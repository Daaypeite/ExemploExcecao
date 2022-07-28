package com.exemplo.sqlcom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploSQL {

	public static void main(String[] args) {
		// Try/catch
		try {
			Connection cn;
			cn = DriverManager.getConnection("jdbc:oracle:thin:local:1512:orcl ", "scott ", "tiger ");
		} catch (SQLException e) {
			System.out.println("Nao foi possivel habilitar a conexao com o DB. ");
			e.printStackTrace();
		}

	}

}
