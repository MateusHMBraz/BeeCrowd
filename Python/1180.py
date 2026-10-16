N = int(input())
X = list(map(int, input().split()))

min_val = min(X)
min_pos = X.index(min_val)

print(f"Menor valor: {min_val}")
print(f"Posicao: {min_pos}")
