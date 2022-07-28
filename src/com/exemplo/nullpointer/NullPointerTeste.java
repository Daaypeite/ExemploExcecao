package com.exemplo.nullpointer;

public class NullPointerTeste {

	public static void main(String[] args) {
		// uso do try/catch
		try {
			Cliente c = null;
			c.setNome("Manuel da Silva ");
		} catch (NullPointerException e) {
			System.out.println("Variavel nao instanciada ");
			e.printStackTrace();
		}
	}

}
