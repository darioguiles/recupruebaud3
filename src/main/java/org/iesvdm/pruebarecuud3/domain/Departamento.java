package org.iesvdm.pruebarecuud3.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {

   private int id;
   private String nombre;
   //private List<Profesor> profesores;
}
