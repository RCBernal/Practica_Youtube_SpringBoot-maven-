package com.cursospringyt.spring.Proyecto1_YT.Controller;

import com.cursospringyt.spring.Proyecto1_YT.Model.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
      public String info(Model model) {//vamos a usar el patron de inyeccion de dependencias con Model
        Empleados empleado1 = new Empleados(05,"Bere","Bernal","Real del valle","Developer",554111111,27);
        model.addAttribute("Empleado",empleado1);

        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> getListaEmpleados() {
        List<Empleados> empleados = new ArrayList<>(Arrays.asList(
                new Empleados(04, "Carlos", "Bernal", "Real del valle", "Developer", 554111111, 27),
                new Empleados(03, "Isidro", "Bernal", "Real del valle", "Developer", 554111111, 27),
                new Empleados(01, "Guille", "Bernal", "Real del valle", "Developer", 554111111, 27),
                new Empleados(02, "Eidem", "Bernal", "Real del valle", "Developer", 554111111, 27)
        ));
        empleados.sort(Comparator.comparing((Empleados empleados1) -> empleados1.getId()));
        return empleados;
    }

}
