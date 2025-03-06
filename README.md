# Calculadora Simples em Java (MVC)

## Descricao

Este projeto implementa uma calculadora simples em Java utilizando o padrao de projeto Model-View-Controller (MVC). O objetivo e demonstrar a aplicacao dos principios de separacao de responsabilidades e organizacao de codigo em um aplicativo basico.

## Funcionalidades

* ✅ Realiza operacoes aritmeticas basicas: adicao, subtracao, multiplicacao e divisao.
* 💻 Interface de linha de comando (CLI) para interacao com o usuario.
* ⚠️ Tratamento de erros para divisao por zero e operacoes invalidas.
* 🔄 Opcao de continuar ou sair apos cada calculo.

## Tecnologias Utilizadas

* ☕ **Java:** Linguagem de programacao principal.
* 🛠️ **Gradle:** Sistema de build para gerenciar dependencias e automatizar o processo de compilacao.
* **Git:** Sistema de controle de versao para gerenciamento de codigo.
* 💡 **IntelliJ IDEA:** Ambiente de desenvolvimento integrado (IDE).

## Estrutura do Projeto

📦 Calculadora  
 ┣ 📂 .gradle                        
 ┃      # Arquivos do sistema de build Gradle  
 ┣ 📂 .idea                         
 ┃      # Arquivos de configuracao do IntelliJ IDEA  
 ┣ 📂 build                         
 ┃      # Diretorio de saida compilada  
 ┣ 📂 docs                          
 ┃      # Documentacao do projeto  
 ┣ 📂 gradle                        
 ┃      # Arquivos do wrapper do Gradle  
 ┣ 📂 src  
 ┃ ┣ 📂 main  
 ┃ ┃ ┣ 📂 java  
 ┃ ┃ ┃ ┣ 📂 controller  
 ┃ ┃ ┃ ┃ ┣ 📜 CalculadoraController.java  
 ┃ ┃ ┃ ┃       # Controlador que gerencia as interacoes e requisicoes do usuario  
 ┃ ┃ ┃ ┣ 📂 io.github.eziocdl  
 ┃ ┃ ┃ ┃ ┣ 📜 Main.java  
 ┃ ┃ ┃ ┃       # Ponto de entrada principal da aplicacao  
 ┃ ┃ ┃ ┣ 📂 model  
 ┃ ┃ ┃ ┃ ┣ 📜 CalculadoraModelImpl.java  
 ┃ ┃ ┃ ┃       # Implementacao da logica de negocios  
 ┃ ┃ ┃ ┃ ┣ 📜 CalculadoraModelInterface.java  
 ┃ ┃ ┃ ┃       # Interface que define o contrato do modelo  
 ┃ ┃ ┃ ┣ 📂 view  
 ┃ ┃ ┣ 📂 resources  
 ┃ ┃        # Recursos da aplicacao (ex.: arquivos de configuracao)  
 ┃ ┣ 📂 test  
 ┃          # Testes unitarios e de integracao  
 ┣ 📜 .gitignore  
 ┃      # Arquivo para ignorar arquivos desnecessarios no Git  
 ┣ 📜 build.gradle.kts  
 ┃      # Configuracao do build do Gradle (Kotlin DSL)  
 ┣ 📜 Calculadora.iml  
 ┃      # Arquivo do projeto IntelliJ  
 ┣ 📜 gradlew  
 ┃      # Wrapper do Gradle (Linux/macOS)  
 ┣ 📜 gradlew.bat  
 ┃      # Wrapper do Gradle (Windows)  
 ┣ 📜 README.md  
 ┃      # Documentacao do projeto  
 ┣ 📜 settings.gradle.kts  
 ┃      # Arquivo de configuracoes do Gradle  


## Como Executar o Projeto

1.  Certifique-se de ter o **Java** e o **Gradle** instalados em sua maquina.
2.  Clone este repositorio para o seu computador: `git clone https://github.com/eziocdl/calculadora-simples.git`
3.  Abra o projeto no **IntelliJ IDEA** (ou outra IDE compativel com Gradle).
4.  Execute a classe `Main` dentro do pacote `io.github.eziocdl`.
5.  Siga as instrucoes no console para interagir com a calculadora.

## Boas Praticas Adotadas

* **🏛️ Padrao MVC:** O projeto segue o padrao Model-View-Controller para separar as responsabilidades e facilitar a manutencao.
* **🧩 Interface e Implementacao:** O Model e definido por uma interface (`CalculadoraModelInterface`) e implementado pela classe `CalculadoraModelImpl`, permitindo a flexibilidade para futuras extensoes.
* **🛡️ Tratamento de Erros:** O projeto inclui tratamento de erros para divisao por zero e operacoes invalidas, melhorando a robustez do aplicativo.
* **🧹 Arquivo `.gitignore`:** O arquivo `.gitignore` foi configurado para ignorar arquivos e diretorios desnecessarios, mantendo o repositorio limpo.
* **📝 Mensagens de Commit:** As mensagens de commit sao claras e concisas, facilitando o acompanhamento das alteracoes.
* **⚙️ Gradle:** O Gradle e utilizado para o gerenciamento de dependencias e automatizacao do processo de build, garantindo a reprodutibilidade do projeto.

## Documentacao

O projeto utiliza **Javadoc** para gerar documentacao automatica do codigo. A documentacao e gerada com base nos comentarios presentes nos arquivos `.java` e esta disponivel no diretorio `docs`.

### 📖 Como Gerar a Documentacao Javadoc

Caso precise gerar a documentacao novamente, siga estes passos:

1. No terminal, navegue ate a raiz do projeto.  
2. Execute o seguinte comando:  

   ```sh
   ./gradlew javadoc
   ```

   Ou, se estiver no Windows:

   ```sh
   gradlew.bat javadoc
   ```

3. A documentacao sera gerada no diretorio `build/docs/javadoc`.

### 🔍 Como Visualizar a Documentacao

- Para acessar a documentacao gerada, abra o arquivo `index.html` localizado em:
  
  ```
  build/docs/javadoc/index.html
  ```

- Voce pode abrir esse arquivo diretamente no seu navegador.

## Contribuicao

Contribuicoes sao bem-vindas! Sinta-se a vontade para abrir issues e pull requests para melhorias e correcoes.

