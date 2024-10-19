def late_clock(a, b, c, d):
    print((a, b, c, d))
    arr = [a, b, c, d]
    arr_str = [str(i) for i in arr]

    if "2" in arr_str:
        result = "2"
        arr_str.remove("2")
        arr.remove(2)
        e = 2
        if "3" in arr_str:
            result += "3"
            w = 3
            arr_str.remove("3")
            arr.remove(3)
        elif "2" in arr_str:
            result += "2"
            w = 2
            arr_str.remove("2")
            arr.remove(2)
        elif "1" in arr_str:
            result += "1"
            w = 1
            arr_str.remove("1")
            arr.remove(1)
        elif "0" in arr_str:
            result += "0"
            w = 0
            arr_str.remove("0")
            arr.remove(0)
        else:
            result = "1"
            e = 1
            arr_str.append("2")
            arr.append(2)
            arr_str.remove("1")
            arr.remove(1)
            result += str(max(arr))
            w = max(a)
            arr_str.remove(str(max(arr)))
            arr.remove(max(arr))
        if max(arr) < 6:
            result += ":" + str(max(arr)) + str(min(arr))
        elif min(arr) < 6:
            result += ":" + str(min(arr)) + str(max(arr))
        else:
            arr.append(e)
            arr.append(w)
            arr_str.append(str(e))
            arr_str.append(str(w))
            if "1" in arr_str:
                result = "1"
                arr_str.remove("1")
                arr.remove(1)
                result += str(max(arr))
                arr_str.remove(str(max(arr)))
                arr.remove(max(arr))
                if max(arr) < 6:
                    result += ":" + str(max(arr)) + str(min(arr))
                else:
                    result += ":" + str(min(arr)) + str(max(arr))
                return result

            elif "0" in arr_str:
                result = "0"
                arr.remove(0)
                arr_str.remove("0")
                result += str(max(arr))
                arr_str.remove(str(max(arr)))
                arr.remove(max(arr))
                if max(arr) < 6:
                    result += ":" + str(max(arr)) + str(min(arr))
                else:
                    result += ":" + str(min(arr)) + str(max(arr))
                return result
            else:
                return "error"


        return result

    elif "1" in arr_str:
        result = "1"
        arr_str.remove("1")
        arr.remove(1)
        result += str(max(arr))
        arr_str.remove(str(max(arr)))
        arr.remove(max(arr))
        if max(arr) < 6:
            result += ":" + str(max(arr)) + str(min(arr))
        else:
            result += ":" + str(min(arr)) + str(max(arr))
        return result

    elif "0" in arr_str:
        result = "0"
        arr_str.remove("0")
        arr.remove(0)
        result += str(max(arr))
        arr_str.remove(str(max(arr)))
        arr.remove(max(arr))
        if max(arr) < 6:
            result += ":" + str(max(arr)) + str(min(arr))
        else:
            result += ":" + str(min(arr)) + str(max(arr))
        return result
    else:
        return "error"


print(late_clock(0,7,8,2))
