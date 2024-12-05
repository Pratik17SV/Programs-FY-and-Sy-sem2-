import time

print("Before execution")
print(time.ctime(time.time()))
for i in range(10):
    time.sleep(1)

print()

print("After execution")
print(time.ctime(time.time()))
