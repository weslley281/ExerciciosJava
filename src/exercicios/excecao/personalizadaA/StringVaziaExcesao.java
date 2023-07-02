package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaExcesao extends RuntimeException {
    private String nomeAtributo;
    public StringVaziaExcesao(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }
    public String getMessage(){
        return String.format("O atributo %s está vazia", nomeAtributo);
    }
}
