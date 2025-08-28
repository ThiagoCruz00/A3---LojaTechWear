/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techwear;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexao {
    
    private static Connection con;
    
    
    protected static Connection getConnection() throws SQLException{

        if(con==null || con.isClosed()){
            try{
            
                String url = "jdbc:mysql://localhost:3306/tech_wear_db";
                String usuario = "root";
                String senha = "1234";
                System.out.println(" URL  " + url);
                System.out.println(" usuario  " + usuario);
                System.out.println(" senha " + senha);

                con=DriverManager.getConnection(url,usuario,senha);

                return con;

            } catch(SQLException e){
                System.err.println("Erro ao executar o metodo de gerar conexao: \n"+e);
                return null;
            }
        }
        
        else
            return con;
    }
}
