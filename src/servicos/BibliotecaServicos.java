/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import DAO.BibliotecaDAO;
import DAO.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.BibliotecaVO;

/**
 *
 * @author 182210014
 */
public class BibliotecaServicos {
    public void cadastrar(BibliotecaVO bVO) throws SQLException{
        BibliotecaDAO bDAO = DAOFactory.getBibliotecaDAO();
        bDAO.cadastrar(bVO);
    }
    public ArrayList<BibliotecaVO> buscarLivro() throws SQLException{
        BibliotecaDAO bDAO = DAOFactory.getBibliotecaDAO();
        
        return bDAO.buscarLivro();
    }
}
