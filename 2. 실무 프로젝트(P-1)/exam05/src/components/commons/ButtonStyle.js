import styled, { css } from 'styled-components';

export const BigButton = styled.button`
  width: 100%  
  height: 45px;
  background: ${({ bgcolor }) => bgcolor ?? 'orange'};
  border: 0;
  font-size: 1.5rem;
  font-weight: bold;

  ${({ selected, bgcolor }) =>
    selected &&
    css`
      border: 1px solid ${bgcolor ?? 'orange'};
      background: #fff;
    `}
`;
