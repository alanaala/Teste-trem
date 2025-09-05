# Teste Trem

Um projeto em **Java** que simula um sistema de gerenciamento de viagens de trem.  
Inclui modelagem de passageiros, trens, estações, viagens e bilhetes, além de testes unitários para validação das regras de negócio.

## Estrutura do Projeto

- **`Passageiro`** → Representa um passageiro, com nome, idade e documento.  
  - Possui método `temDesconto()` que aplica desconto para menores de 12 anos e maiores de 60.  

- **`Estacao`** → Modela uma estação de trem, contendo nome e cidade.  

- **`Trem`** → Representa um trem, com código, capacidade e ocupação atual.  
  - Métodos principais:
    - `temVagas()` → verifica se ainda há assentos livres.  
    - `embarcarPassageiro()` → adiciona passageiro se houver vaga, senão lança exceção.  
    - `desembarcarPassageiro()` → remove passageiro, senão lança exceção.  

- **`Viagem`** → Liga uma estação de origem e destino, com horários de partida e chegada, além do trem utilizado.  
  - Método `duracaoHoras()` retorna a duração da viagem em horas.  

- **`Bilhete`** → Responsável por associar passageiro e viagem.  
  - Método `calcularPreco()` aplica desconto caso o passageiro tenha direito.  
  - Método `validarEmbarque()` embarca o passageiro no trem, se houver vaga.  

- **Testes unitários** → Implementados com **JUnit** para validar regras de negócio.  
  - `PassageiroTest`  
  - `EstacaoTest`  
  - `TremTest`  
  - `ViagemTest`  
  - `BilheteTest`  

## Tecnologias Utilizadas

- **Java 17+**  
- **JUnit 4/5**  
- **Maven**  

##  Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/alanaala/Teste-trem.git
   cd Teste-trem
2. Compile o projeto:
    mvn clean install

3. Rode os testes:
    mvn test

## Exemplos de Uso

- Criando um passageiro com desconto:
    Passageiro p = new Passageiro("João", 65, "123456");
    System.out.println(p.temDesconto()); // true

- Criando um trem e embarcando passageiros:
    Trem trem = new Trem("T123", 2, 1);
    trem.embarcarPassageiro(); // sucesso
    trem.embarcarPassageiro(); // lança Exception: "Trem lotado!"

- Calculando duração de uma viagem:
    Viagem v = new Viagem(origem, destino, partida, chegada, trem);
    System.out.println(v.duracaoHoras()); // ex: 3

 ## Autora

Projeto desenvolvido por Alana como prática de teste maven em Java.
