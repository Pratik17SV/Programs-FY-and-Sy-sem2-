student_data <- data.frame(
  rollno = c(101, 102, 103, 104, 105),
  name = c("John", "Alice", "Bob", "Mary", "David"),
  age = c(20, 21, 22, 20, 23),
  class = c("BSc", "BCom", "BA", "BSc", "BTech"),
  cgpa = c(8.5, 7.8, 9.0, 8.2, 8.9)
)

cat("Structure of the student data frame:\n")
str(student_data)

cat("\nDetails of the student data frame:\n")
print(student_data)