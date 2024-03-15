def solution(babbling): 
    answer = 0
    words = ["aya", "ye", "woo", "ma"]
    
    for bab in babbling:
        for word in words:
            # if bab.find(word) != -1:
            if word * 2 not in bab:
                bab = bab.replace(word, '0')
            if bab.isdigit():
                answer += 1
                break
        
    return answer
