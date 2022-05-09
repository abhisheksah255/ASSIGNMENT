import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import CurrentWeatherDisplay from './components/CurrentWeatherDisplay';

function App() {
  return (
    <div className="App">
     <Header/>
     <CurrentWeatherDisplay/>
    </div>
  );
}

export default App;
