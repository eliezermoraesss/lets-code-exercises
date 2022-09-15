import java.util.Arrays;

public class Vetores {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);
        }

        String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

//        for (int i = 0; i < letras.length; i++) {
//            System.out.println(letras[i]);
//        }

        // OU USAR FOR EACH

        for (String item : letras) {
            System.out.println(item);
        }

        String[] letras2 = {"Eliezer", "Nádia", "Snoopy", "Eliezer Júnior", "Laura"};

//        for (int i = 0; i < letras2.length; i++) {
//            System.out.println(letras2[i]);
//        }

        // OU USAR FOR EACH

        for (String item : letras2) {
            System.out.println(item);
        }

        System.out.println(Arrays.toString(letras2));
    }
}
