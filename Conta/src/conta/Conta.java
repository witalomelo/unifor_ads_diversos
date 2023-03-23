package conta;

public class Conta {
	//atributos
	public String numConta;
	public int tipo;
	private String dono;
	private boolean status;
	private float saldo;
	
	
	public Conta(String numConta, int tipo, String dono) {
		this.setNumConta(numConta);
		this.setTipo(tipo);
		this.setDono(dono);
		this.setStatus(false);
		this.setSaldo(0);
		
	}
	
	//metodos
	public void extrato() {
		System.out.println("--------------------------------------");
		System.out.println("numero da conta: " + this.getNumConta());
		System.out.println("tipo: " + this.getTipo());
		System.out.println("dono: " + this.getDono());
		System.out.println("status: " + this.getStatus());
		System.out.println("saldo: " + this.getSaldo());
	}
	
	
	public void abrirConta(int t) {
		this.setTipo(t);
		this.setStatus(true);
		if (this.getStatus()) {
			if (t == 1) {
				this.setSaldo(50);
			} else if (t == 2) {
				this.setSaldo(150);
			}
		}
		

		
	}
	public void fecharConta() {
		if(this.getStatus()) {
			if (this.getSaldo() == 0) {
				this.setStatus(false);
			} else {
				System.out.println("conta com dinheiro");
			}
		} else {
			System.out.println("conta ja esta fechada");
		}
		
	}
	public void depositar(float v) {
		if (this.getStatus() && this.getSaldo() > 0) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("deposito realizado");
		} else {
			System.out.println("impossivel depositar");
		}
		
	}
	public void sacar(float r) {
		if (this.getStatus() && this.getSaldo() > 0 ) {
			this.setSaldo(this.getSaldo() - r);
			System.out.println("saque realizado");
		} else {
			System.out.println("sem saldo suficiente");
		}
		
	}
	
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	

}
