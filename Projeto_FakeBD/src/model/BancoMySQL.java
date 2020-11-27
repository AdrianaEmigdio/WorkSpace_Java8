package model;

public class BancoMySQL implements InterfaceBD  {

	
	public void conectar(String nomeBanco, String usuario) {
		System.out.println("Conectando ao servidor Mysql "+nomeBanco+" user: "+usuario);
	}

	
	public void desconectar(String nomeBanco) {
		System.out.println("Desconectando Mysql do banco "+nomeBanco);
	}

	
	public void executar(String comando) {
		System.out.println("mysql> "+comando);
	}
}
