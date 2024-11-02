public class Ex_2 {
    public static void main(String[] args) {
        int numLliuraments = 9, totalLliuraments = 10;
        double notaProva = 8, notaPractiques = 6;
        boolean noSeguidaAC = false;
        double notaLLiuraments = 5;

        if (notaProva < 7) {
            System.out.println("Avis: està suspés per prova final.");
        } else if (numLliuraments < 0.7 * totalLliuraments) {
            System.out.println("Avis: està suspés. No has seguit avaluació contínua.");
            noSeguidaAC = true;
        } else {
            if (numLliuraments == totalLliuraments) {
                notaLLiuraments = 10;
            } else if (numLliuraments >= 0.9 * totalLliuraments) {
                notaLLiuraments = 8;
            } else if (numLliuraments >= 0.8 * totalLliuraments) {
                notaLLiuraments = 6;
            } else if (numLliuraments >= 0.7 * totalLliuraments) {
                notaLLiuraments = 4;
            }

            double notaFinal = (0.2 * notaProva) + (0.1 * notaLLiuraments) + (0.7 * notaPractiques);

            if (notaFinal < 5) {
                if (noSeguidaAC) {
                    System.out.println("Recomanacions: cal seguir avaluació contínua.");
                } else {
                    System.out.println("Recomanacions: fes els exercicis preparatoris per a la PAF2.");
                }
            }
        }
    }
}
