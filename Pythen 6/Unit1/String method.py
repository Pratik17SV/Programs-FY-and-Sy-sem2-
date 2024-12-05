def palindrome(num):
    num = str(num)
    if num == num[::-1]:
        print(num,"is a Palindrome number.")
    else:
        print(num,"is not Palindrome number.")
def armstrong(number):
    num_str = str(number)
    
    num_digits = len(num_str)
    
    sum_of_powers = 0

    for digit in num_str:
        sum_of_powers+= int(digit)**num_digits
        
    if sum_of_powers == number:
        print("The number",number,"is Armstrong number.")
    else:
        print("The number",number,"is not Armstrong number.")

user_inp = int(input("Enter the number:"))
palindrome(user_inp)
armstrong(user_inp)
