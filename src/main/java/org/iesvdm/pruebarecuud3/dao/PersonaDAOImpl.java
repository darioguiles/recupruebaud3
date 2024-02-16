package org.iesvdm.pruebarecuud3.dao;

import lombok.extern.slf4j.Slf4j;
import org.iesvdm.pruebarecuud3.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
public class PersonaDAOImpl implements PersonaDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void create(Persona t) {

    }

    @Override
    public List<Persona> getAll() {
        return null;
    }

    @Override
    public Optional<Persona> find(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Persona t) {

    }

    @Override
    public void delete(long id) {

    }
}
