package controleRemoto;

public class TesteControle {
	public static void main(String[] args) {
		ControleRemoto c1 = new ControleRemoto();
		c1.ligar();
		c1.maisvolume();
		c1.ligarMudo();
		c1.desligarMudo();
		c1.pause();
		c1.play();
		c1.desligar();
		c1.pause();

		c1.abrirMenu();
		
	}

}
