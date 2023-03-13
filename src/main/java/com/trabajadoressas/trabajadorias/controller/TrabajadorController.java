package com.trabajadoressas.trabajadorias.controller;

import com.trabajadoressas.trabajadorias.entity.Trabajador;
import com.trabajadoressas.trabajadorias.repository.TrabajadorRepository;
import com.trabajadoressas.trabajadorias.service.ITrabajadorService;
import com.trabajadoressas.trabajadorias.service.TrabajadorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
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

    /*@PutMapping("/liquidados")
    public String actualizarTrabajadores(@RequestBody List<Trabajador> trabajadoresActualizados) {
        // Obtener todos los trabajadores existentes en la base de datos
        List<Trabajador> trabajadores = trabajadorS.findAll();

        // Actualizar los datos de cada trabajador existente con los nuevos valores proporcionados en la solicitud PUT
        for (Trabajador trabajador : trabajadores) {
            Trabajador trabajadorActualizado = trabajadoresActualizados.stream().filter(t -> t.getCedula().equals(trabajador.getCedula())).findFirst().orElse(null);
            if (trabajadorActualizado != null) {
                trabajador.setPrima(trabajadorActualizado.getPrima());
                trabajador.setCesatias(trabajadorActualizado.getCesatias());
                trabajador.setInteresCesantia(trabajadorActualizado.getInteresCesantia());
                trabajador.setVacaiones(trabajadorActualizado.getVacaiones());
                trabajador.setLiquidacion(trabajadorActualizado.getLiquidacion());
            }
        }

        // Guardar los cambios en la base de datos utilizando el método saveAll() de JpaRepository
        trabajadorRepository.saveAll(trabajadores);

        return "";
    }*/

}
