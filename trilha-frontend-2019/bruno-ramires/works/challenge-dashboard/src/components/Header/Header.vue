<template>
  <header class="c-header">
    <img class="c-header__hamburger-menu" src="../../assets/imgs/hamburger_menu.png" alt="menu">
    <div class="c-header__content">
      <img class="c-header__profile-image" src="../../assets/imgs/me.jpeg" alt="profile">
      <span>Bruno Ramires</span>
    </div>
  </header>
</template>

<script>
export default {};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-header {
  background-color: #3c8cbd;
  width: 80%;
  height: 60px;
  margin: 0;
  padding: 0;
  float: right;
}

.c-header__hamburger-menu {
  width: 45px;
  height: 45px;
  padding: 6px;
  cursor: pointer;
}

.c-header__content {
  display: flex;
  align-content: center;
  align-items: center;
  height: 60px;
  width: 160px;
  float: right;
}

.c-header__profile-image {
  width: 45px;
  height: 45px;
  border-radius: 50%;
}

span {
  margin-left: 5px;
  color: white;
}

h1 {
  margin: 0;
  padding: 0;
}

@media (min-width: 1025px) and (max-width: 1366px) {
  .c-header__hamburger-menu {
    margin-left: 16px;
  }
}
</style>
