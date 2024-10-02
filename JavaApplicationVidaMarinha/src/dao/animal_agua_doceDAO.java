
package dao;

import beans.animal_agua_doce;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class animal_agua_doceDAO {
    private final Conexao conexao;
    private final Connection conn;
    
    public animal_agua_doceDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(animal_agua_doce animal_agua_doce){
        String sql = "INSERT INTO animal_agua_doce (id, nome, habitat, peso, nome_cientifico) VALUES (?,?,?,?,?) ";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, animal_agua_doce.getId());
            stmt.setString(2, animal_agua_doce.getNome());
            stmt.setString(3,animal_agua_doce.getHabitat());
            stmt.setString(4,animal_agua_doce.getPeso());
            stmt.setString(5,animal_agua_doce.getNome_cientifico());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao inserir animal_agua_doce: "+ e.getMessage());
        }
    }
    
    public void alterar(animal_agua_doce animal_agua_doce){
        String sql = "UPDATE animal_agua_doce SET nome=?, habitat=?, peso=?, nome_cientifico=? WHERE id=?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, animal_agua_doce.getId());
            stmt.setString(2, animal_agua_doce.getNome());
            stmt.setString(3,animal_agua_doce.getHabitat());
            stmt.setString(4,animal_agua_doce.getPeso());
            stmt.setString(5,animal_agua_doce.getNome_cientifico());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao atualizar animal_agua_doce: "+ e.getMessage());
        }
    }
    
    public void excluir(int id){
        String sql = "DELETE FROM animal_agua_doce WHERE id = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao excluir animal_agua_doce: "+ e.getMessage());
        }
    }
    
    public animal_agua_doce getanimal_agua_doce(int id){
        String sql = "SELECT * FROM animal_agua_doce WHERE id =?";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            animal_agua_doce animal_agua_doce = new animal_agua_doce();
            rs.next();
            animal_agua_doce.setId(rs.getInt("id"));
            animal_agua_doce.setNome(rs.getString("nome"));
            animal_agua_doce.setHabitat(rs.getString("habitat"));
            animal_agua_doce.setPeso(rs.getString("peso"));
            animal_agua_doce.setNome_cientifico(rs.getString("nome cientifico"));
            return animal_agua_doce;
        
        }catch(Exception e){
            System.out.println("Erro ao atualizar animal_agua_doce: "+ e.getMessage());
            return null;
        }
        
    }
    public List<animal_agua_doce> getanimal_agua_doce(){
        String sql = "SELECT * FROM animal_agua_doce";
        try{
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          List<animal_agua_doce> listaanimal_agua_doce = new ArrayList<>();
          while(rs.next()){
              animal_agua_doce p = new animal_agua_doce();
              p.setId(rs.getInt("id"));
              p.setNome(rs.getString("nome"));
              p.setHabitat(rs.getString("habitat"));
              p.setPeso(rs.getString("peso"));
              p.setNome_cientifico(rs.getString("nome cientifico"));
              listaanimal_agua_doce.add(p);
          }
          return listaanimal_agua_doce;
        }catch(Exception e){
            return null;
        }
    }
}
