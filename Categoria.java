package crude;

public class Categoria {
    
    private int codigo;
    private String nome;

    public Categoria(int codigo, String nome){

        this.codigo = codigo;
        this.nome = nome;

    }

    public int getCodigo(){
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome;
    }
}
