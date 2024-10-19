def persistence(n):
    cnt = 0
    while n // 10 != 0:
        arr = [int(i) for i in str(n)]
        n = 1
        for num in arr:
            n *= num
        cnt += 1
    return cnt
