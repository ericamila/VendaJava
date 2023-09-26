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
    private int maxUsu = 50;
    private int maxPro = 100;
    private int maxCli = 100;
    private Usuario msUsuarios[] = new Usuario[maxUsu];
    private Produto msProdutos[] = new Produto[maxPro];
    private Cliente msClientes[] = new Cliente[maxCli];
    private int conUsu = 0;
    private int conPro = 0;
    private int conCli = 0;
    private int numFatura = 0;

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
            return "Usuário cadastrado com sucesso!";
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
            return "Usuário editado com sucesso!";
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
            return "Usuário deletado com sucesso!";
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
    
    public int numeroUsuario() {
        try {
            String sql = "SELECT COUNT(*) AS num FROM usuarios";

            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                return rs.getInt("num");
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

}
