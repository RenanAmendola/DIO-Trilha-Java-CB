import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner Ler = new Scanner(System.in);

        ContaBanco usuario = new ContaBanco();

        System.out.println("Bem vindo ao banco DIO, por favor crie a sua conta!");

        System.out.println("Por favor informe o seu nome!");
        usuario.Nome_Cliente = Ler.nextLine();

        System.out.println("Seja Bem vindo " + usuario.Nome_Cliente + "!");
        System.out.println();
        System.out.println("Agora insira a sua Agência!");
        System.out.println("PS: A agência deve ficar no seguinte formato: 000-0");
        usuario.Agencia = Ler.nextLine();

        System.out.println("Perfeito, agora o número da sua conta!");
        System.out.println("PS: A conta deve ter até no máximo 4 números, nesse formato: 0000");
        usuario.Numero_Conta = Ler.nextInt();

        // Consumir a nova linha pendente após nextInt()
        Ler.nextLine();

        System.out.println("Gostaria de adicionar algum dinheiro para a sua nova conta?");
        System.out.println("y/n?");

        String resposta = Ler.nextLine();

        if (resposta.equalsIgnoreCase("y")) {
            System.out.println("Certo, por favor insira a quantia desejada!");
            usuario.Saldo = Ler.nextDouble();
        } else {
            System.out.println("Entendido! Neste caso a sua conta irá começar com o valor zerado (R$0)");
            usuario.Saldo = 0;
        }

        System.out.println("Obrigado por criar uma conta no banco DIO SR(A): " + usuario.Nome_Cliente);
        System.out.println("O SR(A) está registrado na Agência: " + usuario.Agencia);
        System.out.println("Eis o número de sua conta: " + usuario.Numero_Conta);
        System.out.println("Seu saldo atual é de: R$ " + usuario.Saldo);

        Ler.close();
    
    }
}
