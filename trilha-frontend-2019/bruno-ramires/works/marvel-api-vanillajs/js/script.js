const privateKey = "2ee0807f80c971d782a4eaa79bfff312800dd431",
  publicKey  = "468a011b902c2aa0cd7230939e5000d4",
  content    = document.getElementById('content');

const getConnection = () => {
  const ts = Date.now(),
    hash = MD5(ts + privateKey + publicKey);
    URL = `http://gateway.marvel.com/v1/public/characters?ts=${ts}&apikey=${publicKey}&hash=${hash}`
    fetch(URL)
      .then(response => response.json())
      .then(response => {
        console.log(response);
        response.data.results.forEach(e => {
          drawHero(e);
        });
      });
}

const drawHero = e => {
  const image = `${e.thumbnail.path}/portrait_uncanny.${e.thumbnail.extension}`;
  const hero = `
  <div>
    <h3>${e.name}</h3>
    <img src="${image}">
    <p>${e.description}</p>
  </div>
  `;
  content.insertAdjacentHTML('beforeEnd', hero);
};

getConnection();