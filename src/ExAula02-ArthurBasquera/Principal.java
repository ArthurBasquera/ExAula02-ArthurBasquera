/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author ArthurBasquera
 */
public class Principal {
    public static void main(String[] args){
        Mesa mesa = new Mesa();
        
        mesa.setCor("Preto");
        mesa.setAltura(100);
        mesa.setComprimento(5);
        mesa.setMaterial("Marmore");
        mesa.setQtdLugares(8);
        
       System.out.println("------Mesa--------");
       System.out.println("Altura: "+mesa.getAltura()+" cm");
       System.out.println("Comprimento: "+mesa.getComprimento()+" m");
       System.out.println("Material: "+mesa.getMaterial());
       System.out.println("Cor: "+ mesa.getCor());
       System.out.println("Quantidade de lugares: "+mesa.getQtdLugares());
               
       Sofa sofa = new Sofa();
       
       sofa.setComprimento(2);
       sofa.setCor("Amarelo");
       sofa.setEscConforto(4);
       sofa.setLargura(2);
       sofa.setMaterial("Estofado");
       
       System.out.println("----------Sofa-------");
       System.out.println("Comprimento : "+sofa.getComprimento()+" m");
       System.out.println("Largura: " +sofa.getLargura()+" m");
       System.out.println("Material: " + sofa.getMaterial());
       System.out.println("Cor: "+sofa.getCor());
       System.out.println("Escala de conforto: "+ sofa.getEscConforto()+" de 10");
       
       
      
        
        
    }
    
}
