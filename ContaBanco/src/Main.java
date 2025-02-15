import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! O banco DIO te dá as boas vindas! Vamos agora criar sua conta");
        System.out.println("Qual é o seu nome?");
        String nome = scanner.next();

        System.out.println("Qual é o número da sua conta?");
        int numero = scanner.nextInt();

        System.out.println("Qual é a sua agência?");
        String agencia = scanner.next();

        System.out.println("Qual é o seu saldo? (use vírgula pra casas decimais, e não coloque ponto no milhar)");
        float saldo;
        saldo = scanner.nextFloat();

        ContaTerminal cliente = new ContaTerminal(agencia, nome,  saldo, numero);

        System.out.println(cliente.toString());
        }
    }
