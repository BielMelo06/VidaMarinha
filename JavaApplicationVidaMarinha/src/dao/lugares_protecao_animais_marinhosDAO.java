
package dao;

import beans.lugares_protecao_animais_marinhos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class lugares_protecao_animais_marinhosDAO {
    private final Conexao conexao;
    private final Connection conn;
    
    public lugares_protecao_animais_marinhosDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(lugares_protecao_animais_marinhos lugares_protecao_animais_marinhos){
        String sql = "INSERT INTO lugares_protecao_animais_marinhos (id, nome, lugar, animais_protegidos, instituicao) VALUES (?,?,?,?,?) ";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, lugares_protecao_animais_marinhos.getId());
            stmt.setString(2, lugares_protecao_animais_marinhos.getNome());
            stmt.setString(3,lugares_protecao_animais_marinhos.getLugar());
            stmt.setString(4,lugares_protecao_animais_marinhos.getAnimais_protegidos());
            stmt.setString(5,lugares_protecao_animais_marinhos.getInstituicao());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao inserir lugares_protecao_animais_marinhos: "+ e.getMessage());
        }
    }
    
    public void alterar(lugares_protecao_animais_marinhos lugares_protecao_animais_marinhos){
        String sql = "UPDATE lugares_protecao_animais_marinhos SET nome=?, lugar=?, animais_protegidos=?, instituicao=? WHERE id=?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, lugares_protecao_animais_marinhos.getId());
            stmt.setString(2, lugares_protecao_animais_marinhos.getNome());
            stmt.setString(3,lugares_protecao_animais_marinhos.getLugar());
            stmt.setString(4,lugares_protecao_animais_marinhos.getAnimais_protegidos());
            stmt.setString(5,lugares_protecao_animais_marinhos.getInstituicao());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao atualizar lugares_protecao_animais_marinhos: "+ e.getMessage());
        }
    }
    
    public void excluir(int id){
        String sql = "DELETE FROM lugares_protecao_animais_marinhos WHERE id = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao excluir lugares_protecao_animais_marinhos: "+ e.getMessage());
        }
    }
    
    public lugares_protecao_animais_marinhos getlugares_protecao_animais_marinhos(int id){
        String sql = "SELECT * FROM lugares_protecao_animais_marinhos WHERE id =?";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            lugares_protecao_animais_marinhos lugares_protecao_animais_marinhos = new lugares_protecao_animais_marinhos();
            rs.next();
            lugares_protecao_animais_marinhos.setId(rs.getInt("id"));
            lugares_protecao_animais_marinhos.setNome(rs.getString("nome"));
            lugares_protecao_animais_marinhos.setLugar(rs.getString("lugar"));
            lugares_protecao_animais_marinhos.setAnimais_protegidos(rs.getString("animais_protegidos"));
            lugares_protecao_animais_marinhos.setInstituicao(rs.getString("nome cientifico"));
            return lugares_protecao_animais_marinhos;
        
        }catch(Exception e){
            System.out.println("Erro ao atualizar lugares_protecao_animais_marinhos: "+ e.getMessage());
            return null;
        }
        
    }
    public List<lugares_protecao_animais_marinhos> getlugares_protecao_animais_marinhos(){
        String sql = "SELECT * FROM lugares_protecao_animais_marinhos";
        try{
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          List<lugares_protecao_animais_marinhos> listalugares_protecao_animais_marinhos = new ArrayList<>();
          while(rs.next()){
              lugares_protecao_animais_marinhos p = new lugares_protecao_animais_marinhos();
              p.setId(rs.getInt("id"));
              p.setNome(rs.getString("nome"));
              p.setLugar(rs.getString("lugar"));
              p.setAnimais_protegidos(rs.getString("animais_protegidos"));
              p.setInstituicao(rs.getString("nome cientifico"));
              listalugares_protecao_animais_marinhos.add(p);
          }
          return listalugares_protecao_animais_marinhos;
        }catch(Exception e){
            return null;
        }
    }
}
