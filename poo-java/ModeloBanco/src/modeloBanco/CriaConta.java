package modeloBanco;

public class CriaConta {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//metodos
	
	public void estadoAtual() {
		System.out.println("---------------------------------------------");
		System.out.println("numero da conta: " + this.getNumConta());
		System.out.println("tipo: " + this.getTipo());
		System.out.println("dono: " + this.getDono());
		System.out.println("saldo " + this.getSaldo());
		System.out.println("status: " + this.getStatus());
	}
	@Override
	public String toString() {
		return "CriaConta [numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo
				+ ", status=" + status + "]";
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
			
		}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("conta com dinheiro");
		} else if (this.getSaldo() < 0){
			System.out.println("conta em debito");
		} else {
			this.setStatus(false);
		}
	}
	public void depositar(float v) {
		if (this.getStatus ()) {
			this.setSaldo(getSaldo() + v);
			System.out.println("deposito realizado " + this.getDono());
		} else {
			System.out.println("impossivel depositar");
		}
	}
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("saque realizado");
			} else {
				System.out.println("saldo insuficente");
			} 
		} else {
			System.out.println("impossivel sacar");
		}
	}
		
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > 0) {
				this.setSaldo(getSaldo() - v);
			} else {
				System.out.println("saldo insuficiente");
			}
		} else {
			System.out.println("impossivel pagar");
		}
	}
		
	
	//get and set
		public int getNumConta() {
			return numConta;
		}
		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getDono() {
			return dono;
		}
		public void setDono(String dono) {
			this.dono = dono;
		}
		public float getSaldo() {
			return saldo;
		}
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
}

	