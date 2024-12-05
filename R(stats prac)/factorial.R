n <- as.integer(readline(prompt="Enter a number: "))

factorial <- 1

if (n < 0) {
  print("Factorial is not defined for negative numbers.")

} else {
  for (i in 1:n) {
    factorial <- factorial * i
  }
  print(paste("Factorial of", n, "is", factorial))
}
