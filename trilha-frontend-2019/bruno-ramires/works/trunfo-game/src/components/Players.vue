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
    <ButtonStart @click="saveName()" text="Play"/>
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
      playersName: [],
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