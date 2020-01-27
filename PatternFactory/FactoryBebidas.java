package PatternFactory;

public class FactoryBebidas {
	
	
public Bebidas criarBebida (String bebida) {

	if(bebida == "" || bebida  == null) {
		return null;
	}
	if(bebida.toUpperCase().equals("CAFECURTO")) {
		return new CafeCurto();
	}else if(bebida.toUpperCase().equals("CAFELONGO")) {
		return new CafeLongo();
	}else if(bebida.toUpperCase().equals("CAFECOMLEITE")) {
		return new CafeComLeite();
	}else if(bebida.toUpperCase().equals("AGUAQUENTE")) {
		return new AguaQuente();
	}else if(bebida.toUpperCase().equals("CHACOMLIMAO")) {
			return new ChaComLimao();
	}

	
	return null;
}
}
