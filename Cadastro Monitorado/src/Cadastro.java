public class MainClass {
	public static void main(String[] args) {
		
		InterfaceMicrosoft ims;
		ims = new ProdutoImportacao();
		System.out.println("ERP Microsoft - trava de vez em quando");
		ims.MS_Importador("teste");
	}

}