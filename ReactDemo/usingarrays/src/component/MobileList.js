const MobileList=(props)=>{
   // var namearr=["CSK","RCB","MI","DC","RR"]
    return(
        <div >
            <ul>
                {props.arr.map((x,index)=><li key={index}>{x}----{index}</li>)}
                {/*{namearr.map(x=><li>{x}</li>)}
                <li>{namearr[0]}</li>
                <li>{namearr[1]}</li>
                <li>{namearr[2]}</li>
                <li>{namearr[3]}</li> */}
            </ul>
        </div>
    )
}
export default MobileList;
