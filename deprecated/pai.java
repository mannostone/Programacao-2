package deprecated;

public class pai {
	public void mensagem () {
		System.out.println("pai");
	}
	// Sinaliza que um método deixará de ser usado
	@Deprecated 
	public void  imprimirMensagem(String msg) {
		System.out.println("Depreciada");
	}

}
