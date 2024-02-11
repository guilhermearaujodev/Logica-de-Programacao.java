import java.util.Scanner;

//Laço Faça-enquanto
//Somar números digitados pelo usuário até que ele digite um número negativo.
//(O número negativo não deve fazer parte da soma)
//do = faça
//while pós condicional
public class exemplo_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, soma = 0;

        do{
            System.out.println("Digite um número: ");
            num = entrada.nextInt();
            if (num > 0)
            {
                soma = soma + num;
            }
        }while (num >= 0);

        System.out.println("Soma = " + soma);
    }
}
