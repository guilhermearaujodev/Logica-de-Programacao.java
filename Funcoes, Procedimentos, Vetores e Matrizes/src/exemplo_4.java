import java.util.Scanner;

//Função sem Parâmetro
//Criar uma função do tipo real que retorne o valor de pi
//Para calcular a área de um circulo com o raio 5 (a = pi . r2).
//Definindo uma função
public class exemplo_4 {
    //função sem parâmetro
    public static double pi (){
        return (3.14159);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, r = 5;
        a = pi() * (r * r);
        System.out.println("A área do círculo com raio " + r + " é " + a);
    }
}
