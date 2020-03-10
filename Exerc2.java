import javax.swing.JOptionPane;

   public class Exerc2
   {
      public static void main (String [] args)
      {
         int numero;
         
         numero= Integer.parseInt( JOptionPane.showInputDialog( " digite o numero:  " ));
         
         System.out.println(" o valor do numero digitado é: " + numero );
         
         
      }
   }