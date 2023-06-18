public class Clubes{
    private String[] nomeClubes;
    private int quantidadeClubes;
    private int contadorDeClubes;

    public Clubes(String[] nomeClubes, int quantidade){
        if (quantidade <= 0) quantidade = 20;
        else quantidadeClubes = quantidade;
        nomeClubes = new String[quantidade];
        contadorDeClubes = 0;
    }

    public String[] getNomeClubes(){
        return nomeClubes;
    }

    public boolean insere(String nomeClube){
        if (nomeClube.trim().isEmpty()){
            return false;
        } else if (contadorDeClubes > nomeClubes.length){
            return false;
        }
        nomeClubes[contadorDeClubes] = nomeClube;
        contadorDeClubes++;
        return true;
    }

    public String busca(int numero){
        for (int i = 0; i < contadorDeClubes; i++){
            if ((i + 1) == numero) return nomeClubes[i+1];
        }
        return null;
    }
    
}