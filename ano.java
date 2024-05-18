import java.util.Scanner;

public class ano {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);

            // Obtendo o ano atual
            System.out.println("Digite o ano atual:");
            int anoAtual = scanner.nextInt();

            // Obtendo o ano de nascimento
            System.out.println("Digite o ano de nascimento:");
            int anoNascimento = scanner.nextInt();

            // Calculando a idade
            int idade = anoAtual - anoNascimento;

            // Exibindo a idade
            System.out.println("\nVocê tem " + idade + " anos de idade.");

            scanner.close();
        }
    }
