package oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.x = 10;
        jogador1.y = 10;

        jogador1.andar(Direcao.Norte);
        jogador1.andar(Direcao.Norte);
        jogador1.andar(Direcao.Norte);
        System.out.println(jogador1.y);

        jogador1.andar(Direcao.Leste);
        System.out.println(jogador1.y);

        jogador1.andar(Direcao.Oeste);
        jogador1.andar(Direcao.Oeste);

        System.out.println(jogador1.y);
        jogador1.andar(Direcao.Sul);

        System.out.println(jogador1.y);
    }
}
