/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasExamen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author luisv
 */
public class FileManager {

    public Jugador importFromText(String file) {
        String cadena;
        FileReader f = null;
        Jugador jugadorImport = new Jugador();
        try {
            
            f = new FileReader(file);
            BufferedReader bf = new BufferedReader(f);
            
            while((cadena=bf.readLine())!=null){
                System.out.println(cadena);
                
                String[] listJugador = cadena.split(" ");
                for (int i = 0; i< listJugador.length;i++){
                    String string = listJugador[i];
                    System.out.println(string);
                }
                if(cadena.contains("jugador")){
                    jugadorImport= new Jugador(Integer.parseInt(listJugador[1]),Integer.parseInt(listJugador[2]));
                }else{
                    if(cadena.contains("mascota")){
                        Mascota nMascota = new Mascota(Integer.parseInt(listJugador[1]),Integer.parseInt(listJugador[2]));
                        jugadorImport.LListaMascota.add(nMascota);
                    
                    }else{
                        System.out.println("No es un objeto valido");
                    
                    }
                
                
                
                }
            
            
            
            
            
            }
            bf.close();

        } catch (FileNotFoundException ex) {
            System.err.println("El Fichero no existe");
            System.out.println(ex);
        } catch (IOException ex) {
            System.err.println("Error escribiendo el fichero");
            System.out.println(ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                System.err.println("Error al cerrar el fichero");
                System.out.println(ex);
            }
        }
        return jugadorImport;
    }

}
