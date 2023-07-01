package tentativas.heranca;

import java.util.ArrayList;
import java.util.List;

public class OSomDosAnimais {
    public static void main(String[] args) {
        List<Animal> listaAnimais = new ArrayList<>();

        Cachorro cachorro = new Cachorro("Betovem");
        cachorro.fazerBarulho();

        Animal gato = new Animal("Gato", "Miau");
        gato.fazerBarulho();

        listaAnimais.add(new Cachorro("Rex"));
        listaAnimais.add(new Animal("Gato", "Miau"));
        listaAnimais.add(new Animal("Vaca", "Muu"));

        for (Animal animal: listaAnimais){
            animal.fazerBarulho();
        }
    }
}
