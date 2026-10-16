N = int(input())
for _ in range(N):
    s1, s2 = input().split()
    res = []
    min_len = min(len(s1), len(s2))
    for i in range(min_len):
        res.append(s1[i])
        res.append(s2[i])
    res.append(s1[min_len:])
    res.append(s2[min_len:])
    print("".join(res))
