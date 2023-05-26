import java.util.Scanner;

public class Calculadora{
    public static void main(String [] args) {

        boolean aux = true;
        int opc, numero;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("Calculadora\n");
            System.out.println("1 - Decimal -> Binário\n2 - Decimal Negativo -> Binário Negativo\n0 - Sair");
            System.out.print("Opção: ");
            opc = Integer.parseInt(entrada.nextLine());

            switch(opc) {
                case 0:
                    aux = false;
                    break;

                case 1:
                    System.out.print("Número decimal: ");
                    numero = Integer.parseInt(entrada.nextLine());
            
                    System.out.print("Binário: ");
                    converteBinario(numero);
                    System.out.println("\n\n\n");
                    break;

                case 2:
                    System.out.print("Número Decimal Negativo: ");
                    numero = Integer.parseInt(entrada.nextLine());
            
                    System.out.print("Binário Negativo: ");
                    converteBinarioNegativo(numero);
                    System.out.println("\n\n\n");
                    break;

                default:
                    System.out.println("Opção Inválida\n\n");
                    System.out.println("Pressione Enter para continuar\n\n");
                    entrada.nextLine();
                    break;
            }

        }while(aux);

        entrada.close();
    }

    public static void converteBinario(int n) {
        if (n > 1)
            converteBinario(n / 2);
        
        System.out.print(n % 2);
    }

    public float soma(float n1, float n2) {
        float r = n1 + n2;

        return r;
    }

    public float subtracao(float n1, float n2) {
        float r = n1 - n2;

        return r;
    }

    public float mult(float n1, float n2) {
        float r = n1 * n2;

        return r;
    }

    public float div(float n1, float n2) {
        float r = n1 / n2;

        return r;
    }

    public static String converteBinarioNegativo(int decimal) {
        StringBuilder binary = new StringBuilder();
        
        while (decimal != 0) {
            binary.insert(0, Math.abs(decimal % 2));
            decimal /= -2;
        }
        
        return binary.toString();
    }

}