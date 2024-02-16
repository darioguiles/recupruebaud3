package org.iesvdm.pruebarecuud3.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private int id;
    //Unique
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;

    private String ciudad;

    private String direccion;

    private String telefono;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nacimiento;

    private String tipo;


}
