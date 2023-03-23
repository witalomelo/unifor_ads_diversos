package byteBank;

public class CriaConta {
	
	public static void main(String[] args) {
		//comando para instanciar um objeto a partir da classe conta
		Conta primeiraConta = new Conta();
		
		//acrescentar um atributo para um objeto através do ponto
		primeiraConta.saldo = 200;
		
		// saída
		System.out.println(primeiraConta.saldo);
		
		// acrescenta ao saldo +100
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		//criar segundo objeto
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50; //saldo da segunda conta
		
		//referencia.atributo(estrutura)
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		segundaConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("agora a agencia da segunda conta esta na agencia " + segundaConta.agencia);

		//verificar se a primeira é igual a segunda 
		if (primeiraConta == segundaConta) {
			System.out.println("contas iguais");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
