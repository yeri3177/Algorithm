"""
now + relativedelta(months=1)
my_date = datetime(2019,10,10)
new_date1 = my_date + relativedelta(months=4)

import datetime
import relativedelta

relativedelta.relativedelta(months=1)

 # val[-1:] : 약관종류 
# val[:10] : 날짜 
# print(datetime(2019,10,10)+relativedelta(months=1))
"""

from datetime import datetime
from dateutil import relativedelta

def solution(today, terms, privacies):
    answer = []
    today = datetime.strptime(today, "%Y.%m.%d")
    
    for idx, val in enumerate(privacies):
        day = datetime.strptime(val[:10], "%Y.%m.%d")
        month = 0
        for term in terms:
            if term.startswith(val[-1:]):
                month = int(term[term.index(' '):])
                
        if today >= day + relativedelta.relativedelta(months=month):
            answer.append(idx+1)
    return answer