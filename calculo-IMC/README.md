Descrição

Este aplicativo tem como objetivo calcular o Índice de Massa Corporal (IMC) de um paciente e fornecer um diagnóstico com base no resultado. O IMC é uma medida utilizada para avaliar se uma pessoa está dentro do peso ideal, considerando sua altura e peso.

Funcionalidades

Classe Paciente: Representa um paciente com atributos de peso e altura.
- Construtor: Recebe o peso (em quilos) e a altura (em metros) como parâmetros do tipo double.
- Método calcularIMC(): Calcula o IMC utilizando a fórmula:

IMC = peso / (altura * altura)

Método diagnostico(): Retorna uma string com o diagnóstico baseado nas seguintes faixas de IMC:
- Baixo peso muito grave: IMC < 16 kg/m²
- Baixo peso grave: 16 ≤ IMC < 17 kg/m²
- Baixo peso: 17 ≤ IMC < 18,5 kg/m²
- Peso normal: 18,5 ≤ IMC < 25 kg/m²
- Sobrepeso: 25 ≤ IMC < 30 kg/m²
- Obesidade grau I: 30 ≤ IMC < 35 kg/m²
- Obesidade grau II: 35 ≤ IMC < 40 kg/m²
- Obesidade grau III (obesidade mórbida): IMC ≥ 40 kg/m²
Classe Principal: Interage com o usuário para coletar dados e apresentar o diagnóstico.
- Permite calcular o IMC de diversos pacientes em uma única execução.
- O usuário pode encerrar a execução a qualquer momento.
