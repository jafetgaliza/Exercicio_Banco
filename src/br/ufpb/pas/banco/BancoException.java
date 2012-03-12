package br.ufpb.pas.banco;

public class BancoException extends RuntimeException {
	
	public BancoException (String falha){
		super(falha);
	}

} 
//