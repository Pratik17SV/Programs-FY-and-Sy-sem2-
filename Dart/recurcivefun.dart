
factorial(number) { 
   if (number <= 0) {         
      return 1; 
   } else { 
      return (number * factorial(number - 1));    
   } 
} 
void main() { 
   print(factorial(6));
}  