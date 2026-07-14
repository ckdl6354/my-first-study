# [Java] 배열(Array) vs 리스트(ArrayList) 반복문 핵심 요약

## 1. 한 눈에 보는 차이점 요약

**배열(Array)**            
특징: 방 크기가 고정됨                 
길이 확인: .length    
값 가져오기: arr[i]
--------
**리스트(ArrayList)**
특징: 방크기가 자동으로 변함
길이 확인: .size()
값 가져오기: list.get(i)

--------

## 2. 필수 반복문 패턴 2가지

### ① 일반 for문 (인덱스 번호가 필요할 때)
```java
// 배열 반복
String[] arr = {"Kim", "Lee"};
for (int i = 0; i < arr.length; i++) {
    System.out.println(i + "번: " + arr[i]);
}

// ArrayList 반복
ArrayList<String> list = new ArrayList<>();
list.add("Kim");
for (int i = 0; i < list.size(); i++) {
    System.out.println(i + "번: " + list.get(i));
}
```

### ② 향상된 for문 (단순 전체 출력용 - 추천!)
인덱스(`i`) 없이 알맹이만 순서대로 꺼낼 때 사용하며, 문법이 동일합니다.
```java
String[] arr = {"Kim", "Lee"};

for (String name : arr) {
    System.out.println("이름: " + name);
}
```

---

##  자주 발생하는 초보자 에러 (Troubleshooting)

1. **`ArrayIndexOutOfBoundsException`**
   - **원인**: 없는 방 번호를 불렀을 때 발생 (예: 크기가 3인데 3번 방 호출, 인덱스는 0,1,2만 존재)
   - **해결**: `i <= arr.length`가 아니라 `i < arr.length`로 조건식 수정

2. **`.length`와 `.size()` 헷갈림**
   - 배열은 괄호 없는 `.length`
   - ArrayList는 괄호 있는 `.size()`
