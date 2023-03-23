package modeloBanco;

public class TestaConta {
	public static void main(String[] args) {
		CriaConta c1 = new CriaConta();
		c1.setNumConta(111);
		c1.setDono("joao");
		c1.abrirConta("CC");
		c1.depositar(500);
		c1.sacar(50);
		c1.pagarMensal();

		CriaConta c2 = new CriaConta();
		c2.setNumConta(222);
		c2.setDono("creuza");
		c2.abrirConta("CP");
		
		CriaConta c3 = new CriaConta();
		c3.abrirConta("CC");
		
	
		//System.out.println(c1.toString());
		//System.out.println(c2.toString());
		System.out.println(c3.toString());
		

	}


}
