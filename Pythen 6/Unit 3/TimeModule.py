import time

# Get the current time in seconds since the epoch
current_time = time.time()
print("Current time (seconds since epoch):", current_time)

# Sleep for 2 seconds
time.sleep(2)
print("2 seconds have passed.")

# Get the local time
local_time = time.localtime(current_time)
print("Local time:", local_time)

# Convert local time to a formatted string
formatted_time = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
print("Formatted time:", formatted_time)

# Get the UTC time
utc_time = time.gmtime(current_time)
print("UTC time:", utc_time)
