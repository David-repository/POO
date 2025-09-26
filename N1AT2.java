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
            System.out.println("0 - Sair");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    // CADASTRO CLIENTE
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
                    
                case 2:
                	//COMPRA DE CARRO
                	System.out.println("Compra de Carro");
                    
                    int carro = -1;
                    while (carro < 1 || carro > 3) {
                        System.out.println("Escolha um carro:");
                        System.out.println("1 - Chevette");
                        System.out.println("2 - Mercedona");
                        System.out.println("3 - Uno quadrado");
                        carro = sc.nextInt();
                        sc.nextLine();
                        if (carro < 1 || carro > 3) {
                            System.out.println("Opção inválida! Tente novamente.\n");
                        }
                    }

                    String nomeCarro = (carro == 1) ? "Chevette" : (carro == 2) ? "Mercedona" : "Uno quadrado";

                    // COR
                    System.out.print("Digite a cor do carro: ");
                    String cor = sc.nextLine();

                    //FORMA DE PAGAMENTO
                    int pagamento = -1;
                    while (pagamento < 1 || pagamento > 2) {
                        System.out.println("Forma de pagamento:");
                        System.out.println("1 - À vista");
                        System.out.println("2 - Financiado");
                        pagamento = sc.nextInt();
                        sc.nextLine();
                        if (pagamento < 1 || pagamento > 2) {
                            System.out.println("Opção inválida! Tente novamente.\n");
                        }
                    }

                    String formaPagamento = (pagamento == 1) ? "À vista" : "Financiado";

                    //RESUMO
                    System.out.println("\nCarro escolhido: " + nomeCarro);
                    System.out.println("Cor: " + cor);
                    System.out.println("Pagamento: " + formaPagamento + "\n");
                    break;  
            }

                
        }
		
	sc.close();
	}
}