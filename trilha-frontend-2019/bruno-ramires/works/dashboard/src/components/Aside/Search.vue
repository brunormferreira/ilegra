<template>
  <section class="c-search">
    <input type="text" class="c-search__input" placeholder="Search...">
    <img
      src="../../assets/imgs/icon-search.png"
      class="c-search__icon-search"
      alt="Search"
      title="Search"
    >
  </section>
</template>

<script>
export default {};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-search {
  display: flex;
  background-color: #38464c;
  border: none;
  padding: 11px;
  border-radius: 6px;
  width: 220px;
  height: 26px;
  margin-left: 17px;
  outline: 0;
}

.c-search__input {
  background-color: #38464c;
  border: none;
  outline: 0;
}

.c-search__icon-search {
  height: 30px;
  margin-right: 10px;
}
</style>
