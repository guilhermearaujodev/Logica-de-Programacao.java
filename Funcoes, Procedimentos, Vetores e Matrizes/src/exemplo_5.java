import java.util.Scanner;

//Função com Parâmetro
//Criar uma função do tipo booleana que retorne True caso uma nota seja válida ou False se não for.
//No programa principal aplicar a função calculando a média de duas notas.
public class exemplo_5 {
    public static boolean nota_valida(double nota)
    {
        if (nota >= 0 && nota <= 10)
            return (true);
        else return (false);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        //lendo a nota 1
        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextDouble();
        // verificando se a nota 1 é valida
        if (nota_valida(nota1)) {
            // lendo nota 2
            System.out.println("Digite a nota 2: ");
            nota2 = entrada.nextDouble();
            //verificando se a nota 2 é valida
            if (nota_valida(nota2))
            {
                //se for, calcular e exibir a média
                media = (nota1 + nota2) / 2;
                System.out.println("A média das notas " + nota1 + " e " + nota2 + " é " + media);
            }
            else
            {
                //mensagem de erro para nota 2
                System.out.println("A nota 2 => '" + nota2 + "' é inválida");
            }
        }
        else
        {
            //mensagem de erro para nota 1
            System.out.println("A nota 1 => '" + nota1 + "' é inválida");
        }
    }
}
