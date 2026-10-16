S = input().strip()
ones = S.count('1')
if ones % 2 == 0:
    print(S + "0")
else:
    print(S + "1")
