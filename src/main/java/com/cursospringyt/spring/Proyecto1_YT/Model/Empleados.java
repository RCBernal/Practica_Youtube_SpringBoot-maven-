package com.cursospringyt.spring.Proyecto1_YT.Model;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Empleados {

    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String puesto;
    private int telefono;
    private int edad;


}
