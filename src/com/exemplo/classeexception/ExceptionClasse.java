package com.exemplo.classeexception;

public class ExceptionClasse {

	public static void main(String[] args) {
		// bloco try/catch
		
		try {
			Conta c = new ContaPoupanca();
			ContaCorrente cc = (ContaCorrente)c;
			cc.debitarTarifa(35.5);
		}catch(ClassCastException e) {
			System.out.println("Conta de incompativel! ");
			e.printStackTrace();
		}

	}

}
