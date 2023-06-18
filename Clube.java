public class Clube {
    private String nome;
    private int pontuacao;
    private int jogos;
    private int vitorias;
    private int derrotas;
    private int empate;
    private int golsPro;
    private int golsContra;
    private int saldoDeGols;
    private double aproveitamento;

    public Clube(String nomeClube){
        if (!nomeClube.trim().isEmpty()) {
            nome = nomeClube;
        } else {
            nome = "Nome não definido.";
        }
    }

    public String getNome(){
        return nome;
    }

    public int getJogos(){
        return jogos;
    }

    public int getVitorias(){
        return vitorias;
    }

    public int getDerrotas(){
        return derrotas;
    }

    public int getEmpate(){
        return empate;
    }

    public int getGolsPro(){
        return golsPro;
    }

    public int getGolsContra(){
        return golsContra;
    }

    public void setNome(String novoNome){
        if (!novoNome.trim().isEmpty()) {
            nome = novoNome;
        }
    }

    public void setVitorias(int quantVitorias){
        if (quantVitorias >= 0 && quantVitorias <= this.jogos - this.derrotas) vitorias = quantVitorias;
    }
    
    public void setDerrotas(int quantDerrotas){
        if (quantDerrotas >= 0 && quantDerrotas <= this.jogos - this.vitorias ) derrotas = quantDerrotas;
    }

    public void setEmpates(int quantEmpates){
        if (quantEmpates >= 0 && quantEmpates <= this.jogos - this.vitorias - this.derrotas) empate = quantEmpates;
    }

    public void setGolsPro(int quantGolsPro){
        if (quantGolsPro >= 0) golsPro = quantGolsPro;
    }

    public void setGolsContra(int quantGolsContra){
        if (quantGolsContra >= 0) golsContra = quantGolsContra;
    }

    public int pontuacao(){
        pontuacao = (vitorias * 3) + (empate * 1);
        return pontuacao;
    }

    public int saldoDeGols(){
        saldoDeGols = golsPro - golsContra;
        return saldoDeGols;
    }

    public double aproveitamento(){
        int pontuacaoMaxima = jogos * 3; 
        aproveitamento = (double) (pontuacao / pontuacaoMaxima) * 100;
        return aproveitamento;
    }

    public int jogos(int quantJogos){
        jogos = quantJogos - vitorias - derrotas - empate;
        return jogos;
    }
}
