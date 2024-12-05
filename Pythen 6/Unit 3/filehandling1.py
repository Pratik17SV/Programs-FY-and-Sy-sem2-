no_of_lines = int(input("Enter the number"))
file1 = open("writing.txt","w")

for lines in range(no_of_lines):
    content = input("Enter the line:")
    file1.write(content+"\n")
    
file1.close()

file2 = open("writing.txt","r")

print(file1)
file2.close()

