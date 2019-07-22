let btn = document.querySelector('#btn');
let list = document.querySelector('#list');

btn.addEventListener('click', function() {
  fetch('https://reqres.in/api/users?page=2')
    .then(function(response) {
      return response.json();
    })
    .then(function(response){
      console.log(response.data.forEach(user => {
        let item = document.createElement('li');
        item.classList.add('item');
        
        item.innerHTML = `<img src="${user.avatar}"/><span>${user.first_name}</span>`

        list.appendChild(item);
      }));
    })
})


// Modo resumido de executar a promisse!
// .then(r => r.json())
// .then(r => console.log(r.data))