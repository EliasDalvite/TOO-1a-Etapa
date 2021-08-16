
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias Dalvite
 */
public class Exerc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Qual o seu salário?: ");
        double salariobruto = entrada.nextDouble();
        double INSS;
        if(salariobruto<0){       
            System.out.println("Ocorreu algum erro, tente novemente!");
            return;
        }
        else if(salariobruto>=0&&salariobruto<=1100.00){
            INSS = salariobruto*0.075;
        }
        else if(salariobruto>=1100.01&&salariobruto<=2203.49){
            INSS = salariobruto*0.09;
        }    
        else if(salariobruto>=2203.49&&salariobruto<=3305.22){
            INSS = salariobruto*0.12;
        }
        else if(salariobruto>=3305.23&&salariobruto<=6433.57){
            INSS = salariobruto*0.14;
        }
        else
            INSS = salariobruto*0.20;//só para ficar mais completo...
        System.out.println("Nome: " + nome);
        System.out.println("Salario bruto: " + salariobruto);
        System.out.println("INSS: " + INSS);
        System.out.println("Salario liquido: " + (salariobruto-INSS));
    }
}