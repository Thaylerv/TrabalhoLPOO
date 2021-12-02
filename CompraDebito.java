public class CompraDebito extends Compra {

    // Atributos
    private Cartao cartao;;

    // Construtor
    CompraDebito(String idCompra, int data, float valor, Cartao cartao) {
        super(idCompra, data, valor);

        this.cartao = cartao; // substituindo this.setIdCartao(idCartao);
    }

    // métodos

    // métodos especiais
    public String toString() {
        return super.toString() + "CompraDebito [cartao=" + cartao.getBanco() + "]";
    }

}