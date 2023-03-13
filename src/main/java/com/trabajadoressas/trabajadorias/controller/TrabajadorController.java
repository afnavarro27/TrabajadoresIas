package com.trabajadoressas.trabajadorias.controller;

import com.trabajadoressas.trabajadorias.entity.Trabajador;
import com.trabajadoressas.trabajadorias.repository.TrabajadorRepository;
import com.trabajadoressas.trabajadorias.service.ITrabajadorService;
import com.trabajadoressas.trabajadorias.service.TrabajadorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {
    @Autowired
    private ITrabajadorService trabajadorS;

    @PostMapping("/creartrabajador")
    public Trabajador saveTrabajador(@RequestBody Trabajador trabajador){
        trabajadorS.save(trabajador);
        return trabajador;
    }

    @GetMapping("/trabajadores")
    public List<Trabajador> getAllTrabajadores(){
        return trabajadorS.findAll();
    }

    @GetMapping("/listarTercerTrabajador")
    public Optional<Trabajador> getTercerTrabajador(){
        return trabajadorS.findTercerTrabajador();
    }

    @DeleteMapping("/eliminar/{id}")
    public String deleteTrabajadorById(@PathVariable("id") Integer cedula) {
        return trabajadorS.deleteById(cedula);
    }

    @PutMapping("/actualizar/{id}")
    public Trabajador updateTrabajadorById(@PathVariable("id") Integer cedula, @RequestBody Trabajador trabajador) {
        trabajadorS.updateById(trabajador, cedula);
        return trabajador;
    }

}
