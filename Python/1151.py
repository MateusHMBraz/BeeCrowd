N = int(input())
fib = []
a, b = 0, 1
for _ in range(N):
    fib.append(str(a))
    a, b = b, a + b

print(" ".join(fib))
