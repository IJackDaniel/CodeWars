def triangle(row):
    RGB ={
        "GG": "G",
        "BB": "B",
        "RR": "R",
        "GB": "R",
        "BG": "R",
        "RG": "B",
        "GR": "B",
        "BR": "G",
        "RB": "G",
    }
    while len(row) != 1:
        result = ""
        for i in range(len(row)-1):
            para = row[i] + row[i+1]
            result += RGB[para]
        row = result
    return row


print(triangle("RBRGBRBGGRRRBGBBBGG"))
