<template>
  <div id="app">
    <Aside></Aside>
    <Header></Header>
    <Main></Main>
  </div>
</template>

<script>
import Header from "./components/Header/Header.vue";
import Aside from "./components/Aside/Aside.vue";
import Main from "./components/Main/Main.vue";

export default {
  name: "app",
  components: {
    Header,
    Aside,
    Main
  }
};
</script>

<style>
#app {
}
</style>
