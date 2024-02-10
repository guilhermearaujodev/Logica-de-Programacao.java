import java.util.Scanner;

//CALCULADORA – ESCOLHA
// Dados dois números inteiros e uma operação aritmética desejada calcule a resposta adequada:
// Utilize os símbolos a seguir para ler qual a operação escolhida:
// + soma   -subtração  * multiplicação  / divisão
// esses conjuntos podem conter outros testes de seleção, que por sua vez, também podem conter outros e assim por diante.
public class exemplo_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numero1, numero2, resultado;
        String operador;

        System.out.println("Digite o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println("Digite a operação desejada (+ - * /): ");
        operador = entrada.next();

        switch (operador){
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Soma = " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Subtração = " + resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Multiplicação = " + resultado);
                break;
            case "/":
                // Certifica-se que o segundo número não é zero
                if(numero2 == 0)
                    System.out.println("Não há divisão por zero");
                else {
                    resultado = numero1 / numero2;
                    System.out.println("Divisão = " + resultado);
                }
                break;
            default:
                System.out.println("Operador inválido");
        }
    }
}
