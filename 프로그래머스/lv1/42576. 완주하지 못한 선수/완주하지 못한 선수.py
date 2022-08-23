def solution(participant, completion):
    
    participant.sort()
    completion.sort()    
    for i in range(len(completion)):
        if not completion[i] == participant[i] :
            answer = participant[i]
            break            
        else:
            answer = participant[-1]

    return  answer