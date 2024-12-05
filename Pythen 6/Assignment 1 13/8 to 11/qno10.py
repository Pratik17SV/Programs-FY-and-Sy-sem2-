# for i in range(1,5):
#     for j in range(1,i+1):
#         print(j,end="")
#     print()

# for i in range(4, 0, -1):
#        for j in range(1, i + 1):
#            print(j, end="")
#        print()

# for i in range(1, 5):
#        pattern = ""
#        for j in range(i):
#            pattern += "AB"[j % 2]
#        print(pattern)

# n=1
# for i in range(1,5):
#    for j in range(1,i+1):
#        print(n,end=" ")
#        n+=1
#    print()

# n = 4  # Number of rows
# for i in range(1, n + 1):
#   print(" " * (n - i) + "# " * i)

# n = 8  # Starting number of hashes
# for i in range(n, 0, -2):
#    print("#" * i)
# print("(Check reduction closely)")

# n=1
# for i in range(4, 0, -1):
#    for j in range(1, i + 1):
#        if n%2!=0:
#            print("1",end="")
#        else:
#            print("2",end="")
#    n+=1
#    print()


rows =6
triangle = []
print("Hardest Pascal \ntriangle")
for i in range(rows):
    row = [1] * (i + 1)
    for j in range(1, i):
        row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
    triangle.append(row)
    
for i, row in enumerate(triangle):
    if i == 1:
        continue
    print(' '.join(map(str, row)))

