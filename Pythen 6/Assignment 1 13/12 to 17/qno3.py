#WAP to create a function NPWR to accept the values in a list from the user and return the created list back to the calling program.
#  Display the contents of the list.
def print_list():
    list1 = list()
    while True:
        elements = input("Enter the elements:")
        if elements =="":
            return list1
        else:
            list1.append(elements)

print("The user enter list is:",print_list())

