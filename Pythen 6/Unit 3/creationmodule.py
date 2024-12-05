class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def print_info(self):
        print("The Name is :",self.name,"Age is:",self.age)

p1 = Person("John", 36)
del p1.age
p1.print_info()


def Info_print(name,age):
    print("The Name is :",name,"Age is:",age)

# class Person:
#   def __init__(myobject, name, age):
#     myobject.name = name
#     myobject.age = age


#   def myfunc(abc):
#     print("Hello my name is " + abc.name)


# p1 = Person("John", 36)

# p1.myfunc()
