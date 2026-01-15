package empresa;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas =  new ArrayList<>();
	
	public void adicionar(Moeda m) {
		this.listaMoedas.add(m);
	}
	
	public void remover(Moeda m) {
		this.listaMoedas.remove(m);
	}
	
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio!");
			return;
		}
		
		for (Moeda m : this.listaMoedas) {
			m.info();
		}
	}
	
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		double total = 0;
		for (Moeda m : this.listaMoedas) {
			total += m.converter();
		}
		return total;
	}
	
}
