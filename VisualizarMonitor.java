//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;

public class VisualizarMonitor extends javax.swing.JFrame {

    private Monitor m;
    private static VisualizarMonitor visualizarMonitor;
    public static VisualizarMonitor getVisualizarMonitor(){
        if(visualizarMonitor == null){
            visualizarMonitor = new VisualizarMonitor();
        }
        return visualizarMonitor;
    }
    private VisualizarMonitor() {
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
        rtPolegadas = new javax.swing.JLabel();
        rtTipoTela = new javax.swing.JLabel();
        rtResolucao = new javax.swing.JLabel();
        rtTaxaAtt = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxEntrada = new javax.swing.JTextField();
        cxPolegadas = new javax.swing.JTextField();
        cxTipoTela = new javax.swing.JTextField();
        cxResolucao = new javax.swing.JTextField();
        cxTaxaAtt = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rtMarca.setText("Marca:");

        rtModelo.setText("Modelo:");

        rtPreco.setText("Preço:");

        rtEntrada.setText("Entrada:");

        rtPolegadas.setText("Polegadas:");

        rtTipoTela.setText("Tipo da tela:");

        rtResolucao.setText("Resolução:");

        rtTaxaAtt.setText("Taxa de atualização:");

        btVoltar.setText("Votlar");
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
                                .addComponent(rtPolegadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPolegadas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTipoTela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTipoTela, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtResolucao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTaxaAtt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTaxaAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 203, Short.MAX_VALUE)))
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
                    .addComponent(rtPolegadas)
                    .addComponent(cxPolegadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTipoTela)
                    .addComponent(cxTipoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtResolucao)
                    .addComponent(cxResolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTaxaAtt)
                    .addComponent(cxTaxaAtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
        Visualizar.getVisualizarUnic().listarTabMonitor();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    public void setcaixas(Monitor moni){
        m = moni;
        cxMarca.setText(moni.getMarca());
        cxModelo.setText(moni.getModelo());
        cxPreco.setText(Float.toString(moni.getPreco()));
        cxEntrada.setText(moni.getEntrada());
        cxPolegadas.setText(Float.toString(moni.getPolegadas()));
        cxTipoTela.setText(moni.getTipoTela());
        cxResolucao.setText(moni.getResolucao());
        cxTaxaAtt.setText(Integer.toString(moni.getTaxaAtt()));
    }
    
    public void alterar(){
        try{
            m.setMarca(cxMarca.getText());
            m.setModelo(cxModelo.getText());
            m.setPreco(Float.parseFloat(cxPreco.getText()));
            m.setEntrada(cxEntrada.getText());
            m.setPolegadas(Float.parseFloat(cxPolegadas.getText()));
            m.setTipoTela(cxTipoTela.getText());
            m.setResolucao(cxResolucao.getText());
            m.setTaxaAtt(Integer.parseInt(cxTaxaAtt.getText()));
            dispose();
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Algum Campo contém formato inválido",
                "Erro na alteração", 1);
        }
    }
    
    public void setAlterar(Boolean op){
        if(op){
            visualizarMonitor.setTitle("Alterar Monitor");
        }
        else{
            visualizarMonitor.setTitle("Visualizar Monitor");
        }
        cxMarca.setEditable(op);
        cxModelo.setEditable(op);
        cxPreco.setEditable(op);
        cxEntrada.setEditable(op);
        cxPolegadas.setEditable(op);
        cxTipoTela.setEditable(op);
        cxResolucao.setEditable(op);
        cxTaxaAtt.setEditable(op);
        btAlterar.setVisible(op);
        btAlterar.setVisible(op);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
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
