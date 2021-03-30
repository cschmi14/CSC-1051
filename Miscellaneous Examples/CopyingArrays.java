public class CopyingArrays {
    public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arraycopy = new int[10];
    for (int i = 0; i < array.length; i++) {
        arraycopy[i] = array[i];
    }
    array[9] = -7;
    for (int i = 0; i < array.length; i++) {   
        System.out.print(array[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < arraycopy.length; i++) {   
        System.out.print(arraycopy[i] + " ");
    }
    }
}