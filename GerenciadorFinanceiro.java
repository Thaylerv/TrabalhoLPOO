public class GerenciadorFinanceiro {
    public static void main(String[] args) {

        Cartao nuBank = new Cartao("Nubank", 1000, 10);

        // instanciando objetos
        CompraDebito c1 = new CompraDebito("padaria", 27102021, 25, nuBank);
        CompraCredito c2 = new CompraCredito("mercado", 27112021, 100, "Nubank", 12);
        CompraCreditoParcelado c3 = new CompraCreditoParcelado("shopping", 27112021, 8, "Nubank", 12, 8);

        // print no terminal com toString herdada da superclasse
        System.out.println();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println();

        // c3.getValor();

        Mes nov2021 = new Mes(11, 2021, 10, c1, c2);
        System.out.println(nov2021.toString());

    }
}