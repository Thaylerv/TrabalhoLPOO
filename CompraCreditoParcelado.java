public class CompraCreditoParcelado extends Compra {
    // Atributos
    String idCartao;
    int mesFatura;
    int nVezes;

    // Construtor
    CompraCreditoParcelado(String idCompra, int data, float valor, String idCartao, int mesFatura, int nVezes) {
        super(idCompra, data, valor);
        this.idCartao = idCartao;
        this.mesFatura = mesFatura;
        this.nVezes = nVezes;
    }
    // Métodos

    // Métodos especiais
    public String toString() {
        return "CompraCreditoParcelado [idCartao=" + idCartao + ", mesFatura=" + mesFatura + ", nVezes=" + nVezes + "]";
    }

}