package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloExcesao extends RuntimeException {
    private String nomeAtributo;
    public NumeroForaIntervaloExcesao(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }
    public String getMessage(){
        return String.format("O atributo %s está fora do intervalo", nomeAtributo);
    }
}
