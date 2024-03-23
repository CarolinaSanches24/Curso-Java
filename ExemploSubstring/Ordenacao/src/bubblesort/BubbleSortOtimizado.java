package bubblesort;

//O Bubble Sort compara pares de elementos adjacentes na lista.
//Se o elemento à esquerda for maior que o elemento à direita, eles são trocados.
// Esse processo é repetido até que todos os elementos estejam em ordem.
public class BubbleSortOtimizado {
    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array antes do Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr); // Ordenando os elementos do array usando Bubble Sort

        System.out.println("Array após o Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean troca;

        do {
            troca = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Troca os elementos
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    troca = true;
                }
            }
        } while (troca);
    }
}