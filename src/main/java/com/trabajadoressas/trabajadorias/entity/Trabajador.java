package com.trabajadoressas.trabajadorias.entity;

import jakarta.persistence.*;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "trabajador")
public class Trabajador {

    @Id
    @NotNull
    @Column(name = "cedula",unique = true)
    private Integer cedula;

    @Column(name = "nombre_trabajador")
    @NotNull
    private String nombreTrabajador;

    @Column(name = "dias_laborados")
    @NotNull
    private int diasLaborados;

    @Column(name = "auxilio_transporte")
    @NotNull
    private Integer auxilioTransporte;

    @Column(name = "sueldo_trabajador")
    @NotNull
    private Integer sueldoTrabajador;
    //-----------------------------------------------

    @Column(name = "vacaiones_trabajador")
    private int vacaciones;

    @Column(name = "cesantias_trabajador")
    private Integer cesantias;

    @Column(name = "interes_cesantia")
    private Float interesCesantia;

    @Column(name = "prima_trabajador")
    private Integer prima;

    @Column(name = "liquidacion_trabajador")
    private Integer liquidacion;


    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public Integer getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(Integer auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public Integer getSueldoTrabajador() {
        return sueldoTrabajador;
    }

    public void setSueldoTrabajador(Integer sueldoTrabajador) {
        this.sueldoTrabajador = sueldoTrabajador;
    }

    public int getVacaiones() {
        return vacaciones;
    }

    public void setVacaciones(int vacaiones) {
        this.vacaciones = vacaiones;
    }

    public Integer getCesantias() {
        return cesantias;
    }

    public void setCesantias(Integer cesatias) {
        this.cesantias = cesatias;
    }

    public Float getInteresCesantia() {
        return interesCesantia;
    }

    public void setInteresCesantia(Float interesCesantia) {
        this.interesCesantia = interesCesantia;
    }

    public Integer getPrima() {
        return prima;
    }

    public void setPrima(Integer prima) {
        this.prima = prima;
    }

    public Integer getLiquidacion() {
        return liquidacion;
    }

    public void setLiquidacion(Integer liquidacion) {
        this.liquidacion = liquidacion;
    }
}
