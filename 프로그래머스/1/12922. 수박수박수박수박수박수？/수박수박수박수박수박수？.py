# my code
def solution(n):
    answer = ''
    
    for i in range (0, n):
        if i%2 == 0:
            answer += "수"
        else:
            answer += "박"
    
    return answer

# reference
def solution(n):
    str = "수박"*n
    return str[:n]