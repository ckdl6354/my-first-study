# Java Collection Framework Cheat Sheet

코딩테스트와 실무에서 가장 많이 쓰는 자바 핵심 자료구조(List, Set, Map) 요약

---

## 1. 구조별 특징 한눈에 보기

| 자료구조 | 중복 여부 | 순서 유지 | 시간 복잡도 | 추천 시나리오 |
| :--- | :---: | :---: | :---: | :---: |
| **ArrayList** | 허용 | 유지 | 조회  매우빠름 | 인덱스로 빠른 조회가 필요할 때 |
| **HashSet** | 불가 | 없음 | 탐색  매우빠름 | 값의 존재 여부 확인, 중복 제거 |
| **HashMap** | Key 불가 | 없음 | 탐색 매우빠름 | Key-Value 쌍 관리, 빈도수 카운팅 |
| **TreeSet / Map** | 불가 | **정렬** | 탐색 보통 | 최댓값·최솟값 검색, 실시간 정렬 |

---

## 핵심 요약 및 선택 기준

### List (순서 O, 중복 O)
*   **ArrayList**: 내부 배열 기반. 인덱스 조회($O(1)$)가 빠르지만, 중간 삽입/삭제는 데이터 이동 때문에 느림. **(코테/실무 기본 리스트)**
*   **LinkedList**: 노드 연결 기반. 삽입/삭제($O(1)$)가 빠르지만 탐색이 느림. **(Queue, Deque 구현 시 사용)**

### Set (중복 X)
*   **HashSet**: 해시 기반. 성능이 가장 빠름. **(방문 처리, 중복 체크)**
*   **LinkedHashSet**: 데이터가 들어온 순서 보장.
*   **TreeSet**: Red-Black Tree 기반. 데이터가 자동으로 정렬됨.

### Map (Key-Value 쌍, Key 중복 X)
*   **HashMap**: 해시 기반. Key를 통한 데이터 조회가 가장 빠름. **(카운터, 캐싱)**
*   **LinkedHashMap**: Key가 추가된 순서 보장. **(LRU 캐시 구현)**
*   **TreeMap**: Key 기준 자동 정렬. **(범위 검색)**

---
## 필수 활용 패턴 (Code Snippets)

### HashMap 빈도수 계산
```java
Map<String, Integer> map = new HashMap<>(); 

// 데이터가 없으면 0, 있으면 기존 값 + 1 
map.put(key, map.getOrDefault(key, 0) + 1);
```

### HashSet 중복 제거 및 탐색
```java
Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 2, 3)); 

// O(1) 속도로 데이터 존재 여부 확인 
if (set.contains(target)) { ... }
```

