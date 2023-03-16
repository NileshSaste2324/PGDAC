import './Header.css';
/*const Header(){
    return(
        <h1>This is Header</h1>
    )
}*/
const Header=(props)=>{

   return (
        <h1>This is Header {props.name} {props.address}</h1>
    ) 
}

export default Header; 