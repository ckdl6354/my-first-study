class Solution {
    public String solution(String phone_number) {
       String back = phone_number.substring(phone_number.length()-4); 
      //phone_number의 뒤에서 4번째 위치부터 맨끝까지 잘라서 back에 저장     
       String front = "*".repeat(phone_number.length()-4);  
      //phone_number의 뒤에서 4번째를 제외한 앞부분 길이만큼 "*" 문자열 생성
        return front + back;
    }
}

//한줄로도 가능 return "*".repeat(phone_number.length()-4)+phone_number.substring(phone_number.length()-4);
