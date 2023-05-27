import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        boolean executar = true;
        int opc;
        float numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Calculadora\n");
            System.out.println("1 - Decimal -> Binário");
            System.out.println("2 - Decimal Negativo -> Binário Negativo");
            System.out.println("3 - Soma");
            System.out.println("4 - Subtração");
            System.out.println("5 - Multiplicação");
            System.out.println("6 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opc = Integer.parseInt(entrada.nextLine());

            switch (opc) {
                case 0:
                    executar = false;
                    break;

                case 1:
                    System.out.print("Número decimal: ");
                    int numeroDecimal = Integer.parseInt(entrada.nextLine());

                    System.out.print("Binário: ");
                    System.out.println(converteDecimalParaBinario(numeroDecimal));
                    System.out.println("\n\n\n");
                    break;

                case 2:
                    System.out.print("Número Decimal Negativo: ");
                    int numeroDecimalNegativo = Integer.parseInt(entrada.nextLine());

                    System.out.print("Binário Negativo: ");
                    System.out.println(converteDecimalNegativoParaBinarioNegativo(numeroDecimalNegativo));
                    System.out.println("\n\n\n");
                    break;

                case 3:
                    System.out.print("Número 1: ");
                    numero1 = Float.parseFloat(entrada.nextLine());
                    System.out.print("Número 2: ");
                    numero2 = Float.parseFloat(entrada.nextLine());

                    float soma = realizarSoma(numero1, numero2);
                    System.out.println("Resultado: " + soma);
                    System.out.println("\n\n\n");
                    break;

                case 4:
                    System.out.print("Número 1: ");
                    numero1 = Float.parseFloat(entrada.nextLine());
                    System.out.print("Número 2: ");
                    numero2 = Float.parseFloat(entrada.nextLine());

                    float subtracao = realizarSubtracao(numero1, numero2);
                    System.out.println("Resultado: " + subtracao);
                    System.out.println("\n\n\n");
                    break;

                case 5:
                    System.out.print("Número 1: ");
                    numero1 = Float.parseFloat(entrada.nextLine());
                    System.out.print("Número 2: ");
                    numero2 = Float.parseFloat(entrada.nextLine());

                    float multiplicacao = realizarMultiplicacao(numero1, numero2);
                    System.out.println("Resultado: " + multiplicacao);
                    System.out.println("\n\n\n");
                    break;

                case 6:
                    System.out.print("Número 1: ");
                    numero1 = Float.parseFloat(entrada.nextLine());
                    System.out.print("Número 2: ");
                    numero2 = Float.parseFloat(entrada.nextLine());

                    float divisao = realizarDivisao(numero1, numero2);
                    System.out.println("Resultado: " + divisao);
                    System.out.println("\n\n\n");
                    break;

                default:
                    System.out.println("Opção Inválida\n\n");
                    System.out.println("Pressione Enter para continuar\n\n");
                    entrada.nextLine();
                    break;
            }

        } while (executar);

        entrada.close();
    }

    public static String converteDecimalParaBinario(int n) {
        StringBuilder binario = new StringBuilder();

        while (n > 0) {
            binario.insert(0, n % 2);
            n /= 2;
        }

        return binario.toString();
    }

    public static String converteDecimalNegativoParaBinarioNegativo(int decimal) {
        StringBuilder binario = new StringBuilder();
        int n = Math.abs(decimal);

        if (n == 0) {
            binario.append("0");
        }

        while (n > 0) {
            binario.insert(0, n % 2);
            n /= 2;
        }

        binario.insert(0, "1");  // Adiciona o bit de sinal "1"

        return binario.toString();
    }

    public static float realizarSoma(float n1, float n2) {
        return n1 + n2;
    }

    public static float realizarSubtracao(float n1, float n2) {
        return n1 - n2;
    }

    public static float realizarMultiplicacao(float n1, float n2) {
        return n1 * n2;
    }

    public static float realizarDivisao(float n1, float n2) {
        return n1 / n2;
    }
}

