package com.exemplo.exccustomizada;

public class InformarNotas {

	public static void main(String[] args) {
		// Try/catch
		try {
			Nota nota = new Nota("Um Nome ", 12);
		} catch (NotaInvalidaException e) {
			System.err.println("Nota invalida = " + e.getMessage());
			e.printStackTrace();
		}

	}

}
