# my code
def solution(arr):
    minVal = min(arr)
    arr.remove(minVal)
    if len(arr) < 2:
        return [-1]
    return arr

# def solution(arr):
#     arr = [i for i in arr if i > min(arr)]
#     if len(arr) < 2:
#         return [-1]
#     return arr
