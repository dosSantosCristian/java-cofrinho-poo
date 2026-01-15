package empresa;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Dolar - " +  valor);
	}

	@Override
	public double converter() {
		return this.valor * 5.20;
	}
	
	@Override
	public String toString(){
		return "Dolar - " + valor;
	}

}
