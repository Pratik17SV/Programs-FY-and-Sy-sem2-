items = int(input("Enter the number of items: "))
rate = 200
total_bill = items*rate
if(items>=1 and items<=50):
    print("Total bill: ",total_bill)
elif(items>=51 and items<=100):
    total_bill = total_bill - 150
    print("Total bill: ",total_bill)
elif(items>=101 and items<=150):
    total_bill = total_bill -200
    print("Total bill: ",total_bill)
elif(items>=151 and items<=200):
    total_bill = total_bill - 250
    print("Total bill: ",total_bill)
elif(items>=200):
    total_bill = total_bill -(total_bill/10)
    print("Total bill: ",total_bill)
else:
    total_bill = "0.0"
    print("Total bill: ",total_bill)
    print("No items selected.")