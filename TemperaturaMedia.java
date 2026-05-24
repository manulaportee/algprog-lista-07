import java.util.ArrayList;
import java.util.Scanner;

public class TemperaturaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> temperaturasAnuais = new ArrayList<>();

        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double soma = 0;

        for (int c = 0; c < 12; c++){
            System.out.println("Digite a temperatura média de " + meses[c] + ": ");
            Double temperaturaMedia = scanner.nextDouble();

            temperaturasAnuais.add(temperaturaMedia);
            soma += temperaturaMedia;
        }

        double mediaAnual = soma / temperaturasAnuais.size();
        System.out.println("Média anual das temperaturas: " + mediaAnual + "°.");

        System.out.println("Temperaturas acima da média anual: ");

        for (int c = 0; c < temperaturasAnuais.size(); c++){
            if (temperaturasAnuais.get(c) > mediaAnual) {
                System.out.println(
                    meses[c] + " - " + temperaturasAnuais.get(c) + "°C"
                );
            }
        }

        scanner.close();
    }
    
}
