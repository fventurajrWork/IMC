package entities;

import java.util.Scanner;

public class IMC {
	
	private double altura;
	private double peso;
	
	public IMC() {
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		Double imc = null;
		imc = peso / ( altura * altura );
		return imc.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vou calcular o seu IMC");
		System.out.print("Entre com o seu peso(Kg): ");
		Double peso = Double.parseDouble(sc.nextLine());
		System.out.print("Entre com a sua altura(m): ");
		Double altura = Double.parseDouble(sc.nextLine());
		IMC imc = new IMC();
		imc.setAltura(altura); imc.setPeso(peso);
		System.out.printf("O seu IMC é: %.2f%n",Double.parseDouble(imc.toString()));
		sc.close();

	}

}
