<template>
  <div id="app">
    <Aside></Aside>
    <Header></Header>
  </div>
</template>

<script>
import Header from "./components/Header.vue";
import Aside from "./components/Aside.vue";

export default {
  name: "app",
  components: {
    Header,
    Aside
  }
};
</script>

<style>
#app {
}
</style>
