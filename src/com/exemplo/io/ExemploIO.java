package com.exemplo.io;

import java.io.FileReader;
import java.io.IOException;

public class ExemploIO {

	public static void main(String[] args) {
		// bloco try/catch
		try {
			FileReader doc;
			doc = new FileReader("C:\\carta.txt ");
		} catch (IOException e) {
			System.out.println("Nao foi possivel abrir o arquivo ");
			e.printStackTrace();
		}

	}

}
