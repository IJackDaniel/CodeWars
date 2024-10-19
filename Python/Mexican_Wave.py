def wave(people):
    result = []
    for n in range(len(people)):
        people_un = people
        if people[n] != " ":
            a = chr(ord(people[n]) - 32)
            people_un = people[:n] + a + people[n+1:]
            result.append(people_un)
    return result
