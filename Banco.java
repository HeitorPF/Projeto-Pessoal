//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import java.util.List;
import java.util.ArrayList;

public class Banco{
    
    private static Banco bancoUnic;
    
    static List<Teclado> bdTeclado;
    static List<Mouse> bdMouse;
    static List<Monitor> bdMonitor;
    
    private Banco(){
        bdTeclado = new ArrayList<>();
        bdMouse = new ArrayList<>();
        bdMonitor = new ArrayList<>();
    }
    
    public static Banco getBanco(){
        if(bancoUnic == null){
            bancoUnic = new Banco();
        }
        return bancoUnic;
    }
    
    public List<Teclado> getBdTeclado(){
        return bdTeclado;
    }
    public List<Mouse> getBdMouse(){
        return bdMouse;
    }
    public List<Monitor> getBdMonitor(){
        return bdMonitor;
    }
    
    public Teclado addTeclado(Teclado tec){
        bdTeclado.add(tec);
        return tec;
    }
    public Mouse addMouse(Mouse mou){
        bdMouse.add(mou);
        return mou;
    }
    public Monitor addMonitor(Monitor moni){
        bdMonitor.add(moni);
        return moni;
    }
    
    public static Teclado buscaTeclado(Teclado tec){
        for(int i=0; i<bdTeclado.size(); i++){
            if(tec.getMarca().equals(bdTeclado.get(i).getMarca()) && tec.getModelo().equals(bdTeclado.get(i).getModelo())){
                return bdTeclado.get(i);
            }
        }
        return null;
    }
    public static Mouse buscaMouse(Mouse mou){
        for(int i=0; i<bdMouse.size(); i++){
            if(mou.getMarca().equals(bdMouse.get(i).getMarca()) && mou.getModelo().equals(bdMouse.get(i).getModelo())){
                return bdMouse.get(i);
            }
        }
        return null;
    }
    public static Monitor buscaMonitor(Monitor moni){
        for(int i=0; i<bdMonitor.size(); i++){
            if(moni.getMarca().equals(bdMonitor.get(i).getMarca()) && moni.getModelo().equals(bdMonitor.get(i).getModelo())){
                return bdMonitor.get(i);
            }
        }
        return null;
    }
    public static Teclado delTeclado(Teclado tec){
        if(buscaTeclado(tec)!=null){
            bdTeclado.remove(tec);
            return null;
        }
        return tec;
    }
    public static Mouse delMouse(Mouse mou){
        if(buscaMouse(mou)!=null){
            bdMouse.remove(mou);
            return null;
        }
        return mou;
    }
    public static Monitor delMonitor(Monitor moni){
        if(buscaMonitor(moni)!=null){
            bdMonitor.remove(moni);
            return null;
        }
        return moni;
    }
}