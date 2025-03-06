# Calculadora Simples em Java (MVC)



## Descrição

Este projeto implementa uma calculadora simples em Java utilizando o padrão de projeto Model-View-Controller (MVC). O objetivo é demonstrar a aplicação dos princípios de separação de responsabilidades e organização de código em um aplicativo básico.

## Funcionalidades

* ✅ Realiza operações aritméticas básicas: adição, subtração, multiplicação e divisão.
* 💻 Interface de linha de comando (CLI) para interação com o usuário.
* ⚠️ Tratamento de erros para divisão por zero e operações inválidas.
* 🔄 Opção de continuar ou sair após cada cálculo.

## Tecnologias Utilizadas

* ☕ **Java:** Linguagem de programação principal.
* 🛠️ **Gradle:** Sistema de build para gerenciar dependências e automatizar o processo de compilação.
* **Git:** Sistema de controle de versão para gerenciamento de código.
* 💡 **IntelliJ IDEA:** Ambiente de desenvolvimento integrado (IDE).

## Estrutura do Projeto

📦 Calculadora  
 ┣ 📂 .gradle                       
 ┃      # Arquivos do sistema de build Gradle  
 ┣ 📂 .idea                        
 ┃      # Arquivos de configuração do IntelliJ IDEA  
 ┣ 📂 build                        
 ┃      # Diretório de saída compilada  
 ┣ 📂 gradle                       
 ┃      # Arquivos do wrapper do Gradle  
 ┣ 📂 src  
 ┃ ┣ 📂 main  
 ┃ ┃ ┣ 📂 java  
 ┃ ┃ ┃ ┣ 📂 controller  
 ┃ ┃ ┃ ┃ ┣ 📜 CalculadoraController.java  
 ┃ ┃ ┃ ┃       # Controlador que gerencia as interações e requisições do usuário  
 ┃ ┃ ┃ ┣ 📂 io.github.eziocdl  
 ┃ ┃ ┃ ┃ ┣ 📜 Main.java  
 ┃ ┃ ┃ ┃       # Ponto de entrada principal da aplicação  
 ┃ ┃ ┃ ┣ 📂 model  
 ┃ ┃ ┃ ┃ ┣ 📜 CalculadoraModelImpl.java  
 ┃ ┃ ┃ ┃       # Implementação da lógica de negócios  
 ┃ ┃ ┃ ┃ ┣ 📜 CalculadoraModelInterface.java  
 ┃ ┃ ┃ ┃       # Interface que define o contrato do modelo  
 ┃ ┃ ┃ ┣ 📂 view  
 ┃ ┃ ┣ 📂 resources  
 ┃ ┃        # Recursos da aplicação (ex.: arquivos de configuração)  
 ┃ ┣ 📂 test  
 ┃          # Testes unitários e de integração  
 ┣ 📜 .gitignore  
 ┃      # Arquivo para ignorar arquivos desnecessários no Git  
 ┣ 📜 build.gradle.kts  
 ┃      # Configuração do build do Gradle (Kotlin DSL)  
 ┣ 📜 Calculadora.iml  
 ┃      # Arquivo do projeto IntelliJ  
 ┣ 📜 gradlew  
 ┃      # Wrapper do Gradle (Linux/macOS)  
 ┣ 📜 gradlew.bat  
 ┃      # Wrapper do Gradle (Windows)  
 ┣ 📜 settings.gradle.kts  
 ┃      # Arquivo de configurações do Gradle  



## Como Executar o Projeto

1.  Certifique-se de ter o **Java** e o **Gradle** instalados em sua máquina.
2.  Clone este repositório para o seu computador: `git clone https://github.com/eziocdl/calculadora-simples.git`
3.  Abra o projeto no **IntelliJ IDEA** (ou outra IDE compatível com Gradle).
4.  Execute a classe `Main` dentro do pacote `io.github.eziocdl`.
5.  Siga as instruções no console para interagir com a calculadora.

## Boas Práticas Adotadas

* **🏛️ Padrão MVC:** O projeto segue o padrão Model-View-Controller para separar as responsabilidades e facilitar a manutenção.
* **🧩 Interface e Implementação:** O Model é definido por uma interface (`CalculadoraModelInterface`) e implementado pela classe `CalculadoraModelImpl`, permitindo a flexibilidade para futuras extensões.
* **🛡️ Tratamento de Erros:** O projeto inclui tratamento de erros para divisão por zero e operações inválidas, melhorando a robustez do aplicativo.
* **🧹 Arquivo `.gitignore`:** O arquivo `.gitignore` foi configurado para ignorar arquivos e diretórios desnecessários, mantendo o repositório limpo.
* **📝 Mensagens de Commit:** As mensagens de commit são claras e concisas, facilitando o acompanhamento das alterações.
* **⚙️ Gradle:** O Gradle é utilizado para o gerenciamento de dependências e automatização do processo de build, garantindo a reprodutibilidade do projeto.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias e correções.

