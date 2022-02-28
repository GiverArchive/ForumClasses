## Diagrama de Classes
Fórum da discinplina Análise Orientada a Objetos

---

### Encapsulamento

Neste relacionamento, os atributos são mantidos privados, assim, apenas membros da classe estão aptos a modificar. O encapsulamento fornece segurança dos dados, permitindo que apenas os métodos específicos tenham acesso aos atributos externamente.

- Exemplo: Uma conta bancária só pode ter seu saldo modificado por métodos de movimentação financeira.  
- [Exemplo em Código](https://github.com/GiverPlay007/ForumClasses/tree/main/Encapsulamento)

---

### Herança

Neste relacionamento, uma classe pode herdar características e comportamentos de outras classes, personalizando comportamentos ou implementando novos.

- Exemplo: Um Gerente pode extender a classe Funcionario e implementar o seu próprio método de calcular o salário, com base em comissões ou qualquer outra maneira.   
- [Exemplo em Código](https://github.com/GiverPlay007/ForumClasses/tree/main/Heranca)

---

### Agregação

Neste relacionamento, uma classe pode usar de outras classes para o seu funcionamento, não precisa necessariamente de ter suas instâncias de inicio, mas pode manipular estes objetos conforme necessário.  

- Exemplo: Uma Partida possui Jogadores, mas não sabe quais são eles, afinal, uma partida é dinâmica, podem entrar e sair jogadores a todo momento.  
- [Exemplo em Código](https://github.com/GiverPlay007/ForumClasses/tree/main/Agregacao)

---

### Composição

Neste relacionamento, uma classe pode ser composta por diversas outras classes, que são componentes fundamentais para o funcionamento, e quando a classe é destruída, os componentes também são.

- Exemplo: Uma pessoa pode ter um objeto de ContaBancaria, que deixa de ser útil quando não se tem uma pessoa para ser dona.  
- [Exemplo em Código](https://github.com/GiverPlay007/ForumClasses/tree/main/Composicao)
