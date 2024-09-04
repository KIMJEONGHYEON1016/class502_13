'use client';
import React, { useState } from 'react';
import Greeting from './components/Greeting';

const Counter = () => {
  const [num, setNum] = useState(0);


  return ( 
    <>
      <h1>{num}</h1>
      <button type="button" onClick={() => setNum(num - 1)}>-1</button>
      <button type="button" onClick={() => setNum(num + 1)}>+1</button>
    </>
  );
};

export default Counter;
