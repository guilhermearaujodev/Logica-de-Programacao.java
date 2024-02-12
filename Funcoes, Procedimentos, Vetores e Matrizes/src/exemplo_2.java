import java.util.Scanner;

//Saudações com parâmetros de acordo com o horário do dia.
public class exemplo_2 {
   public static void saudacao(int hora)
   {
       String msg;

       if(hora < 12)
           msg = "Bom dia";
       else if(hora < 18)
           msg = "Boa tarde";
       else
           msg = "Boa noite";

       System.out.println(msg + ", Seja bem vindo!");
   }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        saudacao(20);
    }
}
