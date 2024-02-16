package org.iesvdm.pruebarecuud3.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfesorFormDTO {
    @Min(value=0, message = "{msg.valid.min}")
    private int id_profesor;

    @Min(value=1, message = "{msg.valid.min}")
    private int idPersona;
    @Min(value=1, message = "{msg.valid.min}")
    private int idDepartamento;
}
