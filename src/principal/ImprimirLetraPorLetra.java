/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author david
 */
public class ImprimirLetraPorLetra {
    public String nome = "David Domingos";
    
    
    public static void main(String[] args) {
        int i;
        ImprimirLetraPorLetra n = new ImprimirLetraPorLetra();
       
        for(i=0; i<n.nome.length(); i++){
            System.out.println(n.nome.charAt(i));
        }
        
    }
    
}
