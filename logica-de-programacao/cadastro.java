import java.util.Scanner;
import java.util.stream.Stream;

public class cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cadastro!");
        System.out.println("Por favor, insira seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Insira sua idade:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha pendente

        System.out.println("Insira seu e-mail:");
        String email = scanner.nextLine();

        System.out.println("curso realizado");
        String curso = scanner.nextLine();

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
        System.out.println("Curso:"+curso);




        scanner.close();


    }
}