def solution(X, Y):
    answer = ''
    x = [0,0,0,0,0,0,0,0,0,0]
    y = [0,0,0,0,0,0,0,0,0,0]
    
    for i in X: 
        x[int(i)] += 1
    
    for i in Y:
        y[int(i)] += 1
    
    for i in range(9, -1, -1):
        answer += str(i) * min(x[i], y[i])
 
    if answer == '':
        return '-1'
    elif answer[0] == '0': 
        return '0'
              
    return answer