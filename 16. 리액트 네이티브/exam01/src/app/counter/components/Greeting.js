import React from 'react';

const Greeting = ({ name, age, children }) => {
  age = age ?? 20;
  return (
    <div>
      <h1>
        {name}는 {age}세
      </h1>
      <div>{children(100)}</div>
    </div>
  );
};

export default Greeting;
