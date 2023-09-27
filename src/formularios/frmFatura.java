package formularios;

import classes.Dados_db;
import classes.Opcoes;
import classes.Utilidades;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erica
 */
public class frmFatura extends javax.swing.JInternalFrame {

    private DefaultTableModel mTabela;
        private Dados_db msDados_db;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public frmFatura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaDetalhes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletarTodos = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbProduto = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();
        txtData = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtTotalQuantidade = new javax.swing.JTextField();
        txtTotalValor = new javax.swing.JTextField();
        btnPesquisarCliente = new javax.swing.JButton();
        btnPesquisarProduto = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Vendas:");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jTabelaDetalhes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabelaDetalhes);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add (3).png"))); // NOI18N
        btnNovo.setToolTipText("Adicionar Produto");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        jPanel1.add(btnNovo, gridBagConstraints);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save (2).png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar Venda");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        jPanel1.add(btnSalvar, gridBagConstraints);

        btnDeletarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh (2).png"))); // NOI18N
        btnDeletarTodos.setToolTipText("Deletar todos os produtos");
        btnDeletarTodos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTodosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        jPanel1.add(btnDeletarTodos, gridBagConstraints);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete (2).png"))); // NOI18N
        btnExcluir.setToolTipText("Deletar Produto");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        jPanel1.add(btnExcluir, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Data:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Cliente:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Produto:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prodform.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Total:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("Quantidade:");

        cmbProduto.setPreferredSize(new java.awt.Dimension(320, 22));

        cmbCliente.setPreferredSize(new java.awt.Dimension(320, 22));

        txtData.setEnabled(false);
        txtData.setPreferredSize(new java.awt.Dimension(120, 22));

        txtQuantidade.setPreferredSize(new java.awt.Dimension(120, 22));

        txtTotalQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalQuantidade.setEnabled(false);

        txtTotalValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalValor.setEnabled(false);

        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesql.gif"))); // NOI18N
        btnPesquisarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        btnPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesql.gif"))); // NOI18N
        btnPesquisarProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(txtTotalQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(45, 45, 45)
                                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbCliente, 0, 0, Short.MAX_VALUE)
                                            .addComponent(cmbProduto, 0, 0, Short.MAX_VALUE))
                                        .addGap(8, 8, 8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPesquisarCliente)
                                    .addComponent(btnPesquisarProduto))
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnPesquisarCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel2))
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel3))
                                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4))
                                    .addComponent(cmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel8))
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPesquisarProduto))))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtTotalQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto.");
            cmbProduto.requestFocusInWindow();
            return;
        }
        if (txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma quantidade.");
            txtQuantidade.requestFocusInWindow();
            return;
        }

        if (!Utilidades.isNumeric(txtQuantidade.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Digite somente números para a quantidade.");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }
        int qtd = Integer.parseInt(txtQuantidade.getText());
        if (qtd <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Quantidade inválida.");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
            return;
        }

//        String pega="";
//        for (int i = 0; i < msDados.numeroProduto(); i++) {
//            if (cmbProduto.getSelectedItem().equals(msDados.getProdutos()[i].getDescricao()))
//            pega = msDados.getProdutos()[i].getIdProduto();
//        }
//        
//        int pos = msDados.posicaoProduto(pega);
        int pos = msDados.posicaoProduto(((Opcoes) cmbProduto.getSelectedItem()).getValor());

        String registro[] = new String[5];
        registro[0] = msDados.getProdutos()[pos].getIdProduto();
        registro[1] = msDados.getProdutos()[pos].getDescricao();
        registro[2] = "" + msDados.getProdutos()[pos].getPreco();
        registro[3] = "" + qtd;
        registro[4] = "" + (qtd * msDados.getProdutos()[pos].getPreco());
        mTabela.addRow(registro);

        limpaCampos();
        totais();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (cmbCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente.");
            cmbCliente.requestFocusInWindow();
            return;
        }

        int totalQtd = Integer.parseInt(txtTotalQuantidade.getText());
        if (totalQtd == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione os produtos para venda.");
            txtTotalQuantidade.requestFocusInWindow();
            return;
        }
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Confirma a venda?");
        if (resposta != 0) {
            return;
        }

        int numFatura = msDados.getNumeroFatura() + 1;

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/fatura.txt", true);
            pw = new PrintWriter(fw);

            String aux = "1|"
                    + numFatura + "|"
                    + ((Opcoes) cmbCliente.getSelectedItem()).getValor() + "|"
                    + ((Opcoes) cmbCliente.getSelectedItem()).getDescricao() + "|"
                    + txtData.getText();

            pw.println(aux);

            int num = jTabelaDetalhes.getRowCount();
            for (int i = 0; i < num; i++) {
                aux = "2|"
                        + Utilidades.objectToString(jTabelaDetalhes.getValueAt(i, 0)) + "|"
                        + Utilidades.objectToString(jTabelaDetalhes.getValueAt(i, 1)) + "|"
                        + Utilidades.objectToString(jTabelaDetalhes.getValueAt(i, 2)) + "|"
                        + Utilidades.objectToString(jTabelaDetalhes.getValueAt(i, 3)) + "|"
                        + Utilidades.objectToString(jTabelaDetalhes.getValueAt(i, 4));

                pw.println(aux);
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        JOptionPane.showMessageDialog(rootPane, "VENDA: " + numFatura + " REALIZADA COM SUCESSO!");
        msDados.setNumeroFatura(numFatura);
        cmbCliente.setSelectedIndex(0);
        limparTabela();
        totais();
        cmbCliente.requestFocusInWindow();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (cmbProduto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto.");
            cmbProduto.requestFocusInWindow();
            return;
        }

        try {
            DefaultTableModel modelo = (DefaultTableModel) jTabelaDetalhes.getModel();
            int linha = jTabelaDetalhes.getRowCount();
            for (int i = 0; linha > i; i++) {
                String idTabela = Utilidades.objectToString(jTabelaDetalhes.getValueAt(i, 0));
                String idCombo = ((Opcoes) cmbProduto.getSelectedItem()).getValor();
                if (idTabela.equals(idCombo)) {
                    modelo.removeRow(i);
                    totais();
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnDeletarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTodosActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar esta venda?");
        if (resposta != 0) {
            return;
        }
        limparTabela();
        totais();
    }//GEN-LAST:event_btnDeletarTodosActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        frmPesqCliente mPesqCliente = new frmPesqCliente(null, closable);
        mPesqCliente.setDados(msDados);
        mPesqCliente.setVisible(true);
        String rta = mPesqCliente.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbCliente.getItemCount(); i++) {
            if (((Opcoes) cmbCliente.getItemAt(i)).getValor().equals(rta)) {
                cmbCliente.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed
        frmPesqProduto mPesqProduto = new frmPesqProduto(null, closable);
        mPesqProduto.setDados(msDados);
        mPesqProduto.setVisible(true);
        String rta = mPesqProduto.getResposta();
        if (rta.equals("")) {
            return;
        }
        for (int i = 0; i < cmbProduto.getItemCount(); i++) {
            if (((Opcoes) cmbProduto.getItemAt(i)).getValor().equals(rta)) {
                cmbProduto.setSelectedIndex(i);
                return;
            }
        }
    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            Opcoes opc = new Opcoes("selecione", "Selecione um cliente");
            cmbCliente.addItem(opc);
            ResultSet rsCli = msDados_db.getClientes();
            while(rsCli.next()) {
                opc = new Opcoes(
                rsCli.getString("idCliente"),
                rsCli.getString("nomes")+" "+
                rsCli.getString("snome"));
                cmbCliente.addItem(opc);
            }
            
            opc = new Opcoes("selecione", "Selecione um produto");
            cmbProduto.addItem(opc);
           ResultSet rsPro = msDados_db.getProdutos();
            while(rsPro.next()) {
                opc = new Opcoes(
                rsPro.getString("idProduto"),
                rsPro.getString("descricao"));
                cmbProduto.addItem(opc);
            }
            
            txtData.setText(Utilidades.formatDate(new Date()));
            txtTotalQuantidade.setText("0");
            txtTotalValor.setText("0.00");
            preencherTabela();
        } catch (SQLException ex) {
            Logger.getLogger(frmFatura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletarTodos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Opcoes> cmbCliente;
    private javax.swing.JComboBox<Opcoes> cmbProduto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaDetalhes;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtTotalQuantidade;
    private javax.swing.JTextField txtTotalValor;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        String titulos[] = {"ID Prod", "Descrição", "Preço", "Quantidade", "Valor"};
        String registro[] = new String[5];
        mTabela = new DefaultTableModel(null, titulos);
        jTabelaDetalhes.setModel(mTabela);

        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
        jTabelaDetalhes.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        jTabelaDetalhes.getColumnModel().getColumn(3).setCellRenderer(dtcr);
        jTabelaDetalhes.getColumnModel().getColumn(4).setCellRenderer(dtcr);
    }

    private void limpaCampos() {
        cmbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cmbProduto.requestFocusInWindow();
    }

    private void totais() {
        int num = jTabelaDetalhes.getRowCount();
        int somaQtd = 0, somaVal = 0;

        for (int i = 0; i < num; i++) {
            somaQtd += Utilidades.objectToInt(jTabelaDetalhes.getValueAt(i, 3));
            somaVal += Utilidades.objectToInt(jTabelaDetalhes.getValueAt(i, 4));
        }
        txtTotalQuantidade.setText("" + somaQtd);
        txtTotalValor.setText("" + somaVal);
    }

    public void limparTabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTabelaDetalhes.getModel();
            int linha = jTabelaDetalhes.getRowCount();
            for (int i = 0; linha > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
