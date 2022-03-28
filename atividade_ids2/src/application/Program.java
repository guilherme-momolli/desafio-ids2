package application;

public class Program {
    public static void main(String[] args){

        for (int i = 1; i <= 10000; i++){
            imprimirMesmaQuantidadeDivisores(i);
        }

    }

    private static void imprimirMesmaQuantidadeDivisores(int i) {
        Integer quantidade1 = retornarQuantidadeDivisores(i);
        int subsquente = i + 1;
        Integer quantidade2 = retornarQuantidadeDivisores(subsquente);

        if (quantidade1 == quantidade2){
            System.out.println(i + " e " + subsquente + " tem o mesmo numero de divisores");

        }
    }

    private static Integer retornarQuantidadeDivisores(int numero) {
        int quantidadeDivisores = 0;
        for (int divisor = 1; divisor <= numero; divisor ++){
            if (numero % divisor == 0)
                 quantidadeDivisores++;
        }
        return quantidadeDivisores;
    }

}
