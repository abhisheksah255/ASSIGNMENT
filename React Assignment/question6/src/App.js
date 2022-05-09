import './App.css';
import {BrowserRouter as Router,Routes,Route,Link} from 'react-router-dom'
import HOME from './components/HOME'
import PROJECTS from './components/PROJECTS'
import SERVICES from './components/SERVICES'
import CONTACT from './components/CONTACT'
import ERROR from './components/ERROR';


function App() {
  return (
    <div className="App">
      <Router>
        <nav className='nav-button'>
          <Link className='btn btn-lg btn-primary '  to='/'>HOME</Link>
          <Link className='btn btn-lg btn-primary' to='/projects'>PROJECTS</Link>
          <Link className='btn btn-lg btn-primary' to='/services'>SERVICES</Link>
          <Link  className='btn btn-lg btn-primary' to='/contact'>CONTACT</Link>

        </nav>
        <Routes >
          <Route path='/' element={<HOME/>} />
          <Route path='/projects' element={<PROJECTS/>} />
          <Route path='/services' element={<SERVICES/>} />
          <Route path='/contact' element={<CONTACT/>} />
          <Route path='*' element={<ERROR/>} />
        </Routes>
      </Router>
    </div>
  );
}

export default App;
