public class hw0 {
   public static int max(int[] m) {
    int temp = 0;
      for (int i = 0; i+1 < m.length; i = i + 1){
         if (m[i]<temp){
         }else {
          temp = m[i];
         }
         
      }
       return temp;
   }
   
   public static void main(String[] args) {
      int[] numbers = new int[]{29, 2, 15, 2, 22, 10, 6}; 
      int result = max(numbers);
      System.out.println(result);

   }
}