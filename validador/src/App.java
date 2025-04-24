import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Expressão regular para validar e-mails
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regexEmail);

        System.out.println("Validador de E-mails (digite 'sair' para encerrar)");

        while (true) {
            System.out.print("Digite um e-mail: ");
            String email = scanner.nextLine();

            if (email.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa...");
                break;
            }

            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                System.out.println("E-mail válido!\n");
            } else {
                System.out.println("E-mail inválido.\n");
            }
        }

        scanner.close();
    }
}