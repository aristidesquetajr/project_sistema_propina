package dao;

import beans.Pessoa;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {
    private Conexao conexao;
    private Connection conn;
    
    public PessoaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConnection();
    }
    
    public void cadastrarPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO Pessoa (nome, nascimento) values (?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setDate(2, (Date) pessoa.getNascimento());
            stmt.execute();
        } catch(SQLException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }
}
