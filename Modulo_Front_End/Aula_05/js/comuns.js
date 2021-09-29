// variáveis
// não são tipáveis
// var é uma variável
// camelcase ex: var nomeUsuario

// forma antiga de declara variável
var  nomeUsuario = 'Lucas Kurata';


// forma atual de declarar variáveis
let idade = 50;
//console.log{idade);

let email = 'lucas.kurata@hotmail.com';
//console.log{email);

let dataAtual = '15/09/2021';
//console.log{dataAtual);

let chuva = true;
//console.log{chuva);

// Tipo do variável
//console.log{typeof nomeUsuario);
//console.log{typeof idade);
//console.log{typeof chuva);

// Variável constante
const dataNasc = '23/06/2000';
//console.log{dataNasc);

// Concatenação
// Evitar no JS
//console.log{"Hello world: " + nomeUsuario + '!!!');

// Concatenação
// Melhor jeito -> template string - USAR O APÓSTROFE `TEMPLATE AQUI DENTRO`
//console.log{`Olá ${nomeUsuario}, seu e-mail é: ${email}`)

// Cálculos

let n1 = 2;
let n2 = 5;

//console.log{`${n1} + ${n2} = ${n1 + n2}`);
//console.log{`${n1} - ${n2} = ${n1 - n2}`);
//console.log{`${n1} / ${n2} = ${n1 / n2}`);
//console.log{`${n1} * ${n2} = ${n1 * n2}`);
//console.log{`${n1} ** ${n2} = ${n1 ** n2}`);

let n3 = "2";
//console.log{typeof n3);
// "==" compara igualdade ignorando o tipo.
//console.log{`${n1} == ${n3} = ${n1 == n3}`);
// "==" compara igualdade verificando o tipo.
//console.log{`${n1} === ${n3} = ${n1 === n3}`);

// if - else - while - for - switch
// String - math - date - array

// Array
const pessoas = ['Eu', 'Tu', 'Ele', 'Nós', 'Vós', 'Eles'];
//console.log{pessoas);

// Arrays - juntando tipos de dados diferentes
const aleatorio = ['Lucas Kurata', 23, 23.1, true, 'teste'];
//console.log{aleatorio);

// funções
function mensagem(){
    alert('Alerta criado por uma função');
}


// Pegar os botões do comuns.html e atribuir eventos a eles
// Atribuindo evento de clique
document.querySelector('#btn-1').addEventListener('click', mensagem);
// Atribuindo evento de double click
document.querySelector('#btn-2').addEventListener('dblclick', mensagem);
// Atribuindo evento de Mouse Over - passa o mouse apresenta mensagem
document.querySelector('#btn-3').addEventListener('mouseover', mensagem);
// Atribuindo evento de Mouse Out - passa o mouse e tira o mouse, apresenta mensagem
document.querySelector('#btn-4').addEventListener('mouseout', mensagem);




