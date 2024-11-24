import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Deklaration von Variablen
        int seiteA, seiteB, flaeche, umfang;

        Scanner tastatur = new Scanner(System.in);

        //Eingabe Seite A
        System.out.print("SeiteA (in cm): ");
        seiteA=tastatur.nextInt();

        //Eingabe Seite B
        System.out.print("SeiteB (in cm): ");
        seiteB=tastatur.nextInt();

        //Verarbeitung
        umfang = 2* seiteA + 2 * seiteB;
        flaeche=seiteA*seiteB;

        //Ausgabe
        System.out.println("Umfang1 = " + umfang + "cm");
        System.out.println("Fläche1 = " + flaeche + "cm2");
    }
}