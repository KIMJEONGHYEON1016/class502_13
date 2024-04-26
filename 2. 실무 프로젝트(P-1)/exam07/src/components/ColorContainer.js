import { useState } from 'react';
import Color from './Color';
import ChangeColor from './ChangeColor';

const ColorContainer = () => {
  const [color, setColor] = useState('black');

  return (
    <>
      <Color color={color} />
      <ChangeColor setColor={setColor} />
    </>
  );
};

export default ColorContainer;
