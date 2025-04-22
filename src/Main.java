import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-------------- CALCULADORA --------------");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Potência");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            System.out.print("Digite o valor de A: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o valor de B: ");
            double b = scanner.nextDouble();

            try {
                double resultado = 0;
                switch (opcao) {
                    case 1:
                        resultado = a + b;
                        break;
                    case 2:
                        resultado = a - b;
                        break;
                    case 3:
                        resultado = a * b;
                        break;
                    case 4:
                        resultado = a / b;
                        break;
                    case 5:
                        resultado = Math.pow(a, b);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        continue;
                }
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}