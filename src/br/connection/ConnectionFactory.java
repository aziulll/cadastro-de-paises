package br.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ConnectionFactory
 */
public class ConnectionFactory {

    

    //Nome do usuário do mysql
    private static final String USERNAME = "root";
    //Senha do Banco 
    private static final String PASSWORD = "";
    //Caminho do database, porta e nome do bd
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/continente";


   /*
    * conexão com o banco de dados
    */

    public static Connection createConectionToMySQL() throws Exception{
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
       return connection;
    }

    public static void main(String[] args) throws Exception{
     //Recuperando conexão com banco de dados

     Connection con = createConectionToMySQL();

     //Testanto se é nulo

     if(con!= null){
        System.out.print("Conexão obtida com sucesso");
        con.close();
     }
    }
}