salary = float(input())

if salary <= 2000.0:
    print("Isento")
elif salary <= 3000.0:
    tax = (salary - 2000.0) * 0.08
    print(f"R$ {tax:.2f}")
elif salary <= 4500.0:
    tax = (1000.0 * 0.08) + ((salary - 3000.0) * 0.18)
    print(f"R$ {tax:.2f}")
else:
    tax = (1000.0 * 0.08) + (1500.0 * 0.18) + ((salary - 4500.0) * 0.28)
    print(f"R$ {tax:.2f}")
