def solution(arr1, arr2):
    answer = []
    
    for x in range(0, len(arr1)):
        arr = []
        for y in range(0, len(arr1[x])):
            arr.append(arr1[x][y] + arr2[x][y])
        answer.append(arr)
    
    return answer

# ref
def sumMatrix(A,B):
    return [list(map(sum, zip(*x))) for x in zip(A, B)]

# ref 
def sumMatrix(A,B):
    answer = [[c + d for c, d in zip(a,b)] for a, b in zip(A,B)]
    return answer