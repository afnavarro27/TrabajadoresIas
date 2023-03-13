package com.trabajadoressas.trabajadorias.repository;

import com.trabajadoressas.trabajadorias.entity.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer> {

    @Transactional(readOnly = true)
    public Optional<Trabajador>findByCedula(int cedula);

    public List<Trabajador> findAllByOrderByLiquidacionDesc();
}
