package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaExcesao extends Exception {
    private String nomeAtributo;
    public StringVaziaExcesao(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }
    public String getMessage(){
        return String.format("O atributo %s está vazia", nomeAtributo);
    }
}
