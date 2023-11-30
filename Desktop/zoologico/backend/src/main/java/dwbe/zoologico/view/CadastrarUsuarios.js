import React, { useState } from 'react';
import UsuarioService from '../services/UsuarioService';

const CadastrarUsuarios = () => {
  const [nome, setNome] = useState('');
  const [username, setUsername] = useState('');
  const [senha, setSenha] = useState('');

  const cadastrarUsuario = async () => {
    try {
      const usuario = {
        nome: nome,
        username: username,
        senha: senha,
      };

      await UsuarioService.gravarServiceUsuario(usuario);
      console.log('Usuário cadastrado com sucesso!');
    } catch (error) {
      console.error('Erro ao cadastrar usuário:', error);
    }
  };

  return (
    <div>
      <h1>Cadastrar Usuário</h1>
      <label>
        Nome:
        <input type="text" value={nome} onChange={(e) => setNome(e.target.value)} />
      </label>
      <br />
      <label>
        Username:
        <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />
      </label>
      <br />
      <label>
        Senha:
        <input type="password" value={senha} onChange={(e) => setSenha(e.target.value)} />
      </label>
      <br />
      <button onClick={cadastrarUsuario}>Cadastrar</button>
    </div>
  );
};

export default CadastrarUsuarios;
