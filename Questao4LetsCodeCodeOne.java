import java.util.Arrays;
import java.util.Scanner;

public class Questao4LetsCodeCodeOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] listaFrutas = {"banana", "maçã", "abacaxi", "melão", "mamão"};
        boolean comparador = false;

        System.out.println("A lista de frutas em promoção é: " + Arrays.toString(listaFrutas));
        System.out.println("Qual fruta você deseja comprar hoje?");
        String frutaEscolhida = scan.nextLine();

        for (String item : listaFrutas) {
            comparador = item.equals(frutaEscolhida);
            if (comparador) break;
        }

        System.out.println(comparador ? "Ótima escolha! Essa fruta está em promoção hoje." : "Que pena. Essa fruta não está em promoção hoje.");

        scan.close();
    }
}
