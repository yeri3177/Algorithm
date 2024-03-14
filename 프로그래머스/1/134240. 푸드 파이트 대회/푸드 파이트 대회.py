def solution(food):
    answer = ''
    
    for i in range(1, len(food)):
        halfCnt = food[i]//2
        answer += str(i)*halfCnt
     
    answer = answer + '0' + answer[::-1]
    
    return answer