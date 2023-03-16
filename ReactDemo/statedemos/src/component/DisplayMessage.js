import React,{Component} from 'react';
class DisplayMessage extends Component{
    constructor(){
        super();
        this.state={msg:"This is Initial State"}
       // this.changeMessage=this.changeMessage.bind(this);
    }
    // changeMessage(){
    //     this.setState({msg:"After Click"})

    // }
    changeMessage=()=>{
        this.setState({msg:"After Click"})
    }
    render(){
        return(
            <div>
                {this.state.msg}
                <button type='button' name='btn' value='click'
                onClick={this.changeMessage}>Change the Message</button>
                {/* <button type='button' name='btn' value='click'
                onclick={(event)=>this.changeMessage}>Change the Message</button>*/}
                </div> 
        )
    }
}
export default DisplayMessage;