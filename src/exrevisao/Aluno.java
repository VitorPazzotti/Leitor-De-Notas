/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrevisao;

/**
 *
 * @author lab803
 */
public class Aluno {

    private String nomedoAluno; 
    private double mediaAluno;
    private double[] vetA = new double[4];

    public Aluno(String nomedoAluno, double mediaAluno) {
        this.nomedoAluno = nomedoAluno;
        this.mediaAluno = mediaAluno;
    }

    public double getMediaAluno() {
        return mediaAluno;
    }

    public void setMediaAluno(double mediaAluno) {
        this.mediaAluno = mediaAluno;

    }

    public Aluno(String nomedoAluno) {
        this.nomedoAluno = nomedoAluno;
    }

    public Aluno() {
    }

    public String getNomedoAluno() {
        return nomedoAluno;
    }

    public void setNomedoAluno(String nomedoAluno) {
        this.nomedoAluno = nomedoAluno;
    }

    public double[] getVetA() {
        return vetA;
    }

    public void setVetA(double[] vetA) {
        this.vetA = vetA;

    }
    public double calcularMedia(){
       double total = 0;
        for (double d : vetA) {
            total +=d;
        }
       return mediaAluno = total/vetA.length;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nomedoAluno=" + nomedoAluno +" Media do Aluno= "+mediaAluno;
    }

}
