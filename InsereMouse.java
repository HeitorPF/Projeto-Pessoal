//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;

public class InsereMouse extends javax.swing.JFrame {

    private Mouse mou;
    private static InsereMouse insMouseUnic;
    public static InsereMouse getInsMouseUnic(){
        if(insMouseUnic == null){
            insMouseUnic = new InsereMouse();
        }
        return insMouseUnic;
    }
    
    private InsereMouse() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        rtMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        rtModelo = new javax.swing.JLabel();
        cxModelo = new javax.swing.JTextField();
        rtPreco = new javax.swing.JLabel();
        cxPreco = new javax.swing.JTextField();
        rtEntrada = new javax.swing.JLabel();
        cxEntrada = new javax.swing.JTextField();
        rtPegada = new javax.swing.JLabel();
        cxPegada = new javax.swing.JTextField();
        rtQtdBotoes = new javax.swing.JLabel();
        cxQtdBotoes = new javax.swing.JTextField();
        rtDpi = new javax.swing.JLabel();
        cxDpi = new javax.swing.JTextField();
        checkBluetooth = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir mouse");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        rtMarca.setText("Marca:");

        rtModelo.setText("Modelo:");

        rtPreco.setText("Preço:");

        rtEntrada.setText("Entrada:");

        rtPegada.setText("Pegada:");

        rtQtdBotoes.setText("Quantidade de botões:");

        rtDpi.setText("DPI:");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btInserir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtPegada)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxPegada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rtQtdBotoes)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtDpi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxQtdBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtModelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkBluetooth, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPegada)
                    .addComponent(cxPegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtQtdBotoes)
                    .addComponent(cxQtdBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtDpi)
                    .addComponent(cxDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkBluetooth)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btInserir)
                    .addComponent(btLimpar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        limpar();
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        inserirMouse();
    }//GEN-LAST:event_btInserirActionPerformed

    public void limpar(){
        cxMarca.setText("");
        cxModelo.setText("");
        cxPreco.setText("");
        cxEntrada.setText("");
        cxPegada.setText("");
        cxQtdBotoes.setText("");
        cxDpi.setText("");
        checkBluetooth.setSelected(false);
    }
    
    public void inserirMouse(){
        mou = new Mouse();
        boolean erro = false;
        try{
            mou.setMarca(cxMarca.getText());
            mou.setModelo(cxModelo.getText());
            mou.setPreco(Float.parseFloat(cxPreco.getText()));
            mou.setEntrada(cxEntrada.getText());
            mou.setPegada(cxPegada.getText());
            try{
                mou.setQtdBotoes(Integer.parseInt(cxQtdBotoes.getText()));
            }
            catch(MouseException e){
                erro = true;
                e.quantBotoesInvalida();
            }
            mou.setDpi(Integer.parseInt(cxDpi.getText()));
            mou.setBluetooth(checkBluetooth.isSelected());
            if(erro){
                
            }
            else{
                mou = Banco.getBanco().addMouse(mou);
                limpar();
                JOptionPane.showMessageDialog(null, "Mouse inserido com sucesso!",
                "Sucesso!", 1);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Algum Campo contém formato inválido",
                "Erro na inserção", 1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
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
