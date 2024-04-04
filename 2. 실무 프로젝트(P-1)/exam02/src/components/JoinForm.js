import { useState, useEffect, useRef } from 'react';

const JoinForm = (props) => {
  console.log(props);
  const [form, setForm] = useState({});

   let userIdEl = useRef();

   useEffect(() => {
    userIdEl.current.focus()
  }, [userIdEl]);

  const onChange = (e) => {
    // form[e.currentTarget.name] = e.currentTarget.value;

    //[e.currentTarget.name]은 userId와 폼 프로퍼티로 같다.
    //e.currentTarget은 이벤트가 발생한 곳의 input 객체
    // setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });
    const name = e.currentTarget.name;
    const value = e.currentTarget.value;
    setForm((prevForm) => ({ ...prevForm, [name]: value }));
  };

  const onSubmit = (e) => {
    e.preventDefault(); //기본동작차단
    console.log(form);
    setForm({});
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input
            type="text"
            name="userId"
            onChange={onChange}
            value={form.userId ?? ''}
            ref={userIdEl}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="userPw"
            onChange={onChange}
            value={form.userPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input
            type="password"
            name="confirmPw"
            onChange={onChange}
            value={form.confirmPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="userNm"
            onChange={onChange}
            value={form.userNm ?? ''}
          />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
