
import './App.css';
import Header from './component/Header';
import Footer from './component/Footer';

function App(props) {
  return (
    <><Header name="Nilesh" address="NS"/>
    <Header name="Saste" />
    <div className="App">
      <h1> Hello World</h1>
      <h3> Welcome Nilesh</h3>
      <Footer id="SASTE" name="Dnyanu"/>
    </div></>
  );
}

export default App;
