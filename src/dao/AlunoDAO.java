package dao;

import conexao.Conexao;
import java.sql.Connection;

public class AlunoDAO {
    private Conexao conexao;
    private Connection conn;
    
    public AlunoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConnection();
    }
    
    
}
