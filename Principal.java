//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btInserir = new javax.swing.JButton();
        cbOpcao = new javax.swing.JComboBox<>();
        btSair = new javax.swing.JButton();
        btAddProd = new javax.swing.JButton();
        btVisualizarProdutos = new javax.swing.JButton();
        rtTeste = new javax.swing.JLabel();
        mnbar = new javax.swing.JMenuBar();
        mnGeral = new javax.swing.JMenu();
        mnInserir = new javax.swing.JMenu();
        mnitInserirMouse = new javax.swing.JMenuItem();
        mnitInserirTeclado = new javax.swing.JMenuItem();
        mnitInserirMonitor = new javax.swing.JMenuItem();
        mnDeletar = new javax.swing.JMenu();
        mnitDeletarMouse = new javax.swing.JMenuItem();
        mnitDeletarTeclado = new javax.swing.JMenuItem();
        mnitDeletarMonitor = new javax.swing.JMenuItem();
        mnAlterar = new javax.swing.JMenu();
        mnitAlterarMouse = new javax.swing.JMenuItem();
        mnitAlterarTeclado = new javax.swing.JMenuItem();
        mnitAlterarMonitor = new javax.swing.JMenuItem();
        mnitSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        cbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha uma opção", "Teclado", "Mouse", "Monitor" }));
        cbOpcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcaoActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btAddProd.setText("Adicionar produtos");
        btAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProdActionPerformed(evt);
            }
        });

        btVisualizarProdutos.setText("Visualizar Produtos");
        btVisualizarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarProdutosActionPerformed(evt);
            }
        });

        rtTeste.setText("Para Teste:");

        mnGeral.setText("Geral");

        mnInserir.setText("Inserir");

        mnitInserirMouse.setText("Inserir Mouse");
        mnitInserirMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitInserirMouseActionPerformed(evt);
            }
        });
        mnInserir.add(mnitInserirMouse);

        mnitInserirTeclado.setText("Inserir Teclado");
        mnitInserirTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitInserirTecladoActionPerformed(evt);
            }
        });
        mnInserir.add(mnitInserirTeclado);

        mnitInserirMonitor.setText("Inserir Monitor");
        mnitInserirMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitInserirMonitorActionPerformed(evt);
            }
        });
        mnInserir.add(mnitInserirMonitor);

        mnGeral.add(mnInserir);

        mnDeletar.setText("Deletar");

        mnitDeletarMouse.setText("Deletar Mouse");
        mnitDeletarMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitDeletarMouseActionPerformed(evt);
            }
        });
        mnDeletar.add(mnitDeletarMouse);

        mnitDeletarTeclado.setText("Deletar Teclado");
        mnitDeletarTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitDeletarTecladoActionPerformed(evt);
            }
        });
        mnDeletar.add(mnitDeletarTeclado);

        mnitDeletarMonitor.setText("Deletar Monitor");
        mnitDeletarMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitDeletarMonitorActionPerformed(evt);
            }
        });
        mnDeletar.add(mnitDeletarMonitor);

        mnGeral.add(mnDeletar);

        mnAlterar.setText("Alterar");

        mnitAlterarMouse.setText("Alterar Mouse");
        mnitAlterarMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitAlterarMouseActionPerformed(evt);
            }
        });
        mnAlterar.add(mnitAlterarMouse);

        mnitAlterarTeclado.setText("Alterar Teclado");
        mnitAlterarTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitAlterarTecladoActionPerformed(evt);
            }
        });
        mnAlterar.add(mnitAlterarTeclado);

        mnitAlterarMonitor.setText("Alterar Monitor");
        mnitAlterarMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitAlterarMonitorActionPerformed(evt);
            }
        });
        mnAlterar.add(mnitAlterarMonitor);

        mnGeral.add(mnAlterar);

        mnitSair.setText("Sair");
        mnitSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitSairActionPerformed(evt);
            }
        });
        mnGeral.add(mnitSair);

        mnbar.add(mnGeral);

        setJMenuBar(mnbar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rtTeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAddProd)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 132, Short.MAX_VALUE)
                        .addComponent(btInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btVisualizarProdutos)
                        .addGap(106, 106, 106))))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cbOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btVisualizarProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btAddProd)
                    .addComponent(rtTeste))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOpcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcaoActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        if(cbOpcao.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione uma opção",
                "Opção inválida", 1);
        }
        if(cbOpcao.getSelectedIndex() == 1){ //Teclado
            InsereTeclado.getInsTecUnic().setVisible(true);
        }
        if(cbOpcao.getSelectedIndex() == 2){ //Mouse
            InsereMouse.getInsMouseUnic().setVisible(true);
        }
        if(cbOpcao.getSelectedIndex() == 3){ //Mouse
            InsereMonitor.getInsMonitorUnic().setVisible(true);
        }
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProdActionPerformed
        Teclado tec = new Teclado();
        Mouse mou = new Mouse();
        Monitor moni = new Monitor();
        
        moni.setMarca("Samsung");
        moni.setModelo("Odyssey G30");
        moni.setPreco((float)1299.99);
        moni.setEntrada("HDMI");
        moni.setPolegadas((float)24);
        moni.setResolucao("1920x1080");
        moni.setTaxaAtt(144);
        moni.setTipoTela("OLED");
        Banco.getBanco().getBdMonitor().add(moni);
        
        moni = new Monitor();
        moni.setMarca("Acer");
        moni.setModelo("Nitro QGO");
        moni.setPreco((float) 999.99);
        moni.setEntrada("HDMI");
        moni.setPolegadas((float) 23.8);
        moni.setResolucao("1920x1080");
        moni.setTaxaAtt(180);
        moni.setTipoTela("LCD");
        Banco.getBanco().getBdMonitor().add(moni);
        
        tec.setMarca("Redragon");
        tec.setModelo("Kumara");
        tec.setPreco((float)89.99);
        tec.setTipo("Mecânico");
        tec.setLayout("PT-BR");
        tec.setEntrada("USB");
        tec.setBluetooth(false);
        Banco.getBanco().getBdTeclado().add(tec);
        
        tec = new Teclado();
        tec.setMarca("Logitech");
        tec.setModelo("mk220");
        tec.setPreco((float)129.99);
        tec.setTipo("Mecânico");
        tec.setLayout("PT-BR");
        tec.setEntrada("");
        tec.setBluetooth(true);
        Banco.getBanco().getBdTeclado().add(tec);
        
        mou.setMarca("Razer");
        mou.setModelo("Viper Mini");
        mou.setPreco((float)99.90);
        mou.setEntrada("USB");
        mou.setPegada("Claw");
        try{
            mou.setQtdBotoes(7);
        }
        catch(MouseException e){
            e.quantBotoesInvalida();
        }
        mou.setDpi(1600);
        mou.setBluetooth(false);
        Banco.getBanco().addMouse(mou);
        
        mou = new Mouse();
        mou.setMarca("Logitech");
        mou.setModelo("G203");
        mou.setPreco((float)69.90);
        mou.setEntrada("USB");
        mou.setPegada("Claw");
        try{
            mou.setQtdBotoes(7);
        }
        catch(MouseException e){
            e.quantBotoesInvalida();
        }
        mou.setDpi(1600);
        mou.setBluetooth(false);
        Banco.getBanco().addMouse(mou);
        
        btAddProd.setVisible(false);
        rtTeste.setVisible(false);
    }//GEN-LAST:event_btAddProdActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void mnitInserirMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitInserirMouseActionPerformed
        InsereMouse.getInsMouseUnic().setVisible(true);
    }//GEN-LAST:event_mnitInserirMouseActionPerformed

    private void mnitInserirTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitInserirTecladoActionPerformed
        InsereTeclado.getInsTecUnic().setVisible(true);
    }//GEN-LAST:event_mnitInserirTecladoActionPerformed

    private void mnitInserirMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitInserirMonitorActionPerformed
        InsereMonitor.getInsMonitorUnic().setVisible(true);
    }//GEN-LAST:event_mnitInserirMonitorActionPerformed

    private void mnitDeletarMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitDeletarMouseActionPerformed
        Visualizar.getVisualizarUnic().listarTabMouse();
        Visualizar.getVisualizarUnic().setVisible(true);
    }//GEN-LAST:event_mnitDeletarMouseActionPerformed

    private void mnitDeletarTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitDeletarTecladoActionPerformed
        Visualizar.getVisualizarUnic().listarTabTeclado();
        Visualizar.getVisualizarUnic().setVisible(true);
    }//GEN-LAST:event_mnitDeletarTecladoActionPerformed

    private void mnitDeletarMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitDeletarMonitorActionPerformed
        Visualizar.getVisualizarUnic().listarTabMonitor();
        Visualizar.getVisualizarUnic().setVisible(true);
    }//GEN-LAST:event_mnitDeletarMonitorActionPerformed

    private void btVisualizarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarProdutosActionPerformed
        if(cbOpcao.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Selecione uma opção",
                "Erro", 1);
        }
        if (cbOpcao.getSelectedIndex() == 1) { //Teclado
            Visualizar.getVisualizarUnic().listarTabTeclado();
            Visualizar.getVisualizarUnic().setVisible(true);
        }
        if (cbOpcao.getSelectedIndex() == 2) { //Mouse
            Visualizar.getVisualizarUnic().listarTabMouse();
            Visualizar.getVisualizarUnic().setVisible(true);
        }
        if (cbOpcao.getSelectedIndex() == 3) {
            Visualizar.getVisualizarUnic().listarTabMonitor();
            Visualizar.getVisualizarUnic().setVisible(true);
        }
    }//GEN-LAST:event_btVisualizarProdutosActionPerformed

    private void mnitAlterarMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitAlterarMouseActionPerformed
        Visualizar.getVisualizarUnic().listarTabMouse();
        Visualizar.getVisualizarUnic().setVisible(true);
    }//GEN-LAST:event_mnitAlterarMouseActionPerformed

    private void mnitAlterarTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitAlterarTecladoActionPerformed
        Visualizar.getVisualizarUnic().listarTabTeclado();
        Visualizar.getVisualizarUnic().setVisible(true);
    }//GEN-LAST:event_mnitAlterarTecladoActionPerformed

    private void mnitAlterarMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitAlterarMonitorActionPerformed
        Visualizar.getVisualizarUnic().listarTabMonitor();
        Visualizar.getVisualizarUnic().setVisible(true);
    }//GEN-LAST:event_mnitAlterarMonitorActionPerformed

    private void mnitSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnitSairActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddProd;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVisualizarProdutos;
    private javax.swing.JComboBox<String> cbOpcao;
    private javax.swing.JMenu mnAlterar;
    private javax.swing.JMenu mnDeletar;
    private javax.swing.JMenu mnGeral;
    private javax.swing.JMenu mnInserir;
    private javax.swing.JMenuBar mnbar;
    private javax.swing.JMenuItem mnitAlterarMonitor;
    private javax.swing.JMenuItem mnitAlterarMouse;
    private javax.swing.JMenuItem mnitAlterarTeclado;
    private javax.swing.JMenuItem mnitDeletarMonitor;
    private javax.swing.JMenuItem mnitDeletarMouse;
    private javax.swing.JMenuItem mnitDeletarTeclado;
    private javax.swing.JMenuItem mnitInserirMonitor;
    private javax.swing.JMenuItem mnitInserirMouse;
    private javax.swing.JMenuItem mnitInserirTeclado;
    private javax.swing.JMenuItem mnitSair;
    private javax.swing.JLabel rtTeste;
    // End of variables declaration//GEN-END:variables
}
