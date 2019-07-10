<template>
  <div id="app">
    <h1>SuperTrunfo</h1>
    <Players />
    <Game />
  </div>
</template>

<script>
import Game from './components/Game.vue'
import Players from './components/Players.vue'

export default {
  name: 'app',
  components: {
    Players,
    Game
  },
  data() {
    return {
      name1: '',
      name2: '',
    };
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  text-align: center;
  color: #2c3e50;
  padding: 30px;
}
</style>
