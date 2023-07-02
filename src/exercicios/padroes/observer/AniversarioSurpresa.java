package exercicios.padroes.observer;

public class AniversarioSurpresa {
    public static void main(String[] args) {
        Namorada namorada1 = new Namorada();
        Namorada namorada2 = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.registrarObservador(namorada2);
        porteiro.monitorar();
    }
}
