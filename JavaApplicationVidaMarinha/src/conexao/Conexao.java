package conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    
    public Connection getConexao(){
        try{
            //Estabeler conexão
            Connection conn = DriverManager.getConnection(
                      "jdbc:mysql://localhost:3306/vida_marinha", //linha de conexão
                      "root", //usuario do mysql
                      "" //senha
            );
            return conn; 
        }catch( Exception e){
        //erro na conexão
        System.out.println("Erro conexão: " + e.getMessage());
        return null;
        }
    }
    
}
