package com.cursospringyt.spring.Proyecto1_YT.Controller;

import com.cursospringyt.spring.Proyecto1_YT.Model.DTO.ClaseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/*Este es nuestro metodo Handler pero con la anotacion
 @Restcontroller lo convertimos en un metodo Handler-Rest*/
@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public ClaseDTO detalles_info2() {

/*        Empleados empleado1 = new Empleados(1,"carlos","Bernal","Real del valle","Developer",554111111,27);
        Empleados empleado2 = new Empleados(2,"Sara","Bernal","Real del valle","Developer",554111111,27);


        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("Empleado1",empleado1);
        respuesta.put("Empleado2",empleado2);*/
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Clase con DTO");
        usuario1.setUsuario("ROBERTO");
        return usuario1;

    }


}
