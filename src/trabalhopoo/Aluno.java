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
public class Aluno {
    private String matricula;
    private String nome;
    private float n1;
    private float n2;
    private float t;
    private Data nascimento;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    
    public float getMedia(){
        return (float) ((n1 * 2.5 + n2 * 2.5 + t * 5)/10);
    }
    
    public float getNotaRec(){
        if(this.getMedia() -5.75 < 0){
            return (float) (-this.getMedia() + 5.75 * 2);
        }else{
            return 0;
        }
    }
    
    public Aluno(){
        this.matricula = "00000000";
        this.nome = "Nome não definido";
        this.n1 = 0;
        this.n2 = 0;
        this.t = 0;
    }
    
    public Aluno(String matricula, String nome){
        this.matricula  = matricula;
        this.nome = nome;
        this.n1 = 0;
        this.n2 = 0;
        this.t = 0;
    }
    
    public Aluno(String matricula, String nome, float n1, float n2, float t, Data nascimento){
        this.matricula = matricula;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.t = t;
        this.nascimento = nascimento;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", n1=" + n1 + ", n2=" + n2 + ", t=" + t + ", nascimento=" + nascimento + ", media=" + this.getMedia() + '}';
    }
}
