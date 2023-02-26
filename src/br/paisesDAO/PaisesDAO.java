package br.paisesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.connection.ConnectionFactory;
import br.paises.Paises;

public class PaisesDAO {
    /*
     * Criando meu CRUD
     */

     public void save(Paises paises) {
        String sql = "INSERT INTO paises (nome, capital, regiao, subregiao, area) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try{
            //criar uma conexão com o banco de dados
            conn = ConnectionFactory.createConectionToMySQL();
            //criamos uma Prepare Statemente para excutar uma query, uma busca
            pstm = conn.prepareStatement(sql);
            //adicionar os valores esperados pela query
            pstm.setString(1, paises.getNome());
            pstm.setString(2, paises.getCapital());
            pstm.setString(3, paises.getRegiao());
            pstm.setString(4, paises.getSubregiao());
            pstm.setInt(5, paises.getArea());

            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
              //Fechar as conexoes caso estejam abertas
              try {
                if(pstm!= null) {
                    pstm.close();
                }
                if(conn!= null){
                    conn.close();
                }        
             } catch(Exception e) {
               e.printStackTrace();
             }
        }
    }  
}
