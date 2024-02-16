package org.iesvdm.pruebarecuud3.dao;

import org.iesvdm.pruebarecuud3.domain.Departamento;
import org.iesvdm.pruebarecuud3.domain.Persona;
import org.iesvdm.pruebarecuud3.domain.Profesor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilDAO {

    public static Profesor newProfesor(ResultSet rs) throws SQLException {
        return new Profesor(rs.getInt("id_profesor"),
                rs.getInt("id_departamento"),
                new Persona(rs.getInt("pers.id"),
                        rs.getString("pers.nif"),
                        rs.getString("pers.nombre"),
                        rs.getString("pers.apellido1"),
                        rs.getString("pers.apellido2"),
                        rs.getString("pers.ciudad"),
                        rs.getString("pers.direccion"),
                        rs.getString("pers.telefono"),
                        rs.getDate("pers.fecha_nacimiento"),
                        rs.getString("pers.tipo")
                        ),
                new Departamento(rs.getInt("DP.id"),
                        rs.getString("DP.nombre")
                )
        );
    }
   public static Persona newPersona(ResultSet rs) throws SQLException {
        return new Persona(rs.getInt("id")
                , rs.getString("nif")
                , rs.getString("nombre")
                , rs.getString("apellido1")
                , rs.getString("apellido2")
                , rs.getString("ciudad")
                , rs.getString("direccion")
                , rs.getString("telefono")
                , rs.getDate("fecha_nacimiento")
                , rs.getString("tipo")
        );
    }


    public static Departamento newDepartamento(ResultSet rs) throws SQLException {
        return new Departamento(rs.getInt("id")
                , rs.getString("nombre"));
    }


}
