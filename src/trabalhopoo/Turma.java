/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.List;

/**
 *
 * @author Gabriel Bressanini
 */
public class Turma {
    private String codigo;
    private String nome;
    private Aluno alunos[];
    
    
    public Turma(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new Aluno[50];
        /*for(int i = 0; i < this.alunos.length; i++){
            Aluno a = new Aluno();
            this.alunos[i] = a;
        }*/
    }
    
    
    public void adicionaAluno(Aluno aluno){
        for(int i = 0; i <= this.alunos.length; i++){
            if(i == 50){
                System.err.println("Turma Cheia, Falha ao Adicionar aluno.");
            }else if(this.alunos[i] == null){
                this.alunos[i] = aluno;
                break;
            }
        }
    }
    
    public int getNumAlunos(){
        int cont = 0;
        for(int i = 0; i < this.alunos.length; i++){
            if(this.alunos[i] != null){
                cont ++;
            }else{
                break;
            }
        }
        return cont;
    }
    
    public void mostraAlunos(){
        for(int i = 0; i < this.alunos.length; i++){
            if(this.alunos[i] != null){
                System.out.println(this.alunos[i].toString());
            }
        }
    }
    
    public void mostraAlunosAprovados(){
        for(int i = 0; i < this.alunos.length; i++){
            if(this.alunos[i] != null){
                if(this.alunos[i].getNotaRec() == 0){
                    System.out.println(this.alunos[i].toString());
                }
            }
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
