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
      <tr v-for="user in users" :key="user.id">
        <td>{{ user.id }}</td>
        <td>{{ user.first_name }}</td>
        <td>{{ user.email }}</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
      </tr>
      <!-- <tr>
        <td>2</td>
        <td>Francisco Chang</td>
        <td>Mexico</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
      </tr>
      <tr>
        <td>3</td>
        <td>Roland Mendel</td>
        <td>Austria</td>
        <td>Mexico</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
      </tr>
      <tr>
        <td>4</td>
        <td>Helen Bennett</td>
        <td>UK</td>
        <td>Mexico</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
      </tr>
      <tr>
        <td>5</td>
        <td>Yoshi Tannamuri</td>
        <td>Canada</td>
        <td>Mexico</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
      </tr>
      <tr>
        <td>6</td>
        <td>Giovanni Rovelli</td>
        <td>Italy</td>
        <td>Mexico</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
      </tr>
      <tr>
        <td>7</td>
        <td>Giovanni Rovelli</td>
        <td>Italy</td>
        <td>Mexico</td>
        <td>teste</td>
        <td>teste</td>
        <td>teste</td>
      </tr>-->
    </table>
    <FooterTable></FooterTable>
  </div>
</template>

<script>
import HeaderTable from "../Table/Header-table.vue";
import FooterTable from "../Table/Footer-table.vue";

import UsersService from "@/services/users";

export default {
  components: {
    HeaderTable,
    FooterTable
  },
  created() {
    UsersService.getUsers().then(users => {
      this.users = users.data.data;
    });
  },
  data() {
    return { users: [] };
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.c-main-principal {
  width: 96%;
  height: 66vh;
  margin-left: 14px;
  background: #fcfcfc;
  border-top: 2px solid #c3c8cb;
  padding: 7px;
}

.c-main-principal__table {
  border-collapse: collapse;
  width: 100%;
}
th {
  padding: 8px;
  text-align: left;
}
td {
  border-top: 1px solid #f5f5f7;
  border-bottom: 1px solid #f5f5f7;
  text-align: left;
  padding: 14px;
}

tr:nth-child(even) {
  background-color: #f8f8f9;
}
</style>
