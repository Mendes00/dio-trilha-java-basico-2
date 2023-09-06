/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiocontroledefluxo;

import java.util.Scanner;

/**
 *
 * @author 55539
 */
public class DesafioControleDeFluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner terminal = new Scanner(System.in);
    
        System.out.println("Digite o primeiro parametro: ");
        int primeiroParametro = terminal.nextInt();
        
        System.out.println("Digite o seguno parametro: ");
        int segundoParametro = terminal.nextInt();
        
        try{
            if (primeiroParametro < segundoParametro){
            throw new ParametrosInvalidosException("O primeiro parametro deve ser maior que o segundo.");
            }
           contar(primeiroParametro, segundoParametro);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    private static class ParametrosInvalidosException extends Exception {

        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
    
    public static void contar(int parametroUm, int parametroDois){
           
       int auxiliar = parametroUm - parametroDois;
       
           for (int i = 1; i <= auxiliar; i++) {
               System.out.println("" + i);
           }
       }

}