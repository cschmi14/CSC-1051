public class ArraysExs {

    public static void main(String[] args) {
    
    
        int[] mylist = new int[10];
        mylist[3] = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(mylist[i] + " ");
        }
     
     
        System.out.println(findIndex(mylist, 2));
    
    }

    
    public static int findIndex(int[] array, int x) {
        
        for (int i = 0; i < array.length; i++) {
        
            if (array[i] == x)
                return i;
        
        }    
        return -1; 
    }
    
    
}