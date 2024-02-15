import java.util.Scanner;

public class exemplo_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];
        int i;

        //Preenchendo o vetor
        System.out.println("Preenchendo o vetor...");
        for(i = 0; i < 5; i++) // i = 0
        {
            System.out.println("Posição [" + i + "] = ");
            vetor[i] = entrada.nextInt();
        }

        //Exibindo o vetor
        System.out.println("\nExibindo o vetor...");
        for (i = 0; i < 5; i++)
        {
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }

        //Somando o vetor
        int soma = 0;
        for (i = 0; i < 5; i++)
        {
            soma = soma + vetor[i];
        }
        System.out.println("\nSoma dos elementos = " + soma);
    }
}
