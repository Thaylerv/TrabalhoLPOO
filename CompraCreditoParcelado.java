public class CompraCreditoParcelado extends CompraCredito {
    // Atributos
    private int nVezes;

    // Construtor
    CompraCreditoParcelado(String idCompra, int data, float valor, Cartao cartao, int mesFatura, int nVezes) {
        super(idCompra, data, valor, cartao, mesFatura);
        this.nVezes = nVezes;
    }
    // Métodos

    // Métodos especiais
    public String toString() {
        return super.toString() + "CompraCreditoParcelado [nVezes=" + nVezes + "]";
    }

    @Override
    public float getValor() {
        return valor;
    }

}