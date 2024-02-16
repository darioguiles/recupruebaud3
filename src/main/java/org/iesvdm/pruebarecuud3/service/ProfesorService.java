package org.iesvdm.pruebarecuud3.service;

import org.iesvdm.pruebarecuud3.dao.DepartamentoDAO;
import org.iesvdm.pruebarecuud3.dao.PersonaDAO;
import org.iesvdm.pruebarecuud3.dao.ProfesorDAO;
import org.iesvdm.pruebarecuud3.domain.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService implements ServiceBase<Profesor> {


    @Autowired
    private ProfesorDAO profesorDAO;

    @Autowired
    private PersonaDAO personaDAO;

    @Autowired
    private DepartamentoDAO departamentoDAO;



    @Override
    public List<Profesor> listAll() {
      return this.profesorDAO.getAll();
    }

    @Override
    public Profesor one(int id) {
        return null;
    }

    @Override
    public void create(Profesor profesor) {

    }

    @Override
    public void replace(Profesor profesor) {

    }

    @Override
    public void delete(int id) {

    }
}
