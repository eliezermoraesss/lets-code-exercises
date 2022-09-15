import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsDatesManipulation {

    public static void main(String[] args) {

        // Olá {nome}. Hoje é {diaDaSemana}

        String nome = "Eliezer";
        //System.out.println(nome.toUpperCase());
        //System.out.println(nome.toLowerCase());
        //System.out.println(nome.length());

        String outroNome = "eliezer";
        //System.out.println(nome.equals(outroNome));
        //System.out.println(nome.equalsIgnoreCase(outroNome));

        // ISO-8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        // Locale brasil = new Locale("pt", "BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() <24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase());

    }
}
