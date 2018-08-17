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
public class TrabalhoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("16150228", "Gabriel Bressanini", 10, 10, 10, new Data(21,3,1997));
        Aluno a2 = new Aluno("09247047", "Aluno 2", 5, 2, 1, new Data(1,12,1985));
        Aluno a3 = new Aluno("12878451", "Aluno 3", 9, 9, 9, new Data(15,5,1999));
        Aluno a4 = new Aluno("08665478", "Aluno 4", 3, 1, 5, new Data(10,10,1998));
        Aluno a5 = new Aluno("15154555", "Aluno 5", 2, 5, 3, new Data(31,1,1996));
        Aluno a6 = new Aluno("10000000", "Aluno 6", 8, 8, 8, new Data(19,8,1997));
        Aluno a7 = new Aluno("13454687", "Aluno 7", 7, 7, 7, new Data(22,4,1996));
        
        Turma t1 = new Turma("BLU9999", "Libras I");
        
        t1.adicionaAluno(a1);
        t1.adicionaAluno(a2);
        t1.adicionaAluno(a3);
        t1.adicionaAluno(a4);
        t1.adicionaAluno(a5);
        t1.adicionaAluno(a6);
        t1.adicionaAluno(a7);
        
        System.out.println("Alunos da Turma: " + t1.getCodigo() + " " + t1.getNome());
        t1.mostraAlunos();
        System.out.println("\nAlunos Aprovados da Turma: " + t1.getCodigo() + " " + t1.getNome());
        t1.mostraAlunosAprovados();
        
        
        
    }
    
}
