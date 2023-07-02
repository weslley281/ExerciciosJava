package streams;

import lambidas.Predicado;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fulano", 7.9);
        Aluno aluno2 = new Aluno("Deltrano", 5.8);
        Aluno aluno3 = new Aluno("Cicrano", 9.8);
        Aluno aluno4 = new Aluno("Heltrano", 6.5);
        Aluno aluno5 = new Aluno("Maltrano", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(a -> "Parabens " + a.nome)
                .forEach(System.out::println);
    }
}
