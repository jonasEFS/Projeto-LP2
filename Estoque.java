package crude;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos;
    
    public Estoque(){
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto){
        produtos.put(produto.getCodigo(),produto);
    }

    public Produto consultarProduto(String codigo){
        return produtos.get(codigo);
    }

    public void alterarProduto(String codigo, Produto novoProduto){
        produtos.put(codigo, novoProduto);
    }

    public void excluirProduto(String codigo){
        produtos.remove(codigo);
    }

    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
        }
        else{
            for(Produto produto : produtos.values()){
                System.out.println(produto);
            }
        }
    }
}
