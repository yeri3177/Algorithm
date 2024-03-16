def solution(babbling): 
    answer = 0
    words = ["aya", "ye", "woo", "ma"]
    
    for bab in babbling:
        for word in words:
            if word * 2 not in bab:
                bab = bab.replace(word, '0')
            if bab.isdigit():
                answer += 1
                break
        
    return answer

# ref
def solution(babbling):
    count = 0

    for b in babbling:
        if "ayaaya" in b or "yeye" in b or "woowoo" in b or "mama" in b:
            continue    
        if not b.replace("aya", " ").replace("ye", " ").replace("woo", " ").replace("ma", " ").replace(" ", ""):
            count += 1

    return count