import java.util.Scanner;

public class aluguel {
    public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);


                System.out.println("Quantos dias o carro foi alugado?");
                int diasAlugados = scanner.nextInt();


                System.out.println("Quantos quilômetros foram rodados?");
                double quilometrosRodados = scanner.nextDouble();


                double taxaDiaria = 86.75;
                double taxaQuilometragem = 1.23;

                double valorAluguel = (diasAlugados * taxaDiaria) + (quilometrosRodados * taxaQuilometragem);


                System.out.println("\nTaxa diária: R$" + taxaDiaria);
                System.out.println("Taxa por quilômetro rodado: R$" + taxaQuilometragem);
                System.out.println("\nValor total do aluguel: R$" + valorAluguel);

                scanner.close();
            }
        }