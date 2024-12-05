n <- as.integer(readline(prompt="Enter a number: "))
if (n < 0) {
  print("The number should not be negative.")

} else {
    i<-1
  while (i<=10) 
  {
    result <- n* i
    cat(n," * ",i," = ",result,"\n")
    i=i+1
  }
}