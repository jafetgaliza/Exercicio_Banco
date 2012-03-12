package br.ufpb.pas.banco;

public class BancoFacade {
	
	Banco banco;

	public BancoFacade(){
		
	}
	public double getSaldo(String numero){
		return banco.getConta(numero).getSaldo();
	}
}
