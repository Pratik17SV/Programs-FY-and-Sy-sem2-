class Access:
     def __init__(self,a,b,c):
        self.__private_var = a
        self.public = b
        self._protected = c
     def display(self):
        return print(self.a,self.b,self.c)
        
ac = Access('Private','Public','Protected')
ac.display()