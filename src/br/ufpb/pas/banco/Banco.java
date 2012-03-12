package br.ufpb.pas.banco;

import java.util.HashMap;
import java.util.Map;

public class Banco {

	private Map<String, Conta> contasMap;
	
	public Banco(){
		this.contasMap = new HashMap<String, Conta>();
	}
	public void addConta(Conta conta){
		contasMap.put(conta.getNumero(), conta);
	}
	public Conta getConta(String numero){
		try{
		contasMap.get(numero);
		} catch (BancoException be){
			be.printStackTrace();
		}
		return contasMap.get(numero);
	}
}
