package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) throws Exception {
        try {
            geraErro1();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim...")
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ;
    }

    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro");
    }
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro");
    }
}
