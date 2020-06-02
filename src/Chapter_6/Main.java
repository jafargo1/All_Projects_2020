import javax.swing.JOptionPane;

public class Main {
   public static <T extends Comparable<T>> int search(T arr[], T x) {
       for (int i=0; i<arr.length; i++) {
           if (arr[i].compareTo(x) == 0) {
               return i; }
       }
       return -1;
   }

   public static void main(String[] args) {
       Integer arr[] = {2, 4, 6, 8};
       String input = JOptionPane.showInputDialog(null, "Enter the number of elements os array");
       int size = Integer.parseInt(input);
       for(int i=0;i<size;i++){
           input = JOptionPane.showInputDialog(null, "Enter element number "+(i+1));
           int temp = Integer.parseInt(input);
           arr[i] = temp;
       }
      
       input = JOptionPane.showInputDialog(null, "Enter element need to be search");
       int search = Integer.parseInt(input);
       int res = search(arr, search);
       JOptionPane.showMessageDialog(null, "Search index is : "+res);
   }
}

