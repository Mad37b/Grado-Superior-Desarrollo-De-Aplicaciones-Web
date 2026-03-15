package String;

/**
 * Ejercicio 8 : Contar vocales y consonantes con Array Unidimensionales
 *
 * @author Ulises III
 */
public class Ej08 {

    public static void main(String[] args) {
        String vocales[] = {"A", "a", "E", "e", "I", "i", "O", "o", "U", "u"};
        String consonantes[] = {
            "B", "b", "C", "c", "D", "d", "F", "f", "G", "g", "H", "h", "J", "j", "K", "k",
            "L", "l", "M", "m", "N", "n", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t",
            "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"
        };

        String frase = "El sol brillaba intensamente mientras los niños jugaban en el parque, riendo, corriendo, explorando cada rincón con alegría pura";
        int contadorVocales = 0;
        int contadorConsonantes = 0;

        for (int i = 0; i < vocales.length; i++) {
            if (frase.contains(vocales[i])) {
                contadorVocales++;
            }
        }

        for (int i = 0; i < consonantes.length; i++) {

            if (frase.contains(consonantes[i])) {
                contadorConsonantes++;
            }

        }
        System.out.println("Resultado");
        System.out.println("Vocales :" + contadorVocales);
        System.out.println("consonantes :" + contadorConsonantes);
    }
}
