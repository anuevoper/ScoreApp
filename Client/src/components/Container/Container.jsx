import styles from './Container.module.css'
import Logo from './../../assets/Logo.png'

const Container = () => {

  return (
    
    <div className={styles.Container}>

      <div className={styles.Header}>

        <h1> drqwqw </h1>

        <img className={styles.Logo} src={Logo} alt='Logo Solera'/>

      </div>
            
    </div>

  )
}

export default Container