import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {

            System.out.println(pergunta);
            System.out.print("Responda com S para sim ou N para não: ");

            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                respostasPositivas++;
            }
        }

        System.out.println();

        if (respostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        }
        else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        }
        else if (respostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        }
        else {
            System.out.println("Classificação: Inocente");
        }

        scanner.close();
    }
}