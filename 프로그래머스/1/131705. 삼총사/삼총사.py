def solution(number):
    answer = 0
    for idx1, val1 in enumerate(number):
        for idx2, val2 in enumerate(number):
            for idx3, val3 in enumerate(number):
                if idx1 >= idx2 or idx2 >= idx3:
                    continue
                if val1+val2+val3 == 0:
                    answer += 1
    
    return answer

#ref1
def solution (number) :
    from itertools import combinations
    cnt = 0
    for i in combinations(number,3) :
        if sum(i) == 0 :
            cnt += 1
    return cnt

#ref2
def solution(number):
    answer = 0
    l = len(number)
    for i in range(l-2):
        for j in range(i+1, l-1):
            for k in range(j+1, l):
                # print(number[i],number[j],number[k])
                if number[i]+number[j]+number[k] == 0:
                    answer += 1           
    return answer