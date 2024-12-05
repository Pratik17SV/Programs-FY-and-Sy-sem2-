extract = open('Wifi.txt')
for line in extract:
    line = line.rstrip()
    if not line.startswith(''):
        continue
    print(line)
