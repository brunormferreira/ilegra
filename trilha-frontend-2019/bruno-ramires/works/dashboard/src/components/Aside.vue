<template>
  <aside>
    <div class="content">
      <span class="content-text">AdminPanelTutorial</span>
    </div>
    <section>
      <div class="profile">
        <img src="../assets/imgs/me.jpeg" class="profile-image" alt="profile">
      </div>
    </section>
  </aside>
</template>

<script>
export default {};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
aside {
  background: #ff0;
  width: 273px;
  height: 100%;
  position: absolute;
}

.content {
  position: relative;
  width: 273px;
  height: 60px;
  background: #ffaabb;
}

.content-text {
  font-weight: bold;
  width: 150px;
  height: 35px;
  display: flex;
  align-items: center;
  margin-left: 38px;
  margin-top: 0px;
  font-size: 1.2rem;
  padding: 10px;
}

.profile {
  display: flex;
  width: 273px;
  height: 82px;
  padding: 11px;
}

.profile-image {
  width: 55px;
  height: 55px;
  border-radius: 50%;
}
</style>
