package Sistema;


	import model.BancoOracle;
	import model.InterfaceBD;

	public class Sisteminha {
		public static void main(String[] args) {
			
			
			// eu preciso, no meu sistema:
			// 1 - conectar num banco
			// 2 - executar um comando do banco
			// 3 - desconectar do banco
			
			InterfaceBD ibd;
			
			ibd = new BancoOracle();
			
			ibd.conectar("bancoX", "userX");
			ibd.executar("SELECT * from TabelaX");
			ibd.desconectar("bancoX");
		}

}
