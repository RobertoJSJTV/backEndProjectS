document.getElementById('loginForm').addEventListener('submit', async function (e) {
    e.preventDefault();

const email = document.getElementById('email').value;
const senha = document.getElementById('senhas').value;

const response = await fetch('jdbc:mysql://localhost:8080/login',{
    method: 'POST',
    headers: {'Content-Type': 'application/json'},
    body: JSON.stringify({ email, senha })
});

const result = await response.json();

if(result.sucess) {
    document.getElementById('message').textContent = 'Login Realizaado com sucesso!';
    window.location.href = "painel.html";
    console.log('foi');
} else {
    document.getElementById('message').textContent = 'Usuário ou senha inválidos.';
    console.log('não foi');
}


});