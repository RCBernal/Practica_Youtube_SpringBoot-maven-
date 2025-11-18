package com.cursospringyt.spring.Proyecto1_YT.Controller;

import com.cursospringyt.spring.Proyecto1_YT.Model.DTO.ClaseDTO;
import com.cursospringyt.spring.Proyecto1_YT.Model.DTO.ParametroDTO;
import com.cursospringyt.spring.Proyecto1_YT.Model.Empleados;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensaje;


    @Value("${config.valores}")
    private String[] valores;



    @GetMapping("/path/{ms}")
    public ParametroDTO getClaseDTO(@PathVariable String ms) {
        ParametroDTO parametroDTO = new ParametroDTO();
        parametroDTO.setInformacion(ms);
        return parametroDTO;
    }

    @PostMapping("/path2")
    public ClaseDTO getClase(@RequestBody ClaseDTO claseDTO) {
        ClaseDTO claseDTOo = new ClaseDTO();
        claseDTOo.setTitulo(claseDTO.getTitulo());
        claseDTOo.setUsuario(claseDTO.getUsuario());
//        claseDTOo.setEdad(claseDTO.getEdad()+3);
        return claseDTOo;
    }

    @PostMapping("/create")
    public Empleados createEmploy(@RequestBody Empleados empleados) {
        return empleados;
    }

    @GetMapping("/valores")
    public Map<String,Object> values(){
        Map<String,Object> json = new HashMap<>();
        json.put("Usuario",usuario);
        json.put("Codigo",codigo);
        json.put("Mensaje",mensaje);
        json.put("Valores",valores);
        return json;
    }
}
