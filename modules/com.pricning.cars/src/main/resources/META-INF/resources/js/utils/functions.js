export function preventDefaultHOF(eventHandler){
  return (event)=>{
    event.preventDefault()
    eventHandler(event)
  }		
}
