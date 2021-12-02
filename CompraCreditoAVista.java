public class CompraCreditoAVista extends CompraCredito {

    CompraCreditoAVista(String idCompra, int data, float valor, Cartao cartao, int mesFatura) {
        super(idCompra, data, valor, cartao, mesFatura);
        
    }

    CompraCreditoAVista(String idCompra, int data, float valor) {
        super(idCompra, data, valor);
        
    }

    

    @Override
    public String toString() {
        return "Compra [data=" + data + ", idCompra=" + idCompra + ", valor=" + valor + "]";
    }

    @Override
    public float getValor() {
            return valor;
    }
    



}