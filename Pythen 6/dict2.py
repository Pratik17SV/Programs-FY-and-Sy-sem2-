count = dict()
names = ['Pratik', 'Sahil', 'Nikhil','Pratik','Sahil','Ronak']
for name in names:
    if name not in count:
        count[name] = 1
    else:
        count[name] = count[name] + 1
print("This is the name directory of students with same name:\n",count)