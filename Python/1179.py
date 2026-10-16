par = []
impar = []

def print_array(arr, name):
    for i, val in enumerate(arr):
        print(f"{name}[{i}] = {val}")

for _ in range(15):
    x = int(input())
    if x % 2 == 0:
        par.append(x)
        if len(par) == 5:
            print_array(par, "par")
            par = []
    else:
        impar.append(x)
        if len(impar) == 5:
            print_array(impar, "impar")
            impar = []

print_array(impar, "impar")
print_array(par, "par")
