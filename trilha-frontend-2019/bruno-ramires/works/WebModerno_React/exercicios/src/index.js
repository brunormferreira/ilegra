import React from 'react'
import ReactDOM from 'react-dom'

import Pai from './componentes/Pai'

ReactDOM.render(
  <div>
    <Pai nome="Paulo" sobrenome="Silva">
      {/* Como passo os componentes Filhos aqui? */}
    </Pai>
  </div>
, document.getElementById('root'))