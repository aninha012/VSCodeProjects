# README - Sistema de Gerenciamento de Animais

## Descrição

Este projeto é um sistema simples para gerenciar informações sobre cães e gatos, utilizando herança. O usuário pode criar instâncias de animais, especificamente cães e gatos, e realizar ações como fazer aniversário, latir, miar, vigiar, relaxar, e subir ou descer do muro. O sistema foi desenvolvido em Java e utiliza conceitos de orientação a objetos.

## Estrutura do Código

O código é dividido em várias classes:

1. **Classe `Animal`**
   - **Atributos:**
     - `nome`: Nome do animal.
     - `vivo`: Estado de vida do animal (booleano).
     - `idade`: Idade do animal (inteiro).
   - **Métodos:**
     - `morrer()`: Torna o animal não vivo.
     - `fazerAniversário()`: Incrementa a idade se o animal estiver vivo.
     - `isVivo()`: Retorna o estado de vida do animal.
     - `toString()`: Retorna uma representação textual do animal.

2. **Classe `Mamífero` (herda de `Animal`)**
   - **Atributos:**
     - `tutor`: Nome do tutor do mamífero.
   - **Métodos:**
     - Construtor que inicializa o nome e o tutor, definindo o estado de vida como verdadeiro.
     - `toString()`: Retorna uma representação textual do mamífero, incluindo informações sobre o tutor.

3. **Classe `Cão` (herda de `Mamífero`)**
   - **Atributos:**
     - `vigiando`: Estado de vigilância (booleano).
   - **Métodos:**
     - `latir()`: Emite um som (Au, Au!) se o cão estiver vivo.
     - `vigiar()`: Coloca o cão em modo de vigilância.
     - `relaxar()`: Faz o cão parar de vigiar.

4. **Classe `Gato` (herda de `Mamífero`)**
   - **Atributos:**
     - `noMuro`: Estado no muro (booleano).
   - **Métodos:**
     - `miar()`: Emite um som (Miau, Miau!) se o gato estiver vivo.
     - `subirMuro()`: Faz o gato subir no muro.
     - `descerMuro()`: Faz o gato descer do muro.

5. **Classe `PrincipalAnimal`**
   - Classe responsável pela interação com o usuário através de um menu interativo que permite executar as funcionalidades descritas.

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

## Como Executar

1. Certifique-se de ter o Java instalado em seu sistema.
2. Clone ou baixe este repositório para sua máquina local.
3. Compile as classes usando um terminal ou prompt de comando:
   ```bash
   javac PricipalAnimal.java
   ```
4. Execute a classe principal:
   ```bash
   java PrincipalAnimal
   ```
5. Siga as instruções no menu para interagir com os animais.

## Contribuições

Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades! Para isso, você pode abrir uma issue ou enviar um pull request.
