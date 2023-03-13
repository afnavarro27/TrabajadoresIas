package com.trabajadoressas.trabajadorias.service;

import com.trabajadoressas.trabajadorias.entity.Trabajador;
import org.springframework.stereotype.Component;

@Component
public class CalcularLiquidacionImp implements ICalcularLiquidacion{
    @Override
    public Integer prima(Trabajador trabajador) {
        Integer primaRes = ((trabajador.getSueldoTrabajador() + trabajador.getAuxilioTransporte()) * trabajador.getDiasLaborados())/360;
        return primaRes;
    }

    @Override
    public Integer cesantias(Trabajador trabajador) {
        Integer cesantiaRes = (trabajador.getSueldoTrabajador() * trabajador.getDiasLaborados()/360);
        return cesantiaRes;
    }

    @Override
    public Float interesCesantia(Trabajador trabajador) {
        float interesCesantiaRe = (trabajador.getCesantias() * 12f) /trabajador.getDiasLaborados();
        return interesCesantiaRe;
    }

    @Override
    public int vacaciones(Trabajador trabajador) {
        int vacacionesRe = (trabajador.getSueldoTrabajador() * trabajador.getDiasLaborados())/720;
        return vacacionesRe;
    }

    @Override
    public Integer liquidacion(Trabajador trabajador) {
        Integer valorLiquidacion = prima(trabajador) + cesantias(trabajador) + Math.round(interesCesantia(trabajador)) + vacaciones(trabajador);
        return valorLiquidacion;
    }
}
