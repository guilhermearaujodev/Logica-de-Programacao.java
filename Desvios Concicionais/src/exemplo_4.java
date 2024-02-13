import java.util.Scanner;
//Dado um número pelo usuário, exibir o dia da semana correspondente.
public class exemplo_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dia;

        System.out.println("Digite um número de 1 à 7 para saber o dia da semana!");
        dia = entrada.nextInt();

        switch(dia)
        {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-feira"); break;
            case 3: System.out.println("Terça-feira"); break;
            case 4: System.out.println("Quarta-feira"); break;
            case 5: System.out.println("Quinta-feira"); break;
            case 6: System.out.println("Sexta-feira"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Dia inválido"); break;
        }
    }
}
