import sys

total_dist = 0
count = 0

lines = sys.stdin.read().splitlines()
i = 0
while i < len(lines):
    name = lines[i]
    if i + 1 < len(lines):
        dist = float(lines[i + 1])
        total_dist += dist
        count += 1
    i += 2

if count > 0:
    print(f"{total_dist / count:.1f}")
