def duplicate_encode(word):
    word = word.lower()
    result = ""
    for sym in word:
        result += "(" if word.count(sym) == 1 else ")"
    return result


print(duplicate_encode("din"))
print(duplicate_encode("recede"))
