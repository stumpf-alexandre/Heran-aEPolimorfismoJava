public class TestaHeranca {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Branco");
        carro.setModelo("Uno");
        carro.setVelocidadeAtual(0);
        carro.setVelocidadeMaxima(270);
        carro.setConversivel(false);
        carro.ligar();
        carro.acelera(120);

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Preta");
        caminhonete.setModelo("Strada");
        caminhonete.setVelocidadeAtual(0);
        caminhonete.setVelocidadeMaxima(290);
        caminhonete.setCarga(590);
        caminhonete.ligar();
        caminhonete.acelera(100);

        Jipe jipe = new Jipe();
        jipe.setCor("Azul");
        jipe.setModelo("Renegueiter");
        jipe.setVelocidadeAtual(0);
        jipe.setVelocidadeMaxima(190);
        jipe.setTracionado(false);
        jipe.ligar();
        jipe.acelera(100);

        System.out.println(caminhonete.getVelocidadeAtual());
        System.out.println(jipe.getVelocidadeAtual());
    }
}
