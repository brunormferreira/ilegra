<template>
  <main class="c-main">
    <Title></Title>
  </main>
</template>

<script>
import Title from "./Title-table.vue";

export default {
  components: {
    Title
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-main {
  background: #ebeef1;
  display: flex;
  width: 80%;
  height: 92vh;
  margin-left: 275px;
}
</style>
