//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;

public class InsereTeclado extends javax.swing.JFrame {
    
    private Teclado tec;
    private static InsereTeclado insTecUnic;
    public static InsereTeclado getInsTecUnic(){
        if(insTecUnic == null){
            insTecUnic = new InsereTeclado();
        }
        return insTecUnic;
    }
    private InsereTeclado() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        rtMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        rtModelo = new javax.swing.JLabel();
        cxModelo = new javax.swing.JTextField();
        rtPreco = new javax.swing.JLabel();
        cxPreco = new javax.swing.JTextField();
        rtEntrada = new javax.swing.JLabel();
        cxEntrada = new javax.swing.JTextField();
        rtLayout = new javax.swing.JLabel();
        cxLayout = new javax.swing.JTextField();
        rtTipo = new javax.swing.JLabel();
        cxTipo = new javax.swing.JTextField();
        checkBluetooth = new javax.swing.JCheckBox();
        btLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir teclado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        rtMarca.setText("Marca:");

        rtModelo.setText("Modelo:");

        rtPreco.setText("Preço:");

        rtEntrada.setText("Entrada:");

        rtLayout.setText("Layout:");

        rtTipo.setText("Tipo:");

        checkBluetooth.setText("Bluetooth");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
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
                                .addComponent(rtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rtEntrada)
                                    .addComponent(rtLayout))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkBluetooth, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(rtLayout)
                    .addComponent(cxLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTipo)
                    .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkBluetooth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
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
        inserirTeclado();
    }//GEN-LAST:event_btInserirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    public void limpar(){
        cxMarca.setText("");
        cxModelo.setText("");
        cxPreco.setText("");
        cxEntrada.setText("");
        cxLayout.setText("");
        cxTipo.setText("");
        checkBluetooth.setSelected(false);
    }
    
    public void inserirTeclado(){
        tec = new Teclado();
        try{
            tec.setMarca(cxMarca.getText());
            tec.setModelo(cxModelo.getText());
            tec.setPreco(Float.parseFloat(cxPreco.getText()));
            tec.setEntrada(cxEntrada.getText());
            tec.setTipo(cxTipo.getText());
            tec.setLayout(cxLayout.getText());
            tec.setBluetooth(checkBluetooth.isSelected());
            tec = Banco.getBanco().addTeclado(tec);
            limpar();
            JOptionPane.showMessageDialog(null, "Teclado inserido com sucesso!",
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
