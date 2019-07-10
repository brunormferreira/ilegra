<template>
  <button class="button-start" @click="emitClick">
    {{ text }}
  </button>
</template>

<script>
export default {
  name: 'buttonStart',
  props: [
    'text'
  ],
  methods: {
    emitClick () {
      this.$emit('click')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.button-start {
  font-weight: bold;
  color: #2c3e50;
  text-decoration: none;
  border: 2px solid #2c3e50;;
  padding: 10px;
  outline: 0;
  cursor: pointer;
}
</style>