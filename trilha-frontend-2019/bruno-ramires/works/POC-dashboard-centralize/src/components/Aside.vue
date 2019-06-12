<template>
  <aside class="c-aside">
    <div class="c-aside__content">
      <h1 class="c-aside__brand">AdminPanel</h1>
    </div>
    <Profile name="Bruno Ramires" :status="status"></Profile>
    <Search></Search>
    <Nav></Nav>
  </aside>
</template>

<script>
import Profile from "./Profile.vue";
import Search from "./Search.vue";
import Nav from "./Nav.vue";

export default {
  components: {
    Profile,
    Search,
    Nav
  },
  data() {
    return {
      status: "off"
    };
  },
  created() {
    setTimeout(() => {
      this.status = "on";
    }, 3000);
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-aside {
  background: #222b30;
  width: 275px;
  height: 100%;
  position: absolute;
}

.c-aside__content {
  position: relative;
  width: 275px;
  height: 60px;
  background: #357eab;
}

.c-aside__brand {
  position: absolute;
  margin: 0;
  padding: 11px;
  margin-left: 34px;
}
</style>
