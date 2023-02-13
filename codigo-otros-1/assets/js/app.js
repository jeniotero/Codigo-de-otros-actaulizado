

const $n = document.querySelector('name');
const $b = document.querySelector('#blog');
const $l = document.querySelector('.location');

// agregue async para que pueda funcionar como asincrona
async function displayUser(username) { 
  $n.textContent = 'cargando...';
  fetch (baseEndpoint)

  //reacomode las variables, intente asignar response a .then
  
  const baseEndpoint = 'https://api.github.com';
  const usersEndpoint = `${baseEndpoint}/users`;
  const response = await fetch(`${usersEndpoint}/${username}`);
  console.log(data);
  response.then
  $n.textContent = '${data.name}';
  $b.textContent = '${data.blog}';
  $l.textContent = '${data.location}';
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`
}

console.log (displayUser('stolinski').catch(handleError));