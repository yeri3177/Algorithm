def solution(players, callings):
    rank = {player: idx for idx, player in enumerate(players)}
    
    for call in callings:
        callRank = rank[call]
        
        rank[call] -= 1
        rank[players[callRank - 1]] += 1
        
        players[callRank-1], players[callRank] = players[callRank], players[callRank-1]
    
    return players



# 시간초과 9~13 실패 / 68.8
# def solution(players, callings):
#     for call in callings:
#         index = players.index(call)
#         players[index-1], players[index] = players[index], players[index-1] 
#     return players

# 시간초과 8~13 실패 / 62.5
# def solution(players, callings):
#     for call in callings:
#         index = players.index(call)-1 if players.index(call) != 0 else 0
#         players.remove(call)
#         players.insert(index, call)
#     return players