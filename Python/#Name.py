name_raw = input("Введите название задачи: ")
name = "_".join(name_raw.split()) + ".py"
file = open(name, "w")
file.close()
