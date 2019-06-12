<template>
  <div class="total">
    <div class="c-main-principal">
      <Header></Header>
      <Content></Content>
      <Footer></Footer>
    </div>
  </div>
  <!-- Header - Content-principal - Footer -->
</template>

<script>
import Header from "./Header";
import Content from "./Content-principal.vue";
import Footer from "./Footer.vue";

export default {
  components: {
    Header,
    Content,
    Footer
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.total {
  width: 80%;
  height: 100vh;
}

.c-main-principal {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}
</style>
