<template>
  <footer class="c-footer-table">
    <span class="c-footer-table__text">Showing 1 to 7 of 7 entries</span>
    <div class="c-footer-table__pagination">
      <button class="c-footer-table__pagination-button">Previous</button>
      <button class="c-footer-table__pagination-button-selected">1</button>
      <button class="c-footer-table__pagination-button">Next</button>
    </div>
  </footer>
</template>

<script>
// import footertable from "./x.vue";

export default {
  components: {}
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-footer-table {
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 54px;
  margin: 4px;
}

.c-footer-table__text {
  font-weight: 400;
}

.c-footer-table__pagination {
  display: flex;
  flex-direction: row;
  width: 147px;
  height: 34px;
}

.c-footer-table__pagination-button-selected {
  background: #3580ae;
  color: #ffff;
  cursor: pointer;
  border: none;
  outline: 0;
  border: 4px solid #3580ae;
}
.c-footer-table__pagination-button {
  background: #fcfcfc;
  color: #a9a9a9;
  cursor: pointer;
  outline: 0;
  font-size: 15px;
  border: 1px solid #a9a9a9;
  border-radius: 2px;
}
</style>
