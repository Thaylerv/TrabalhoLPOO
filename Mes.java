public class Mes {
    @Override
    public String toString() {
        return "Mes [ano=" + ano + ", fechouPositivo=" + fechouPositivo + ", idxMes=" + idxMes + ", nome=" + nome
                + ", saldoFinal=" + saldoFinal + ", saldoInicial=" + saldoInicial + ", totalEntrada=" + totalEntrada
                + ", totalSaida=" + totalSaida + "]";
    }

    // atributos
    private int idxMes; // [1 a 12]
    private int ano;
    private String nome; // [janeiro a dezembro]
    private float saldoInicial;
    private float totalEntrada;
    private float totalSaida; //
    private float saldoFinal;
    private boolean fechouPositivo;

    // atributos abstratos

    public Mes(int idxMes, int ano, float saldoInicial) {
        this.idxMes = idxMes;
        this.ano = ano;
        this.saldoInicial = saldoInicial;        
        this.setNome();
        this.setTotalSaida();
    }

    // metodos da classe

    // metodos especiais
    public int getIdxMes() {
        return idxMes;
    }

    public void setIdxMes(int idxMes) {
        this.idxMes = idxMes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        String[] meses = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" }; // indice[0-11]

        this.nome = meses[this.idxMes - 1];
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public float getTotalEntrada() {
        return totalEntrada;
    }

    public void setTotalEntrada(float totalEntrada) {
        this.totalEntrada = totalEntrada;
    }

    public float getTotalSaida() {
        return totalSaida;
    }

    public void setTotalSaida() {
        // totalSaida = compraDebito + compraCredito
        float soma = 0;
        for (int i = 0; i < Compra.listaCompras.size(); i++) {
            soma = soma + Compra.listaCompras.get(i).getValor();
            
        }
        this.totalSaida = soma;
    }

    public float getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(float saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public boolean isFechouPositivo() {
        return fechouPositivo;
    }

    public void setFechouPositivo(boolean fechouPositivo) {
        this.fechouPositivo = fechouPositivo;
    }

}