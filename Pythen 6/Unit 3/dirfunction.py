# import platform


# x = dir(platform)
# print(x)
import time

print("Calling without any parameter")
print(time.gmtime())
print()
print("Passing seconds")
print(time.gmtime(time.time()))
