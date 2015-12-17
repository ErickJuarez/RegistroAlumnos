/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.Serializable;

/**
 *
 * @author Erick
 */
public class Alumnos implements Serializable {

    private int boleta;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int cal1;
    private int cal2;
    private int cal3;
    private int calCuest;
    private int calTot;
    private String observaciones;

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    int getBoleta() {
        return this.boleta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() {
        return this.nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    String getApellidoP() {
        return this.apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    String getApellidoM() {
        return this.apellidoM;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    String getObservaciones() {
        return this.observaciones;
    }

    public void setCal1(int cal1) {
        this.cal1 = cal1;
    }

    int getCal1() {
        return this.cal1;
    }

    public void setCal2(int cal2) {
        this.cal2 = cal2;
    }

    int getCal2() {
        return this.cal2;
    }

    public void setCal3(int cal3) {
        this.cal3 = cal3;
    }

    int getCal3() {
        return this.cal3;
    }

    public void setCalCuest(int calCuest) {
        this.calCuest = calCuest;
    }

    int getCalCuest() {
        return this.calCuest;
    }

    public void setCalTot(int calTot) {
        this.calTot = calTot;
    }

    int getCalTot() {
        return this.calTot;
    }

}
