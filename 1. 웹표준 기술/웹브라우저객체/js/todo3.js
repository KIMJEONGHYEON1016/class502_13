const todo = {
  //최종적으로 로컬에서  todo로 데이터를 옮긴후 동기화 시킴
  id: 0,
  data: [], // 스케줄 데이터
  tpl: "", // 스케줄 목록 템플릿 HTML
  parser: null,

  init() {
    // 스케줄 목록 템플릿 가져오기
    const tplEl = document.getElementById("tpl"); // text html 문서 양식
    this.tpl = tplEl.innerHTML; // todo에 html과 동기화
    this.parser = new DOMParser();

    // 저장 값 조회 -> 스케줄 완성
    const jsonData = localStorage.getItem("todos"); // 로컬 스토리지로부터 조회
    const todos = jsonData ? JSON.parse(jsonData) : []; //todos == (객체) 문자열 ->  객체
    this.data = todos; //스케줄 데이터를 담음
    this.id = todos.length; //로컬 스토리지 배열의 길이 = id로 치환

    const itemsEl = document.querySelector(".items"); //items를 선택
    for (const item of todos) {
      // Symbol.iterator / 반복자 패턴 / 반복이 필요한 객체
      const liEl = this.getItem(item.title);
      liEl.dataset.id = item.id;
      itemsEl.appendChild(liEl);
    }
  },
  /**
   * 스케줄 추가
   *
   */
  add() {
    const subject = frmRegist.subject.value;

    if (!subject.trim()) {
      // 좌우 공백 제거
      alert("할일을 입력하세요.");
      return;
    }

    const itemsEl = document.querySelector(".items");
    const liEl = this.getItem(subject);
    itemsEl.appendChild(liEl);

    frmRegist.subject.value = "";
    frmRegist.subject.focus();

    const { data } = this;
    let id = this.id;
    data.push({
      id,
      title: subject,
    });

    this.save();
  },
  save() {
    localStorage.setItem("todos", JSON.stringify(this.data));
  },
  getItem(subject) {
    let html = this.tpl;
    html = html.replace(/#subject/g, subject).replace(/#id/g, ++this.id); //메서드 체이닝

    const dom = this.parser.parseFromString(html, "text/html");
    const liEl = dom.querySelector("li");
    const buttonEl = liEl.querySelector("button");
    buttonEl.addEventListener("click", function () {
      const itemsEl = document.querySelector(".items");
      itemsEl.removeChild(liEl);

      //localStorage에 저장된 데이터도 삭제
      const id = Number(liEl.dataset.id);
      const index = todo.data.findIndex((item) => item.id == id);
      if (index !== -1) {
        todo.data.splice(index, 1);
        todo.save();
      }
    });

    return liEl;
  },
};

window.addEventListener("DOMContentLoaded", function () {
  todo.init(); // 데이터 조회 및 완성

  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();
    todo.add(); // 스케줄 추가
  });
});
