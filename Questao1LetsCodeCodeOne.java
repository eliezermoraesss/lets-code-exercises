import java.util.Scanner;

public class Questao1LetsCodeCodeOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número de 1 à 10: ");
        int numero = scan.nextInt();
        System.out.printf("A tabuada de %d é: \n", numero);

        for (int i = numero; i <= 10; i++) {
            System.out.printf("%dx%d=%d\n", numero, i, numero * i);
        }
        scan.close();
    }
}
