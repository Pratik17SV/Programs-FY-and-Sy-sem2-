# class Student:
    
#      # protected data members
#      _name = None
#      _roll = None
#      _branch = None
    
#      # constructor
#      def __init__(self, name, roll, branch): 
#           self._name = name
#           self._roll = roll
#           self._branch = branch
    
#      # protected member function  
#      def _displayRollAndBranch(self):
 
#           # accessing protected data members
#           print("Roll: ", self._roll)
#           print("Branch: ", self._branch)
 
 
# # derived class
# class Geek(Student):
 
#        # constructor
#        def __init__(self, name, roll, branch):
#                 Student.__init__(self, name, roll, branch)
         
#        # public member function
#        def displayDetails(self):
                   
#                  # accessing protected data members of super class
#                 print("Name: ", self._name)
                   
#                  # accessing protected member functions of super class
#                 self._displayRollAndBranch()
 
# # creating objects of the derived class       
# obj = Geek("R2J", 1706256, "Information Technology")
 
# # calling public member functions of the class
# obj.displayDetails()

class Access:
     def __init__(self,a,b,c):
        self.__private_var = a
        self.public = b
        self._protected = c
     def display(self):
        return print(self.__private_var,self.public,self._protected)
        
ac = Access('Private','Public','Protected')
ac.display()
print(ac.public)
print(ac._protected)
print(ac.__private_var)