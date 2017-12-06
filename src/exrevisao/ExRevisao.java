/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrevisao;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author lab803
 */
public class ExRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String dados = "";
        try (FileInputStream entrada = new FileInputStream("arquivo.txt");
                Scanner in = new Scanner(entrada);
                FileOutputStream saida = new FileOutputStream("saida.txt");) {
            while (in.hasNext()) {
                Aluno a = new Aluno();
                double[] vetA = new double[4];
                a.setNomedoAluno(in.nextLine());

                for (int i = 0; i < vetA.length; i++) {
                    vetA[i] = Double.parseDouble(in.nextLine());
                }
                a.setVetA(vetA);

                dados += a.getNomedoAluno() +"\t" + a.calcularMedia() + "\n";
            }
            saida.write(dados.getBytes());

        } catch (Exception x) {
            System.out.println(x);
        }

    }
//        Scanner entradaN = new Scanner(System.in);
//        Scanner entradaS  = new Scanner(System.in);
//        Aluno a = new Aluno();
//        double [] vetA = new double[4];
//        System.out.println("Digite o nome do aluno");
//        a.setNomedoAluno(entradaS.nextLine());
//        for (int i = 0; i < vetA.length; i++) {
//            System.out.println("Digite a nota "+(i+1)+" do aluno");
//            vetA[i]= entradaN.nextDouble(); 
//        }
//        a.setVetA(vetA);
//        System.out.println(a.calcularMedia());
//        System.out.println(a.toString());
//    }
//    
}
