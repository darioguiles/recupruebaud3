package org.iesvdm.pruebarecuud3.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profesor {
    private int id_profesor;

    private int id_departamento;

    private Persona persona;

    private Departamento departamento;

}
