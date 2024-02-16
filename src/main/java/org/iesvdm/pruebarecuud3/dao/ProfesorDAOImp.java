package org.iesvdm.pruebarecuud3.dao;

import lombok.extern.slf4j.Slf4j;
import org.iesvdm.pruebarecuud3.domain.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
public class ProfesorDAOImp implements ProfesorDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(Profesor profesor) {

        KeyHolder keyHolder = new GeneratedKeyHolder();
        //Con recuperación de id generado
        int rows = jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement("""
                        insert into universidad_recu_ud3.profesor (id_profesor,id_departamento)
                        values (?, ?);
                        """, new String[] { "id" });
            int idx = 1;
            ps.setInt(idx++, profesor.getPersona().getId());
            ps.setInt(idx, profesor.getDepartamento().getId());
            return ps;
        },keyHolder);

        log.info("Filas creadas {}", rows);
        log.debug("Profesor con id = {} grabado correctamente",keyHolder.getKey().intValue());

        profesor.setId_profesor(keyHolder.getKey().intValue());

    }

    @Override
    public List<Profesor> getAll() {

        List<Profesor> listProfesor = this.jdbcTemplate.query("""
                SELECT * FROM  universidad_recu_ud3.profesor P left join universidad_recu_ud3.persona pers on  P.id_profesor = pers.id
                left join universidad_recu_ud3.departamento DP on P.id_departamento = DP.id
                """, (rs, rowNum) -> UtilDAO.newProfesor(rs)
        );

        return listProfesor;

    }

    @Override
    public Optional<Profesor> find(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Profesor profesor) {

    }

    @Override
    public void delete(long id) {

    }
}
