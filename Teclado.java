//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

public class Teclado extends Perifericos{

	private String tipo;
	private Boolean bluetooth;
	private String layout;

	public String getTipo(){
		return tipo;
	}
	public Boolean getBluetooth(){
		return bluetooth;
	}
	public String getLayout(){
		return layout;
	}



	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setBluetooth(Boolean bluetooth){
		this.bluetooth = bluetooth;
	}
	public void setLayout(String layout){
		this.layout = layout;
	}
}