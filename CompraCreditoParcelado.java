public class CompraCreditoParcelado extends Compra {
    // Atributos
    Cartao cartao;
    int mesFatura;
    int nVezes;

    // Construtor
    CompraCreditoParcelado(String idCompra, int data, float valor, Cartao cartao, int mesFatura, int nVezes) {
        super(idCompra, data, valor);
        this.cartao = cartao;
        this.mesFatura = mesFatura;
        this.nVezes = nVezes;
    }
    // Métodos

    // Métodos especiais
    public String toString() {
        return super.toString() + "CompraCreditoParcelado [idCartao=" + cartao + ", mesFatura=" + mesFatura + ", nVezes=" + nVezes + "]";
    }

}