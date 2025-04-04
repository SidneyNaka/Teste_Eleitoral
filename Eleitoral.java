public class Eleitoral {
	private String nome;
	private int idade;
	
	public Eleitoral() {
	}
	public Eleitoral(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimir() {
		System.out.println("Nome....:"+nome);
		System.out.println("Idade...:"+idade);
		verificar();
	}
	
	public void verificar() {
		if(idade < 16)
			System.out.println("O Eleitor não pode votar");
		else if(idade <= 65)
			System.out.println("O Eleitor deve Votar");
		else
			System.out.println("Voto Facultativo");
	}
}
