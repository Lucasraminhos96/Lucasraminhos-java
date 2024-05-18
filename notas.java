import java.util.Scanner;

public class hbvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // Obtendo o nome do aluno
                System.out.println("Digite seu nome:");
                String nomeAluno = scanner.nextLine();

                // Obtendo o RA do aluno
                System.out.println("Digite seu RA:");
                String raAluno = scanner.nextLine();

                // Obtendo as três notas de prova
                System.out.println("Digite a nota da primeira prova:");
                double nota1 = scanner.nextDouble();

                System.out.println("Digite a nota da segunda prova:");
                double nota2 = scanner.nextDouble();

                System.out.println("Digite a nota da terceira prova:");
                double nota3 = scanner.nextDouble();

                // Calculando a média
                double media = (nota1 + nota2 + nota3) / 3;

                // Exibindo a mensagem final
                System.out.println("\nQuerido Aluno " + nomeAluno + " do RA " + raAluno + ", sua média foi igual a " + media + ".");
                System.out.println("Obrigado pela atenção!");

                scanner.close();
            }
        }

