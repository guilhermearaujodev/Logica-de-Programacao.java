import java.util.Scanner;
//DESVIO COMPOSTO
//Uma empresa dará aumento para os seus funcionários.
//Caso ele trabalhe menos de três anos na empresa, ganhará 5% de aumento, caso contrário 10%.
public class exemplo_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tempo_empresa;
        double sal, aumento, novo_sal;

        System.out.println("Digite o seu tempo de casa: ");
        tempo_empresa = entrada.nextInt();
        System.out.println("Digite o seu salário: ");
        sal = entrada.nextDouble();

        if (tempo_empresa < 3) {
            aumento = sal * 0.05;
        }
        else {
            aumento = sal * 0.1;
        }
            novo_sal = sal + aumento;
            System.out.println("O seu salário foi de " + sal + " para " + novo_sal);
    }
}

