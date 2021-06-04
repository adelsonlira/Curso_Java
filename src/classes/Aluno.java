package classes;

public class Aluno {
	
	private String nome;
	private int idade;
	private String cpf;
	private double nota1, nota2, nota3;
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	/*Método para calcular a média do aluno*/
	public double getMedia() {
		return (nota1+nota2+nota3)/3;
	}
	
	/*Método para saber a situação do aluno*/
	public String getSituacaoAluno() {
		if (this.getMedia() >= 7) {
			return "Aluno Aprovado";
		} else if(this.getMedia() >= 3 && this.getMedia() < 7) {
			return "Aluno em Recuperação";
		}else {
			return "Aluno Reprovado";
		}
	}
	
	/*Método alternativo para saber a situação do aluno, retornando true or false*/
	public Boolean getSituacaoAluno2() {
		if (this.getMedia() >= 7) {
			return true;		
		} else  {
			return false;
		}
	}
	
	//toString Facilita no retorno dos objetos
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3
				+ "]";
	}
	
	//equals e hashcode sobrescrita dos objetos, exemplo comparação de objetos (cpf)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	
}
