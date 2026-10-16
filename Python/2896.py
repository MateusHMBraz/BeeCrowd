T = int(input())
for _ in range(T):
    N, K = map(int, input().split())
    res = (N // K) + (N % K)
    print(res)
