#WAP to determine the validity of seat no using the NOT operator. 
# If it does not start with 31 and length is not 11 characters then it's invalid.
seat_number = input("Enter the seat no:")

if seat_number[0]=="3" and seat_number[1]=="1" and len(seat_number)==11:
    print("The seat no is valid.")
else:
    print("The seat no is Invalid.") 