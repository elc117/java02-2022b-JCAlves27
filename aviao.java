package aula;

public class aviao {
	private boolean estacionado;
	private double emmovimento;

	public aviao(double emmovimento, boolean estacionado) {
		this.estacionado = estacionado;
		this.emmovimento = emmovimento;
	}

	public boolean getestacionado() {
		return this.estacionado;
	}

	public double getemmovimento() {
		return this.emmovimento;
	}

	public void setestacionado(boolean set) {
		this.estacionado = set;
	}

	public void acelerador() {
		if (this.estacionado) {
			System.out.println("Não foi possível iniciar voo, acelerador bloqueado!");
			return;
		}

		this.emmovimento += 30.0;
		System.out.println("A velocidade do aviao " + this.emmovimento);

	}

}