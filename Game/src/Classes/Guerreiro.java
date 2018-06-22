package Classes;
import Codes.Jogadores;

public class Guerreiro extends Jogadores{
	public void mostrarAtaques(String spec) {
		switch(spec) {
			case "Tank":
				ataques[1] = "Levantar Escudo";
				ataques[2] = "";
				ataques[3] = "";
				ataques[4] = "";
				break;
		
			case "Berseker":
				ataques[1] = "Arremessar";
				ataques[2] = "";
				ataques[3] = "";
				ataques[4] = "";
				break;
		}
	}
	public static void main(String[] args) {

	}

}
