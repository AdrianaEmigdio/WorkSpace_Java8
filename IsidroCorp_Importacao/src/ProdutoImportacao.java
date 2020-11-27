public class ProdutoImportacao implements InterfaceSAP, InterfaceOracle, InterfaceMicrosoft{
	
	// essa aqui é a minha "inteligência"
	public void executaImportacao(String invoice) {
		System.out.println("ISIDROCORP: Invoice importada com sucesso - Tecle ENTER");
	}

	@Override
	public void SAP_ImportInovice(String invoice) {
		executaImportacao(invoice);
	}

	@Override
	public void ORACLE_Importer(String invoice) {
		executaImportacao(invoice);	
	}

	@Override
	public void MS_Importador(String invoice) {
		executaImportacao(invoice);
		
	}
	
	
	

}