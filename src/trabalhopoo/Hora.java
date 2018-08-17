/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author Gabriel Bressanini
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        if(hora >= 0){
            this.hora = hora;
        }else{
            this.hora = 0;
        }
        
        if(minuto < 60 && minuto >= 0){
            this.minuto = minuto;
        }else{
            this.minuto = 0;
        }
        
        if(segundo >= 0 && segundo < 60){
            this.segundo = segundo;
        }else{
            this.segundo = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        String hora = String.format("%02d",this.hora);
        String minuto = String.format("%02d",this.minuto);
        String segundo = String.format("%02d",this.segundo);
        return hora + ":" + minuto + ":" + segundo;    
        
    }
}
