def solution(a, b):
    answer = ''
    week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
    month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    # test = ((31+29+31+30)+24)%7 # 5
    # print(week[(5+4)%7]) # mont[(5+5)%7]
    
    test = week[(sum(month[0:a-1], b)%7+4)%7]
    print(test)
    return ''.join(week[(sum(month[0:a-1], b)%7+4)%7])