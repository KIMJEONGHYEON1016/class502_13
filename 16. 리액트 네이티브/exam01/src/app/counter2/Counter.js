'use client';
import React, { useReducer } from 'react';

function reducer(state, action) {
  switch (action.type) {
    case 'INCREASE':
      return { number: state.number + 1 };
    case 'DRCREASE':
      return { number: state.number - 1 };
    default:
      return state;
  }
}

const Counter = () => {
  const [state, dispatch] = useReducer(reducer, { number: 0 });
  const { number } = state;
  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={() => dispatch({ type: 'DRCREASE' })}>
        -1
      </button>
      <button type="button" onClick={() => dispatch({ type: 'INCREASE' })}>
        +1
      </button>
    </>
  );
};

export default Counter;
