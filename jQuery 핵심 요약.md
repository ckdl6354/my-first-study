# 💡 jQuery 핵심 내용 정리

## 1. jQuery 개요
* **정의:** 복잡하고 길게 작성해야 하는 순수 자바스크립트(JavaScript) 코드를 아주 짧고 직관적으로 쓸 수 있도록 만들어진 **오픈소스 JavaScript 라이브러리**입니다.
* **핵심 슬로건:** *"Write less, do more"* (적게 쓰고 더 많은 것을 하라)

---

## 2. 왜 사용하는가? (장점)
* **압도적인 생산성:** 복잡한 DOM 조작 및 이벤트를 단 몇 줄의 코드로 구현 가능합니다.
* **크로스 브라우징 지원:** 브라우저별(Chrome, Safari, 과거 IE 등) 자바스크립트 호환성 문제를 알아서 해결해 줍니다.
* **쉬운 AJAX 통신:** 서버와 데이터를 주고받는 API 연동을 매우 직관적인 문법(`$.ajax`)으로 제공합니다.
* **풍부한 생태계:** 수많은 SI/SM 기업, JSP 기반 웹 서비스, 전자정부프레임워크 환경에서 여전히 메인 기술로 사용 중입니다.

---

## 3. 코드 비교 (Vanilla JS vs jQuery)
웹페이지 내 특정 버튼을 클릭했을 때, 대상 텍스트를 숨기는 기능 구현 비교입니다.

### ❌ 순수 자바스크립트 (Vanilla JS)
```javascript
document.getElementById("myButton").addEventListener("click", function() {
    document.getElementById("targetText").style.display = "none";
});
```

### ⭕ 제이쿼리 (jQuery)
```javascript
$("#myButton").click(function() {
    $("#targetText").hide();
});
```
* **`$` 기호:** jQuery 라이브러리를 호출하고 사용하겠다는 선언입니다.
* **`$("#id")`:** CSS 선택자 방식을 사용하여 대상 요소를 쉽게 타겟팅합니다.
* **`.hide()`:** 복잡한 스타일에 접근할 필요 없이 직관적인 내장 메서드를 사용합니다.

---

## 4. 실무에서의 위치 (JSP와의 관계)
* **레거시 및 SI 환경의 단짝:** 최근 신생 스타트업은 React나 Vue를 선호하지만, **중견기업, 공공기관 사업(SI), JSP/Servlet 기반 인프라**에서는 jQuery가 화면 제어의 표준으로 동작합니다.
* **과제형 코테/실무 구현:** 취업 준비 시 게시판 구현, API 데이터 렌더링 등의 과제를 수행할 때 코드의 가독성과 구현 속도를 폭발적으로 높여줍니다.
