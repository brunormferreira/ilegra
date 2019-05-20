const users = [
  {
    name: "Mister M",
    lastMessage: "Vamos começar a mágica?",
    image: "assets/img/me.jpeg",
    time: "20:04"
  },
  {
    name: "Pérola",
    lastMessage: "Meooowww!!!",
    image: "assets/img/cat.jpg",
    time: "17:48"
  },
  {
    name: "Cervejeiro",
    lastMessage: "Teu copo ja está vazio?",
    image: "assets/img/cerva.jpg",
    time: "16:32"
  },
  {
    name: "Flash",
    lastMessage: "Rápido demais?",
    image: "assets/img/flash.jpg",
    time: "16:22"
  },
  {
    name: "Lanterna Verde",
    lastMessage: "Rrsrsrs...",
    image: "assets/img/lvv.jpeg",
    time: "15:59"
  },
  {
    name: "Libélula",
    lastMessage: "Eu sou um super-herói!",
    image: "assets/img/libelola.jpg",
    time: "14:10"
  },
  {
    name: "Hulk",
    lastMessage: "Hulk esmaga!!!!",
    image: "assets/img/hulk.jpg",
    time: "12:10"
  },
  {
    name: "Superman",
    lastMessage: "Vá para longe com essa kryptonita!",
    image: "assets/img/sm.jpg",
    time: "11:38"
  },
  {
    name: "Raphael",
    lastMessage: "Vamos lutar!!!",
    image: "assets/img/raptn.jpg",
    time: "11:00"
  },
  {
    name: "Michelangelo",
    lastMessage: "Eu estou com fome! Hahahaha.",
    image: "assets/img/michetn.jpg",
    time: "09:28"
  },
  {
    name: "Donatello",
    lastMessage: "Fight!!!!",
    image: "assets/img/donattn.jpg",
    time: "07:19"
  },
];

const listUsers = users.map(function(user) {
  return `
  <div class="contact">
    <img src="${user.image}" class="side-panel-img">
    <div class="contact-preview">
        <div class="contact-text">
            <h1 class="font-name">${user.name}</h1>
            <p class="font-preview">${user.lastMessage}</p>
        </div>
    </div>
    <div class="contact-time">
      <p>${user.time}</p>
    </div>
    </div>
  `;
});

document.getElementById("contacts-list").innerHTML = listUsers.join('');

document.getElementById("input-filter").addEventListener("keyup", function(event) {
    const value = event.target.value;

    const filtered = users.filter(user => user.name.toLowerCase().includes(value));

    let listUsersFiltered = '';

    filtered.forEach(function (user){
      listUsersFiltered += `
      <div class="contact">
        <img src="${user.image}" class="side-panel-img">
        <div class="contact-preview">
            <div class="contact-text">
                <h1 class="font-name">${user.name}</h1>
                <p class="font-preview">${user.lastMessage}</p>
            </div>
        </div>
        <div class="contact-time">
          <p>${user.time}</p>
        </div>
        </div>
      `
    })
    document.getElementById('contacts-list').innerHTML = listUsersFiltered;
  });

console.log(listUsers);