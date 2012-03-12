package br.ufpb.pas.banco;

import br.ufpb.pas.persistencia.PersistenciaException;
import br.ufpb.pas.persistencia.PersistenciaFacade;

public class Conta {

	String numero;
	double saldo;
	PersistenciaFacade persistencia;
	
	public Double getSaldo(){
		try {
		persistencia.selecionaSaldo(numero);
		} catch (PersistenciaException e) {
			e.printStackTrace();
		}
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
