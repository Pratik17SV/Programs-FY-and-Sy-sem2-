#WAP to create a function WPNR to calculate accept values for quantity of items and price per item. 
# Display the total bill accordingly in the function.
def total_bill(quantity,p_item):
    print("Quantity:",quantity,"\nPrice per-item:",p_item,"\n--------------","\nTotal bill:",(quantity*p_item))
quantity = int(input("Enter the Quantity:"))
price = int(input("Enter the price per item:"))
total_bill(quantity,price)