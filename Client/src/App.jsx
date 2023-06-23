import styles from './App.module.css'
import { Routes, Route } from "react-router-dom"

function App() {

  return (

    <>

      <main className={styles.App}>

        <Routes>

          <Route path="/" element={<Container title={"Solera Teams - Bootcamp 5"} />}>
            <Route index element={<CardList />} />
            <Route path="team/:id" element={<TeamScore />} />
          </Route>
          
        </Routes>

      </main>

    </>
  )
}

export default App
