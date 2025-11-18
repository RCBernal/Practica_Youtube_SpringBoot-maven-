package com.cursospringyt.spring.Proyecto1_YT.Controller;

import com.cursospringyt.spring.Proyecto1_YT.Model.DTO.ClaseDTO;
import com.cursospringyt.spring.Proyecto1_YT.Model.DTO.ParametroDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parametros")
public class RequestParamController {

    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam (required = false,defaultValue = "Sigue aprendiendo ") String informacion) {
        ParametroDTO parametroDTO = new ParametroDTO();
        parametroDTO.setInformacion(informacion);
        return parametroDTO;
    }
}
