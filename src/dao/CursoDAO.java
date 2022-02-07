package dao;

import beans.Curso;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CursoDAO {
    private Conexao conexao;
    private Connection conn;
    private String sql;
    private PreparedStatement stmt;
    
    public CursoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConnection();
    }
    
    public void createdCurso(Curso curso) {
        this.sql = "INSERT INTO Curso (curso) VALUES (?)";
        try {
            this.stmt = this.conn.prepareStatement(this.sql);
            this.stmt.setString(1, curso.getCurso());
        } catch (SQLException e) {
            System.out.println("Erro no cadastro do curso: " + e.getMessage());
        }
    }
}
