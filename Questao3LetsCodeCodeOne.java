import java.util.Arrays;
import java.util.Scanner;

public class Questao3LetsCodeCodeOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] listaCompras = new String[5];

        System.out.println("Insira sua lista de compras: ");
        for (int i = 0; i < listaCompras.length; i++) {
            listaCompras[i] = scan.nextLine();
        }
        System.out.println("As frutas do seu carrinho são: ");
        int count = 0;
        for (String item : listaCompras) {
            count++;
            System.out.print(item);
            if (count < listaCompras.length) System.out.print(", ");
        }

        scan.close();
    }
}
