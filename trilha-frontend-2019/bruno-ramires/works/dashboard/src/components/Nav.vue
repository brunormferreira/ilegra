<template>
  <nav class="c-header">
    <div class="c-header__container">
      <span class="c-header__text">Header</span>
    </div>
    <ul class="c-header__list">
      <a href="#" class="c-header__link">
        <li class="c-header__item">
          <img class="c-header__item-image" src="../assets/imgs/peoples.png">
          <span class="c-header__item-text">Home</span>
        </li>
      </a>
      <a href="#" class="c-header__link">
        <li class="c-header__item">
          <img class="c-header__item-image" src="../assets/imgs/peoples.png">
          <span class="c-header__item-text">Doctors</span>
        </li>
      </a>
      <a href="#" class="c-header__link">
        <li class="c-header__item">
          <img class="c-header__item-image" src="../assets/imgs/peoples.png">
          <span class="c-header__item-text">Nurses</span>
        </li>
      </a>
      <a href="#" class="c-header__link">
        <li class="c-header__item">
          <img class="c-header__item-image" src="../assets/imgs/peoples.png">
          <span class="c-header__item-text">Patients</span>
        </li>
      </a>
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

.c-header__link {
  text-decoration: none;
  color: white;
}

.c-header__item {
  display: flex;
  align-items: center;
  height: 54px;
  padding: 14px;
}

.c-header__item:hover {
  background: #1a2527;
  border-left: solid 2px #468fba;
}

.c-header__item-image {
  width: 25px;
  height: 25px;
  opacity: 1.5;
}

.c-header__item-text {
  margin: 0;
  padding: 0;
  margin-left: 4px;
  margin-top: 3px;
}
</style>
