import javax.swing.JOptionPane;

   public class Exerc3
   {
      public static void main ( String [] args)
      {
         int dia;
         int mes;
         int ano;
        
        dia = Integer.parseInt( JOptionPane.showInputDialog(" informe o dia: " ));
        mes = Integer.parseint(JOptionPane.showInputDialog(" informe o mes: "));
        ano = Integer.parseint(JOptionpane.show.InputDialog(" informe o ano:"));
        
        System.out.println(dia + " " + mes + " "+ ano);
      }
   }