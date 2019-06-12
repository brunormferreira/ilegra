<template>
  <div class="c-main-principal-table">
    <HeaderTable></HeaderTable>
  </div>
</template>

<script>
import HeaderTable from "./Header-table.vue";
// import footertable from "./x.vue";

export default {
  components: {
    HeaderTable
    // footertable,
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-main-principal-table {
  width: 200px;
  height: 150px;
}
</style>
