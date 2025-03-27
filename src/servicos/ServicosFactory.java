/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author 182210014
 */
public class ServicosFactory {
    private static BibliotecaServicos bibliotecaServicos = new BibliotecaServicos();
    
    public static BibliotecaServicos getBibliotecaServicos(){
        return bibliotecaServicos;
    }
}
