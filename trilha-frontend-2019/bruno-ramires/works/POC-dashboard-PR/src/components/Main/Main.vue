<template>
  <main class="c-main">
    <Title></Title>
    <Table></Table>
    <Footer></Footer>
  </main>
</template>

<script>
import Title from "../Main/Title-main";
import Table from "../Table/Table.vue";
import Footer from "../Main/Footer-main.vue";

export default {
  components: {
    Title,
    Table,
    Footer
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
  border-bottom: 2px solid #ebeef1;
}
@media (min-width: 1025px) and (max-width: 1400px) {
  .c-main {
    width: 79%;
    height: 90vh;
  }
}
</style>
