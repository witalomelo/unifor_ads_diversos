import java.util.Random;


public class Luta {
    //tipo abstrato de dados
	private Lutador desafiado; //instancia da classe lutador
	private Lutador desafiante; //instancia da classe lutador
	private int rounds;
	private boolean aprovada;
	
	
	//verifica se a lutador l1 e l2 são mesma categoria e se não são 
	// iguais
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() &&
				l1 != l2) {
			System.out.println("luta marcada com sucesso");
			this.aprovada= true;
			this.desafiado = l1;
			this.desafiante = l2;			
		} else {
			System.out.println("lutadores de categorias diferentes");
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;			
		}
	}
	
	//vitoria/ empate ou derrota utilizando o random
	public void lutar() {
		if (this.aprovada) {
			System.out.println("---------------------------");
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("---------------------------");
			System.out.println("### DESAFIANTE ###)");
			this.desafiante.apresentar();	
			
			Random aleatorio = new Random(); //escolhe vencedor aleatorio
			int vencedor = aleatorio.nextInt(3); //0 1 2
			switch(vencedor) {
				case 0: // empate
					System.out.println("-------------------------");
					System.out.println("EMPATOU!");
					this.desafiado.empatarLuta(); // adiciona +1 empate
					this.desafiante.empatarLuta(); // adiciona +1 empate
					break;
				case 1: // desafiado vence
					System.out.println("--------------------------");
					System.out.println("VITORIA DO: " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: // desafiante vence
					System.out.println("---------------------------");
					System.out.println("VITORIA DO: " + this.desafiante.getNome());
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;				
			}
		} else {
			System.out.println("a luta não pode acontecer");
		}
	}
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
 
}



