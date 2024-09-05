'use client';
import React, { useState } from 'react';
import { produce } from 'immer';
import TodoForm from '../components/TodoForm';
import TodoList from '../components/TodoList';

const TodoContainer = () => {
  const [items, setItems] = useState([
    { id: 1, title: '할일1', content: '내용1', done: true },
    { id: 2, title: '할일2', content: '내용2', done: false },
    { id: 3, title: '할일3', content: '내용3', done: false },
  ]);
  const [form, setForm] = useState({});

  const onToggle = (id) => {
    /*
    const newItems = items.map((item) =>
      id === item.id ? { ...item, done: !item.done } : item,
    );
    setItems(newItems);
    */
    /*
    setItems((prev) =>
      prev.map((item) =>
        item.id === id ? { ...item, done: !item.done } : item,
      ),
    );
    */
    setItems(
      produce((draft) => {
        draft
          .filter((item) => item.id === id)
          .forEach((item) => {
            item.done = !item.done;
          });
      }),
    );
  };

  const onRemove = (id) => {
    // filter 메서드
    setItems((items) => items.filter((item) => item.id !== id));
  };

  const onSubmit = (e) => {
    e.preventDefault();
  };

  const onChange = (e) => {
    /**
     * e.target
     * e.currentTarget
     */

    const name = e.target.name;
    const value = e.target.value;
    setForm((form) => ({ ...form, [name]: value }));
  };
  return (
    <>
      <TodoForm onSubmit={onSubmit} onChange={onChange} form={form}/>
      <TodoList items={items} onToggle={onToggle} onRemove={onRemove} />
    </>
  );
};

export default TodoContainer;
