const users = [
  {
    name: "Mister M",
    lastMessage: "Vamos começar a mágica?",
    image: "assets/img/me.jpeg",
    time: "20:04"
  },
  {
    name: "Mister X",
    lastMessage: "Vamos começar a mágica?",
    image: "assets/img/me.jpeg",
    time: "20:04"
  }
];

const listUsers = users.map(function(user) {
  return `
  <div class="contact">
    <img src="assets/img/donattn.jpg" class="side-panel-img">
    <div class="contact-preview">
        <div class="contact-text">
            <h1 class="font-name">Donatello</h1>
            <p class="font-preview">Fight!!!!</p>
        </div>
    </div>
    <div class="contact-time">
        <p>07:19</p>
    </div>
    </div>
  `;
});

listUsers.addEventListener;

console.log(listUsers);
