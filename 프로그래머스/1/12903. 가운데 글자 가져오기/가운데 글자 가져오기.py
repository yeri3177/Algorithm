def solution(s):
    answer = ''
    middle = len(s)//2
    # print(middle)
    
    if len(s)%2 != 0:
        answer = s[middle:middle+1]
    else:
        answer = s[middle-1:middle+1]
    return answer