public class CompraCreditoAVista extends Compra {

    private Cartao cartao;
    private int mesFatura;
    public CompraCreditoAVista(String idCompra, int data, float valor, Cartao cartao, int mesFatura) {
        super(idCompra, data, valor);
        this.cartao = cartao;
        this.mesFatura = mesFatura;                
    }
    public CompraCreditoAVista(String idCompra, int data, float valor) {
        super(idCompra, data, valor);
                      
    }
    
}