
package dao;

import beans.animal_agua_salgada;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class animal_agua_salgadaDAO {
    private final Conexao conexao;
    private final Connection conn;
    
    public animal_agua_salgadaDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(animal_agua_salgada animal_agua_salgada){
        String sql = "INSERT INTO animal_agua_salgada (id, nome, habitat, peso, nome_cientifico) VALUES (?,?,?,?,?) ";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, animal_agua_salgada.getId());
            stmt.setString(2, animal_agua_salgada.getNome());
            stmt.setString(3,animal_agua_salgada.getHabitat());
            stmt.setString(4,animal_agua_salgada.getPeso());
            stmt.setString(5,animal_agua_salgada.getNome_cientifico());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao inserir animal_agua_salgada: "+ e.getMessage());
        }
    }
    
    public void alterar(animal_agua_salgada animal_agua_salgada){
        String sql = "UPDATE animal_agua_salgada SET nome=?, habitat=?, peso=?, nome_cientifico=? WHERE id=?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, animal_agua_salgada.getId());
            stmt.setString(2, animal_agua_salgada.getNome());
            stmt.setString(3,animal_agua_salgada.getHabitat());
            stmt.setString(4,animal_agua_salgada.getPeso());
            stmt.setString(5,animal_agua_salgada.getNome_cientifico());
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao atualizar animal_agua_salgada: "+ e.getMessage());
        }
    }
    
    public void excluir(int id){
        String sql = "DELETE FROM animal_agua_salgada WHERE id = ?";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao excluir animal_agua_salgada: "+ e.getMessage());
        }
    }
    
    public animal_agua_salgada getanimal_agua_salgada(int id){
        String sql = "SELECT * FROM animal_agua_salgada WHERE id =?";
        
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            animal_agua_salgada animal_agua_salgada = new animal_agua_salgada();
            rs.next();
            animal_agua_salgada.setId(rs.getInt("id"));
            animal_agua_salgada.setNome(rs.getString("nome"));
            animal_agua_salgada.setHabitat(rs.getString("habitat"));
            animal_agua_salgada.setPeso(rs.getString("peso"));
            animal_agua_salgada.setNome_cientifico(rs.getString("nome cientifico"));
            return animal_agua_salgada;
        
        }catch(Exception e){
            System.out.println("Erro ao atualizar animal_agua_salgada: "+ e.getMessage());
            return null;
        }
        
    }
    public List<animal_agua_salgada> getanimal_agua_salgada(){
        String sql = "SELECT * FROM animal_agua_salgada";
        try{
          PreparedStatement stmt = this.conn.prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          List<animal_agua_salgada> listaanimal_agua_salgada = new ArrayList<>();
          while(rs.next()){
              animal_agua_salgada p = new animal_agua_salgada();
              p.setId(rs.getInt("id"));
              p.setNome(rs.getString("nome"));
              p.setHabitat(rs.getString("habitat"));
              p.setPeso(rs.getString("peso"));
              p.setNome_cientifico(rs.getString("nome cientifico"));
              listaanimal_agua_salgada.add(p);
          }
          return listaanimal_agua_salgada;
        }catch(Exception e){
            return null;
        }
    }
}
