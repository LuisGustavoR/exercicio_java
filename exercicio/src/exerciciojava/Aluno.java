package exerciciojava;

import java.rmi.server.SkeletonMismatchException;

public class Aluno {
	private String nome;
	private double nota;

	public static void main(String[] args) {
		setNome(umNome);
		setNota(umaNota);		
	}

	public String getNome(){return nome;} 

	public void setNome(String nome){this.nome = nome;}

	public double getNota(){return nota}

	public void setNota(double nota){this.nota = nota}

	public String toString(){
		return (Nome: "+getNome()+", Nota: "+getNota()+")
	}
	
}
