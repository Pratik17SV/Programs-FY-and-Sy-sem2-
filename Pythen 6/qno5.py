def devide(num1,num2):
    try:
        result = num1/num2
    except ZeroDivisionError:
        print("Enter the value greater then zero.")
    return result
try:
    n1 =int(input("Enter the number:"))
    n2 =int(input("Enter the number:"))
except ValueError:
    print("Value Error.")
else:
    print("Enter else block.")
    print("the result is:",devide(n1,n2))
finally:
    print("the Calculation Completed.")
