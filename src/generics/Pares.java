package generics;

import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

public class Pares<C extends Number, V> {
    private final SortedSet<Par<C, V>> itens = new TreeSet<>();
    public void adcionar(C chave, V valor){
        if(chave == null) return;

        Par<C, V> novoPar = new Par<>(chave, valor);

        if(itens.contains(novoPar)){
            itens.remove(novoPar);
        }

        itens.add(novoPar);
    }

    public V getValor(C chave){
        if(chave == null) return null;
        Optional<Par<C, V>> parOptional = itens.stream().filter(p -> chave.equals(p.getChave())).findFirst();

        return parOptional.isPresent() ? parOptional.get().getValor() : null;
    }
}
