package Matriz;

public class Main {

    public static void main(String[] args) {
        Matriz matriz = new Matriz(3, 6);

        int[][] matriz2 = {{2, 1}, {3, 4}};
        int[][] matriz3 = {{1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3, 3}};

        matriz.cargar(matriz2);

        matriz.cargar(matriz3);

        matriz.impDiagonal();

        matriz.impFirstFila();

        matriz.impUltFila();

        System.out.println("Suma de los elementos: " + matriz.sumaElementos());

        System.out.println("La media de los elementos es: " + matriz.promedio());


    }


}
