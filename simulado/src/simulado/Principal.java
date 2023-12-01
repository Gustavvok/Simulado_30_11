package simulado;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        SistemaVendaPassagens sistema = new SistemaVendaPassagens();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Vender Passagem");
            System.out.println("2 - Listar Destinos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    sistema.venderPassagem();
                    break;
                case 2:
                    scanner.nextLine(); 
                    System.out.print("Digite seu nome para listar destinos: ");
                    String nome = scanner.nextLine();
                    sistema.listarDestinos(nome);
                    break;
                case 0:
                    System.out.println("Encerramento,Obbrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            } 
        } while (opcao != 0);
        scanner.close();
    }
}

