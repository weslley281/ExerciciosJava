package oo.heranca;

public class Jogador {
    int x;
    int y;
    boolean andar(Direcao direcao){
        switch (direcao){
            case Norte:
                y--;
                break;
            case Sul:
                y++;
                break;
            case Leste:
                x++;
                break;
            case Oeste:
                x--;
                break;
        }

        return true;
    }
}
