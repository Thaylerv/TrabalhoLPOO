public class Compra {

    // atributos
    private String idCompra;
    private int data; // ddmmaaaa
    private float valor;

    public Compra(String idCompra, int data, float valor) {
        this.idCompra = idCompra;
        this.data = data;
        this.valor = valor;
    }

    // métodos

    // métodos especiais
    public String toString() {
        return "Compra [data=" + data + ", idCompra=" + idCompra + ", valor=" + valor + "]";
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}