/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasExamen;

import java.io.Serializable;

/**
 *
 * @author luisv
 */
public class Mascota implements Serializable {
    Integer vida;
    Integer velocidad;

    public Mascota() {
    }

    public Mascota(Integer vida, Integer velocidad) {
        this.vida = vida;
        this.velocidad = velocidad;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
    
    public String toText(){
        return "mascota "+ this.vida+" "+ this.velocidad;
    
    }
    
}
