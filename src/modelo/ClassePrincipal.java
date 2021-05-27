package modelo;

import java.util.ArrayList;
import java.util.List;



public class ClassePrincipal {

  
    public static void main(String[] args) {
        // a ------------------------------------------------------------------
        List<Produto> lista_produtos = new ArrayList<>();
        
        Produto produto1 = new Produto("Laptop", "00la23", 100, 50.00);
        Produto produto2 = new Produto("Phone", "12ve89", 200, 20.00);
        Produto produto3 = new Produto("Game", "34nu00", 50, 250.00);
        Produto produto4 = new Produto("Book", "66pr22", 130, 150.00);
        Produto produto5 = new Produto("Note", "33da10", 40, 500.00);
        
        lista_produtos.add(produto1);
        lista_produtos.add(produto2);
        lista_produtos.add(produto3);
        lista_produtos.add(produto4);
        lista_produtos.add(produto5);

        System.out.println("Designacao......Codigo.......Quantidade........Preco");
        for(int i = 0; i < lista_produtos.size(); i+=2){
            System.out.println(lista_produtos.get(i).getDesignacao() + "\t\t" +
                               lista_produtos.get(i).getCodigo() + "\t\t" +
                               lista_produtos.get(i).getQuantidade() + "\t\t" + 
                               lista_produtos.get(i).getPreco()
            );
        }
        
        
        for(Produto p : lista_produtos){
            if(p.getDesignacao().equalsIgnoreCase("Toyota")){
                System.out.println("Existe");
            }
        }

    }
    
}
