public class Funciones {
    public double funcionRecursiva(double x, double y){
        int i;
        int contador = 0;
        double resultado = 0;
        do{
            for(i = 0; i < y; i++){
                 resultado = Math.pow(x, y);
                contador++;
            }

        }while(contador != y);
        return resultado;
    }
}
