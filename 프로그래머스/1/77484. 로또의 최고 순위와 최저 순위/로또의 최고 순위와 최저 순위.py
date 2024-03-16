def solution(lottos, win_nums):
    answer = []
    count = 0
    zero = 0
    
    for num in lottos:
        if num in win_nums:
            count += 1
        if num == 0:
            zero += 1
    print(str(count) + ' '+ str(zero))
    rank = [6, 6, 5, 4, 3, 2, 1]
    answer.append(rank[count+zero])
    answer.append(rank[count])
    return answer