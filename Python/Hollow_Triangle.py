def hollow_triangle(n):
    l = n*2-1
    result = []
    for i in range(n):
        if i == n-1:
            print(l*"#")
            result.append(l*"#")
        else:
            s = "_"*(int(l/2)-i) + "#" + " " * i*2 + "#" + "_"*(int(l/2)-i)
            if "##" in s:
                s = s.replace("##", "#")
            result.append(s)
            print(s)

hollow_triangle(6)