package atividadedois;

import javax.swing.JOptionPane;

public class Notas {

    public static void main(String[] args) {
        String aux;
        double []notas1=new double[6] ;
        double []notas2=new double[6] ;
        double []ma=new double[6] ;
        double []ms=new double[6] ;
        
        for (i = 0; i <= 6; i++) {
            aux = JOptionPane.showInputDialog(null, "Digite a nota 1 do aluno " + i);
            notas1[i] = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Digite a nota 2 do aluno " + i);
            notas2[i] = Double.parseDouble(aux);

        }
    }

}
