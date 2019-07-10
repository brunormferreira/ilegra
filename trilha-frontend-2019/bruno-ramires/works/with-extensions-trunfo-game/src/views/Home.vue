<template>
  <div>
    <h1>SuperTrunfo</h1>
    <Players/>
  </div>
</template>

<script>
// @ is an alias to /src
import Players from '@/components/Players.vue'

export default {
  name: 'home',
  components: {
    Players,
  }
}
</script>