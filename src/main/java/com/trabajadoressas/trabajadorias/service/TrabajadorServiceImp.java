package com.trabajadoressas.trabajadorias.service;

import com.trabajadoressas.trabajadorias.entity.Trabajador;
import com.trabajadoressas.trabajadorias.repository.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TrabajadorServiceImp implements ITrabajadorService {

    @Autowired
    private TrabajadorRepository trabajadorRepository;
    @Autowired
    private ICalcularLiquidacion calculo;

    @Override
    public List<Trabajador> findAll() {
        return trabajadorRepository.findAll();
    }

    @Override
    public void save(Trabajador trabajador) {
        trabajador.setVacaciones(calculo.vacaciones(trabajador));
        trabajador.setCesantias(calculo.cesantias(trabajador));
        trabajador.setInteresCesantia(calculo.interesCesantia(trabajador));
        trabajador.setPrima(calculo.prima(trabajador));
        trabajador.setLiquidacion(calculo.liquidacion(trabajador));
        trabajadorRepository.save(trabajador);
    }

    @Override
    public Optional<Trabajador> findOne(Integer cedula) {
        return trabajadorRepository.findById(cedula);
    }

    @Override
    public Optional<Trabajador> findTercerTrabajador() {
        Optional<Trabajador> tercerTrabajador = Optional.ofNullable(trabajadorRepository.findAllByOrderByLiquidacionDesc().get(2));
        return tercerTrabajador;
    }

    public String deleteById(Integer cedula) {
        Optional<Trabajador> trabajadorElimi = trabajadorRepository.findByCedula(cedula);

        if (trabajadorElimi.isPresent()) {
            Trabajador trabajador = trabajadorElimi.get();
            trabajadorRepository.deleteById(cedula);
            return "El trabajador nombre: " + trabajador.getNombreTrabajador() + " Cedula: " + trabajador.getCedula() + " ha sido eliminado con éxito.";
        } else {
            return "El trabajador con la cédula " + cedula + " no existe.";
        }
    }

    @Override
    public List<Trabajador> updateById(Integer cedula) {
        return null;
    }
}
