package homework;

public class SelectionSort {

   public static void main(String[] args) {
      int[] array = {10, 6, 4, 8, 9, 2, 3, 7, 5, 1};
      int temp;
      for(int i = 0 ; i < array.length-1; i++)
      {
         int min = 99999; // int min = array[i]·Î ÇØµµ µÊ
         int index = i;
         for(int j = i+1 ; j < array.length ; j++)
         {
            if(array[j] < min)
            {
               min = array[j];
               index = j;
            }            
         }
         temp = array[i];
         array[i] = array[index];
         array[index] = temp;
         
      }
      
      for(int i = 0 ; i < array.length; i++)
      {
         System.out.print(array[i] + " ");
      }
   }
   

}