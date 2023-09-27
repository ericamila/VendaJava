package formularios;

import classes.Dados_db;
import classes.Cliente;
import classes.Utilidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClientes extends javax.swing.JInternalFrame {

    private Dados_db msDados_db;
    private int cliAtual = 0;
    private boolean novo = false;
    private DefaultTableModel mTabela;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public frmClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIDCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbIdentificacao = new javax.swing.JComboBox<>();
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
        jLabel8 = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox<>();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jData = new com.toedter.calendar.JDateChooser();
        jDataNascimento = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("Clientes:");
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes (2).png"))); // NOI18N

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNome.setEnabled(false);

        txtIDCliente.setBackground(new java.awt.Color(242, 242, 242));
        txtIDCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIDCliente.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("ID Cliente:");

        txtSNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSNome.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Sobrenome:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Identificação:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Nome:");

        cmbIdentificacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbIdentificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Identificação", "CNH", "Identidade", "Passaporte" }));
        cmbIdentificacao.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Endereço:");

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
                .addGap(46, 46, 46)
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
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
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
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Cidade:");

        cmbCidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma cidade", "Boa Vista", "Rorainópolis", "Caracaraí", "Alto Alegre", "Mucajaí", "Cantá", "Bonfim", "Pacaraima", "Amajari", "Normandia", "Iracema", "Uiramutã", "Caroebe", "São João da Baliza", "São Luís do Anauá" }));
        cmbCidade.setEnabled(false);

        txtEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEndereco.setEnabled(false);

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTelefone.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Data Nasc.:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Data:");

        jData.setEnabled(false);

        jDataNascimento.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTelefone)
                                    .addComponent(txtIDCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addComponent(txtSNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cmbIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
        txtIDCliente.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtIDCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Favor inserir um número de ID.");
            txtIDCliente.requestFocusInWindow();
            return;
        }
        if (cmbIdentificacao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um tipo de documento.");
            cmbIdentificacao.requestFocusInWindow();
            return;
        }
        if (cmbCidade.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma cidade.");
            cmbCidade.requestFocusInWindow();
            return;
        }
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite um nome válido.");
            txtNome.requestFocusInWindow();
            return;
        }
        if (txtSNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite um sobrenome válido.");
            txtSNome.requestFocusInWindow();
            return;
        }
        if (txtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite um endereço válido.");
            txtEndereco.requestFocusInWindow();
            return;
        }
        if (txtTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite um telefone válido.");
            txtTelefone.requestFocusInWindow();
            return;
        }
        if (jDataNascimento.getDate().after(new Date())) {
            JOptionPane.showMessageDialog(rootPane, "Digite uma data de nascimento anterior à data atual.");
            jDataNascimento.requestFocusInWindow();
            return;
        }

        if (novo) {
            if (msDados_db.existeCliente(txtIDCliente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Cliente já existe.");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        } else {
            if (!msDados_db.existeCliente(txtIDCliente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Cliente ainda não existe.");
                txtIDCliente.requestFocusInWindow();
                return;
            }
        }

        Cliente mCliente = new Cliente(txtIDCliente.getText(), cmbIdentificacao.getSelectedIndex(), txtNome.getText(), txtSNome.getText(),
                txtEndereco.getText(), txtTelefone.getText(), cmbCidade.getSelectedIndex(), jDataNascimento.getDate(), jData.getDate());
        String msg;
        if (novo) {
            msg = msDados_db.adicionarCliente(mCliente);
        } else {
            msg = msDados_db.editarCliente(mCliente);
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
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        desabilitaBotoes();
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        habilitaCampos();
        txtIDCliente.setEnabled(false);
        jData.setEnabled(false);
        novo = false;
        txtNome.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        preencherTabela();
        mostrarRegisto();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        cliAtual = 0;
        mostrarRegisto();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        cliAtual = msDados_db.numeroCliente() - 1;
        mostrarRegisto();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        cliAtual++;
        if (cliAtual == msDados_db.numeroCliente()) {
            cliAtual = 0;
        }
        mostrarRegisto();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        cliAtual--;
        if (cliAtual == -1) {
            cliAtual = msDados_db.numeroCliente() - 1;
        }
        mostrarRegisto();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente deletar este cadastro?");
        if (resposta != 0) {
            return;
        }
        String msg;
        msg = msDados_db.deletarCliente(txtIDCliente.getText());
        JOptionPane.showMessageDialog(rootPane, msg);
        cliAtual = 0;
        preencherTabela();
        mostrarRegisto();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String cliente = JOptionPane.showInputDialog("Insira o código do usuário");
        if (cliente.equals("")) {
            return;
        }
        if (!msDados_db.existeCliente(cliente)) {
            JOptionPane.showMessageDialog(rootPane, "Cliente não existe");
            return;
        }
        int num = jTabela.getRowCount();
        for (int i = 0; i < num; i++) {
            if (Utilidades.objectToString(jTabela.getValueAt(i, 0)).equals(cliente)) {
                cliAtual = i;
                break;
            }
        }
        mostrarRegisto();

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void mostrarRegisto() {
        txtIDCliente.setText(Utilidades.objectToString(jTabela.getValueAt(cliAtual, 0)));
        cmbIdentificacao.setSelectedIndex(tipoID(Utilidades.objectToString(jTabela.getValueAt(cliAtual, 1))));
        txtNome.setText(Utilidades.objectToString(jTabela.getValueAt(cliAtual, 2)));
        txtSNome.setText(Utilidades.objectToString(jTabela.getValueAt(cliAtual, 3)));
        txtEndereco.setText(Utilidades.objectToString(jTabela.getValueAt(cliAtual, 4)));
        txtTelefone.setText(Utilidades.objectToString(jTabela.getValueAt(cliAtual, 5)));
        cmbCidade.setSelectedIndex(cidade(Utilidades.objectToString(jTabela.getValueAt(cliAtual, 6))));
        jDataNascimento.setDate(Utilidades.objectToDate(jTabela.getValueAt(cliAtual, 7)));
        jData.setDate(Utilidades.objectToDate(jTabela.getValueAt(cliAtual, 8)));
    }

    private void preencherTabela() {
        try {
            String titulos[] = {"ID Cliente", "Tipo ID", "Nome", "Sobrenome", "Endereço", "Telefone", "Cidade", "Data de Nasc.", "Data"};
            String registro[] = new String[9];
            mTabela = new DefaultTableModel(null, titulos);
            ResultSet rs = msDados_db.getClientes();

            while (rs.next()) {
                registro[0] = rs.getString("idCliente");
                registro[1] = tipoID(rs.getInt("idTipo"));
                registro[2] = rs.getString("nomes");
                registro[3] = rs.getString("snome");
                registro[4] = rs.getString("endereco");
                registro[5] = rs.getString("telefone");
                registro[6] = cidade(rs.getInt("idCidade"));
                registro[7] = rs.getString("dataNascimento");
                registro[8] = rs.getString("dataCadastro");
                mTabela.addRow(registro);
            }
            jTabela.setModel(mTabela);
        } catch (SQLException ex) {
            Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String tipoID(int id) {
        return switch (id) {
            case 1 ->
                "CNH";
            case 2 ->
                "Identidade";
            case 3 ->
                "Passaporte";
            case 4 ->
                "CPF";
            case 5 ->
                "Carteira Internacional";
            case 6 ->
                "Outros";
            default ->
                "Não definido";
        };
    }

    private int tipoID(String tipo) {
        return switch (tipo) {
            case "CNH" ->
                1;
            case "Identidade" ->
                2;
            case "Passaporte" ->
                3;
            case "CPF" ->
                4;
            case "Carteira Internacional" ->
                5;
            default ->
                6;
        };
    }

    private String cidade(int id) {
        return switch (id) {
            case 1 ->
                "Boa Vista";
            case 2 ->
                "Rorainópolis";
            case 3 ->
                "Caracaraí";
            case 4 ->
                "Alto Alegre";
            case 5 ->
                "Mucajaí";
            case 6 ->
                "Cantá";
            case 7 ->
                "Bonfim";
            case 8 ->
                "Pacaraima";
            case 9 ->
                "Amajari";
            case 10 ->
                "Normandia";
            case 11 ->
                "Iracema";
            case 12 ->
                "Uiramutã";
            case 13 ->
                "Caroebe";
            case 14 ->
                "São João da Baliza";
            case 15 ->
                "São Luís do Anauá";
            default ->
                "Não definido";
        };
    }

    private int cidade(String nome) {
        return switch (nome) {
            case "Boa Vista" ->
                1;
            case "Rorainópolis" ->
                2;
            case "Caracaraí" ->
                3;
            case "Alto Alegre" ->
                4;
            case "Mucajaí" ->
                5;
            case "Cantá" ->
                6;
            case "Bonfim" ->
                7;
            case "Pacaraima" ->
                8;
            case "Amajari" ->
                9;
            case "Normandia" ->
                10;
            case "Iracema" ->
                11;
            case "Uiramutã" ->
                12;
            case "Caroebe" ->
                13;
            case "São João da Baliza" ->
                14;
            default ->
                15;
        };
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
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JComboBox<String> cmbIdentificacao;
    private com.toedter.calendar.JDateChooser jData;
    private com.toedter.calendar.JDateChooser jDataNascimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSNome;
    private javax.swing.JTextField txtTelefone;
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
        txtIDCliente.setEnabled(false);
        txtNome.setEnabled(false);
        txtSNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        cmbIdentificacao.setEnabled(false);
        cmbCidade.setEnabled(false);
        jDataNascimento.setEnabled(false);
        jData.setEnabled(false);
    }

    public void habilitaCampos() {
        txtIDCliente.setEnabled(true);
        txtNome.setEnabled(true);
        txtSNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtTelefone.setEnabled(true);
        cmbIdentificacao.setEnabled(true);
        cmbCidade.setEnabled(true);
        jDataNascimento.setEnabled(true);
        jData.setEnabled(true);
    }

    public void limpaCampos() {
        txtIDCliente.setText("");
        txtNome.setText("");
        txtSNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        jDataNascimento.setDate(new Date());
        jData.setDate(new Date());
        cmbIdentificacao.setSelectedIndex(0);
        cmbCidade.setSelectedIndex(0);
    }

}
