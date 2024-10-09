# README - Sistema de Gerenciamento de Animais

## Descrição

Este projeto é um sistema simples para gerenciar informações sobre cães e gatos. O usuário pode criar instâncias de cães e gatos, realizar ações como fazer aniversário, latir, miar, vigiar, relaxar, e subir ou descer do muro. O sistema foi desenvolvido em Java e utiliza conceitos de orientação a objetos.

## Funcionalidades

- **Criar Cão**: Permite ao usuário criar um novo cão informando o nome e o tutor.
- **Criar Gato**: Permite ao usuário criar um novo gato informando o nome e o tutor.
- **Fazer Aniversário**: Incrementa a idade do animal se ele estiver vivo.
- **Latir**: O cão pode emitir um som (Au, Au!) se estiver vivo.
- **Miar**: O gato pode emitir um som (Miau, Miau!) se estiver vivo.
- **Vigiar**: O cão pode entrar no modo de vigilância.
- **Relaxar**: O cão pode parar de vigiar.
- **Subir Muro**: O gato pode subir no muro.
- **Descer Muro**: O gato pode descer do muro.
- **Morrer**: Permite ao usuário "matar" o animal, tornando-o não mais vivo.
- **Exibir Estado dos Animais**: Mostra as informações atuais dos cães e gatos criados.

## Estrutura do Código

O código é dividido em duas classes principais para os animais:

1. **Cão**
   - Atributos:
     - `nome`: Nome do cão.
     - `tutor`: Nome do tutor do cão.
     - `vivo`: Estado de vida do cão (booleano).
     - `idade`: Idade do cão (inteiro).
     - `vigiando`: Estado de vigilância (booleano).
   - Métodos:
     - `morrer()`, `fazerAniversário()`, `latir()`, `vigiar()`, `relaxar()`, `toString()`.

2. **Gato**
   - Atributos:
     - `nome`: Nome do gato.
     - `tutor`: Nome do tutor do gato.
     - `vivo`: Estado de vida do gato (booleano).
     - `idade`: Idade do gato (inteiro).
     - `noMuro`: Estado no muro (booleano).
   - Métodos:
     - `morrer()`, `fazerAniversário()`, `miar()`, `subirMuro()`, `descerMuro()`, `toString()`.

3. **PrincipalAnimal**
   - Classe responsável pela interação com o usuário através de um menu interativo que permite executar as funcionalidades descritas.

## Como Executar

1. Certifique-se de ter o Java instalado em seu sistema.
2. Clone ou baixe este repositório para sua máquina local.
3. Compile as classes usando um terminal ou prompt de comando:
   ```bash
   javac Principal.java
   ```
4. Execute a classe principal:
   ```bash
   java Principal
   ```
5. Siga as instruções no menu para interagir com os animais.

