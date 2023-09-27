package formularios;

import classes.BackGround;
import classes.Dados;
import classes.Dados_db;

/**
 *
 * @author Erica
 */
public class frmPrincipal extends javax.swing.JFrame {

    private int perfil;
    private String senha;
    private String usuario;  
    private Dados_db msDados_db;

    public void setDados_db(Dados_db msDados_db) {
        this.msDados_db = msDados_db;
    }
   
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new BackGround();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        mnArquivoCliente = new javax.swing.JMenuItem();
        mnArquivoProduto = new javax.swing.JMenuItem();
        mnArquivoUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnArquivoTSenha = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnArquivoTUsuario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnArquivoSair = new javax.swing.JMenuItem();
        mnMovimento = new javax.swing.JMenu();
        mnMovimentoNovaVenda = new javax.swing.JMenuItem();
        mnMovimentoRelatorioVenda = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        mnAjudaSobre = new javax.swing.JMenuItem();
        mnAjudaAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        mnArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/application_search.png"))); // NOI18N
        mnArquivo.setText("Arquivo");

        mnArquivoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnArquivoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        mnArquivoCliente.setText("Clientes");
        mnArquivoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivoClienteActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivoCliente);

        mnArquivoProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnArquivoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produtos.png"))); // NOI18N
        mnArquivoProduto.setText("Produtos");
        mnArquivoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivoProdutoActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivoProduto);

        mnArquivoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnArquivoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        mnArquivoUsuario.setText("Usuários");
        mnArquivoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivoUsuarioActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivoUsuario);
        mnArquivo.add(jSeparator1);

        mnArquivoTSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnArquivoTSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/senhas.png"))); // NOI18N
        mnArquivoTSenha.setText("Trocar Senha");
        mnArquivoTSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivoTSenhaActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivoTSenha);
        mnArquivo.add(jSeparator2);

        mnArquivoTUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnArquivoTUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        mnArquivoTUsuario.setText("Trocar Usuário");
        mnArquivoTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivoTUsuarioActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivoTUsuario);
        mnArquivo.add(jSeparator3);

        mnArquivoSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnArquivoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        mnArquivoSair.setText("Sair");
        mnArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivoSairActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivoSair);

        jMenuBar1.add(mnArquivo);

        mnMovimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chart (3).png"))); // NOI18N
        mnMovimento.setText("Movimentos");

        mnMovimentoNovaVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnMovimentoNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/venda.png"))); // NOI18N
        mnMovimentoNovaVenda.setText("Nova Venda");
        mnMovimentoNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMovimentoNovaVendaActionPerformed(evt);
            }
        });
        mnMovimento.add(mnMovimentoNovaVenda);

        mnMovimentoRelatorioVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnMovimentoRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/relatorio.png"))); // NOI18N
        mnMovimentoRelatorioVenda.setText("Relatório Venda");
        mnMovimento.add(mnMovimentoRelatorioVenda);

        jMenuBar1.add(mnMovimento);

        mnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone (2).png"))); // NOI18N
        mnAjuda.setText("Ajuda");

        mnAjudaSobre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        mnAjudaSobre.setText("Sobre");
        mnAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAjudaSobreActionPerformed(evt);
            }
        });
        mnAjuda.add(mnAjudaSobre);

        mnAjudaAjuda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        mnAjudaAjuda.setText("Ajuda");
        mnAjudaAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAjudaAjudaActionPerformed(evt);
            }
        });
        mnAjuda.add(mnAjudaAjuda);

        jMenuBar1.add(mnAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnMovimentoNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMovimentoNovaVendaActionPerformed
        frmFatura mFaturas = new frmFatura();
        mFaturas.setDados_db(msDados_db);
        dpnDesk.add(mFaturas);
        mFaturas.show();
    }//GEN-LAST:event_mnMovimentoNovaVendaActionPerformed

    private void mnArquivoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivoUsuarioActionPerformed
        frmUsuario mUsuarios = new frmUsuario();
        mUsuarios.setDados_db(msDados_db);
        dpnDesk.add(mUsuarios);
        mUsuarios.show();
    }//GEN-LAST:event_mnArquivoUsuarioActionPerformed

    private void mnArquivoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivoProdutoActionPerformed
        frmProdutos msProdutos = new frmProdutos();
        msProdutos.setDados_db(msDados_db);
        dpnDesk.add(msProdutos);
        msProdutos.show();
    }//GEN-LAST:event_mnArquivoProdutoActionPerformed

    private void mnArquivoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivoClienteActionPerformed
        frmClientes msClientes = new frmClientes();
        msClientes.setDados_db(msDados_db);
        dpnDesk.add(msClientes);
        msClientes.show();
    }//GEN-LAST:event_mnArquivoClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ((BackGround) dpnDesk).setImage("/images/background.jpg");

        if (perfil == 2) {
            mnArquivoCliente.setEnabled(false);
            mnArquivoProduto.setEnabled(false);
            mnArquivoUsuario.setEnabled(false);
            mnMovimentoRelatorioVenda.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void mnArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivoSairActionPerformed
        msDados.salvarTodo();
        System.exit(0);
    }//GEN-LAST:event_mnArquivoSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        msDados.salvarTodo();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void mnArquivoTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivoTUsuarioActionPerformed
        this.setVisible(false);
        frmLogin mLogin = new frmLogin();
        mLogin.setDados(msDados);
        mLogin.setVisible(true);
    }//GEN-LAST:event_mnArquivoTUsuarioActionPerformed

    private void mnArquivoTSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivoTSenhaActionPerformed
        frmTrocarSenha msSenha = new frmTrocarSenha(this, rootPaneCheckingEnabled);
        msSenha.setSenha(senha);
        msSenha.setUsuario(usuario);
        msSenha.setDados(msDados);
        msSenha.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnArquivoTSenhaActionPerformed

    private void mnAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAjudaSobreActionPerformed
        frmSobre mSobre = new frmSobre(this, rootPaneCheckingEnabled);
        mSobre.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnAjudaSobreActionPerformed

    private void mnAjudaAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAjudaAjudaActionPerformed
        frmSobre mAjuda = new frmSobre(this, rootPaneCheckingEnabled);
        mAjuda.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_mnAjudaAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenuItem mnAjudaAjuda;
    private javax.swing.JMenuItem mnAjudaSobre;
    private javax.swing.JMenu mnArquivo;
    private javax.swing.JMenuItem mnArquivoCliente;
    private javax.swing.JMenuItem mnArquivoProduto;
    private javax.swing.JMenuItem mnArquivoSair;
    private javax.swing.JMenuItem mnArquivoTSenha;
    private javax.swing.JMenuItem mnArquivoTUsuario;
    private javax.swing.JMenuItem mnArquivoUsuario;
    private javax.swing.JMenu mnMovimento;
    private javax.swing.JMenuItem mnMovimentoNovaVenda;
    private javax.swing.JMenuItem mnMovimentoRelatorioVenda;
    // End of variables declaration//GEN-END:variables
}
