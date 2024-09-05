import React from 'react';
import { IoIosRadioButtonOn, IoIosRadioButtonOff, IoMdRadioButtonOn, IoMdRadioButtonOff } from 'react-icons/io';

const TodoForm = ({ onSubmit, onChange, form }) => {
  return (
    <form autoComplete="off" onSubmit={onSubmit}>
      <dl>
        <dt>할 일</dt>
        <dd>
          <input type="text" name="title" value={form?.title ?? ''} onChange={onChange} />
        </dd>
      </dl>
      <dl>
        <dt>내용</dt>
        <dd>
          <textarea name="content" value={form?.content ?? ''} onChange={onChange}></textarea>
        </dd>
      </dl>
      <dl>
        <dt>완료 여부</dt>
        <dd>
          <span>
            {form?.done ? <IoMdRadioButtonOn /> :
            <IoIosRadioButtonOff />}
            완료
          </span>
          <span>
          {form?.done ? <IoMdRadioButtonOff /> :
            <IoIosRadioButtonOn />}
            미완료
          </span>
        </dd>
      </dl>
      <button type="submit">할 일 등록</button>
    </form>
  );
};

export default TodoForm;
