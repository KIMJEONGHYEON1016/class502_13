import React from 'react';
import { IoIosRadioButtonOn, IoIosRadioButtonOff } from 'react-icons/io';

const TodoForm = ({ onSubmit }) => {
  return (
    <form autoComplete="off" onSubmit={onSubmit}>
      <dl>
        <dt>할 일</dt>
        <dd>
          <input type="text" onChange={onchange}/>
        </dd>
      </dl>
      <dl>
        <dt>내용</dt>
        <dd>
          <textarea></textarea>
        </dd>
      </dl>
      <dl>
        <dt>완료 여부</dt>
        <dd>
          <span>
            <IoIosRadioButtonOff />
            완료
          </span>
          <span>
            <IoIosRadioButtonOff />
            미완료
          </span>
        </dd>
      </dl>
      <button type="submit">할 일 등록</button>
    </form>
  );
};

export default TodoForm;
