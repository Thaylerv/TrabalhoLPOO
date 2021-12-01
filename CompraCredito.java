public abstract class CompraCredito extends Compra {

    // Atributos
    private Cartao cartao;
    private int mesFatura;

    // Construtor
    
    CompraCredito(String idCompra, int data, float valor, Cartao cartao, int mesFatura) {
        super(idCompra, data, valor);        
        this.cartao = cartao;        
        this.mesFatura = mesFatura;
    }

    // Métodos

    // Métodos especiais
    public String toString() {
        return super.toString() + "CompraCredito [idCartao=" + cartao.getBanco() + ", mesFatura=" + mesFatura + "]";
    }

    public int getMesFatura() {
        return mesFatura;
    }

    public void setMesFatura(int mesFatura) {
        this.mesFatura = mesFatura;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

}