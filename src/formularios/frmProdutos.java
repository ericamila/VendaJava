package formularios;

import classes.Dados_db;
import classes.Produto;
import classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class frmProdutos extends javax.swing.JInternalFrame {

    private int proAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;
    private Dados_db msDados_db;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public frmProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtIDProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbImposto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnotacao = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produtos:");
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone-carro.png"))); // NOI18N

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescricao.setEnabled(false);

        txtIDProduto.setBackground(new java.awt.Color(242, 242, 242));
        txtIDProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDProduto.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("ID Produto:");

        txtPreco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPreco.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Preço:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Imposto:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Descrição:");

        cmbImposto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbImposto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "15%" }));
        cmbImposto.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Anotação:");

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabela);

        btnPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volta.png"))); // NOI18N
        btnPrimeiro.setToolTipText("Navegar para o primeiro cadastro");
        btnPrimeiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/antes.png"))); // NOI18N
        btnAnterior.setToolTipText("Navegar para o cadastro anterior");
        btnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/depois.png"))); // NOI18N
        btnProximo.setToolTipText("Navegar para o próximo cadastro");
        btnProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avanca.png"))); // NOI18N
        btnUltimo.setToolTipText("Navegar para o último cadastro");
        btnUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add (3).png"))); // NOI18N
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save (2).png"))); // NOI18N
        btnSalvar.setEnabled(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete (2).png"))); // NOI18N
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        btnPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUltimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAnotacao.setColumns(20);
        txtAnotacao.setRows(5);
        jScrollPane2.setViewportView(txtAnotacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbImposto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(94, 94, 94))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel1)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel4)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel6))
                                            .addComponent(cmbImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        desabilitaBotoes();
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        habilitaCampos();
        limpaCampos();
        novo = true;
        txtIDProduto.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtIDProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID.");
            txtIDProduto.requestFocusInWindow();
            return;
        }
//        if (cmbImposto.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(rootPane, "Selecione um valor de imposto.");
//            cmbImposto.requestFocusInWindow();
//            return;
//        }
        if (txtPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite o preço.");
            txtPreco.requestFocusInWindow();
            return;
        }
        int preco = Integer.parseInt(txtPreco.getText());
        if (preco <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Preço inválido.");
            txtPreco.requestFocusInWindow();
            return;
        }
        if (!Utilidades.isNumeric(txtPreco.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Digite somente números para o preço.");
            txtPreco.requestFocusInWindow();
            return;
        }
        if (txtDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite a descrição.");
            txtDescricao.requestFocusInWindow();
            return;
        }

        if (novo) {
            if (msDados_db.existeProduto(txtIDProduto.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Produto já existe.");
                txtIDProduto.requestFocusInWindow();
                return;
            }
        } else {
            if (!msDados_db.existeProduto(txtIDProduto.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Produto ainda não existe.");
                txtIDProduto.requestFocusInWindow();
                return;
            }
        }

        Produto mProduto = new Produto(txtIDProduto.getText(), txtDescricao.getText(), preco, cmbImposto.getSelectedIndex(), txtAnotacao.getText());
        String msg;
        if (novo) {
            msg = msDados_db.adicionarProduto(mProduto);
        } else {
            msg = msDados_db.editarProduto(mProduto);
        }

        JOptionPane.showMessageDialog(rootPane, msg);

        habilitaBotoes();
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        desabilitaCampos();
        preencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitaBotoes();
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        desabilitaCampos();
        limpaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        desabilitaBotoes();
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        habilitaCampos();
        txtIDProduto.setEnabled(false);
        novo = false;
        txtDescricao.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela();
        mostrarRegisto();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        proAtual = 0;
        mostrarRegisto();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        proAtual = msDados_db.numeroProduto() - 1;
        mostrarRegisto();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        proAtual++;
        if (proAtual == msDados_db.numeroProduto()) {
            proAtual = 0;
        }
        mostrarRegisto();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        proAtual--;
        if (proAtual == -1) {
            proAtual = msDados_db.numeroProduto() - 1;
        }
        mostrarRegisto();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar este cadastro?");
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = msDados_db.deletarProduto(txtIDProduto.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        proAtual = 0;
        preencherTabela();
        mostrarRegisto();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String produto = JOptionPane.showInputDialog("Insira o código do produto");
        if (produto.equals("")) {
            return;
        }
        if (!msDados_db.existeProduto(produto)) {
            JOptionPane.showMessageDialog(rootPane, "Produto não existe");
            return;
        }
        int num = jTabela.getRowCount();
        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(jTabela.getValueAt(i, 0)).equals(produto)) {
                proAtual = i;
                break;
            }
        }
        mostrarRegisto();

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegisto() {
        txtIDProduto.setText(Utilidades.objectToString(jTabela.getValueAt(proAtual, 0)));
        txtDescricao.setText(Utilidades.objectToString(jTabela.getValueAt(proAtual, 1)));
        txtPreco.setText(Utilidades.objectToString(jTabela.getValueAt(proAtual, 2)));
        cmbImposto.setSelectedIndex(imposto(Utilidades.objectToString(jTabela.getValueAt(proAtual, 3))));
        txtAnotacao.setText(Utilidades.objectToString(jTabela.getValueAt(proAtual, 4)));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Produto", "Descrição", "Preço", "Imposto", "Anotação"};
            String registro[] = new String[5];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = msDados_db.getProdutos();

            while (rs.next()) {
                registro[0] = rs.getString("idProduto");
                registro[1] = rs.getString("descricao");
                registro[2] = rs.getString("preco");
                registro[3] = imposto(rs.getInt("idImposto"));
                registro[4] = rs.getString("notas");
                mTabela.addRow(registro);
            }
            jTabela.setModel(mTabela);
            DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
            dtcr.setHorizontalAlignment(SwingConstants.RIGHT);
            jTabela.getColumnModel().getColumn(2).setCellRenderer(dtcr);
        } catch (SQLException ex) {
            Logger.getLogger(frmProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String imposto(int idImposto) {//verificar
        return switch (idImposto) {
            case 0 ->
                "0%";
            case 1 ->
                "10%";
            default ->
                "15%";
        };
    }

    private Integer imposto(String imposto) {
        if (imposto.equals("0%")) {
            return 0;
        } else if (imposto.equals("10%")) {
            return 1;
        } else {
            return 2;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox<String> cmbImposto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextArea txtAnotacao;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
    public void desabilitaBotoes() {
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnProximo.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnPesquisar.setEnabled(false);
    }

    public void habilitaBotoes() {
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnProximo.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnPesquisar.setEnabled(true);
    }

    public void desabilitaCampos() {
        txtIDProduto.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPreco.setEnabled(false);
        txtAnotacao.setEnabled(false);
        cmbImposto.setEnabled(false);
    }

    public void habilitaCampos() {
        txtIDProduto.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtPreco.setEnabled(true);
        txtAnotacao.setEnabled(true);
        cmbImposto.setEnabled(true);
    }

    public void limpaCampos() {
        txtIDProduto.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtAnotacao.setText("");
        cmbImposto.setSelectedIndex(0);
    }

}
