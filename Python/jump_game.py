def jump_game(arr):
    step = arr[0]
    place = 0
    while place < len(arr) - 1:
        place += step
        if place > len(arr) - 1 or step == 0:
            return "Невозможно"
        step = arr[place]
    return "Success"


data = open(r"Tests\jump_game_test.txt", "r")

for string in data.readlines():
    flag = True
    for elem in string.split():
        if not (elem.isdigit()):
            print(f"Набор: {string}\nРезультат игры: Ошибка входных значений!\n")
            flag = False
    if flag:
        test = [int(elem) for elem in string.split()]
        test_set = " ".join(str(i) for i in test)
        print(f"Набор: {test_set}\nРезультат игры: {jump_game(test)}\n")
