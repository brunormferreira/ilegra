<template>
  <main class="c-main">
    <Title></Title>
    <Table></Table>
  </main>
</template>

<script>
import Title from "./Title-table.vue";
import Table from "./Table.vue";
// criar footerMain para o template main;

export default {
  components: {
    Title,
    Table
    // footerMain
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-main {
  background: #ebeef1;
  display: flex;
  flex-direction: column;
  width: 80%;
  height: 92vh;
  margin-left: 275px;
}
</style>
