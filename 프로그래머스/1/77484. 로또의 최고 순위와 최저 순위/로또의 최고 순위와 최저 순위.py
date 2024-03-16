def solution(lottos, win_nums):
    answer = []
    count = 0
    zero = 0
    
    for num in lottos:
        if num in win_nums:
            count += 1
        if num == 0:
            zero += 1

    rank = [6, 6, 5, 4, 3, 2, 1]
    answer.append(rank[count+zero])
    answer.append(rank[count])
    
    return answer

# ref
def solution(lottos, win_nums):

    rank=[6,6,5,4,3,2,1]

    cnt_0 = lottos.count(0)
    ans = 0
    for x in win_nums:
        if x in lottos:
            ans += 1
    return rank[cnt_0 + ans],rank[ans]
	
# ref
def solution(lottos, win_nums):
    rank = {
        0: 6,
        1: 6,
        2: 5,
        3: 4,
        4: 3,
        5: 2,
        6: 1
    }
    return [rank[len(set(lottos) & set(win_nums)) + lottos.count(0)], rank[len(set(lottos) & set(win_nums))]]
	