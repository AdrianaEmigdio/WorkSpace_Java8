package model;

public class BancoOracle implements InterfaceBD{
	
	public void conectar(String nomeBanco, String usuario) {
		System.out.println("Connecting Oracle DB on "+nomeBanco+" with user "+usuario);
		
	}

	
	public void desconectar(String nomeBanco) {
		System.out.println(nomeBanco + " connection Closed");
		
	}

	
	public void executar(String comando) {
		System.out.println("oracle> "+comando);
		
	}
}
