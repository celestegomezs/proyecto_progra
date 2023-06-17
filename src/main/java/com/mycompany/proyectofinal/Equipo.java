/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

/**
 *
 * @author celeste
 */
public class Equipo {
    private String NombreEquipo;
    private String Lider;
    private int correlativo;

    /**
     * @return the NombreEquipo
     */
    public String getNombreEquipo() {
        return NombreEquipo;
    }

    /**
     * @param NombreEquipo the NombreEquipo to set
     */
    public void setNombreEquipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }

    /**
     * @return the Lider
     */
    public String getLider() {
        return Lider;
    }

    /**
     * @param Lider the Lider to set
     */
    public void setLider(String Lider) {
        this.Lider = Lider;
    }

    /**
     * @return the correlativo
     */
    public int getCorrelativo() {
        return correlativo;
    }

    /**
     * @param correlativo the correlativo to set
     */
    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }
}
