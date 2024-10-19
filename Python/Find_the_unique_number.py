def find_uniq(arr):
    symb = set(arr)
    for elem in symb:
        if arr.count(elem) == 1:
            return elem
