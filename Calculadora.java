public class Calculadora{
    public static void main(String [] args) {
        int decimal = 3;
        System.out.printf("O número %d em binário é: ", decimal);
        converteBinario(decimal);
        System.out.println();
    }

    public static void converteBinario(int n) {
        if (n > 1)
            converteBinario(n / 2);
        
        System.out.print(n % 2);
    }
}