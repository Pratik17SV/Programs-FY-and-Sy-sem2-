cmp <-sample(c("rock","paper","scissors"),1)
# print(cmp)
print("Any thing in rock paper or scissors.")

user <-readline(prompt="Enter the choise:")

if (user == "rock" && cmp == "scissors") {
    print("The User wins.")
} else if (user == "scissors" && cmp == "rock") {
    print("The computer wins.")
} else if (user == "rock" && cmp == "paper") {
    print("The computer wins.")
} else if (user == "paper" && cmp == "rock") {
    print("The User wins.")
} else if (user == "scissors" && cmp == "paper") {
    print("The User wins.")
} else if (user == cmp) {
    print("It's a tie.")
} else {
    print("Invalid input.")
}
print(paste("The computer entered", cmp, "."))
