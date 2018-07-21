public class TestaPolimorfismo {
    public static void main(String[] args) {
        Automovel veiculo = new Automovel();
        Automovel[] frota = new Automovel[3];
        Carro carro = new Carro();
        carro.setCor("Branco");
        carro.setModelo("Uno");
        carro.setVelocidadeAtual(0);
        carro.setVelocidadeMaxima(270);
        carro.setConversivel(false);

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Preta");
        caminhonete.setModelo("Strada");
        caminhonete.setVelocidadeAtual(0);
        caminhonete.setVelocidadeMaxima(290);
        caminhonete.setCarga(590);

        Jipe jipe = new Jipe();
        jipe.setCor("Azul");
        jipe.setModelo("Renegueiter");
        jipe.setVelocidadeAtual(0);
        jipe.setVelocidadeMaxima(190);
        jipe.setTracionado(true);

        frota[0] = carro;
        frota[1] = caminhonete;
        frota[2] = jipe;

        for (Automovel automovel : frota){
            automovel.ligar();
            automovel.acelera(100);
            System.out.println("Automovel: " + automovel.getModelo() + " da cor " + automovel.getCor());
            System.out.println("Velocidade Atual: " + automovel.velocidadeAtual + "\n");
        }
        System.out.println("Quantidade de automoveis na frota: " + veiculo.getQtdAutomovel());
    }
}
