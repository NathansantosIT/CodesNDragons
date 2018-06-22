package Codes;

import java.lang.reflect.GenericArrayType;
import Classes.Mago;


public class Menus {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		criarJogador();

	}
	
	public static void criarJogador() {
		
		
		
		System.out.println("Escolha a sua raça");
		System.out.println("Escolha a sua classe");
		Mago.gerarSpec();
	}

}
