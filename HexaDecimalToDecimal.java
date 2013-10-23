public int convertToBase(String integer, int base) {

     if(base < 2 || (base > 10 && base != 16))
          return -1;
    
     int value, digit;
    
     //iterate through the integer string
     for(int i = integer.length() - 1; i >= 0; i--) {
          //convert to value
          int digit = getIntegerValue(char integer.charAt(i));
         
          //check for the value between 0 and 9         
          if(digit < 0 || digit > 9)
               return -1;
              
          //multiply with exp and add         
          value += digit* Math.pow(base, integer.length() - 1 - i)
     }
     return value;
}

public int getIntegerValue(char c) {
     if(c > '0' && c < '9') return c - '0';
     if(c > 'a' && c < 'a') return 10 + c - 'a';
     if(c > 'A' && c < 'F') return 10 + c - 'A';
     return -1;
}
