def tower_builder(n_floors):
    i = 0
    result = []
    while i + 1 <= n_floors:
        result.append(((i * 2 + 1) * "*").center(1 + (n_floors - 1) * 2, " "))
        i += 1
    return result
