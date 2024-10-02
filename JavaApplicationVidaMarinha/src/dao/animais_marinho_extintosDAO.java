
package dao;

import beans.animais_marinho_extintos;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class animais_marinho_extintosDAO {
    private final Conexao conexao;
    private final Connection conn;
    
    public animais_marinho_extintosDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(animais_marinho_extintos animais_marinho_extintos){
        String sql = "INSERT INTO animais_marinho_extintos (id, nome, habitat, peso, nome_cientifico) VALUES (?,?,?,?,?) ";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, animais_marinho_extintos.getId());
            stmt.setString(2, animais_marinho_extintos.getNome());
            stmt.setString(3,animais_marinho_extintos.getHabitat());
            stmt.setString(4,animais_marinho_extintos.getPeso());
            stmt.setString(5,animais_marinho_extintos.getNome_cientifico());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao inserir animais_marinho_extintos: "+ e.getMessage());
        }
    }
    
    public void alterar(animais_marinho_extintos animais_marinho_extintos){
        String sql = "UPDATE animais_marinho_extintos SET nome=?, habitat=?, peso=?, nome_cientifico=? WHERE id=?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, animais_marinho_extintos.getId());
            stmt.setString(2, animais_marinho_extintos.getNome());
            stmt.setString(3,animais_marinho_extintos.getHabitat());
            stmt.setString(4,animais_marinho_extintos.getPeso());
            stmt.setString(5,animais_marinho_extintos.getNome_cientifico());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao atualizar animais_marinho_extintos: "+ e.getMessage());
        }
    }
    
    public void excluir(int id){
        String sql = "DELETE FROM animais_marinho_extintos WHERE id = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao excluir animais_marinho_extintos: "+ e.getMessage());
        }
    }
    
    public animais_marinho_extintos getanimais_marinho_extintos(int id){
        String sql = "SELECT * FROM animais_marinho_extintos WHERE id =?";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            animais_marinho_extintos animais_marinho_extintos = new animais_marinho_extintos();
            rs.next();
            animais_marinho_extintos.setId(rs.getInt("id"));
            animais_marinho_extintos.setNome(rs.getString("nome"));
            animais_marinho_extintos.setHabitat(rs.getString("habitat"));
            animais_marinho_extintos.setPeso(rs.getString("peso"));
            animais_marinho_extintos.setNome_cientifico(rs.getString("nome cientifico"));
            return animais_marinho_extintos;
        
        }catch(Exception e){
            System.out.println("Erro ao atualizar animais_marinho_extintos: "+ e.getMessage());
            return null;
        }
        
    }
    public List<animais_marinho_extintos> getanimais_marinho_extintos(){
        String sql = "SELECT * FROM animais_marinho_extintos";
        try{
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          List<animais_marinho_extintos> listaanimais_marinho_extintos = new ArrayList<>();
          while(rs.next()){
              animais_marinho_extintos p = new animais_marinho_extintos();
              p.setId(rs.getInt("id"));
              p.setNome(rs.getString("nome"));
              p.setHabitat(rs.getString("habitat"));
              p.setPeso(rs.getString("peso"));
              p.setNome_cientifico(rs.getString("nome cientifico"));
              listaanimais_marinho_extintos.add(p);
          }
          return listaanimais_marinho_extintos;
        }catch(Exception e){
            return null;
        }
    }
}
