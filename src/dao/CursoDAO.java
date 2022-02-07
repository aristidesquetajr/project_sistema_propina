package dao;

import conexao.Conexao;
import java.sql.Connection;

public class CursoDAO {
    private Conexao conexao;
    private Connection conn;
    
    public CursoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConnection();
    }
}
