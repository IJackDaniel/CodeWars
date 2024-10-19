# Name
# Training on Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!
# 6 kyu
def sum_dig_pow(a, b): # range(a, b + 1) will be studied by the function
    result = []
    for num in range(a, b+1):
        i = 1
        sm = 0
        for n in str(num):
            sm += int(n)**i
            i += 1
        if sm == num:
            result.append(sm)
    return result
