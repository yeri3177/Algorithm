def solution(k, score):
    answer = []
    top = []
    
    for sco in score:
        if len(top)<k:
            top.append(sco)
        else:
            if min(top) < sco:
                top.remove(min(top))
                top.append(sco)
            
        
        answer.append(min(top))
    
    return answer