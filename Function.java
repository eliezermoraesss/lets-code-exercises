public class Function {

    public static void main(String[] args) {
        String nome = "Eliezer";
        saudacao(nome);

        int resultado = somar(7, 3);
        System.out.println(resultado);
    }

    public static void saudacao(String nome) {
        System.out.println("Hello " + nome);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}
