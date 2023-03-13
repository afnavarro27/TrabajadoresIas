package com.trabajadoressas.trabajadorias.service;

import com.trabajadoressas.trabajadorias.entity.Trabajador;

public interface ICalcularLiquidacion {
    public Integer prima(Trabajador trabajador);
    public Integer cesantias(Trabajador trabajador);
    public Float interesCesantia(Trabajador trabajador);
    public int vacaciones(Trabajador trabajador);
    public Integer liquidacion(Trabajador trabajador);
}
