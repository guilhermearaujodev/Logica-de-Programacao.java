//Cria um procedimento para exibir na tela o nome do usuário e a saudação de acordo com o horário do dia.
public class exemplo_3 {
    public static void saudacao2(String usuario, int hora)
    {
        String msg;
        if (hora < 12) {
            msg = "Bom dia!";
        }
            else if (hora < 18) {
            msg = "Boa tarde!";
        }
        else {
            msg = "Boa noite!";
        }
        System.out.println("Olá " + usuario + ", " + msg + " Você está logado");
    }
    public static void main(String[] args)
    {
     saudacao2("Guilherme", 14);
    }
}
