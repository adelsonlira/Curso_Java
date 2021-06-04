package main;

import javax.swing.JOptionPane;

import classes.Aluno;

public class Principal {

	public static void main(String args[]) {

		/*String nome = JOptionPane.showInputDialog("Nome do aluno");
		String idade = JOptionPane.showInputDialog("Idade do aluno");
		String nota1 = JOptionPane.showInputDialog("Primeira nota");
		String nota2 = JOptionPane.showInputDialog("Segunda nota");
		String nota3 = JOptionPane.showInputDialog("Terceira nota");

		Aluno aluno = new Aluno();

		aluno.setNome(nome);
		aluno.setIdade(Integer.parseInt(idade));
		aluno.setNota1(Double.parseDouble(nota1));
		aluno.setNota2(Double.parseDouble(nota2));
		aluno.setNota3(Double.parseDouble(nota3));*/

		/*System.out.println(
				"O aluno " + aluno.getNome() + " de " + aluno.getIdade() + " anos, teve média " + aluno.getMedia());
		System.out.println(aluno.getSituacaoAluno());

		// Operador Ternário
		System.out.println(aluno.getSituacaoAluno2() ? "Aprovado" : "Reprovado");
		
		// Utilização do toString (facilita no retorno do objeto)
		System.out.println("aluno"+ aluno);*/
		
		//Exemplo de uso do Equal e HashCode
		Aluno aluno1 = new Aluno();		
		aluno1.setNome("Carina");
		aluno1.setCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Carina");
		aluno2.setCpf("1234");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos iguais");
		}else {
			System.out.println("Alunos diferentes");
		}
	}
	
}
