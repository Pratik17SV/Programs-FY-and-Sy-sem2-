#How to create and use a global variable?
 
var = 18
def modify_global_varible():
    #declaration of global varible using global key word in the function
    global var
    print("INside function:",var+5)
print("Ouside function:",var)
modify_global_varible()