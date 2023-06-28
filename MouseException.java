//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;

public class MouseException extends Exception{
    
    public void quantBotoesInvalida(){
        JOptionPane.showMessageDialog(
                    null,
                    "Quantidade de botões invalida",
                    "Botões inválido",
                    1);
    }
    
}
