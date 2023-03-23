package uec;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//private String nome, nacionalidade, categoria;
	//private int idade, vitorias, derrotas, empares;
	//private float altura, peso;
	
	
	//construtor
	public Lutador(String no, String na, int id, float al,
			float pe, int vi, int de, int en) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(en);
	}
	
	
	
	//metodos 
	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("origem: " + this.getNacionalidade());
		System.out.println("idade: " + this.getIdade());
		System.out.println("altura: " + this.getAltura());
		System.out.println("peso: " + this.getPeso());
		System.out.println("vitoria " + this.getVitorias());
		System.out.println("derrota: " + this.getDerrotas());
		System.out.println("empate: " + this.getEmpates());
		
	}
	public void status() {
		System.out.println("----------STATUS --------");
		System.out.println(this.getNome());
		System.out.println("é um peso: " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
		
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
		
	}

	//get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		this.nome = no;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria(); //automaticamente ajusta categoria de acordo com peso
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "invalido";
		} else if(this.peso <= 70.3) {
			this.categoria = "leve";
		} else if(this.peso <= 83.9) {
			this.categoria = "media";
		} else if (this.peso <= 120.2) {
			this.categoria = "pesado";
		} else {
			this.categoria = "invalido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
