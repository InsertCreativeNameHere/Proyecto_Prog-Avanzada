/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Presentacion.Modelo;

/**
 *
 * @author ldani
 */
public class Tarjeta {

    private String nombre;
    private String estado;
    private String clave;
    private int id_cuenta;

    public Tarjeta() {
        this.nombre = this.concatenarId(this.crearId());
        this.estado = "activo";
        this.clave = "0000";
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    public String[] crearId(){
        String idTarjeta[] = new String[10];
        for (int i = 0; i < 10; i++) {
            idTarjeta[i] = obtenerNumeroAleatorio();
        }        
        return idTarjeta;
    }
    
    public String concatenarId(String[] id){
        String idConcatenado = "";
        for (int i = 0; i < 10; i++) {
            idConcatenado = idConcatenado+id[i];
        }
        return idConcatenado;
    }
    
    public String obtenerNumeroAleatorio(){        
        int numeroAleatorio = (int) (Math.random() * 9) + 1;
        String numeroAleatorioString = Integer.toString(numeroAleatorio);
        return numeroAleatorioString;       
    }
    
}
