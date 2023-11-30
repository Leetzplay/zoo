import React, {useState } from "react";

function CadastroUsuarios() {  
    const[formData, setFormData] = useState({
        nome: '',
        username: '',
        password: '',
    });
    const cadastrarUsuario = async () => {
            try {
                const response = await fetch('http://localhost:3001/cadastrarUsuario', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json',
                    },
                    body: JSON.stringify(formData),
                });
                if (response.ok) {
                    alert('Dados cadastrados com sucesso!!');
                    setFormData({
                        nome: '',
                        username: '',
                        password: '',
                    });
                } else {
                    alert('Erro ao cadastrar usuário');
                }
            } catch (error) {
                console.error('Erro ao cadastrar usuário:', error);
            }
        };
    return (
        <div>
            <div>
                <label>Nome: </label>
                <input 
                    type="text" 
                    id="component" 
                    value = {formData.nome}
                    onChange={(e) =>
                        setFormData((prevState) => ({
                            ...prevState,
                            nome: e.target.value,
                        }))
                    }
                />
            </div>
            <div>
                <label>Username: </label>
                <input 
                    type="text"
                    id="component" 
                    value = {formData.username}
                    onChange={(e) =>
                        setFormData((prevState) => ({
                            ...prevState,
                            username: e.target.value,
                        }))
                    }
                />
            </div>
            <div>
                <label>Password: </label>
                <input
                    type="text"
                    id="component"
                    value = {formData.password}
                    onChange={(e) =>
                        setFormData((prevState) => ({
                            ...prevState,
                            password: e.target.value,
                        }))
                    }
                />
            </div>
            <div>
                <button onClick={cadastrarUsuario}>Cadastrar</button>
            </div>
        </div> 
    );

}  

export default CadastroUsuarios;