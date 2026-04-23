public class Main {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("ABC1234", 500.0, 6);

        Pacote pacote = new Pacote("BR999", 10.5);

        Rota rota = new Rota(pacote, caminhao);

        rota.iniciarEntrega();
    }
}
