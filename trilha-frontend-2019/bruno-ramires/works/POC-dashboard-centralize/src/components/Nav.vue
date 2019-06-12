<template>
  <nav class="c-header">
    <div class="c-header__container">
      <span class="c-header__text">Header</span>
    </div>
    <ul class="c-header__list">
      <li class="c-header__item">
        <img class="c-header__item-image" src="../assets/imgs/peoples.png">
        Home
      </li>
      <li class="c-header__item">Doctors</li>
      <li class="c-header__item">Nurses</li>
      <li class="c-header__item">Patients</li>
    </ul>
  </nav>
</template>

<script>
export default {};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-header__container {
  display: flex;
  align-items: center;
  background: #1a2527;
  width: 275px;
  height: 54px;
  margin-top: 12px;
}

.c-header__text {
  color: #303d40;
  margin-left: 19px;
}

.c-header__list {
  margin: 0;
  padding: 0;
  list-style: none;
  color: #fff;
}

.c-header__item {
  width: 235px;
  height: 54px;
}

.c-header__item-image {
  width: 25px;
  height: 25px;
  opacity: 0.3;
}
</style>
