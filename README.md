📦 Sistema de Estoque em Java

Sistema de estoque desenvolvido em Java, executado via console, com foco no estudo e aplicação prática dos conceitos de Programação Orientada a Objetos (POO) e modelagem de regras de negócio.
O projeto simula operações básicas de um estoque real, como cadastro de produtos, controle de entrada e saída, e validações para garantir a consistência dos dados.

🎯 Objetivo do Projeto

Este projeto foi criado com fins educacionais, com os seguintes objetivos:

Praticar Programação Orientada a Objetos em Java
Trabalhar separação de responsabilidades entre classes
Implementar regras de negócio reais de um sistema de estoque
Desenvolver pensamento lógico e modelagem de domínio
Criar um projeto simples, porém estruturado, para portfólio

⚙️ Funcionalidades Implementadas

Cadastro de produtos
Listagem de todos os produtos em estoque
Busca de produto por código
Entrada de produtos no estoque
Definição de preço de compra
Cálculo automático do preço de venda
Atualização da quantidade disponível
Saída de produtos do estoque (em evolução)
Exibição de mensagens de erro para ações inválidas
Controle centralizado das operações pelo estoque

🧱 Estrutura do Projeto

O sistema está organizado nas seguintes classes:

🔹 Produto
Classe que representa a entidade Produto, contendo informações como:

Código
Nome
Preço de compra
Preço de venda
Quantidade em estoque
** Essa classe é responsável por armazenar o estado do produto, sem conter lógica de interação com o usuário. **

🔹 Estoque

Classe responsável por:

Manter a lista de produtos cadastrados
Centralizar as regras de negócio
Controlar as operações de:
Cadastro
Entrada
Saída
Consulta de produtos
** Todas as validações e decisões relacionadas ao estoque passam por esta classe. **

🔹 Main

Classe responsável pela interface via console, contendo:

Menu de opções
Leitura das entradas do usuário
Direcionamento das ações para a classe Estoque
** Essa classe não contém regras de negócio, apenas controle de fluxo. **

🔹 Erros

** Classe auxiliar utilizada para exibir mensagens de erro quando o usuário realiza uma ação inválida ou escolhe uma opção incorreta no menu. **

🧠 Regras de Negócio

O sistema segue as seguintes regras de negócio:

Um produto só pode ser manipulado se estiver previamente cadastrado

Não é permitida entrada ou saída de quantidade negativa

A entrada de produtos atualiza:

Quantidade em estoque

Preço de compra

Preço de venda (calculado automaticamente)

A saída de produtos reduz a quantidade disponível em estoque

O estoque é responsável por validar todas as operações antes de executá-las

As regras de negócio são centralizadas na classe Estoque, evitando lógica espalhada pelo sistema

Essas regras garantem a integridade do estoque e simulam comportamentos reais de sistemas comerciais.

🧠 Conceitos de POO Aplicados

Encapsulamento

Classes e objetos

Separação de responsabilidades

Uso de listas (ArrayList)

Centralização de regras de negócio

Organização de código orientada ao domínio

Controle de estado dos objetos

▶️ Como Executar o Projeto

Clone o repositório:

git clone https://github.com/andreysilva018/sistema-estoque-java.git


Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)

Execute a classe Main

Utilize o menu exibido no console para interagir com o sistema

🚀 Melhorias Planejadas

Bloqueio automático de produtos com estoque zerado

Validação para impedir saída maior que a quantidade disponível

Reativação automática de produtos após nova entrada

Mensagem de aviso quando o estoque de um produto for zerado

Melhor separação entre regras de negócio e interação com o usuário

Refatoração para padronização de nomes e pacotes

📌 Considerações Finais

Este projeto representa um processo de aprendizado contínuo em Java e Programação Orientada a Objetos.
A evolução do código reflete a consolidação de conceitos fundamentais para o desenvolvimento de sistemas reais.
