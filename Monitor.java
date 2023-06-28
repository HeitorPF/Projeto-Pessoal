//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

public class Monitor extends Perifericos{

	private float polegadas;
	private String tipoTela;
	private String resolucao;
	private int taxaAtt;

	public float getPolegadas(){
		return polegadas;
	}
	public String getTipoTela(){
		return tipoTela;
	}
	public String getResolucao(){
		return resolucao;
	}
	public int getTaxaAtt(){
		return taxaAtt;
	}

	public void setPolegadas(float polegadas){
		this.polegadas = polegadas;
	}
	public void setTipoTela(String tipoTela){
		this.tipoTela = tipoTela;
	}
	public void setResolucao(String resolucao){
		this.resolucao = resolucao;
	}
	public void setTaxaAtt(int taxaAtt){
		this.taxaAtt = taxaAtt;
	}
}