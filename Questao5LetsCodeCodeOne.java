import java.util.Arrays;
import java.util.Scanner;

public class Questao5LetsCodeCodeOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] listaFrutas = {"banana", "maçã", "abacaxi", "melão", "mamão"};
        String[] listaCompras = new String[listaFrutas.length];
        String frutasPromocao = "";

        System.out.println("A lista de frutas em promoção é: " + Arrays.toString(listaFrutas));
        System.out.println("Qual a lista de frutas  para hoje?");

        for (int i = 0; i < listaCompras.length; i++ ) {
            listaCompras[i] = scan.nextLine();
        }

        int desconto = 0;
        for (int i = 0; i < listaCompras.length; i++) {
            for (int j = 0; j < listaFrutas.length; j++) {
                if (listaCompras[i].equals(listaFrutas[j])) {
                    desconto+=5;
                    frutasPromocao+=listaFrutas[j] + ", ";
                }
            }
        }

        System.out.printf("Você tem o direito à um desconto de %d", desconto);
        System.out.print("%. ");

        if (desconto <= 5) {
            System.out.printf("A fruta %s está em promoção!", frutasPromocao.substring(0, frutasPromocao.length() - 2));
        } else {
            System.out.printf("As seguintes frutas %s estão em promoção!", frutasPromocao.substring(0, frutasPromocao.length() - 2));
        }

        scan.close();
    }
}
