import React from 'react'
import ReactDOM from 'react-dom'

import Bla, { BoaNoite } from './componentes/Multiplos'

ReactDOM.render(
  <div>
    <Bla.BoaTarde nome="Igor" />
    <BoaNoite nome="Bruno" />
  </div>
, document.getElementById('root'))