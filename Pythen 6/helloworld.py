def paragraph():
    para = input("Enter the para:")
    para = para.upper()
    print(para)
    status = True
    for alphabet in  "ABCDEFGHIJKNMOPQRSTUVWXYZ ":
        if alphabet not in para:
            status = False
            break
    
    if status == True:
        print("This is the paragraph")
    else:
        print("Not a para.")
paragraph()