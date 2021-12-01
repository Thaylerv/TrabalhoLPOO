

public class GerenciadorFinanceiro {
    public static void main(String[] args) {
        // criando objetos relacionados ao cartão com sobrecarga de construtor
        
        Cartao nubank = new Cartao("NuBank", 1000, 10);
        Cartao interbank = new Cartao("InterBank");

        // criando objetos relacionado as compras
        CompraDebito c1 = new CompraDebito("padaria", 27102021, 25, nubank);
        CompraDebito c2 = new CompraDebito("academia", 5102021, 250, interbank);

        CompraCreditoAVista c3 = new CompraCreditoAVista("mercado", 27112021, 100f, nubank, 12);
        CompraCreditoAVista c4 = new CompraCreditoAVista("bar", 10112021, 30f, nubank, 12);

        CompraCreditoParcelado c5 = new CompraCreditoParcelado("shopping estacionamento", 13112021, 8, nubank, 12, 8);
        CompraCreditoParcelado c6 = new CompraCreditoParcelado("shopping compra", 13112021, 150, nubank, 12, 5);

        CompraCreditoAVista c7 = new CompraCreditoAVista("aluguel", 12112021, 1000);
        CompraCreditoAVista c8 = new CompraCreditoAVista("peça para bike", 12112021, 45.5f);

        


        // print no terminal com toString herdada da superclasse
        System.out.println("Todas as compras");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c5.toString());
        System.out.println(c6.toString());
        System.out.println(c7.toString());
        System.out.println(c8.toString());

        // instanciando mes
        Mes nov2021 = new Mes(11, 2021, 10);
        System.out.println(nov2021.toString());

    }
}