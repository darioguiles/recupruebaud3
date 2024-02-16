package org.iesvdm.pruebarecuud3.controller;



import org.iesvdm.pruebarecuud3.domain.Departamento;
import org.iesvdm.pruebarecuud3.domain.Persona;
import org.iesvdm.pruebarecuud3.domain.Profesor;
import org.iesvdm.pruebarecuud3.dto.ProfesorFormDTO;
import org.iesvdm.pruebarecuud3.mapper.ProfesorMapper;
import org.iesvdm.pruebarecuud3.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @Autowired
    private ProfesorMapper profesorMapper;


    @GetMapping("/profesores")
    public String listar(Model model) {

        List<Profesor> listAllProf =  profesorService.listAll();
        model.addAttribute("listaProfesores", listAllProf);
        int tamanyoLista = listAllProf.size();
        model.addAttribute("tamanyoLista", tamanyoLista);


        return "profesores";

    }

    @GetMapping("/profesores/crear")
    public String crear(Model model) {

        ProfesorFormDTO pedidoFormDTO = new ProfesorFormDTO();
        model.addAttribute("pedidoFormDTO", pedidoFormDTO);

        return "crear-profesor";
    }

    @PostMapping("/pedidos/crear")
    public String submitCrear( @ModelAttribute("pedidoFormDTO") ProfesorFormDTO pedidoFormDTO, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("pedidoFormDTO", pedidoFormDTO);

            return "crear-pedido";
        }

        Profesor pedido = profesorMapper.profesorFormDTOAProfesor(pedidoFormDTO);

        profesorService.create(pedido);

        return "redirect:/pedidos?newPedidoID="+pedido.getId_profesor();

    }



}
