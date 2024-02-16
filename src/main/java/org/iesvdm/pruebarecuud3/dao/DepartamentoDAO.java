package org.iesvdm.pruebarecuud3.dao;

import org.iesvdm.pruebarecuud3.domain.Departamento;
import org.iesvdm.pruebarecuud3.domain.Persona;

import java.util.List;
import java.util.Optional;

public interface DepartamentoDAO  {

    public void create(Departamento t);

    public List<Departamento> getAll();
    public Optional<Departamento> find(int id);

    public void update(Departamento t);

    public void delete(long id);

}
