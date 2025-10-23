#  Calculadora em Java

Projeto simples de calculadora em Java que demonstra **herança**, **polimorfismo** e **encapsulamento**.

## 📘 Descrição

- `DadosOperacao`: encapsula os operandos para proteger e organizar os dados.
- `Operacao`: classe **abstrata** que define o método `calcular`, que todas as operações devem implementar.
- `Soma`, ➖ `Subtracao`, ✖️ `Multiplicacao`, ➗ `Divisao`: herdam de `Operacao` e implementam `calcular` com sua lógica específica.
- `Calculadora`: executa uma `Operacao` recebida (**injeção de dependência**), delegando o cálculo à implementação concreta.
- `Main`: o usuário fornece os números e escolhe a operação; o programa instancia a operação desejada e a executa.  
  Isso é **polimorfismo**: uma referência do tipo `Operacao` é capaz de executar diferentes comportamentos conforme a subclasse concreta apontada.

## 🗂️ Estrutura do Projeto

Arquivos principais:

- `Operacao.java` – classe abstrata que define `calcular(double a, double b)`
- `Soma.java`, `Subtracao.java`, `Multiplicacao.java`, `Divisao.java` – implementações concretas de `Operacao`
- `DadosOperacao.java` – classe que encapsula os operandos
- `Calculadora.java` – classe com método que recebe uma `Operacao` e executa o cálculo
- `Main.java` – programa principal que interage com o usuário via `Scanner`

## 🛠️ Como compilar e executar (Windows PowerShell)

1. Abra o PowerShell e vá até a pasta do projeto:
   
   cd "c:\Users\VitoriaLeticiadaSilv\Downloads\Calculadora"
   
2. Compile todos os arquivos Java:
   
  " javac *.java
  
3.Execute o programa:

"java Main  

## Observações

- A classe `Divisao` verifica divisão por zero e lança `IllegalArgumentException` se o divisor for zero; `Main` captura essa exceção e mostra uma mensagem.
- Evite usar acentos em nomes de arquivos e identificadores (por exemplo, `Operacao` em vez de `Operação`) para manter portabilidade entre sistemas operacionais.

## Exemplo de uso

Ao executar `java Main`, siga as instruções exibidas para informar dois números e escolher a operação (1=+, 2=-, 3=*, 4=/). O programa exibirá o resultado ou uma mensagem de erro em caso de entrada inválida.

---


