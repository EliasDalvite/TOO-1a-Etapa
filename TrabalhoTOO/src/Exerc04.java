
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias Dalvite
 */
public class Exerc04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        float valcompra = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual o valor da compra?"));
        int parcelas = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a quantidade de parcelas?"));
        int i;
        float[] vetor1 = new float[parcelas];
        for(i=0;i<parcelas;i++){
            vetor1[i] = (valcompra/parcelas);
        }
        Date[] vetor2 = new Date[parcelas];
        Date hoje = new Date();
        Date hojemodificado = (Date) hoje.clone();
        System.out.println("Valor da compra: " + valcompra);
        System.out.println("Total de parcelas: " + parcelas);
       for(i=0;i<parcelas;i++){
            hojemodificado.setDate(hoje.getDate() + 30);
            vetor2[i] = hojemodificado;
            System.out.println("Valor da parcela: " + vetor1[i] + " / Data do " + (i+1) + "° vencimento: " + sdf.format(vetor2[i]));
        }
    }
}
