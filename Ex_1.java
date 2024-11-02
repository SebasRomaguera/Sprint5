//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int edat=5, cicle = -1, curs = -1;

        if (edat < 3) {
            System.out.println("És massa petit.");
        } else if (edat < 6) {
            cicle = 0;
        } else if (edat < 7) {
            curs = 1;
            cicle = 1;
        } else if (edat < 8) {
            curs = 2;
            cicle = 1;
        } else if (edat < 9) {
            curs = 3;
            cicle = 2;
        } else if (edat < 10) {
            curs = 4;
            cicle = 2;
        } else if (edat < 11) {
            curs = 5;
            cicle = 3;
        } else if (edat < 12) {
            curs = 6;
            cicle = 3;
        } else {
            System.out.println("És massa gran.");
        }

        switch (cicle) {
            case 0:
                System.out.println("Es d'educació infantil.");
                break;
            case 1:
                System.out.println("Es d'educació primaria. Cicle inicial.");
                break;
            case 2:
                System.out.println("Es d'educació primaria. Cicle mitjà.");
                break;
            case 3:
                System.out.println("Es d'educació primaria. Cicle superior.");
                break;
            default:
                // No hacer nada si cicle es -1 (por ejemplo, para edades fuera del rango)
                break;
        }

        if (curs != -1) {
            System.out.println("Curs assignat: " + curs);
        }


    }
}