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
public class DataHora {
    private Data data;
    private Hora hora;
    
    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo){
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(hora, minuto, segundo);
    }
    
    public DataHora(int dia, int mes, int ano){
        this.data = new Data(dia, mes, ano);
        this.hora = new Hora(0, 0, 0);
    }
    
    public DataHora(int hora, int minuto){
        this.hora = new Hora(hora, minuto, 0);
        this.data = new Data(1);
    }
    
    public DataHora(Data data, Hora hora){
        this.data = data;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return data.toString() + " " + hora.toString();
    }
    
    public DataHora clone(){
        return new DataHora(this.getData(), this.getHora());
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
}
