def solution(arr):
    minVal = min(arr)
    arr.remove(minVal)
    if len(arr) < 2:
        return [-1]
    return arr