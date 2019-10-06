package atividadedois;
import javax.swing.*;
public class Tabuada {

    public static void main(String[] args) {
        int resultado = 0, i=0, o=0, p=0;

        for (i = 0; i <= 10; i++) {
            for (o=0 ; o <=10 ; o++){
                
                System.out.println("----------------\n"
                        + "| Tabuada do: " + o + "|");
                for (p=0 ; p<=10 ; p++){
                    resultado = o * p;
                    System.out.println("|  " +  o + " * " + p + " = " + resultado + "  |");
                }
                System.out.println("----------------");
                
            }
        }

    }
}
