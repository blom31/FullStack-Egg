import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Welcome from './components/Welcome'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <h1>Bienvenida Olga</h1>
        <h3>Hoy aprenderás </h3>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>Vite + React</h1>
     {/*  <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
       
      </div> */}
      <Welcome message="Hola Welcome Props" name="Olga"/>
    </>
  )
}


export default App 
