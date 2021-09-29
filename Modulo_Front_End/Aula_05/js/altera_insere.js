// pegar o botão para aplicar a ação
document.querySelector("#alterarConteudo").addEventListener('click', () => {

    // pegar o elemento da página que terá seu conteúdo alterado
    const novoConteudo = document.querySelector('#conteudo');
    //console.log(novoConteudo);

    // Pegar o campo do formulário que terá a nova informação
    const novaInformacao = document.querySelector("#dados").value;
    // console.log(novaInformacao)

    // Inserir na DIV o novo conteúdo
    novoConteudo.textContent = novaInformacao;

})

// Botão inserir dados
// recuperar o botão
document.querySelector("#insereConteudo").addEventListener('click', () =>{

    // Recuperar o valor digitado
    const input = document.querySelector("#novosDados").value;
    //console.log(input);

    // Recuperar a DIV que receberá o input e a nova TAG
    const nova = document.querySelector("#novaTag");
    //console.log(nova);

    // criar uma TAG HTML na div recuperada
    const novaH2 = document.createElement('h2');

    // Atribuir o valor digitado/recuperado para o h2
    novaH2.textContent = input;

    // Adicionar na DIV o novo elemento h2 com o seu conteúdo
    nova.appendChild(novaH2);

})