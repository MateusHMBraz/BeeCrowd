N = int(input())
for _ in range(N):
    text = input().strip()
    shift = int(input())
    res = []
    for char in text:
        res.append(chr((ord(char) - ord('A') - shift) % 26 + ord('A')))
    print("".join(res))
