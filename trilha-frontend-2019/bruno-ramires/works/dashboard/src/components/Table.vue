<template>
  <div class="c-main-principal">
    <HeaderTable></HeaderTable>
    <table class="c-main-principal__table">
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>E-mail</th>
        <th>Phone</th>
        <th>Created</th>
        <th>Specialist</th>
        <th>Action</th>
      </tr>
      <tr>
        <td>Alfreds Futterkiste</td>
        <td>Maria Anders</td>
        <td>Germany</td>
      </tr>
      <tr>
        <td>Centro comercial Moctezuma</td>
        <td>Francisco Chang</td>
        <td>Mexico</td>
      </tr>
      <tr>
        <td>Ernst Handel</td>
        <td>Roland Mendel</td>
        <td>Austria</td>
      </tr>
      <tr>
        <td>Island Trading</td>
        <td>Helen Bennett</td>
        <td>UK</td>
      </tr>
      <tr>
        <td>Laughing Bacchus Winecellars</td>
        <td>Yoshi Tannamuri</td>
        <td>Canada</td>
      </tr>
      <tr>
        <td>Magazzini Alimentari Riuniti</td>
        <td>Giovanni Rovelli</td>
        <td>Italy</td>
      </tr>
    </table>
  </div>
</template>

<script>
import HeaderTable from "./Header-table.vue";
// import footertable from "./x.vue";

export default {
  components: {
    HeaderTable
    // footertable,
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-main-principal {
  width: 96%;
  height: 62vh;
  margin-left: 24px;
}

.c-main-principal-table {
  border-collapse: collapse;
  width: 100%;
}
th {
  padding: 8px;
  text-align: left;
}
td {
  border-top: 1px solid #dddddd;
  border-bottom: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
</style>
