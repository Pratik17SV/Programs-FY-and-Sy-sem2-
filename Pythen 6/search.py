hand = open('pratik.txt')
for line in hand:
    line = line.rstrip()
    if line.startswith('From:'):
        print(line)