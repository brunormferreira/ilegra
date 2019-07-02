<template>
  <section>
    <div class="conteudo">
      <div class="players">
        <h3>Nome do Jogador 1</h3>
        <input type="text" class="players-input" v-model="name1"/>
      </div>
      <div class="players">
        <h3>Nome do Jogador 2</h3>
        <input type="text" class="players-input" v-model="name2"/>
      </div>
    </div>
    <ButtonStart @click="saveName()" text="Start Game"/>
  </section>
</template>

<script>
import ButtonStart from '@/components/ButtonStart.vue'

export default {
  name: 'Players',
  components: {
    ButtonStart
  },
  data() {
    return {
      name1: '',
      name2: '',
    }
  },
  methods: {
    saveName() {
     console.log(this.name1);
     console.log(this.name2);
     this.$router.push({ path: '/game' });
    },
  },
  mounted() {
    if (localStorage.name) {
      this.name1 = localStorage.name;
      this.name2 = localStorage.name;
    }
  },
  watch: {
    name(newName) {
      localStorage.name = newName; 
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.conteudo {
  display: flex;
  justify-content: space-evenly;
  margin-bottom: 40px;
}
.players {
  display: flex;
  flex-direction: column;
}

.players-input {
  outline: none;
  border: 1px solid #2c3e50;
}
</style>