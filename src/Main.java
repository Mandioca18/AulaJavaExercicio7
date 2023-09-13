import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int salarioFuncionario;
        int idadeFuncionario;

        System.out.println("Olá este é o sistema do consórcio, para avaliarmos possíveis compradores de automóveis");

        System.out.println("Para começarmos, o senhor(a) poderia nos dizer sua idade?");
        idadeFuncionario = scan.nextInt();

        System.out.println("E o seu salário?");
        salarioFuncionario = scan.nextInt();

        if (salarioFuncionario > 2000 && idadeFuncionario >= 18) {
            System.out.println("Ótimo, você pode comprar um de nossos veículos");
        } else {
            System.out.println("Lamentamos muito, Mas não podes comprar nenhum de nossos veículos");
        }

    }
}