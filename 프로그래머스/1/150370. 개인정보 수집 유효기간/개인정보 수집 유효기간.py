from datetime import datetime
from dateutil.relativedelta import relativedelta

def solution(today, terms, privacies):
    answer = []
    today = datetime.strptime(today, "%Y.%m.%d")
    
    for idx, val in enumerate(privacies):
        month = 0
        for term in terms:
            if term.startswith(val[-1:]):
                month = int(term[term.index(' '):])
        day = datetime.strptime(val[:10], "%Y.%m.%d")
        
        if today >= day + relativedelta(months=month):
            answer.append(idx+1)
    return answer