# 다크모드 기능 고도화 분석 (With AI)

어제 구현한 다크모드 토글 기능의 한계점(새로고침 시 초기화)을 보완하기 위해
AI와 함께 브라우저 저장소를 활용한 상태 유지 로직을 공부하고 기록합니다.

## 핵심 학습 내용
1. **`localStorage` 활용**: 브라우저를 닫거나 새로고침해도 사용자가 설정한 다크모드 상태가 유지되도록 값을 저장하고 불러오는 방법을 배웠습니다.
2. **조건문 분석**: `document.body.classList.contains`를 활용해 현재 화면의 상태를 체크하는 분기 처리 로직을 이해했습니다.

## 구현 로직 (JavaScript)
```javascript
// 1. 페이지 로드시 기존에 저장된 테마 불러오기
if (localStorage.getItem('theme') === 'dark') {
  document.body.classList.add('dark-mode');
}

// 클래스 토글 함수
function toggleMode() {
  document.body.classList.toggle('dark-mode');
  
  // 2. 사용자가 변경한 테마를 브라우저에 저장하기
  if (document.body.classList.contains('dark-mode')) {
    localStorage.setItem('theme', 'dark');
  } else {
    localStorage.setItem('theme', 'light');
  }
}
```
