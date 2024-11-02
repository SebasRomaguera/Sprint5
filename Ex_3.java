public class Ex_3 {
    public static void main(String[] args) {
        // Inicialización de valores
        double temperatura = 39.5; // Ejemplo de temperatura en grados
        int edat = 4; // Ejemplo de edad en años
        double peso = 16; // Ejemplo de peso en kilos

        double dosisParacetamol = 0;

        // Lógica de control de temperatura
        if (temperatura < 38) {
            System.out.println("El nen està bé.");
        } else if (temperatura < 39) {
            System.out.println("Es recomanable donar-li un bany per baixar la temperatura.");
        } else {
            if (edat < 3) {
                System.out.println("Has de consultar al médico.");
            } else if (edat < 12) {
                dosisParacetamol = 15 * peso;
                System.out.println("Cal donar-li: " + dosisParacetamol + " mg cada 8h.");
            } else {
                dosisParacetamol = 500;
                System.out.println("Cal donar-li: " + dosisParacetamol + " mg cada 8h.");
            }

            if (temperatura >= 40) {
                System.out.println("Avís: per més de 40 cal portar-lo a l'hospital.");
            }
        }
    }
}
