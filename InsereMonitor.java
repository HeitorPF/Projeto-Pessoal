//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;

public class InsereMonitor extends javax.swing.JFrame {

    private Monitor moni;
    private static InsereMonitor insMonitorUnic;
    public static InsereMonitor getInsMonitorUnic(){
        if(insMonitorUnic == null){
            insMonitorUnic = new InsereMonitor();
        }
        return insMonitorUnic;
    }
    private InsereMonitor() {
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
        rtPolegadas = new javax.swing.JLabel();
        cxPolegadas = new javax.swing.JTextField();
        rtTipoTela = new javax.swing.JLabel();
        cxTipoTela = new javax.swing.JTextField();
        rtTaxaAtt = new javax.swing.JLabel();
        cxTaxaAtt = new javax.swing.JTextField();
        rtResolucao = new javax.swing.JLabel();
        cxResolucao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir monitor");

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

        rtPolegadas.setText("Polegadas:");

        rtTipoTela.setText("Tipo da tela:");

        rtTaxaAtt.setText("Taxa de atualização:");

        rtResolucao.setText("Resolução:");

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
                                .addComponent(rtPolegadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPolegadas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTipoTela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTipoTela, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTaxaAtt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTaxaAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtResolucao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtPolegadas)
                    .addComponent(cxPolegadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTipoTela)
                    .addComponent(cxTipoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTaxaAtt)
                    .addComponent(cxTaxaAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtResolucao)
                    .addComponent(cxResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btInserir)
                    .addComponent(btLimpar))
                .addContainerGap())
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
        inserirMonitor();
    }//GEN-LAST:event_btInserirActionPerformed

    public void limpar(){
        cxMarca.setText("");
        cxModelo.setText("");
        cxPreco.setText("");
        cxEntrada.setText("");
        cxPolegadas.setText("");
        cxTipoTela.setText("");
        cxTaxaAtt.setText("");
        cxResolucao.setText("");
    }
    
    public void inserirMonitor(){
        moni = new Monitor();
        try{
            moni.setMarca(cxMarca.getText());
            moni.setModelo(cxModelo.getText());
            moni.setPreco(Float.parseFloat(cxPreco.getText()));
            moni.setEntrada(cxEntrada.getText());
            moni.setPolegadas(Float.parseFloat(cxPolegadas.getText()));
            moni.setTipoTela(cxTipoTela.getText());
            moni.setTaxaAtt(Integer.parseInt(cxTaxaAtt.getText()));
            moni.setResolucao(cxResolucao.getText());
            moni = Banco.getBanco().addMonitor(moni);
            limpar();
            JOptionPane.showMessageDialog(null, "Monitor inserido com sucesso!",
                "Sucesso!", 1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Algum Campo contém formato inválido",
                "Erro na inserção", 1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxEntrada;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxPolegadas;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxResolucao;
    private javax.swing.JTextField cxTaxaAtt;
    private javax.swing.JTextField cxTipoTela;
    private javax.swing.JLabel rtEntrada;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtModelo;
    private javax.swing.JLabel rtPolegadas;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtResolucao;
    private javax.swing.JLabel rtTaxaAtt;
    private javax.swing.JLabel rtTipoTela;
    // End of variables declaration//GEN-END:variables
}
