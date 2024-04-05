import { Component } from 'react';

class ErrorProcess extends Component {
  state = {
    isError: false,
    message: '',
  };

  componentDidCatch(error, info) {
    console.error(error, info);

    this.setState({ isError: true, message: error.message });
  }

  render() {
    
    const { isError, message } = this.state;
    const { children } = this.props;

    throw new Error("에러발생");
    
    console.log('실행');
    return isError ? <div>{message}</div> : children;
  }
}

export default ErrorProcess;