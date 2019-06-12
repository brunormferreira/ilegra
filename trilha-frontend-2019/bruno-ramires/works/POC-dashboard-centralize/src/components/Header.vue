<template>
  <header>
    <img class="hamburger-menu" src="../assets/imgs/hamburger_menu.png" alt="menu">
    <div class="content">
      <img class="profile-image" src="../assets/imgs/me.jpeg" alt="profile">
      <span>Bruno Ramires</span>
    </div>
  </header>
</template>

<script>
export default {};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
header {
  background-color: #3c8cbd;
  /* width: 80%; */
  height: 60px;
  margin: 0;
  padding: 0;
  float: right;
}

img.hamburger-menu {
  width: 45px;
  height: 45px;
  padding: 6px;
  cursor: pointer;
}

.content {
  display: flex;
  align-content: center;
  align-items: center;
  height: 60px;
  width: 160px;
  float: right;
}

.profile-image {
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
</style>
