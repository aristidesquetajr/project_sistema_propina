package dao;

import beans.Aluno;
import beans.Classe;
import beans.Pessoa;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
    private Conexao conexao;
    private Connection conn;
    
    public AlunoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConnection();
    }
    
    public boolean cadastro(Pessoa pessoa, Aluno aluno, Classe classe) {
        String sql = "INSERT INTO Aluno (fkPessoa, fkClasse, numProcesso, numEstudante) values (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, pessoa.getIdPessoa());
            stmt.setInt(2, classe.getIdClasse());
            stmt.setInt(3, aluno.getNumProcesso());
            stmt.setInt(4, aluno.getNumEstudantes());
            return stmt.execute();
        } catch(SQLException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
        return false;
    }
}
