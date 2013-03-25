package classes;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

public class Banco {
    private Connection conexao;
    private Statement stm;

    //Construtor
    public Banco() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            this.conexao = DriverManager.getConnection("jdbc:sqlite:dados.db");
            this.stm = this.conexao.createStatement();
            this.stm.executeUpdate("CREATE TABLE IF NOT EXISTS Pessoas (id integer PRIMARY KEY NOT NULL, nome varchar(70), idade integer);");
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Reseta as tabelas do banco
    public void initDB() {
        try {
            this.stm.executeUpdate("DROP TABLE IF EXISTS Pessoas");
            this.stm.executeUpdate("CREATE TABLE IF NOT EXISTS Pessoas (id integer PRIMARY KEY NOT NULL, nome varchar(70), idade integer);");
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Insere no banco
    public void insere(Pessoa pessoa) {
        try {
            this.stm.executeUpdate("INSERT INTO Pessoas VALUES (" +pessoa.getId() +",\'" +pessoa.getNome() +"\'," +pessoa.getIdade() +")");
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Exclui do banco
    public void deleta(int id) {
        try {
            this.stm.executeUpdate("DELETE FROM Pessoas WHERE id = " +id);
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Altera do banco
    public void altera(Pessoa p) {
        try {
            this.stm.executeUpdate("UPDATE Pessoas SET nome = \'" +p.getNome() +"\', idade = " +p.getIdade() +" WHERE id = " +p.getId() +"");
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Retorna o último valor de um id valido acrescido de 1
    public int retornaID() {
        ResultSet rs;
        int id=0;
        try {
            rs = this.stm.executeQuery("SELECT * FROM Pessoas");
            while(rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            return ++id;
        } catch(SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    //Retorna um ArrayList com todas as pessoas cadastradas
    public ArrayList retornaPessoa() {
        ResultSet rs;
        Pessoa p = new Pessoa();
        Pessoa aux = null;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        try {
            rs = this.stm.executeQuery("SELECT * FROM Pessoas");
            while(rs.next()) {
                p.setId(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setIdade(rs.getInt(3));
                aux = new Pessoa(p.getId(),p.getNome(),p.getIdade());
                pessoas.add(aux);
            }
            rs.close();
            return pessoas;
        } catch(SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    //Retorna um objeto Pessoa com o id fornecido
    public Pessoa retornaPessoa(int id) {
        ResultSet rs;
        Pessoa p = new Pessoa();
        try {
            rs = this.stm.executeQuery("SELECT * FROM Pessoas WHERE id = " +id);
            p.setId(rs.getInt(1));
            p.setNome(rs.getString(2));
            p.setIdade(rs.getInt(3));
            rs.close();
            return p;
        } catch(SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    //Retorna um objeto Pessoa com o nome fornecido
    public ArrayList retornaPessoa(String nome) {
        ResultSet rs;
        Pessoa p = new Pessoa();
        Pessoa aux = null;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        try {
            rs = this.stm.executeQuery("SELECT * FROM Pessoas WHERE nome = \'" +nome +"\'");
            while(rs.next()) {
                p.setId(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setIdade(rs.getInt(3));
                aux = new Pessoa(p.getId(),p.getNome(),p.getIdade());
                pessoas.add(aux);
            }
            rs.close();
            return pessoas;
        } catch(SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    //Retorna um ArrayList com todas as pessoas cadastradas ordenado pelo nome
    public ArrayList retornaPessoaNome() {
        ResultSet rs;
        Pessoa p = new Pessoa();
        Pessoa aux = null;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        try {
            rs = this.stm.executeQuery("SELECT * FROM Pessoas ORDER BY nome");
            while(rs.next()) {
                p.setId(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setIdade(rs.getInt(3));
                aux = new Pessoa(p.getId(),p.getNome(),p.getIdade());
                pessoas.add(aux);
            }
            rs.close();
            return pessoas;
        } catch(SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    //Fecha as conexões do banco
    public void close() {
        try {
            this.conexao.close();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        try {
            this.stm.close();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }

}
