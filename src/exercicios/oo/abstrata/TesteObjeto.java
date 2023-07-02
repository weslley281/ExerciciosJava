package oo.abstrata;

public class TesteObjeto {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro.mover());
        System.out.println(cachorro.respirar());
        System.out.println(cachorro.mamar());
    }
}
