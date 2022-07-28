package com.exemplo.numberexc;

public class ExemploNumberFormat {

	public static void main(String[] args) {
		// uso do try/catch
		try {
			String texto = "10xpt23";
			int idade = Integer.parseInt(texto);
			System.out.println("Parabens pelos seus " + idade + "Anos de vida ");
		} catch (NumberFormatException e) {
			System.out.println("Numero invalido. ");
			e.printStackTrace();
		}

	}

}
