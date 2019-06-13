<template>
  <header class="c-header-table">
    <h3 class="c-header-table__text-title">Data Table with full features</h3>
    <span class="c-header-table__text">Show</span>
    <input type="text" class="c-header-table__input" placeholder="10">
    <span>entries</span>
    <div class="c-header-table__container-input-search">
      <span>Search:</span>
      <input type="text" class="c-header-table__input-search" placeholder>
    </div>
  </header>
</template>

<script>
export default {
  components: {}
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-header-table {
  height: 83px;
  background: #fcfcfc;
}

.c-header-table__text-title {
  font-weight: 400;
  padding: 11px;
  margin: 0;
}

.c-header-table__text {
  margin-left: 12px;
}
.c-header-table__input {
  outline: 0;
  border-radius: 4px;
  border: solid 1px #a1afa9;
  width: 57px;
  margin: 4px;
}

.c-header-table__container-input-search {
  float: right;
}

.c-header-table__input-search {
  outline: 0;
  border-radius: 2px;
  border: solid 1px #a1afa9;
  width: 120px;
  height: 26px;
  margin-left: 4px;
  margin-right: 10px;
}
</style>
