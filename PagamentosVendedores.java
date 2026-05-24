import java.util.ArrayList;
import java.util.Scanner;

public class PagamentosVendedores {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        ArrayList<Double> salarios = new ArrayList<>();

        int[] contadores = new int[9];

        System.out.print("Quantos vendedores deseja cadastrar? ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Digite o valor das vendas do vendedor " + (i + 1) + ": ");
            double vendas = scanner.nextDouble();

            double salario = 200 + (vendas * 0.09);

            salarios.add(salario);
        }

        for (double salario : salarios) {

            if (salario >= 1000) {
                contadores[8]++;
            }
            else {

                int indice = ((int) salario - 200) / 100;

                if (indice >= 0 && indice < 8) {
                    contadores[indice]++;
                }
            }
        }

        System.out.println("\nQuantidade de vendedores por faixa salarial:");

        System.out.println("$200 - $299: " + contadores[0]);
        System.out.println("$300 - $399: " + contadores[1]);
        System.out.println("$400 - $499: " + contadores[2]);
        System.out.println("$500 - $599: " + contadores[3]);
        System.out.println("$600 - $699: " + contadores[4]);
        System.out.println("$700 - $799: " + contadores[5]);
        System.out.println("$800 - $899: " + contadores[6]);
        System.out.println("$900 - $999: " + contadores[7]);
        System.out.println("$1000 em diante: " + contadores[8]);

        scanner.close();
    }
}
