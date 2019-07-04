<template>
  <section>
    <div class="conteudo">
      <div class="players">
        <h3>Nome do Jogador 1</h3>
        <input type="text" v-model="name1" @input="saveName1()"/>
      </div>
      <div class="players">
        <h3>Nome do Jogador 2</h3>
        <input type="text" v-model="name2" @input="saveName2()"/>
      </div>
    </div>
    <ButtonStart @click="saveName()" text="Start Game"/>
  </section>
</template>

<script>
import Bus from '../bus';
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
    saveName1() {
      Bus.$emit('input', this.name1);
      // Bus.$emit('input', this.name2);
    },
    saveName2() {
      Bus.$emit('tst', this.name2);
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