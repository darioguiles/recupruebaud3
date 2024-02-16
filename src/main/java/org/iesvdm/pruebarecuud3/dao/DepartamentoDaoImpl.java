package org.iesvdm.pruebarecuud3.dao;

import lombok.extern.slf4j.Slf4j;
import org.iesvdm.pruebarecuud3.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Slf4j
@Repository
public class DepartamentoDaoImpl implements DepartamentoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Departamento t) {

    }

    @Override
    public List<Departamento> getAll() {
        return null;
    }

    @Override
    public Optional<Departamento> find(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Departamento t) {

    }

    @Override
    public void delete(long id) {

    }
}
