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

    public CompraCredito(String idCompra, int data, float valor) {
        super(idCompra, data, valor);
        
    }

    // Métodos especiais
    public String toString() {
        return super.toString() + "CompraCredito [cartao=" + cartao.getBanco() + ", mesFatura=" + mesFatura + "]";
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
    
    public abstract float getValor();

}