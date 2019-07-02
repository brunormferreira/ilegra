<template>
  <div id="app">
    <div id="game-start">
     <router-view/>
    </div>
  </div>
</template>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#game-start {
  padding: 30px;
}
#game-start a {
  font-weight: bold;
  color: #2c3e50;
  text-decoration: none;
  border: 2px solid #2c3e50;;
  padding: 10px;
}
</style>