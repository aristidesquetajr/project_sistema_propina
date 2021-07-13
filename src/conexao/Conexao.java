package conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kashiki
 */
public class Conexao {
    
    private String host;
    private String user;
    private String pass;
    
    public Conexao() {
        this.host = "jdbc:mysql://localhost:3306/projectoPropina";
        this.user = "root";
        this.pass = "KASHIKI";
    }
    
    public Connection getConnection() {
        try {
            return (Connection) DriverManager.getConnection(this.host, this.user, this.pass);
        } catch (SQLException e) {
            System.out.println("Erro na conexao " + e.getMessage());
            return null;
        }
    }
}
