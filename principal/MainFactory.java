package principal;

import PatternFactory.Bebidas;
import PatternFactory.FactoryBebidas;

public class MainFactory {

	public static void main(String[] args) {
FactoryBebidas tipoBebidas = new FactoryBebidas();
		
		Bebidas bebida = tipoBebidas.criarBebida("cafecurto");
		bebida.criarBebida();

		bebida = tipoBebidas.criarBebida("cafelongo");
		bebida.criarBebida();

		bebida = tipoBebidas.criarBebida("cafecomleite");
		bebida.criarBebida();

		bebida = tipoBebidas.criarBebida("chacomlimao");
		bebida.criarBebida();

		bebida = tipoBebidas.criarBebida("aguaquente");
		bebida.criarBebida();
	}

}
