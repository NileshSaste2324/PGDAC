
import './App.css';
import Header from './component/Header';
import MobileList from './component/MobileList';
function App() {
 var namearr=["CSK","RCB","MI","DC"]
  return (
    <div >
      <Header/>
      <MobileList arr={namearr}/>
    
    </div>
  );
}

export default App;
