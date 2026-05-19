const clientes = [];

function mostrarCadastro() {
    esconderTelas();
    document.getElementById("cadastro").classList.remove("escondido");
}

function mostrarLista() {
    esconderTelas();
    document.getElementById("lista").classList.remove("escondido");
    atualizarCards();
}

function voltarMenu() {
    esconderTelas();
    document.getElementById("menu").classList.remove("escondido");
}

function esconderTelas() {
    document.getElementById("menu").classList.add("escondido");
    document.getElementById("cadastro").classList.add("escondido");
    document.getElementById("lista").classList.add("escondido");
}

function buscarLogradouro() {
    const cep = document.getElementById('cep');
    const cepValor = cep.value.replace(/\D/g, '');

    if (cepValor.length !== 8) {
        alert("CEP inválido. Digite 8 números.");
        return;
    }

    fetch(`https://viacep.com.br/ws/${cepValor}/json/`)
        .then(dados => dados.json())
        .then(resposta => {
            if (resposta.erro) {
                alert("CEP não encontrado.");
                return;
            }
            document.getElementById('rua').value = resposta.logradouro || '';
            document.getElementById('bairro').value = resposta.bairro || '';
            document.getElementById('cidade').value = resposta.localidade || '';
            document.getElementById('estado').value = resposta.uf || '';
            document.getElementById('numero').focus();
        })
        .catch(() => alert("Erro ao buscar o CEP. Verifique sua conexão."));
}

// Permitir busca ao pressionar Enter no campo CEP
document.addEventListener("DOMContentLoaded", () => {
    document.getElementById('cep').addEventListener('keydown', function (e) {
        if (e.key === 'Enter') buscarLogradouro();
    });
});

function cadastrarCliente() {
    const nome = document.getElementById("nome").value.trim();
    const email = document.getElementById("email").value.trim();
    const telefone = document.getElementById("telefone").value.trim();
    const cep = document.getElementById("cep").value.trim();
    const rua = document.getElementById("rua").value.trim();
    const numero = document.getElementById("numero").value.trim();
    const bairro = document.getElementById("bairro").value.trim();
    const cidade = document.getElementById("cidade").value.trim();
    const estado = document.getElementById("estado").value.trim();
    const mensagem = document.getElementById("mensagem");

    if (!nome || !email || !telefone || !cep || !rua || !numero || !bairro || !cidade || !estado) {
        mensagem.textContent = "Preencha todos os campos!";
        mensagem.className = "mensagem-erro";
        return;
    }

    clientes.push({ nome, email, telefone, cep, rua, numero, bairro, cidade, estado });

    mensagem.textContent = "Cliente cadastrado com sucesso!";
    mensagem.className = "mensagem-sucesso";

    document.getElementById("nome").value = "";
    document.getElementById("email").value = "";
    document.getElementById("telefone").value = "";
    document.getElementById("cep").value = "";
    document.getElementById("rua").value = "";
    document.getElementById("numero").value = "";
    document.getElementById("bairro").value = "";
    document.getElementById("cidade").value = "";
    document.getElementById("estado").value = "";
}

function excluirCliente(index) {
    clientes.splice(index, 1);
    atualizarCards();
}

function toggleDetalhes(index) {
    const detalhes = document.getElementById(`detalhes${index}`);
    const btn = document.getElementById(`btnDetalhes${index}`);
    if (detalhes.classList.contains("escondido")) {
        detalhes.classList.remove("escondido");
        btn.textContent = "Ocultar detalhes";
    } else {
        detalhes.classList.add("escondido");
        btn.textContent = "Exibir detalhes";
    }
}

function salvarEdicao(index) {
    const novoNome = document.getElementById(`editNome${index}`).value;
    const novoEmail = document.getElementById(`editEmail${index}`).value;
    const novoTelefone = document.getElementById(`editTelefone${index}`).value;
    const novoCep = document.getElementById(`editCep${index}`).value;
    const novaRua = document.getElementById(`editRua${index}`).value;
    const novoNumero = document.getElementById(`editNumero${index}`).value;
    const novoBairro = document.getElementById(`editBairro${index}`).value;
    const novaCidade = document.getElementById(`editCidade${index}`).value;
    const novoEstado = document.getElementById(`editEstado${index}`).value;

    clientes[index] = {
        nome: novoNome, email: novoEmail, telefone: novoTelefone,
        cep: novoCep, rua: novaRua, numero: novoNumero,
        bairro: novoBairro, cidade: novaCidade, estado: novoEstado
    };
    atualizarCards();
}

function editarCliente(index) {
    const areaEdicao = document.getElementById(`edicao${index}`);
    if (areaEdicao.classList.contains("escondido")) {
        areaEdicao.classList.remove("escondido");
    } else {
        areaEdicao.classList.add("escondido");
    }
}

function atualizarCards() {
    const lista = document.getElementById("listaCards");
    lista.innerHTML = "";

    if (clientes.length === 0) {
        lista.innerHTML = "<p>Nenhum cliente cadastrado.</p>";
        return;
    }

    clientes.forEach((cliente, index) => {
        lista.innerHTML += `
            <div class="card-cliente">
                <strong>${cliente.nome}</strong>

                <div id="detalhes${index}" class="escondido detalhes-cliente">
                    <p><span class="label">E-mail:</span> ${cliente.email}</p>
                    <p><span class="label">Telefone:</span> ${cliente.telefone}</p>
                    <p><span class="label">Endereço:</span> ${cliente.rua}, ${cliente.numero}</p>
                    <p><span class="label">Bairro:</span> ${cliente.bairro}</p>
                    <p><span class="label">Cidade/UF:</span> ${cliente.cidade} - ${cliente.estado}</p>
                    <p><span class="label">CEP:</span> ${cliente.cep}</p>
                </div>

                <div class="card-acoes">
                    <button id="btnDetalhes${index}" class="btn-detalhes" onclick="toggleDetalhes(${index})">Exibir detalhes</button>
                    <button class="btn-editar" onclick="editarCliente(${index})">Editar</button>
                    <button class="btn-excluir" onclick="excluirCliente(${index})">Excluir</button>
                </div>

                <div id="edicao${index}" class="escondido area-edicao">
                    <input type="text" id="editNome${index}" value="${cliente.nome}" placeholder="Nome">
                    <input type="email" id="editEmail${index}" value="${cliente.email}" placeholder="E-mail">
                    <input type="text" id="editTelefone${index}" value="${cliente.telefone}" placeholder="Telefone">
                    <input type="text" id="editCep${index}" value="${cliente.cep}" placeholder="CEP">
                    <input type="text" id="editRua${index}" value="${cliente.rua}" placeholder="Rua">
                    <input type="text" id="editNumero${index}" value="${cliente.numero}" placeholder="Número">
                    <input type="text" id="editBairro${index}" value="${cliente.bairro}" placeholder="Bairro">
                    <input type="text" id="editCidade${index}" value="${cliente.cidade}" placeholder="Cidade">
                    <input type="text" id="editEstado${index}" value="${cliente.estado}" placeholder="UF">
                    <button class="btn-salvar" onclick="salvarEdicao(${index})">Salvar</button>
                </div>
            </div>
        `;
    });
}
