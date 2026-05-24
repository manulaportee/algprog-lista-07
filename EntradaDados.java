import java.util.ArrayList;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        double nota;

        while (true) {

            System.out.print("Digite uma nota (-1 para encerrar): ");
            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            notas.add(nota);
        }

        System.out.println("\nQuantidade de valores lidos: " + notas.size());

        System.out.println("\nValores na ordem informada:");

        for (Double valor : notas) {
            System.out.print(valor + " ");
        }

        System.out.println("\n\nValores na ordem inversa:");

        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;

        for (Double valor : notas) {
            soma += valor;
        }

        System.out.println("\nSoma dos valores: " + soma);

        double media = soma / notas.size();

        System.out.println("Média dos valores: " + media);

        int acimaMedia = 0;

        for (Double valor : notas) {

            if (valor > media) {
                acimaMedia++;
            }
        }

        System.out.println("Quantidade acima da média: " + acimaMedia);

        int abaixoSete = 0;

        for (Double valor : notas) {

            if (valor < 7) {
                abaixoSete++;
            }
        }

        System.out.println("Quantidade abaixo de 7: " + abaixoSete);

        System.out.println("\nPrograma encerrado.");

        scanner.close();
    }
}
