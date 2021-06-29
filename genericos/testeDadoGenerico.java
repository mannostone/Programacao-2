package genericos;

public class testeDadoGenerico {
	public static void main (String [] args) {
	
		DadoGenerico<String> d1 = new DadoGenerico("Amarelo");
		System.out.println(d1.getDado());
	
		DadoGenerico<Float> d2 = new DadoGenerico(5.654f);
		System.out.println(d2.getDado());
	}

}
