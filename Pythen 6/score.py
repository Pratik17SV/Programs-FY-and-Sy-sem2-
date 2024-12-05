score = input("Enter Score: ")

#convert string to float
s = float(score)

#calculating grade.
if s>=0.0 and s<=1.0:
    if s>=0.9:
        grade = "A"
    elif s>=0.8:
        grade = "B"
    elif s>=0.7:
        grade = "C"
    elif s>=0.6:
        grade = "D"
    elif s>0.6:
        grade = "f"
else:
    print("Please enter the number between the range.")
print(grade)