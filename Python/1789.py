import sys

for line in sys.stdin:
    line = line.strip()
    if not line:
        continue
    try:
        L = int(line)
        speeds = list(map(int, sys.stdin.readline().split()))
        max_speed = max(speeds)
        if max_speed < 10:
            print(1)
        elif max_speed < 20:
            print(2)
        else:
            print(3)
    except:
        break
