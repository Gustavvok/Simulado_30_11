package simulado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaVendaPassagens {
	 private List<Passagem> passagens;
	 
	 public void venderPassagem() { 
	        this.passagens = new ArrayList<>();
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite seu nome: ");
	        String nome = scanner.nextLine();

	        System.out.print("Digite sua origem: ");
	        String origem = scanner.nextLine();

	        System.out.print("Digite o destino: ");
	        String destino = scanner.nextLine();

	        Passagem passagem = new Passagem(nome, origem, destino);
	        passagens.add(passagem);

	        System.out.println("Passagem vendida!");
	    }
		public void listarDestinos(String nome) {
			System.out.println("Destinos para " + nome + ":");
			for (Passagem passagem : passagens) {
				if (passagem.getNome().equals(nome)) {
            System.out.println(passagem.getDestino());
        }
    }
}
}

