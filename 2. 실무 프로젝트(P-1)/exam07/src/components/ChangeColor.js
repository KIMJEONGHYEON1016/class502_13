import ChangeColor2 from "./ChangeColor2";

const ChangeColor = ({ setColor }) => {
  return (
    <button type="button" onClick={() => setColor('orange')}>
      변경
    </button>
  );
};

export default ChangeColor;
