//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;

public class VisualizarTeclado extends javax.swing.JFrame {

    private Teclado t;
    private static VisualizarTeclado visualizarTeclado;
    public static VisualizarTeclado getVisualizarTeclado(){
        if(visualizarTeclado == null){
            visualizarTeclado = new VisualizarTeclado();
        }
        return visualizarTeclado;
    }
    private VisualizarTeclado() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtMarca = new javax.swing.JLabel();
        rtModelo = new javax.swing.JLabel();
        rtPreco = new javax.swing.JLabel();
        rtLayout = new javax.swing.JLabel();
        rtTipo = new javax.swing.JLabel();
        checkBluetooth = new javax.swing.JCheckBox();
        cxMarca = new javax.swing.JTextField();
        cxModelo = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxLayout = new javax.swing.JTextField();
        cxTipo = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        rtEntrada = new javax.swing.JLabel();
        cxEntrada = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rtMarca.setText("Marca:");

        rtModelo.setText("Modelo:");

        rtPreco.setText("Preço:");

        rtLayout.setText("Layout");

        rtTipo.setText("Tipo:");

        checkBluetooth.setText("Bluetooth");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        rtEntrada.setText("Entrada:");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(btAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBluetooth, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(rtLayout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtEntrada)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtLayout)
                    .addComponent(cxLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTipo)
                    .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBluetooth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
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
        Visualizar.getVisualizarUnic().listarTabTeclado();
    }//GEN-LAST:event_btAlterarActionPerformed

    public void setcaixas(Teclado tec){
        t = tec;
        cxMarca.setText(tec.getMarca());
        cxModelo.setText(tec.getModelo());
        cxPreco.setText(Float.toString(tec.getPreco()));
        cxEntrada.setText(tec.getEntrada());
        cxLayout.setText(tec.getLayout());
        cxTipo.setText(tec.getTipo());
        checkBluetooth.setSelected(tec.getBluetooth());
    }
    
    public void alterar(){
        try{
            t.setMarca(cxMarca.getText());
            t.setModelo(cxModelo.getText());
            t.setPreco(Float.parseFloat(cxPreco.getText()));
            t.setEntrada(cxEntrada.getText());
            t.setLayout(cxLayout.getText());
            t.setTipo(cxTipo.getText());
            t.setBluetooth(checkBluetooth.isSelected());
            dispose();
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Algum Campo contém formato inválido",
                "Erro na alteração", 1);
        }
    }
    
    public void setAlterar(Boolean op){
        if(op){
            visualizarTeclado.setTitle("Alterar Teclado");
        }
        else{
            visualizarTeclado.setTitle("Visualizar Teclado");
        }
        cxMarca.setEditable(op);
        cxModelo.setEditable(op);
        cxPreco.setEditable(op);
        cxEntrada.setEditable(op);
        cxLayout.setEditable(op);
        cxTipo.setEditable(op);
        checkBluetooth.setEnabled(op);
        btAlterar.setVisible(op);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JCheckBox checkBluetooth;
    private javax.swing.JTextField cxEntrada;
    private javax.swing.JTextField cxLayout;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JLabel rtEntrada;
    private javax.swing.JLabel rtLayout;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtModelo;
    private javax.swing.JLabel rtPreco;
    private javax.swing.JLabel rtTipo;
    // End of variables declaration//GEN-END:variables
}
