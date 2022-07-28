package com.exemplo.exemploexcecao;

public class Teste {

	public static void main(String[] args) throws Exception {
		// try/catch para a chamada do metodo 1
		try {
			// chamar o metodo aqui
			metodo1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 1º método
	public static void metodo1() throws Exception {
		try {
			// chamar o metodo 2
			metodo2();
		} catch (Exception e) {
			throw new Exception("Excecao enviada no metodo1 ", e);
		}
	}

	// 2º método
	public static void metodo2() throws Exception {
		throw new Exception("Excecao enviada no metodo2 ");
	}
}
