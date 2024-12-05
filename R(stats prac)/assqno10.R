matrix1 <- matrix(c(1, 2, 3, 4, 5, 6, 7, 8, 9), nrow = 3, ncol = 3)
matrix2 <- matrix(c(9, 8, 7, 6, 5, 4, 3, 2, 1), nrow = 3, ncol = 3)

matrix_addition <- matrix1 + matrix2
cat("Matrix Addition:\n")
print(matrix_addition)

matrix_transpose <- t(matrix1)
cat("\nMatrix Transpose of matrix1:\n")
print(matrix_transpose)

matrix_multiplication <- matrix1 %*% matrix2
cat("\nMatrix Multiplication:\n")
print(matrix_multiplication)

matrix_inverse <- solve(matrix1)
cat("\nMatrix Inverse of matrix1:\n")
print(matrix_inverse)
