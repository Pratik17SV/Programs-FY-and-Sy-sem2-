class Person:
    def __init__(self, name="", city=""):
        self.name = name
        self.city = city

    def acceptInformation(self):
        self.name = input("Enter name: ")
        self.city = input("Enter city: ")

    def displayInformation(self):
        print("Name: ", self.name)
        print("City: ", self.city)


class Employee(Person):
    def __init__(self, name="", city="", designation="", basic_salary=0, tax=0):
        super().__init__(name, city)
        self.designation = designation
        self.basic_salary = basic_salary
        self.tax = tax

    def acceptInformation(self):
        super().acceptInformation()
        self.designation = input("Enter designation: ")
        self.basic_salary = int(input("Enter basic salary: "))
        self.tax = int(input("Enter tax to be deducted: "))

    def calculateSalary(self):
        total_salary = self.basic_salary - self.tax
        return total_salary

    def displayInformation(self):
        super().displayInformation()
        print("Designation: ", self.designation)
        print("Basic Salary: ", self.basic_salary)
        print("Tax: ", self.tax)
        print("Net Salary: ", self.calculateSalary())


class Manager(Employee):
    def __init__(self, name="", city="", designation="", basic_salary=0, tax=0, incentive=0.0):
        # Pass all necessary arguments to the Employee class
        super().__init__(name, city, designation, basic_salary, tax)
        self.incentive = incentive

    def acceptInformation(self):
        super().acceptInformation()
        self.incentive = float(input("Enter incentive: "))

    def calculateSalary(self):
        return super().calculateSalary() + self.incentive

    def displayInformation(self):
        super().displayInformation()
        print("Incentive: ", self.incentive)
        print("Total Salary: ", self.calculateSalary())


# Example usage:
manager = Manager()  # Now, no missing arguments error will occur
manager.acceptInformation()
manager.displayInformation()
