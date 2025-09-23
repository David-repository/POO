package programaConcessionaria;

import java.util.Scanner;

public class N1AT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 123;
        int senhaDigitada = -1;

        while (senhaDigitada != senhaCorreta) {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextInt();

            if (senhaDigitada != senhaCorreta) {
                System.out.println("ERRO DE SENHA");
            }
        }
        System.out.println("SENHA CORRETA\n");

        //MENU
        int menu = -1;
        while (menu != 0) {
            System.out.println("---MENU PRINCIPAL---");
            System.out.println("1 - Cadastro Cliente");
            System.out.println("2 - Compra de Carro");
            System.out.println("3 - Compra de Acessório");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    // Cadastro cliente
                    System.out.println("Cadastro de Cliente");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();

                    System.out.println("\nCliente cadastrado com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Telefone: " + telefone);
                    System.out.println("Endereço: " + endereco);
                    break;
            }

                
        }
		
	sc.close();
	}
}