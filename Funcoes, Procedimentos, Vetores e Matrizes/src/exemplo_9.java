import java.util.Scanner;

public class exemplo_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int[4][2];
        //l = linha, c = coluna
        int l, c;

        //Preenchendo a matriz
        //Minha matriz tem 4 linhas e 2 colunas
        System.out.println("Preenchendo a matriz [4][2]");
        for (l = 0; l < 4; l++)
            for (c = 0; c < 2; c++)
            {
                System.out.println("Posição [" + l + "][" + c + "] = ");
                matriz[l][c] = entrada.nextInt();
            }

        //Exibindo a matriz
        System.out.println("Preenchendo a matriz [4][2]");
        for (l = 0; l < 4; l++)
        {
            for (c = 0; c < 2; c++)
            {
                System.out.println(matriz[l][c] + "\t");
            }
            System.out.println();
        }

        //Somando a matriz
        System.out.println("\nSomando os elementos da matriz [4][2]");
        int soma = 0;

        for (l = 0; l < 4; l++)
            for (c = 0; c < 2; c++)
                soma = soma + matriz[l][c];

        System.out.println("Somatória = " + soma);
    }
}
