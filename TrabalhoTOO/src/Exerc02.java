
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias Dalvite
 */
public class Exerc02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float diaria = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor da diaria?"));
        String datalocacao = JOptionPane.showInputDialog("Qual a data de locacao?");
        String datadevolucao = JOptionPane.showInputDialog("E a data de devolucao?");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataloc = new Date();
        Date datadev = new Date();
        try{
            dataloc = sdf.parse(datalocacao);
            datadev = sdf.parse(datadevolucao);
        }catch (Exception e) {
            System.out.println("Erro ao converter a data");
        }
        Long diferenca = datadev.getTime() - dataloc.getTime();
        int milispordia = (24 * 60 * 60 * 1000);
        Long dias = diferenca / milispordia;
        System.out.println("Valor da diaria: " + diaria);
        System.out.println("Data de locacao: " + sdf.format(dataloc.getTime()));
        System.out.println("Data de devolucao: " + sdf.format(datadev.getTime()));
        System.out.println("Dias de locacao: " + dias);
        System.out.println("Valor total da locacao: " + dias*diaria);
    }
}