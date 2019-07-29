import React from 'react'

export function childrenWithProps(props) {
  return React.Children.map(props.children, child => {
    return React.cloneElement(child, {
      ...props, ...child.props
    })
  })
}

// Pega todos parâmetros do Pai e do Filho, cria um elemento clone
// lhe dando a possibilidade de usar os parâmetros que veio do pai
// e ir propagando estes parâmetros de Pai para Filho com essa
// função.