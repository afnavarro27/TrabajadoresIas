package com.trabajadoressas.trabajadorias.service;

import com.trabajadoressas.trabajadorias.entity.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ITrabajadorService{
    public List<Trabajador> findAll();
    public void save(Trabajador trabajador);
    public Optional<Trabajador> findOne(Integer cedula);
    public String deleteById(Integer cedula);
    public List<Trabajador>updateById(Integer cedula);
    //-------------------------------------
    public Optional<Trabajador> findTercerTrabajador();
}
