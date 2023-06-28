//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

public abstract class Perifericos implements Loja{
    
	private String marca;
	private String modelo;
	private float preco;
	private String entrada;

	public String getMarca(){
		return marca;
	}
	public float getPreco(){
		return preco;
	}
	public String getModelo(){
		return modelo;
	}
	public String getEntrada(){
		return entrada;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}
	public void setPreco(float preco){
		this.preco = preco;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public void setEntrada(String entrada){
		this.entrada = entrada;
	}

        @Override
	public void aplicaDesconto(float desconto){
		setPreco(getPreco() * (1-(desconto/100)));
	}
	public void aplicaAumento(float aumento){
		setPreco(getPreco() * (1+(aumento/100)));
	}
       
}