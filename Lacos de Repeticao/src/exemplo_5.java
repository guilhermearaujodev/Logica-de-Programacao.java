import java.util.Scanner;
//Laço Para
//Dados 5 números pelo usuário, exibir o de maior valor.
// for(<inicialização>; <condição>; incremento)
// ++ soma 1
public class exemplo_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, cont, maior;

        System.out.println("Digite 5 números: ");
        num = entrada.nextInt();
        maior = num;
        for(cont = 1; cont <= 4; cont++)
        {
            num = entrada.nextInt();
            if(num > maior)
            {
                maior = num;
            }
        }
        System.out.println("Maior valor = " + maior);
    }
}
