package com.cursospringyt.spring.Proyecto1_YT.Controller;

import com.cursospringyt.spring.Proyecto1_YT.Model.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
      public String info(Model model) {//vamos a usar el patron de inyeccion de dependencias con Model
        Empleados empleado1 = new Empleados(05,"Bere","Bernal","Real del valle","Developer",554111111,27);
        model.addAttribute("Empleado",empleado1);


        return "detalles_info";
    }
}
