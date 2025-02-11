def more_zeros(s):
    result = []
    for sym in s:
        binary = str(bin(ord(sym)))[2:]
        if binary.count("0") > binary.count("1"):
            if sym not in result:
                result.append(sym)
    return result


print(more_zeros("abcde"))
