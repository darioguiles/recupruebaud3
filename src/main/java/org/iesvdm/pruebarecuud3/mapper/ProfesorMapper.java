package org.iesvdm.pruebarecuud3.mapper;


import org.iesvdm.pruebarecuud3.domain.Profesor;
import org.iesvdm.pruebarecuud3.dto.ProfesorFormDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProfesorMapper {

    @Mapping(source = "persona.id", target = "idPersona")
    @Mapping(source = "id_departamento", target = "idDepartamento")
    public ProfesorFormDTO profesorAProfesorFormDTO(Profesor profesor);

    @Mapping(source = "idPersona", target = "persona.id")
    @Mapping(source = "idDepartamento", target = "id_departamento")
    public Profesor profesorFormDTOAProfesor(ProfesorFormDTO profesorFormDTO);

}
