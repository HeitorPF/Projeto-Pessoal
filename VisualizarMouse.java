//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;

public class VisualizarMouse extends javax.swing.JFrame {

    private Mouse m;
    private static VisualizarMouse visualizarMouse;
    public static VisualizarMouse getVisualizarMouse(){
        if(visualizarMouse == null){
            visualizarMouse = new VisualizarMouse();
        }
        return visualizarMouse;
    }
    private VisualizarMouse() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        rtModelo = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtEntrada = new javax.swing.JLabel();
        rtDpi = new javax.swing.JLabel();
        rtPegada = new javax.swing.JLabel();
        rtQtdBotoes = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxEntrada = new javax.swing.JTextField();
        cxDpi = new javax.swing.JTextField();
        cxPegada = new javax.swing.JTextField();
        cxQtdBotoes = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        checkBluetooth = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rtMarca.setText("Marca:");

        rtModelo.setText("Modelo:");

        rtPreco.setText("Preço:");

        rtEntrada.setText("Entrada:");

        rtDpi.setText("Dpi:");

        rtPegada.setText("Pegada:");

        rtQtdBotoes.setText("Quantidade de botões:");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        checkBluetooth.setText("Bluetooth");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtEntrada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtDpi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPegada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPegada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtQtdBotoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxQtdBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkBluetooth, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtModelo)
                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPreco)
                    .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEntrada)
                    .addComponent(cxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtDpi)
                    .addComponent(cxDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPegada, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxPegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtQtdBotoes)
                    .addComponent(cxQtdBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBluetooth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
       alterar();
       Visualizar.getVisualizarUnic().listarTabMouse();
    }//GEN-LAST:event_btAlterarActionPerformed

    public void setcaixas(Mouse mou){
        m = mou;
        cxMarca.setText(mou.getMarca());
        cxModelo.setText(mou.getModelo());
        cxPreco.setText(Float.toString(mou.getPreco()));
        cxEntrada.setText(mou.getEntrada());
        cxDpi.setText(Integer.toString(mou.getDpi()));
        cxPegada.setText(mou.getPegada());
        cxQtdBotoes.setText(Integer.toString(mou.getQtdBotoes()));
        checkBluetooth.setSelected(mou.getBluetooth());
    }
    
    public void alterar(){
        try{
            m.setMarca(cxMarca.getText());
            m.setModelo(cxModelo.getText());
            m.setPreco(Float.parseFloat(cxPreco.getText()));
            m.setEntrada(cxEntrada.getText());
            m.setPegada(cxPegada.getText());
            try{
                m.setQtdBotoes(Integer.parseInt(cxQtdBotoes.getText()));
            }
            catch(MouseException e){
                e.quantBotoesInvalida();
            }
            m.setDpi(Integer.parseInt(cxDpi.getText()));
            m.setBluetooth(checkBluetooth.isSelected());
            dispose();
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Algum Campo contém formato inválido",
                "Erro na alteração", 1);
        }
    }
    
    public void setAlterar(Boolean op){
        if(op){
            visualizarMouse.setTitle("Alterar Mouse");
        }
        else{
            visualizarMouse.setTitle("Visualizar Mouse");
        }
        cxMarca.setEditable(op);
        cxModelo.setEditable(op);
        cxPreco.setEditable(op);
        cxEntrada.setEditable(op);
        cxDpi.setEditable(op);
        cxPegada.setEditable(op);
        checkBluetooth.setEnabled(op);
        cxQtdBotoes.setEditable(op);
        btAlterar.setVisible(op);
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JCheckBox checkBluetooth;
    private javax.swing.JTextField cxDpi;
    private javax.swing.JTextField cxEntrada;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxPegada;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQtdBotoes;
    private javax.swing.JLabel rtDpi;
    private javax.swing.JLabel rtEntrada;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtModelo;
    private javax.swing.JLabel rtPegada;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtQtdBotoes;
    // End of variables declaration//GEN-END:variables
}
