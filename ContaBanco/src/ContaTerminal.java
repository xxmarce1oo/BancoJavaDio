import java.util.Scanner;
import java.math.BigDecimal;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner Valores = new Scanner(System.in);
    
        
        System.out.println("Digite o número da conta:");
        int NumConta = Valores.nextInt();

        Valores.nextLine();

        System.out.println("Digite o número da agência:");
        String NumAg = Valores.nextLine();

        System.out.println("Digite o seu nome:");
        String Nome = Valores.nextLine();
       
        System.out.println("Digite o valor do depósito");
        BigDecimal depósito = Valores.nextBigDecimal();

        

        System.out.println("Olá "+Nome+" sua conta foi criada, número: "+NumConta+" Agência: "+NumAg+" seu saldo é de:R$"+depósito);
    }
}
