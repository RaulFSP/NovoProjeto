
import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo a este programa!!!");

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = sc.nextLine();

        System.out.println("Digite seu cpf:");
        String cpf = sc.nextLine();

        System.out.println("Digite sua idade:");
        Integer idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu peso:");
        Double peso = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite sua altura:");
        Double altura = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite seu estado civil:");
        String estadoCivil = sc.nextLine();

        System.out.println("""
                -----------------
                Suas informações
                -----------------
                Nome:%s
                CPF:%s
                Idade:%d
                Peso:%f
                Altura:%f
                EC:%s
                -----------------
                """.formatted(nomeCompleto, cpf, idade, peso, altura, estadoCivil));
        sc.close();
    }
}
