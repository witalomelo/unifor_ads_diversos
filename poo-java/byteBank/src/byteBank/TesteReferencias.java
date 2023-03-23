package byteBank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; // no Java copia o que está na direita e cola na esquerda.
		// primeiraConta não é um objeto mais uma referencia p/ um mesmo objeto
			
		System.out.println("saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda: " + segundaConta.saldo);
		
		// verificar se a primeira tem as mesmas informações da segunda
		if(primeiraConta == segundaConta) {
			System.out.println("é a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
