package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Fulano");
        usuarios.put(2, "Deltrano");
        usuarios.put(3, "Beltrano");
        usuarios.put(4, "Maltrano");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Fulano"));
        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(4));

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for (String usuario: usuarios.values()){
            System.out.println(usuario);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey() + " " + registro.getValue());
        }
    }
}
