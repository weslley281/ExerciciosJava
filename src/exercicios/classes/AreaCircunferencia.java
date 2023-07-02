package classes;

public class AreaCircunferencia {
    double raio;
    double pi = Math.PI;
    AreaCircunferencia(double Raio){
        raio = Raio;
    }

    double area(){
        return Math.pow(raio, 2) * pi;
    }
}
