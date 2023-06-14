package excecao;

public class Basico {
    public static void main(String[] args) {
        Aluno aluno1 = null;

        try {
            imprimir(aluno1);
        }catch (Exception excesao){
            System.out.println("Ocorreu um erro ao imprimir nome de usuario: " + excesao);
        }

        try {
            System.out.println(7/0);
        }catch (Exception excesao){
            System.out.println("Erro dividido por zero: " + excesao);
        }

        System.out.println("Fim");
    }

    public static void imprimir(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
