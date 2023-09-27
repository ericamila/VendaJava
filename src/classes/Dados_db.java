package classes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erica
 */
public class Dados_db {

    private Connection cnn;

    public Dados_db() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String db = "jdbc:postgresql://localhost:5432/faturacao";
            cnn = DriverManager.getConnection(db, "postgres", "erufg");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validarUsuario(String usuario, String senha) {
        try {
            String sql = "SELECT (1) FROM usuarios WHERE idUsuario = '"
                    + usuario + "' AND senha ='" + senha + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int getPerfil(String usuario) {
        try {
            String sql = "SELECT idPerfil FROM usuarios WHERE idUsuario = '"
                    + usuario + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("idPerfil");
            } else {
                return -1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public boolean existeUsuario(String usuario) {
        try {
            String sql = "SELECT (1) FROM usuarios WHERE idUsuario = '"
                    + usuario + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean existeCliente(String cliente) {
        try {
            String sql = "SELECT (1) FROM clientes WHERE idcliente = '"
                    + cliente + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean existeProduto(String produto) {
        try {
            String sql = "SELECT (1) FROM produtos WHERE idproduto = '"
                    + produto + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public String adicionarUsuario(Usuario mUsuario) {
        try {
            String sql = "INSERT INTO usuarios VALUES('"
                    + mUsuario.getIdUsuario() + "', '"
                    + mUsuario.getNome() + "', '"
                    + mUsuario.getSnome() + "', '"
                    + mUsuario.getSenha() + "', "
                    + mUsuario.getPerfil() + ")";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro efetuado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível efetuar o cadastro!";
        }
    }

    public String adicionarCliente(Cliente mCliente) {
        try {
            String sql = "INSERT INTO clientes VALUES('"
                    + mCliente.getIdCliente() + "', "
                    + mCliente.getIdTipo() + ", '"
                    + mCliente.getNome() + "', '"
                    + mCliente.getSnome() + "', '"
                    + mCliente.getEndereco() + "', '"
                    + mCliente.getTelefone() + "', "
                    + mCliente.getIdCidade() + ", '"
                    + Utilidades.formatDate(mCliente.getNascimento()) + "', '"
                    + Utilidades.formatDate(mCliente.getData()) + "')";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro efetuado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível efetuar o cadastro!";
        }
    }

    public String adicionarProduto(Produto mProduto) {
        try {
            String sql = "INSERT INTO produtos VALUES('"
                    + mProduto.getIdProduto() + "', '"
                    + mProduto.getDescricao() + "', "
                    + mProduto.getPreco() + ", "
                    + mProduto.getImposto() + ", '"
                    + mProduto.getAnotacao() + "')";
            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro efetuado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível efetuar o cadastro!";
        }
    }

    public String editarUsuario(Usuario mUsuario) {
        try {
            String sql = "UPDATE usuarios SET "
                    + "nome = '" + mUsuario.getNome() + "',"
                    + "snome = '" + mUsuario.getSnome() + "',"
                    + "senha = '" + mUsuario.getSenha() + "',"
                    + "idPerfil = " + mUsuario.getPerfil() + " "
                    + " WHERE idUsuario = '" + mUsuario.getIdUsuario() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro editado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível editar o cadastro!";
        }
    }

    public String editarProduto(Produto mProduto) {
        try {
            String sql = "UPDATE produtos SET "
                    + "descricao = '" + mProduto.getDescricao() + "',"
                    + "preco = " + mProduto.getPreco() + ","
                    + "idimposto = " + mProduto.getImposto() + ","
                    + "notas = '" + mProduto.getAnotacao() + "' "
                    + " WHERE idProduto = '" + mProduto.getIdProduto() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro editado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível editar o cadastro!";
        }
    }

    public String editarCliente(Cliente mCliente) {
        try {
            String sql = "UPDATE clientes SET "
                    + "idTipo = " + mCliente.getIdTipo() + ","
                    + "nomes = '" + mCliente.getNome() + "',"
                    + "snome = '" + mCliente.getSnome() + "',"
                    + "endereco = '" + mCliente.getEndereco() + "',"
                    + "telefone = '" + mCliente.getTelefone() + "',"
                    + "idCidade = " + mCliente.getIdCidade() + ","
                    + "dataNascimento = '" + Utilidades.formatDate(mCliente.getNascimento()) + "',"
                    + "dataCadastro = '" + Utilidades.formatDate(mCliente.getData()) + "'"
                    + " WHERE idCliente = '" + mCliente.getIdCliente() + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro editado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível editar o cadastro!";
        }
    }

    public String deletarUsuario(String usuario) {
        try {
            String sql = "DELETE FROM usuarios WHERE idUsuario = '" + usuario + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro deletado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível excluir o cadastro!";
        }
    }

    public String deletarCliente(String cliente) {
        try {
            String sql = "DELETE FROM clientes WHERE idCliente = '" + cliente + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro deletado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível excluir o cadastro!";
        }
    }

    public String deletarProduto(String produto) {
        try {
            String sql = "DELETE FROM produtos WHERE idProduto = '" + produto + "'";

            Statement st = cnn.createStatement();
            st.executeUpdate(sql);
            return "Cadastro deletado com sucesso!";
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return "Não foi possível excluir o cadastro!";
        }
    }

    public ResultSet getUsuarios() {
        try {
            String sql = "SELECT * FROM usuarios";

            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet getClientes() {
        try {
            String sql = "SELECT * FROM clientes";

            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ResultSet getProdutos() {
        try {
            String sql = "SELECT * FROM produtos";

            Statement st = cnn.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int numeroUsuario() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM usuarios";

            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int numeroCliente() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM clientes";

            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int numeroProduto() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM produtos";

            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public Produto getProduto(String idProduto) {
        try {
            Produto mProduto = null;
            String sql = "SELECT * FROM produtos " + " WHERE idProduto '" + idProduto + "'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                mProduto = new Produto(rs.getString("idProduto"),
                        rs.getString("descricao"),
                        rs.getInt("preco"),
                        rs.getInt("idProduto"),
                        rs.getString("notas"));
            }
            return mProduto;
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
