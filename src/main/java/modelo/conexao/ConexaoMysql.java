/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafael
 */
public class ConexaoMysql {
    
    private final static String USUARIO = "root";
    private static final String SENHA = "33#Senha";
    private static final String URL = "jdbc:mysql://localhost:3306/?user=root";
    private static Connection connection;

    private ConexaoMysql() {}
    
    public static Connection obterConexao() throws SQLException {
       if(connection == null) {
          connection = DriverManager.getConnection(URL, USUARIO, SENHA);
       }
       
       return connection;
       
    }
    
    public static void fecharConexao() throws SQLException {
        if(connection == null) {
            connection.close();
        }
      
        
    }
   
    public static void main(String[] args) throws SQLException {
        System.out.print(obterConexao());
    }
   
}
