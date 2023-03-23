package conta;

public class testaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta("26272", 0, "Antonio");
		c1.abrirConta(1);
		c1.depositar(100f);
		c1.sacar(100f);
		c1.sacar(50);
		c1.fecharConta();
		
		
		c1.extrato();
		Conta c2 = new Conta("jdnc999",0, "Maria");
		c2.abrirConta(2);
		c2.depositar(200f);
		c2.sacar(300f);
		c2.sacar(50);
		c2.fecharConta();
		c2.extrato();
		
	}
}
