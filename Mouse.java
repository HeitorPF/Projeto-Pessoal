//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

public class Mouse extends Perifericos{

	private  int dpi;
 	private String pegada;
	private Boolean bluetooth;
	private int qtdBotoes;

	public int getDpi(){
		return dpi;
	}
	public String getPegada(){
		return pegada;
	}
	public Boolean getBluetooth(){
		return bluetooth;
	}
	public int getQtdBotoes(){
		return qtdBotoes;
	}

	public void setDpi(int dpi){
		this.dpi = dpi;
	}
	public void setPegada(String pegada){
		this.pegada = pegada;
	}
	public void setBluetooth(Boolean bluetooth){
		this.bluetooth = bluetooth;
	}
	public void setQtdBotoes(int qtdBotoes) throws MouseException{
            if(qtdBotoes < 13 && qtdBotoes > 3){
                this.qtdBotoes = qtdBotoes;
            }
            else{
                throw new MouseException();
            }
        }
}