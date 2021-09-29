// O que podemos fazer com o DOM
// Manipular o HTML 
// Entende o HTML como uma grande árvore de nós
// Alterar - Excluir - Inserir

// Forma Nova
const personagens = document.querySelector("#personagensDados");
console.log(personagens);

// Forma antiga
const personagens2 = document.getElementById("personagensDados");
console.log(personagens2);


// Forma nova
// Classe - retornará apenas o primeiro que ele encontrar
const nomePersonagens1 = document.querySelectorAll('.nome-personagem');
console.log(nomePersonagens1);

// Forma antiga
const nomePersonagens2 = document.getElementsByClassName('nome-personagem');
console.log(nomePersonagens2);

// Pegando uma tag
const todasTds = document.querySelectorAll("td");
console.log(todasTds);

// Pegando tr
const todasTrs = document.querySelectorAll("tr");
console.log(todasTrs);
