def pattern(n):
    result = "1"
    for i in range(1, n):
        add = "*" * i
        result += f"\n1{add}{i+1}"
    return result


print(pattern(7))

