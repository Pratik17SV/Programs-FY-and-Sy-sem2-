#WAP to determine to display the cube of a number if the number equals multiple of 5. 
# If the number does not equal multiple of 2 then display its square. 
# And if the number is apart from the above two conditions then display 
# the answer for calculation of 20% of that number.


num = int(input("Enter the number"))
#determine to display the cube of a number if the number equals multiple of 5.
if num%5==0:
    result = num**3
    print("The number is equal multiple of 5 so the cube is",result)

#If the number does not equal multiple of 2 then display its square. 
if num%2!=0:
    result = num**2
    print("The number is equal multiple of 5 so the cube is",result)

#And if the number is apart from the above two conditions then display
if num%5!=0 and num%2==0:
    print("The above condition so calculation of 20% of that number",num - (num*0.2))
