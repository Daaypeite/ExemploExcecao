package com.exemplo.exemploexcecao;

import java.io.IOException;

public class BlocoTryCatch {

	public static void main(String[] args) throws IOException {
		// tentativa de gerar uma exception
		// definido uma variavel

		// bloco try
		try {
			int i;
			i = 1 / 0;
			i = 2;
			System.out.println(i);
		} catch (ArithmeticException ex) {
			System.out.println(ex);
			// e.printStackTrace();
		}
		System.out.println("Continuacao do codigo! ");
	}

}
