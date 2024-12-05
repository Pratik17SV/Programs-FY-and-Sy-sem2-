somaiyamail = input("Emter the email:")
sv_netid = str()
for char in somaiyamail:
    if char =="@":
        break
    sv_netid= sv_netid + char
print("the net id is ",sv_netid)