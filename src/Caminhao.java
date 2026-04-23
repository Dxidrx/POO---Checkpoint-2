public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}