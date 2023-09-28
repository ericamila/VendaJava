package formularios;

import classes.Dados_db;
import classes.Opcoes;
import classes.Relatorio;
import classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Erica
 */
public class frmRelatoriosVendas extends javax.swing.JInternalFrame {

    private Dados_db msDados_db;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public frmRelatoriosVendas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGRFiltro = new javax.swing.ButtonGroup();
        bGRTipo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnSelecao = new javax.swing.JButton();
        jRData = new javax.swing.JRadioButton();
        jRCliente = new javax.swing.JRadioButton();
        jRNumVenda = new javax.swing.JRadioButton();
        jRTodos = new javax.swing.JRadioButton();
        jRSelecao = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDCDataInicial = new com.toedter.calendar.JDateChooser();
        jDCDataFinal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCBVendaInicial = new javax.swing.JComboBox<>();
        jCBVendaFinal = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCBCliente = new javax.swing.JComboBox<>();
        jBGerarRelatorio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatório de vendas:");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Arquivo:");

        txtArquivo.setText("Relatório");

        btnSelecao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelecao.setForeground(new java.awt.Color(0, 51, 102));
        btnSelecao.setText("...");
        btnSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecaoActionPerformed(evt);
            }
        });

        bGRFiltro.add(jRData);
        jRData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRData.setSelected(true);
        jRData.setText("Data Venda");
        jRData.setEnabled(false);
        jRData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRDataActionPerformed(evt);
            }
        });

        bGRFiltro.add(jRCliente);
        jRCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRCliente.setText("Cliente");
        jRCliente.setEnabled(false);
        jRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRClienteActionPerformed(evt);
            }
        });

        bGRFiltro.add(jRNumVenda);
        jRNumVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRNumVenda.setText("Número Venda");
        jRNumVenda.setEnabled(false);
        jRNumVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNumVendaActionPerformed(evt);
            }
        });

        bGRTipo.add(jRTodos);
        jRTodos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRTodos.setSelected(true);
        jRTodos.setText("Todas Venda");
        jRTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRTodosActionPerformed(evt);
            }
        });

        bGRTipo.add(jRSelecao);
        jRSelecao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRSelecao.setText("Seleção Venda");
        jRSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRSelecaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Data Inicial:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Data Final:");

        jDCDataInicial.setEnabled(false);

        jDCDataFinal.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Venda Inicial:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Venda Final:");

        jCBVendaInicial.setEnabled(false);

        jCBVendaFinal.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Cliente:");

        jCBCliente.setEnabled(false);

        jBGerarRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBGerarRelatorio.setText("Gerar Relatório");
        jBGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRData)
                                .addGap(18, 18, 18)
                                .addComponent(jRNumVenda))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDCDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCBVendaInicial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRCliente)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 60, Short.MAX_VALUE)
                                        .addComponent(jLabel5))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDCDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jCBVendaFinal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBGerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRTodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRSelecao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecao))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRTodos)
                            .addComponent(jRSelecao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRData)
                            .addComponent(jRNumVenda)
                            .addComponent(jRCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2))
                            .addComponent(jDCDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDCDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jCBVendaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBVendaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jBGerarRelatorio)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setBounds(500, 200, 644, 414);
    }// </editor-fold>//GEN-END:initComponents

    private void jRTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRTodosActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_jRTodosActionPerformed

    private void jRSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRSelecaoActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_jRSelecaoActionPerformed

    private void jRDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRDataActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_jRDataActionPerformed

    private void jRNumVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNumVendaActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_jRNumVendaActionPerformed

    private void jRClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRClienteActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_jRClienteActionPerformed

    private void jBGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarRelatorioActionPerformed
        if (txtArquivo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return;
        }
        try {

            String arquivo = txtArquivo.getText() + ".pdf";

            String sql = "SELECT fatura.idFatura, fatura.idCliente, "
                    + "CONCAT (nomes, ' ' , snome) AS nomeFull, "
                    + "data, idLinha, idProduto, descricao, preco, "
                    + "quantidade, preco*quantidade AS valor "
                    + "FROM fatura "
                    + "INNER JOIN clientes ON fatura.idCliente = clientes.idCliente "
                    + "INNER JOIN detalheFatura ON fatura.idFatura = detalheFatura.idFatura";

            String filtro = "";
            if (jRTodos.isSelected()) {
                filtro = "";
            } else {
                if (jRCliente.isSelected()) {
                    if (jCBCliente.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Selecione um cliente!");
                        jCBCliente.requestFocusInWindow();
                        return;
                    }
                    filtro = " WHERE fatura.idCliente = '" + ((Opcoes) jCBCliente.getSelectedItem()).getValor() + "'";
                }
                if (jRNumVenda.isSelected()) {
                    if (jCBVendaInicial.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Selecione uma venda inicial!");
                        jCBVendaInicial.requestFocusInWindow();
                        return;
                    }
                    if (jCBVendaFinal.getSelectedIndex() == 0) {
                        JOptionPane.showMessageDialog(null, "Selecione uma venda final!");
                        jCBVendaFinal.requestFocusInWindow();
                        return;
                    }
                    filtro = " WHERE fatura.idFatura >= " + ((Opcoes) jCBVendaInicial.getSelectedItem()).getValor()
                            + " AND fatura.idFatura <= " + ((Opcoes) jCBVendaFinal.getSelectedItem()).getValor();
                }
                
                if (jRData.isSelected()) {
                    if (jDCDataInicial.getDate() == null) {
                        JOptionPane.showMessageDialog(null, "Selecione uma data inicial!");
                        jDCDataInicial.requestFocusInWindow();
                        return;
                    }
                    if (jDCDataFinal.getDate() == null) {
                        JOptionPane.showMessageDialog(null, "Selecione uma data final!");
                        jDCDataFinal.requestFocusInWindow();
                        return;
                    }
                    filtro = " WHERE data >= '" + Utilidades.formatDate(jDCDataInicial.getDate())
                            + "' AND data <= '" + Utilidades.formatDate(jDCDataFinal.getDate())+"'";
                }
            }
            sql += filtro;
            Relatorio.relatorioFatura(arquivo, msDados_db.getConsulta(sql));

            JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!");

        } catch (Exception ex) {
            Logger.getLogger(frmRelatoriosVendas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBGerarRelatorioActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            Opcoes opc = new Opcoes("selecione", "Selecione um cliente");
            jCBCliente.addItem(opc);
            ResultSet rsCli = msDados_db.getClientes();
            while (rsCli.next()) {
                opc = new Opcoes(
                        rsCli.getString("idCliente"),
                        rsCli.getString("nomes") + " "
                        + rsCli.getString("snome"));
                jCBCliente.addItem(opc);
            }

            opc = new Opcoes("selecione", "Selecione uma venda:");
            jCBVendaInicial.addItem(opc);
            jCBVendaFinal.addItem(opc);
            ResultSet rsFat = msDados_db.getFatura();
            while (rsFat.next()) {
                opc = new Opcoes(
                        rsFat.getString("idFatura"),
                        rsFat.getString("idFatura"));
                jCBVendaInicial.addItem(opc);
                jCBVendaFinal.addItem(opc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmRelatoriosVendas.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecaoActionPerformed
        frmSelecionarArquivo mArquivo = new frmSelecionarArquivo(null, closable);
        mArquivo.setVisible(true);
        String arquivo = mArquivo.getArquivo();
        if (!arquivo.equals("")) {
            txtArquivo.setText(arquivo);
        }
    }//GEN-LAST:event_btnSelecaoActionPerformed

    private void habilitarCampos() {
        if (jRTodos.isSelected()) {
            jRData.setEnabled(false);
            jRNumVenda.setEnabled(false);
            jRCliente.setEnabled(false);
            jDCDataInicial.setEnabled(false);
            jDCDataFinal.setEnabled(false);
            jCBCliente.setEnabled(false);
            jCBVendaInicial.setEnabled(false);
            jCBVendaFinal.setEnabled(false);
        } else {
            jRData.setEnabled(true);
            jRNumVenda.setEnabled(true);
            jRCliente.setEnabled(true);

            if (jRData.isSelected()) {
                jDCDataInicial.setEnabled(true);
                jDCDataFinal.setEnabled(true);

                jCBCliente.setEnabled(false);
                jCBVendaInicial.setEnabled(false);
                jCBVendaFinal.setEnabled(false);
            }
            if (jRNumVenda.isSelected()) {
                jDCDataInicial.setEnabled(false);
                jDCDataFinal.setEnabled(false);
                jCBCliente.setEnabled(false);

                jCBVendaInicial.setEnabled(true);
                jCBVendaFinal.setEnabled(true);
            }
            if (jRCliente.isSelected()) {
                jDCDataInicial.setEnabled(false);
                jDCDataFinal.setEnabled(false);

                jCBCliente.setEnabled(true);

                jCBVendaInicial.setEnabled(false);
                jCBVendaFinal.setEnabled(false);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGRFiltro;
    private javax.swing.ButtonGroup bGRTipo;
    private javax.swing.JButton btnSelecao;
    private javax.swing.JButton jBGerarRelatorio;
    private javax.swing.JComboBox<Opcoes> jCBCliente;
    private javax.swing.JComboBox<Opcoes> jCBVendaFinal;
    private javax.swing.JComboBox<Opcoes> jCBVendaInicial;
    private com.toedter.calendar.JDateChooser jDCDataFinal;
    private com.toedter.calendar.JDateChooser jDCDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRCliente;
    private javax.swing.JRadioButton jRData;
    private javax.swing.JRadioButton jRNumVenda;
    private javax.swing.JRadioButton jRSelecao;
    private javax.swing.JRadioButton jRTodos;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables
}
