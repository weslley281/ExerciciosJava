package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloExcesao extends Exception {
    private String nomeAtributo;
    public NumeroForaIntervaloExcesao(String nomeAtributo){
        this.nomeAtributo = nomeAtributo;
    }
    public String getMessage(){
        return String.format("O atributo %s está fora do intervalo", nomeAtributo);
    }
}
