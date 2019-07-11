/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author javie
 */
public class Cuenta {
    
    private int saldo;
    private int id_cliente;

    public Cuenta(int saldo, int id_cliente) {
        this.saldo = saldo;
        this.id_cliente = id_cliente;
    }

    
    
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    
    
    
    
}
