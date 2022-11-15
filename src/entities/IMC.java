package entities;

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
		return "IMC [altura=" + altura + ", peso=" + peso + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
