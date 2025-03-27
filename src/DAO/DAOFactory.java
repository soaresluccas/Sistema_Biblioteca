/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 182210014
 */
public class DAOFactory {
    private static BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
    
    public static BibliotecaDAO getBibliotecaDAO(){
        return bibliotecaDAO;
    }
    
}
