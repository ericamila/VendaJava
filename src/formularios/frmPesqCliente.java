package formularios;

import classes.Dados;
import classes.Dados_db;
import classes.Utilidades;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erica
 */
public class frmPesqCliente extends javax.swing.JDialog {

    private DefaultTableModel mTabela;
    private String resposta = "";
    private Dados_db msDados_db;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }

    public String getResposta() {
        return resposta;
    }

    private void preencherTabela() {
        String titulos[] = {"ID Cliente", "Tipo ID", "Nome", "Sobrenome"};
        String registro[] = new String[3];
        mTabela = new DefaultTableModel(null, titulos);
        String sql = "";
        if (txtPesqCliente.getText().equals("")) {
            sql = "SELECT idCliente, nomes, snome FROM clientes";
        } else {
            if (jRBNome.isSelected()) {
                sql = "SELECT idCliente, nomes, snome FROM clientes "
                        + "WHERE nomes LIKE '" + txtPesqCliente.getText() + "%'";
            }
            if (jRBSobrenome.isSelected()) {
                sql = "SELECT idCliente, nomes, snome FROM clientes "
                        + "WHERE snome LIKE '" + txtPesqCliente.getText() + "%'";
            }
            if (jRBIDCliente.isSelected()) {
                sql = "SELECT idCliente, nomes, snome FROM clientes "
                        + "WHERE idCliente LIKE '" + txtPesqCliente.getText() + "%'";
            }
        }

        ResultSet rs = msDados_db.getConsulta(sql);

        try {
            while (rs.next()) {
                registro[0] = rs.getString("idCliente");
                registro[1] = rs.getString("nomes");
                registro[2] = rs.getString("snome");
                mTabela.addRow(registro);
            }
            jTabela.setModel(mTabela);
            return;
        } catch (SQLException ex) {
            Logger.getLogger(frmPesqCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public frmPesqCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGTipoPesq = new javax.swing.ButtonGroup();
        jRBIDCliente = new javax.swing.JRadioButton();
        jRBNome = new javax.swing.JRadioButton();
        jRBSobrenome = new javax.swing.JRadioButton();
        txtPesqCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        btnPesquisarCliente = new javax.swing.JButton();
        btnPesquisarSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bGTipoPesq.add(jRBIDCliente);
        jRBIDCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRBIDCliente.setForeground(new java.awt.Color(0, 51, 102));
        jRBIDCliente.setSelected(true);
        jRBIDCliente.setText("ID Cliente");
        jRBIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBIDClienteActionPerformed(evt);
            }
        });

        bGTipoPesq.add(jRBNome);
        jRBNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRBNome.setForeground(new java.awt.Color(0, 51, 102));
        jRBNome.setText("Nome");
        jRBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNomeActionPerformed(evt);
            }
        });

        bGTipoPesq.add(jRBSobrenome);
        jRBSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRBSobrenome.setForeground(new java.awt.Color(0, 51, 102));
        jRBSobrenome.setText("Sobrenome");
        jRBSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBSobrenomeActionPerformed(evt);
            }
        });

        txtPesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqClienteActionPerformed(evt);
            }
        });

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

        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pesql.gif"))); // NOI18N
        btnPesquisarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        btnPesquisarSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnPesquisarSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisarSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPesqCliente)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRBIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRBNome, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRBSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBIDCliente)
                    .addComponent(jRBNome)
                    .addComponent(jRBSobrenome))
                .addGap(18, 18, 18)
                .addComponent(txtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisarSair, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        int num = jTabela.getRowCount();
        if (num == 0) {
            resposta = "";
            dispose();
            return;
        }
        for (int i = 0; i < num; i++) {
            if (jTabela.isRowSelected(i)) {
                resposta = Utilidades.objectToString(jTabela.getValueAt(i, 0));
                dispose();
                return;
            }
        }
        resposta = Utilidades.objectToString(jTabela.getValueAt(0, 0));
        dispose();
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnPesquisarSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarSairActionPerformed
        resposta = "";
        dispose();
    }//GEN-LAST:event_btnPesquisarSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencherTabela();
        txtPesqCliente.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void jRBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNomeActionPerformed
        txtPesqCliente.setText("");
        txtPesqCliente.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_jRBNomeActionPerformed

    private void jRBSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBSobrenomeActionPerformed
        txtPesqCliente.setText("");
        txtPesqCliente.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_jRBSobrenomeActionPerformed

    private void jRBIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBIDClienteActionPerformed
        txtPesqCliente.setText("");
        txtPesqCliente.requestFocusInWindow();
        preencherTabela();
    }//GEN-LAST:event_jRBIDClienteActionPerformed

    private void txtPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqClienteActionPerformed
        preencherTabela();
    }//GEN-LAST:event_txtPesqClienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmPesqCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPesqCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPesqCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPesqCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPesqCliente dialog = new frmPesqCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGTipoPesq;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarSair;
    private javax.swing.JRadioButton jRBIDCliente;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JRadioButton jRBSobrenome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextField txtPesqCliente;
    // End of variables declaration//GEN-END:variables
}
