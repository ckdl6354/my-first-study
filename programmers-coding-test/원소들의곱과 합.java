//문제출처:https://school.programmers.co.kr/learn/courses/30/lessons/181929

class 원소들의 곱과 합 {
    public int solution(int[] num_list) {
        int sum =0;
        int product =1;
        for(int i=0;i<num_list.length;i++){
            sum += num_list[i];
             product *=num_list[i];
        }
            if(product<=(sum*sum)){
                return 1;
            }else {
                return 0;
            }
            
        }
    }

        
        
        
        
        
    
