<template>
  <div class="c-main-principal">
    <HeaderTable></HeaderTable>
    <table class="c-main-principal__table">
      <tr class="c-main-principal__table-line">
        <th class="c-main-principal__table-header">Id</th>
        <th class="c-main-principal__table-header">Name</th>
        <th class="c-main-principal__table-header">E-mail</th>
        <th class="c-main-principal__table-header">Phone</th>
        <th class="c-main-principal__table-header">Created</th>
        <th class="c-main-principal__table-header">Specialist</th>
        <th class="c-main-principal__table-header">Action</th>
      </tr>
      <tr class="c-main-principal__table-line" v-for="user in users" :key="user.id">
        <td class="c-main-principal__table-column">{{ user.id }}</td>
        <td class="c-main-principal__table-column">{{ user.first_name }}</td>
        <td class="c-main-principal__table-column">{{ user.email }}</td>
        <td class="c-main-principal__table-column">teste</td>
        <td class="c-main-principal__table-column">teste</td>
        <td class="c-main-principal__table-column">teste</td>
        <td class="c-main-principal__table-column">teste</td>
      </tr>
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

.c-main-principal__table-header {
  padding: 8px;
  text-align: left;
}

.c-main-principal__table-column {
  border-top: 1px solid #f5f5f7;
  border-bottom: 1px solid #f5f5f7;
  text-align: left;
  padding: 14px;
}

.c-main-principal__table-line:nth-child(even) {
  background-color: #f8f8f9;
}

@media (min-width: 1025px) and (max-width: 1366px) {
  .c-main-principal__table-column {
    padding: 8px;
  }
}
</style>