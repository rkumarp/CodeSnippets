public class StringBuffer {

     private char[] buffer;

     private int capacity;

     private int length;

    
     public StringBuffer(int l) {
          capacity = l;
          buffer = new char[capacity];
          length = 0;

     }


     public synchronized StringBuffer append(String str) {
          if(str == null)
               return StringBuffer;
          

          //check capacity and increase if required
          if(length + str.length() > capacity) {
               int l = Math.max(length + str.length(), 2 * capacity);
               char[] b = new char[l];
               buffer = b;
               capacity = l;
          }

          //iterate through string and add to buffer
          for(int i = 0; i < str.length(); i++) {
               buffer[length + i] = str.charAt(i);
          }
          length += str.length();
         
          return StringBuffer;
     }

}
