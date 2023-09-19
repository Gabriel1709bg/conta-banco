import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
//TODO:"Conhecer e importar a classe Scanner"
// "Exibir as mensagens para o nosso usuário"
// "Obter pelo Scanner os valores digitados no terminal"
// "Exibir a mensagem conta criada"


        System.out.println("Parabéns, a sua conta foi criada!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar: ");
        double saldo = scanner.nextDouble();


        System.out.println("Digite o valor que deseja sacar: ");
        double valorSolicitado = scanner.nextDouble();



        if (valorSolicitado < saldo) {
            double saldoAtual = saldo - valorSolicitado;
            System.out.println("Você sacou, agora seu saldo é: " + saldoAtual);
        }
        if (valorSolicitado > saldo) {
            System.out.println("Seu saldo é: " + saldo + "\nNão foi possível sacar, seu saldo é insuficiente.");
        }


    }
}
