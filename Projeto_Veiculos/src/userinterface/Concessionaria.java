package userinterface;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Concessionaria {
	public static void main(String[] args) {
		
		
		Veiculo v1, v2;
		
		v1 = new Carro("Fuscao","ABC1234",1970);
		v2 = new Moto("Harley","XYZ9876", "custom");
		
		
		v1.acelerar();
		v1.frear();
		v2.acelerar();
		v2.frear();
		
		
	}

}
