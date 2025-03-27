/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.BibliotecaVO;
import persistencia.ConexaoBanco;

/**
 *
 * @author 182210014
 */
public class BibliotecaDAO {
    public void cadastrar(BibliotecaVO bVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            
            sql = "insert into livro values(null, '"+bVO.getExemplar()+"', '"+bVO.getAutor()+"', "+bVO.getEdicao()+", "+bVO.getAno()+", '"+bVO.getDisponibilidade()+"') ";
            
            stat.execute(sql); 
            
        }catch(SQLException e){
            throw new SQLException("Erro ao inserir Livro!");
        }finally{
            con.close();
            stat.close();
        }
    } 
    
    public ArrayList<BibliotecaVO> buscarLivro() throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        
        try{
          String sql;
          sql = "select * from livro";
          ResultSet rs = stat.executeQuery(sql);
          ArrayList<BibliotecaVO> bi = new ArrayList<>();
          while(rs.next()){
              BibliotecaVO b = new BibliotecaVO();
              b.setIdLivro(rs.getInt("idLivro")); 
              b.setExemplar(rs.getString("exemplar")); 
              b.setAutor(rs.getString("autor")); 
              b.setEdicao(rs.getInt("edicao")); 
              b.setAno(rs.getInt("ano")); 
              b.setDisponibilidade(rs.getString("disponibilidade")); 
              
              bi.add(b);
          }
          return bi;
        }catch(SQLException e){
            throw new SQLException("Erro ao buscar livro!" + e.getMessage());
        }finally{
            con.close();
            stat.close();
        }
    }

    
    
}
