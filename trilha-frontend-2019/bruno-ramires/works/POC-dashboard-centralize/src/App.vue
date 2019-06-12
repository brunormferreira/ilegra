<template>
  <div id="app">
    <Aside></Aside>
    <Main></Main>
  </div>
</template>

<script>
import Main from "./components/Main";
import Aside from "./components/Aside";

export default {
  name: "app",
  components: {
    Main,
    Aside
  }
};
</script>

<style>
#app {
}
</style>