is_palindrome <- function(input_string) {
  processed_string <- gsub(" ", "", tolower(input_string))
  
  reversed_string <- paste(rev(strsplit(processed_string, NULL)[[1]]), collapse = "")
  
  return(processed_string == reversed_string)
}

input_string <- readline(prompt="Enter the sring:")

string_length <- nchar(input_string)
cat("Length of the string: ", string_length, "\n")

reversed_string <- paste(rev(strsplit(input_string, NULL)[[1]]), collapse = "")
cat("Reversed string: ", reversed_string, "\n")

if (is_palindrome(input_string)) {
  print("The string is a palindrome.")
} else {
  print("The string is not a palindrome.")
}