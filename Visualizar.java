//Heitor da Piedade Ferreira RA:2465744
//Versão NetBeans: Apache NetBeans IDE 17
package com.mycompany.projpesperiferico;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Visualizar extends javax.swing.JFrame {

    private static Visualizar visualizarUnic;
    public static Visualizar getVisualizarUnic(){
        if(visualizarUnic == null){
            visualizarUnic = new Visualizar();
        }
        return visualizarUnic;
    }
    private Visualizar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbView = new javax.swing.JTable();
        rtProcurar = new javax.swing.JLabel();
        cbProduto = new javax.swing.JComboBox<>();
        cxPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btMaisInfo = new javax.swing.JButton();
        rtPesquisa = new javax.swing.JLabel();
        cbPesquisa = new javax.swing.JComboBox<>();
        checkFiltro = new javax.swing.JCheckBox();
        rtFaixa = new javax.swing.JLabel();
        cxFaixa = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar produtos");
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

        tbView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Marca", "Modelo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbView);

        rtProcurar.setText("Procurar por");

        cbProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Teclado", "Mouse", "Monitor" }));
        cbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btMaisInfo.setText("Mais informações");
        btMaisInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisInfoActionPerformed(evt);
            }
        });

        rtPesquisa.setText("Pesquisar por:");

        cbPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um item", "Marca", "Modelo", "Preço" }));
        cbPesquisa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPesquisaItemStateChanged(evt);
            }
        });

        checkFiltro.setText("Usar filtro");

        rtFaixa.setText("Faixa de preço:");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtProcurar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPesquisar)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btDeletar)
                                    .addComponent(btAlterar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rtPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(cxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rtFaixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btMaisInfo)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtProcurar)
                            .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(checkFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtPesquisa)
                    .addComponent(cbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtFaixa)
                    .addComponent(cxFaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addGap(89, 89, 89)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btMaisInfo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        limpar();
        faixaVisible();
    }//GEN-LAST:event_formWindowActivated

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        int pos = tbView.getSelectedRow();
        if(tbView.getModel().getValueAt(pos,0).equals("Mouse")){
            Mouse mou = new Mouse();
            mou.setMarca((String) tbView.getValueAt(pos, 1));
            mou.setModelo((String) tbView.getValueAt(pos, 2));
            mou = Banco.buscaMouse(mou);
            Banco.delMouse(mou);
            listarTabMouse();
        }
        else if(tbView.getModel().getValueAt(pos,0).equals("Teclado")){
            Teclado tec = new Teclado();
            tec.setMarca((String) tbView.getValueAt(pos, 1));
            tec.setModelo((String) tbView.getValueAt(pos, 2));
            tec = Banco.buscaTeclado(tec);
            Banco.delTeclado(tec);
            listarTabTeclado();
        }
        else if(tbView.getModel().getValueAt(pos,0).equals("Monitor")){
            Monitor moni = new Monitor();
            moni.setMarca((String) tbView.getValueAt(pos, 1));
            moni.setModelo((String) tbView.getValueAt(pos, 2));
            moni = Banco.buscaMonitor(moni);
            Banco.delMonitor(moni);
            listarTabMonitor();
        }
    }//GEN-LAST:event_btDeletarActionPerformed

    private void cbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoActionPerformed

    }//GEN-LAST:event_cbProdutoActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        switch (cbProduto.getSelectedIndex()) {
            case 1:
                //Teclado
                listarTabTeclado();
                break;
            case 2:
                //Mouse
                listarTabMouse();
                break;
            case 3:
                //Monitor
                listarTabMonitor();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btMaisInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisInfoActionPerformed
        int pos = tbView.getSelectedRow();
        if(pos>=0){
            if(tbView.getModel().getValueAt(pos,0).equals("Mouse")){
                Mouse mou = new Mouse();
                mou.setMarca((String)tbView.getModel().getValueAt(pos,1));
                mou.setModelo((String)tbView.getModel().getValueAt(pos,2));
                mou = Banco.buscaMouse(mou);
                VisualizarMouse.getVisualizarMouse().setAlterar(false);
                VisualizarMouse.getVisualizarMouse().setcaixas(mou);
                VisualizarMouse.getVisualizarMouse().setVisible(true);
            }
            if(tbView.getModel().getValueAt(pos,0).equals("Teclado")){
                Teclado tec = new Teclado();
                tec.setMarca((String)tbView.getModel().getValueAt(pos,1));
                tec.setModelo((String)tbView.getModel().getValueAt(pos,2));
                tec = Banco.buscaTeclado(tec);
                VisualizarTeclado.getVisualizarTeclado().setAlterar(false);
                VisualizarTeclado.getVisualizarTeclado().setcaixas(tec);
                VisualizarTeclado.getVisualizarTeclado().setVisible(true);
            }
            else if(tbView.getModel().getValueAt(pos,0).equals("Monitor")){
                Monitor moni = new Monitor();
                moni.setMarca((String)tbView.getModel().getValueAt(pos,1));
                moni.setModelo((String)tbView.getModel().getValueAt(pos,2));
                moni = Banco.buscaMonitor(moni);
                VisualizarMonitor.getVisualizarMonitor().setAlterar(false);
                VisualizarMonitor.getVisualizarMonitor().setcaixas(moni);
                VisualizarMonitor.getVisualizarMonitor().setVisible(true);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um produto",
                "Erro", 1);
        }
    }//GEN-LAST:event_btMaisInfoActionPerformed

    private void cbPesquisaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPesquisaItemStateChanged
        faixaVisible();
    }//GEN-LAST:event_cbPesquisaItemStateChanged
    
    public void faixaVisible(){
        if(cbPesquisa.getSelectedIndex() ==3){
            rtFaixa.setVisible(true);
            cxFaixa.setVisible(true);
        }
        else{
            cxFaixa.setText("");
            rtFaixa.setVisible(false);
            cxFaixa.setVisible(false);
        }
}
    
    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        int pos = tbView.getSelectedRow();
        if(pos>=0){
            if(tbView.getModel().getValueAt(pos,0).equals("Mouse")){
                Mouse mou = new Mouse();
                mou.setMarca((String)tbView.getModel().getValueAt(pos,1));
                mou.setModelo((String)tbView.getModel().getValueAt(pos,2));
                mou = Banco.buscaMouse(mou);
                VisualizarMouse.getVisualizarMouse().setAlterar(true);
                VisualizarMouse.getVisualizarMouse().setcaixas(mou);
                VisualizarMouse.getVisualizarMouse().setVisible(true);
                listarTabMouse();
            }
            else if(tbView.getModel().getValueAt(pos,0).equals("Teclado") == true){
                Teclado tec = Banco.getBanco().getBdTeclado().get(pos);
                tec.setMarca((String)tbView.getModel().getValueAt(pos,1));
                tec.setModelo((String)tbView.getModel().getValueAt(pos,2));
                tec = Banco.buscaTeclado(tec);
                VisualizarTeclado.getVisualizarTeclado().setAlterar(true);
                VisualizarTeclado.getVisualizarTeclado().setcaixas(tec);
                VisualizarTeclado.getVisualizarTeclado().setVisible(true);
                listarTabTeclado();
            }
            else if(tbView.getModel().getValueAt(pos,0).equals("Monitor")){
                Monitor moni = Banco.getBanco().getBdMonitor().get(pos);
                moni.setMarca((String)tbView.getModel().getValueAt(pos,1));
                moni.setModelo((String)tbView.getModel().getValueAt(pos,2));
                moni = Banco.buscaMonitor(moni);
                VisualizarMonitor.getVisualizarMonitor().setAlterar(true);
                VisualizarMonitor.getVisualizarMonitor().setcaixas(moni);
                VisualizarMonitor.getVisualizarMonitor().setVisible(true);
                listarTabMonitor();
            }
        }
    }//GEN-LAST:event_btAlterarActionPerformed
 
    public void limpar(){
        cxPesquisa.setText("");
    }
    
    public javax.swing.JButton getBtDeletar(){
        return btDeletar;
    }

    public void listarTabMouse(){
        DefaultTableModel tabModel = (DefaultTableModel) tbView.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        if(checkFiltro.isSelected() == false){
            for (Mouse mou : Banco.getBanco().getBdMouse()) {
                tabModel.insertRow(posLin, new Object[]{"Mouse", mou.getMarca(), mou.getModelo(), mou.getPreco()});
                posLin++;
            }
        }
        else{
            if(cbPesquisa.getSelectedIndex() == 0 || cxPesquisa.getText().equalsIgnoreCase("")){
                System.out.println("Pesquise por algo");
            }
            else{
                if(cbPesquisa.getSelectedIndex() == 1){ //marca
                    for (Mouse mou : Banco.getBanco().getBdMouse()) {
                        if(mou.getMarca().equalsIgnoreCase(cxPesquisa.getText())){
                            tabModel.insertRow(posLin, new Object[]{"Mouse", mou.getMarca(), mou.getModelo(), mou.getPreco()});
                            posLin++;
                        }
                    }
                }
                if(cbPesquisa.getSelectedIndex() == 2){ //modelo
                    for (Mouse mou : Banco.getBanco().getBdMouse()) {
                        if(mou.getModelo().equalsIgnoreCase(cxPesquisa.getText())){
                            tabModel.insertRow(posLin, new Object[]{"Mouse", mou.getMarca(), mou.getModelo(), mou.getPreco()});
                            posLin++;
                        }
                    }
                }
                if(cbPesquisa.getSelectedIndex() == 3){ //preco
                    for (Mouse mou : Banco.getBanco().getBdMouse()) {
                        if(mou.getPreco() > (Float.parseFloat(cxPesquisa.getText()) - Integer.parseInt(cxFaixa.getText())) && mou.getPreco() < (Float.parseFloat(cxPesquisa.getText()) + Integer.parseInt(cxFaixa.getText()))){
                            tabModel.insertRow(posLin, new Object[]{"Mouse", mou.getMarca(), mou.getModelo(), mou.getPreco()});
                            posLin++;
                        }
                    }
                }
            }
        }
    }
    public void listarTabTeclado(){
        DefaultTableModel tabModel = (DefaultTableModel) tbView.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        if(checkFiltro.isSelected() == false){
            for (Teclado tec : Banco.getBanco().getBdTeclado()) {
                tabModel.insertRow(posLin, new Object[]{"Teclado",tec.getMarca(), tec.getModelo(), tec.getPreco()});
                posLin++;
            }
        }
        else{
            if(cbPesquisa.getSelectedIndex() == 0 || cxPesquisa.getText().equals("")){
                System.out.println("Pesquise por um item");
            }
            else{
                if(cbPesquisa.getSelectedIndex() == 1){
                    for (Teclado tec : Banco.getBanco().getBdTeclado()) {
                        if(tec.getMarca().equalsIgnoreCase(cxPesquisa.getText())){
                            tabModel.insertRow(posLin, new Object[]{"Teclado", tec.getMarca(), tec.getModelo(), tec.getPreco()});
                            posLin++;
                        }
                    }
                }
                if(cbPesquisa.getSelectedIndex() == 2){
                    for (Teclado tec : Banco.getBanco().getBdTeclado()) {
                        if(tec.getModelo().equalsIgnoreCase(cxPesquisa.getText())){
                            tabModel.insertRow(posLin, new Object[]{"Teclado", tec.getMarca(), tec.getModelo(), tec.getPreco()});
                            posLin++;
                        }
                    }
                }
                if(cbPesquisa.getSelectedIndex() == 3){
                    for (Teclado tec : Banco.getBanco().getBdTeclado()) {
                        if(tec.getPreco() > (Float.parseFloat(cxPesquisa.getText())-Integer.parseInt(cxFaixa.getText())) && tec.getPreco() < (Float.parseFloat(cxPesquisa.getText())+Integer.parseInt(cxFaixa.getText()))){
                            tabModel.insertRow(posLin, new Object[]{"Teclado", tec.getMarca(), tec.getModelo(), tec.getPreco()});
                            posLin++;
                        }
                    }
                }
            }
        }
    }
    public void listarTabMonitor(){
        DefaultTableModel tabModel = (DefaultTableModel) tbView.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        if(checkFiltro.isSelected() == false){
            for (Monitor moni : Banco.getBanco().getBdMonitor()) {
                tabModel.insertRow(posLin, new Object[]{"Monitor", moni.getMarca(), moni.getModelo(), moni.getPreco()});
                posLin++;
            }
        }
        else{
            if(cbPesquisa.getSelectedIndex() == 0 || cxPesquisa.getText().equals("")){
                System.out.println("Pesquise um item");
            }
            else{
                if(cbPesquisa.getSelectedIndex() == 1){
                    for (Monitor moni : Banco.getBanco().getBdMonitor()) {
                        if(moni.getMarca().equalsIgnoreCase(cxPesquisa.getText())){
                            tabModel.insertRow(posLin, new Object[]{"Monitor", moni.getMarca(), moni.getModelo(), moni.getPreco()});
                            posLin++;
                        }
                    }
                }
                if(cbPesquisa.getSelectedIndex() == 2){
                    for (Monitor moni : Banco.getBanco().getBdMonitor()) {
                        if(moni.getModelo().equalsIgnoreCase(cxPesquisa.getText())){
                            tabModel.insertRow(posLin, new Object[]{"Monitor", moni.getMarca(), moni.getModelo(), moni.getPreco()});
                            posLin++;
                        }
                    }
                }
                if(cbPesquisa.getSelectedIndex() == 3){
                    for (Monitor moni : Banco.getBanco().getBdMonitor()) {
                        if(moni.getPreco() > (Float.parseFloat(cxPesquisa.getText())-Integer.parseInt(cxFaixa.getText())) && moni.getPreco() < (Float.parseFloat(cxPesquisa.getText())+Integer.parseInt(cxFaixa.getText()))){
                            tabModel.insertRow(posLin, new Object[]{"Monitor", moni.getMarca(), moni.getModelo(), moni.getPreco()});
                            posLin++;
                        }
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btMaisInfo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbPesquisa;
    private javax.swing.JComboBox<String> cbProduto;
    private javax.swing.JCheckBox checkFiltro;
    private javax.swing.JTextField cxFaixa;
    private javax.swing.JTextField cxPesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtFaixa;
    private javax.swing.JLabel rtPesquisa;
    private javax.swing.JLabel rtProcurar;
    private javax.swing.JTable tbView;
    // End of variables declaration//GEN-END:variables
}
