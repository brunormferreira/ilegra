<template>
  <section class="c-main__container-info">
    <h2 class="c-main__text">Data Tables</h2>
    <span class="c-main__subtext">advanced tables</span>
    <section class="c-main__container-navigation">
      <span class="c-main__text-navigation">Home</span>
      <img src="../../assets/imgs/arrow1.png" class="c-main__image-arrow" alt="Arrow" title="Arrow">
      <span class="c-main__text-navigation">Tables</span>
      <img src="../../assets/imgs/arrow1.png" class="c-main__image-arrow" alt="Arrow" title="Arrow">
      <span class="c-main__text-navigation">Data tables</span>
    </section>
  </section>
</template>

<script>
export default {};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-main__container-info {
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 54px;
  padding: 21px;
}

.c-main__text {
  margin: 0;
  padding: 0;
  color: #38464c;
  font-weight: 400;
}

.c-main__subtext {
  flex: 1;
  margin: 0;
  padding: 0;
  margin-top: 6px;
  margin-left: 9px;
}

.c-main__container-navigation {
  width: 222px;
  height: 30px;
  display: flex;
  align-items: center;
}

.c-main__image-arrow {
  width: 25px;
  height: 25px;
}

.c-main__text-navigation {
  cursor: pointer;
  color: #38464c;
}

@media (min-width: 1025px) and (max-width: 1400px) {
  .c-main__container-info {
    height: 39px;
    margin-left: 14px;
    padding: 0;
  }
}
</style>
