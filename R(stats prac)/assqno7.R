is_armstrong<- function(num) {
  digits <- as.numeric(unlist(strsplit(as.character(num), NULL)))

  num_digits <- length(digits)
  
  sum_of_powers <- sum(digits^num_digits)

  return(sum_of_powers == num)
    
}
num <-as.integer(readline(prompt="Enter the number:"))
if(is_armstrong(num)){
    print("The number is Armstrong number.")
}else{
    print("The number is Not Armstrong number.")
}