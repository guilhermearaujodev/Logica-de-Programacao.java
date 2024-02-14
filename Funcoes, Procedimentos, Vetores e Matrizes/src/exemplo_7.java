import java.util.Scanner;
//FUNÇÕES E PROCEDIMENTOS

//Em  uma  instituição  de  ensino, um  aluno  é  submetido  a  três  avaliações  em  um semestre.

//A média semestral é calculada por meio de uma média simples das duas maiores avaliações obtidas entre três //avaliações.
//Caso essa média semestral resulte em uma nota inferior a 4, o aluno foi reprovado sem outra oportunidade.
//Caso a média semestral seja maior ou igual a 7, o aluno foi aprovado de forma direta.
//Caso a média esteja entre 4 e 6.9, o aluno tem a oportunidade de fazer o exame por meio de uma nova avaliação.
//Considerando que o aluno está em exame, média final é uma média simples da média semestral com a nota da avaliação //obtida no exame.
//Caso a média final seja inferior a 5, o aluno foi Reprovado em Exame, senão ele foi aprovado.

//Requisitos:
//-O algoritmo efetua todo esse cálculo com apenas um aluno.
//-Consistir as notas para que estejam entre 0 e 10.
//-As mensagens informativas devem ser claras em relação ao problema ou à situação do aluno.
//-Quando necessário, exibir as médias calculadas para simples conferência
public class exemplo_7 {
    public static void main(String[] args)
    {
        // Estancia o objeto Teclado para ler variáveis
        Scanner teclado = new Scanner(System.in);
        // Declaração das variáveis
        float nota1, nota2, nota3, media_semestral, nota_exame, media_exame, menor_nota;
        System.out.print("Nota 1:");
        nota1 = teclado.nextFloat();
        // Verifica se a nota é válida
        if (nota1 >= 0 && nota1 <= 10)
        {
            System.out.print("Nota 2:");
            nota2 = teclado.nextFloat();
            if (nota2 >= 0 && nota2 <= 10)
            {
                System.out.print("Nota 3:");
                nota3 = teclado.nextFloat();
                if (nota3 >= 0 && nota3 <= 10)
                {
                    // Verifica qual a menor nota
                    menor_nota = nota1;
                    if (nota2 < menor_nota)
                    {
                        menor_nota = nota2;
                    }
                    if (nota3 < menor_nota)
                    {
                        menor_nota = nota3;
                    }
                    // Calcula a média tirando a nota com menor valor
                    media_semestral = (nota1 + nota2 + nota3 - menor_nota) / 2;
                    System.out.println("A sua média semestral é " + media_semestral);
                    // Verifica o status do aluno
                    if (media_semestral < 4)
                    {
                        System.out.println("Você está reprovado direto");
                    }
                    else if (media_semestral >= 7)
                    {
                        System.out.println("Você está aprovado direto");
                    }
                    else
                    {
                        // Solicita uma nota em caso de exame
                        System.out.println("VOCÊ FICOU EM EXAME");
                        nota_exame = teclado.nextFloat();
                        if(nota_exame >= 0 && nota_exame <= 10)
                        {
                            // Verifica se passou no exame
                            media_exame = (media_semestral + nota_exame) / 2;
                            if(media_exame < 5)
                            {
                                System.out.println("Reprovado em exame com media " + media_exame);
                            }
                            else
                            {
                                System.out.println("Aprovado em exame com media " + media_exame);
                            }
                        }
                        else
                        {
                            System.out.println("Nota de exame" + nota_exame + "Inválida");
                        }
                    }
                }
                else
                {
                    System.out.println("Nota 3 " + nota3 + " - É inválida");
                }
            }
            else
            {
                System.out.println("Nota 2 " + nota2 + " - É inválida");
            }
        }
        else
        {
            System.out.println("Nota 1 " + nota1 + " - É inválida");
        }
    }
}