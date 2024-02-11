import java.util.Scanner;
//LAÇO FAÇA-ENQUANTO
//Em uma eleição, há três candidatos: 1 – Huguinho; 2 – Zezinho e 3 – Luizinho.
//Fazer um algoritmo que leia votos dados pelo usuário até que ele digite 0 (zero).
//Ao finalizar a votação, informar quantos votos cada candidato obteve.
public class exemplo_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hug, zez, lui, voto;

        //zera as variáveis dos candidatos
        hug = zez = lui = 0;
        System.out.println("1 - Huguinho: ");
        System.out.println("2 - Zezinho: ");
        System.out.println("3 - Luizinho: ");
        System.out.println("0 - Sair: ");

        //início do laço Faça-Enquanto
        do {
            System.out.println("Digite o voto: ");
            voto = teclado.nextInt();
            switch(voto) {
                case 1 : hug++; break;
                case 2 : zez++; break;
                case 3 : lui++; break;
                default: System.out.println("Voto inválido, digite: 1,2 ou 3");
            }
        }
        while(voto != 0);

        //Exibe o resultado da apuração
        System.out.println("1 - Huguinho: " + hug + " votos");
        System.out.println("2 - Huguinho: " + zez + " votos");
        System.out.println("3 - Huguinho: " + lui + " votos");
    }
}
