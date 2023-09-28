package classes;

import formularios.frmLogin;
import java.sql.SQLException;

public class JavaVenda {

    public static void main(String[] args) throws SQLException {
        Dados_db msDados_db = new Dados_db();
        
        frmLogin miLogin = new frmLogin();
        
        miLogin.setDados_db(msDados_db);
        
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
}
