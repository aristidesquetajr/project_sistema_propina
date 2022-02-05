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
    private PreparedStatement stmt;
    
    public AlunoDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConnection();
    }
    
    public boolean cadastro(Pessoa pessoa, Aluno aluno, Classe classe) {
        String sql = "INSERT INTO Aluno (fkPessoa, fkClasse, numProcesso, numEstudante) values (?, ?, ?, ?)";
        try {
            this.stmt = this.conn.prepareStatement(sql);
            this.stmt.setInt(1, pessoa.getIdPessoa());
            this.stmt.setInt(2, classe.getIdClasse());
            this.stmt.setInt(3, aluno.getNumProcesso());
            this.stmt.setInt(4, aluno.getNumEstudante());
            return stmt.execute();
        } catch(SQLException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
        return false;
    }
    
    public void mostrarAlunos() {
        String sql = "SELECT * FROM Pessoa AS pes LEFT JOIN Aluno AS alu ON (pes.idPessoa = alu.fkPessoa)";
        try {
            this.stmt = this.conn.prepareStatement(sql);
            stmt.execute();
        } catch (Exception e) {
        }
    }    
}
