def solution(n, lost, reserve):
    answer = 0
    lost.sort()
       
    for x in lost:    
        if x in reserve:
            reserve.remove(x)
            answer += 1
            
        elif x-1 in reserve:
            reserve.remove(x-1)
            answer += 1
            
        elif x+1 in reserve:
            if x+1 in lost:
                continue
            reserve.remove(x+1)
            answer += 1
    
    return n-len(lost)+answer