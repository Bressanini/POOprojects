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
public class Data {
    private int dia = 1;
    private int mes = 1;
    private int ano = 1;
    private int vdias[] = 
        {31,28,31,30,31,30,31,31,30,31,30,31};
    private String vmesext[] = {"Janeiro", "Fevereiro", "Marco", "Abril","Maio", "Junho", "Julho", "Agosto", "Setembro","Outubro", "Novembro", "Dezembro"};
    
    public Data(int ano){
        this.ano = ano;
    }
    
    public Data(int dia, int mes, int ano){
        if (validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    public Data(String data) {
        int dia = Integer.valueOf(data.substring(0, 2)).intValue();
        int mes = Integer.valueOf(data.substring(3, 5)).intValue();
        int ano = Integer.valueOf(data.substring(6)).intValue();
        if (validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }        
    }

    public boolean isBissexto(int ano){
        if (ano % 4 == 0 && 
            (ano % 400 == 0 || ano % 100 != 0)) {
            return true;
        }
        return false;        
    }
    private boolean validaData(int dia, int mes, int ano) {
        if (mes >= 1 && mes <= 12){           
            if (isBissexto(ano)){
                vdias[1] = 29;
            }
            if (dia >= 1 && dia <= vdias[mes - 1]){
                return true;
            }            
        }
        return false;
    }
    
    public int getDia(){
        return this.dia;        
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    public String getMesExtenso(){
        return vmesext[this.mes - 1];
    }   
    
    public int getAno2Dig(){        
        return this.ano % 100;
    }

    @Override
    public String toString() {
       String dias = String.format("%02d",this.dia);
       String mess = String.format("%02d",this.mes);
       String anos = String.format("%04d",this.ano);
       return dias + "/" + mess + "/" + anos;       
    }

    public Data clone(){
        Data toreturn = 
          new Data(this.dia, this.mes, this.ano);
        return toreturn;
    }
    
    public int compare(Data d){
        if (this.dia == d.getDia() && 
                this.mes == d.getMes() &&
                this.ano == d.getAno()){
            // datas iguais
            return 0;
        }else{
            // data recebida menor
            if (d.getAno() < this.ano){
                return 1;
            }
            if(d.getAno() == this.ano && 
                    d.getMes() < this.mes){
                return 1;
            }
            if(d.getAno() == this.ano && 
                    d.getMes() == this.mes &&
                    d.getDia() < this.dia){
                return 1;
            }
        }                 
        // data recebida é maior
        return -1;
    }
}
