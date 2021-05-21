def solution(numbers, target):
    answer = 0
    
    result_list = [0]
    
    for i in range(len(numbers)):
        tmp_list = []
        
        for j in range(len(result_list)):
            tmp_list.append(result_list[j]-numbers[i])
            tmp_list.append(result_list[j]+numbers[i])
        
        result_list = tmp_list
            
    
    
    return result_list.count(target)
