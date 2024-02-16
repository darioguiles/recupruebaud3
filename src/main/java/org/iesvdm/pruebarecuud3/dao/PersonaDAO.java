package org.iesvdm.pruebarecuud3.dao;

import org.iesvdm.pruebarecuud3.domain.Persona;
import org.iesvdm.pruebarecuud3.domain.Profesor;

import java.util.List;
import java.util.Optional;

public interface PersonaDAO {

    public void create(Persona t);

    public List<Persona> getAll();
    public Optional<Persona> find(int id);

    public void update(Persona t);

    public void delete(long id);
}
