<template>
  <section class="c-profile">
    <section class="c-profile__content">
      <img src="../assets/imgs/me.jpeg" class="c-profile__image" alt="profile">
      <div class="c-profile__container-text">
        <h3 class="c-profile__text">{{ name }}</h3>
        <div class="c-profile__radius" v-if="status !== 'off'"></div>
        <span class="c-profile__status" v-if="status !== 'off'">Online</span>
      </div>
    </section>
  </section>
</template>

<script>
export default {
  name: "Profile",
  props: ["name", "status"]
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-profile__content {
  display: flex;
  flex-direction: row;
  width: 253px;
  height: 54px;
  padding: 11px;
}

.c-profile__container-text {
  width: 135px;
  height: 51px;
  margin-left: 15px;
}

.c-profile__image {
  width: 55px;
  height: 55px;
  border-radius: 50%;
}

.c-profile__text {
  font-weight: 400;
  font-size: 17px;
  color: #fff;
  margin: 0;
  margin-top: 6px;
}

.c-profile__radius {
  width: 12px;
  height: 12px;
  border-radius: 50%;
  background: green;
  display: inline-block;
  margin-right: 6px;
  margin-top: 7px;
}

.c-profile__status {
  color: #fff;
  font-weight: 400;
  font-size: 15px;
}
</style>
