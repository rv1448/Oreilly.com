def fib(n):
    if n == 0:
        return 0
    elif(n == 1):
        return 1
    else:
        return fib(n-1) + fib(n-2)

print(fib(3))

def fib2(n):
    a,b = 1,1
    result = [a,b]
    while n > 2:
        n = n-1
        a,b = b,a+b
        result.append(b)

    return result

print(fib2(100))




