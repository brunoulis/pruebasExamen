/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasExamen;

import java.util.List;

/**
 *
 * @author luisv
 */
public class Jugador {
    Integer vida;
    Integer ataque;
    List<Mascota> LListaMascota;

    public Jugador() {
    }

    public Jugador(Integer vida, Integer ataque ) {
        this.vida = vida;
        this.ataque = ataque;
        
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    

   
    
    
}
