import React from 'react'
import './Button.css'

export default props => {
  let classes = 'button '
  classes += props.operation ? 'operation' : ''
  classes += props.double ? 'double' : ''
  classes += props.double ? 'triple' : ''

  return (
    <button 
      onClick={e => props.click && props.click(props.label)}
      className={classes}>
      {props.label}
    </button>
  )
}

// *** OTHER MODE TO DO THE SAME THING WITH CLASSES***
// export default props => {
//   return (
//     <button className={`
//       button
//       ${props.operation ? 'operation' : ''}
//       ${props.double ? 'double' : ''}
//       ${props.triple ? 'triple' : ''}
//     `}>
//       {props.label}
//     </button>
//   )
// }