#WAP to create a function WPWR to accept the TA, DA,
#Basic Salary from user and return the total salary calculated.
def salary_calculator(TA,DA,b_salary):
    return print("\nTA:",TA,"\nDA:",DA,"\nBase Salary:",b_salary,"\nTotal Salary:",(TA+DA+b_salary))

TA = int(input("Enter the TA:"))
DA = int(input("Enter the DA:"))
Base_salary = int(input("Enter the Salary:"))
salary_calculator(TA,DA,Base_salary)
