public class CompraCredito extends Compra {

    // Atributos
    private String idCartao;
    private int mesFatura;

    // Construtor
    CompraCredito(String idCompra, int data, float valor, String idCartao, int mesFatura) {
        super(idCompra, data, valor);

        this.idCartao = idCartao;
        this.mesFatura = mesFatura;
    }

    // Métodos

    // Métodos especiais
    public String toString() {
        return "CompraCredito [idCartao=" + idCartao + ", mesFatura=" + mesFatura + "]";
    }

    public String getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(String idCartao) {
        this.idCartao = idCartao;
    }

    public int getMesFatura() {
        return mesFatura;
    }

    public void setMesFatura(int mesFatura) {
        this.mesFatura = mesFatura;
    }

}