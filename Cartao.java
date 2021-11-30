public class Cartao {
    private String banco;
    private float limite;
    private int diaFechaFatua;
    private boolean monitorado;

    Cartao(String banco, float limite, int diaFechaFatua) {
        this.banco = banco;
        this.limite = limite;
        this.diaFechaFatua = diaFechaFatua;
        this.monitorado = true;
    }

    public boolean isMonitorado() {
        return monitorado;
    }

    public void setMonitorado(boolean monitorado) {
        this.monitorado = monitorado;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public int getDiaFechaFatua() {
        return diaFechaFatua;
    }

    public void setDiaFechaFatua(int diaFechaFatua) {
        this.diaFechaFatua = diaFechaFatua;
    }

}
