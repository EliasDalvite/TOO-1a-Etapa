
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
public class Exerc03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datainicial = JOptionPane.showInputDialog("Qual a data?");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        try{
            data = sdf.parse(datainicial);
        }catch(Exception e){
            System.out.println("Erro ao converter a data");
        }
        int cont=0;
        System.out.println("Data informada: " + sdf.format(data.getTime()));
        while(cont<5){
            cont++;
            data.setDate(data.getDate() + 7);
            System.out.println("Data de pagamento: " + sdf.format(data.getTime()));
        }
    }
}
