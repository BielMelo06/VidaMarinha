
package dao;

import beans.animais_em_risco_extincao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class animais_em_risco_extincaoDAO {
    private final Conexao conexao;
    private final Connection conn;
    
    public animais_em_risco_extincaoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(animais_em_risco_extincao animais_em_risco_extincao){
        String sql = "INSERT INTO animais_em_risco_extincao (id, nome, habitat, peso, nome_cientifico) VALUES (?,?,?,?,?) ";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, animais_em_risco_extincao.getId());
            stmt.setString(2, animais_em_risco_extincao.getNome());
            stmt.setString(3,animais_em_risco_extincao.getHabitat());
            stmt.setString(4,animais_em_risco_extincao.getPeso());
            stmt.setString(5,animais_em_risco_extincao.getNome_cientifico());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao inserir animais_em_risco_extincao: "+ e.getMessage());
        }
    }
    
    public void alterar(animais_em_risco_extincao animais_em_risco_extincao){
        String sql = "UPDATE animais_em_risco_extincao SET nome=?, habitat=?, peso=?, nome_cientifico=? WHERE id=?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, animais_em_risco_extincao.getId());
            stmt.setString(2, animais_em_risco_extincao.getNome());
            stmt.setString(3,animais_em_risco_extincao.getHabitat());
            stmt.setString(4,animais_em_risco_extincao.getPeso());
            stmt.setString(5,animais_em_risco_extincao.getNome_cientifico());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao atualizar animais_em_risco_extincao: "+ e.getMessage());
        }
    }
    
    public void excluir(int id){
        String sql = "DELETE FROM animais_em_risco_extincao WHERE id = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao excluir animais_em_risco_extincao: "+ e.getMessage());
        }
    }
    
    public animais_em_risco_extincao getanimais_em_risco_extincao(int id){
        String sql = "SELECT * FROM animais_em_risco_extincao WHERE id =?";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            animais_em_risco_extincao animais_em_risco_extincao = new animais_em_risco_extincao();
            rs.next();
            animais_em_risco_extincao.setId(rs.getInt("id"));
            animais_em_risco_extincao.setNome(rs.getString("nome"));
            animais_em_risco_extincao.setHabitat(rs.getString("habitat"));
            animais_em_risco_extincao.setPeso(rs.getString("peso"));
            animais_em_risco_extincao.setNome_cientifico(rs.getString("nome cientifico"));
            return animais_em_risco_extincao;
        
        }catch(Exception e){
            System.out.println("Erro ao atualizar animais_em_risco_extincao: "+ e.getMessage());
            return null;
        }
        
    }
    public List<animais_em_risco_extincao> getanimais_em_risco_extincao(){
        String sql = "SELECT * FROM animais_em_risco_extincao";
        try{
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          List<animais_em_risco_extincao> listaanimais_em_risco_extincao = new ArrayList<>();
          while(rs.next()){
              animais_em_risco_extincao p = new animais_em_risco_extincao();
              p.setId(rs.getInt("id"));
              p.setNome(rs.getString("nome"));
              p.setHabitat(rs.getString("habitat"));
              p.setPeso(rs.getString("peso"));
              p.setNome_cientifico(rs.getString("nome cientifico"));
              listaanimais_em_risco_extincao.add(p);
          }
          return listaanimais_em_risco_extincao;
        }catch(Exception e){
            return null;
        }
    }
}
