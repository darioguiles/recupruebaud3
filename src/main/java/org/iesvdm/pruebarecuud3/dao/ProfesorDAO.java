package org.iesvdm.pruebarecuud3.dao;

import org.iesvdm.pruebarecuud3.domain.Persona;
import org.iesvdm.pruebarecuud3.domain.Profesor;

import java.util.List;
import java.util.Optional;


public interface ProfesorDAO  {

    public void create(Profesor t);

    public List<Profesor> getAll();
    public Optional<Profesor> find(int id);

    public void update(Profesor t);

    public void delete(long id);

}
