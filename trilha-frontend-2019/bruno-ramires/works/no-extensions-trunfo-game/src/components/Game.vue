<template>
  <h1>{{ name1 }} - Versus - {{ name2 }}</h1>
</template>

<script>
import Bus from '../bus';
import Players from './Players';

export default {
  components: {
    Players,
  },
  data () {
    return {
      name1: '',
      name2: '',
    }
  },
  mounted() {
    Bus.$on('input', (value) => this.name1 = value);
    Bus.$on('tst', (value2) => this.name2 = value2);
  }
};

</script>

<style scoped>
</style>