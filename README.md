
# Sistema de Mapeamento de Áreas Verdes

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

## Introdução
O **Sistema de Mapeamento de Áreas Verdes** é um projeto desenvolvido em Java que permite o cadastro, avaliação e consulta de espaços verdes em uma região. O projeto é fruto de uma atividade avaliativa focado no paradigma POO de um programa de formação em desenvolvimento FullStack, com temas voltados para sustentabilidade.

## Funcionalidades

- **Cadastro de áreas verdes**: Permite adicionar novas áreas verdes com informações como nome, localização, atividades d e tipo de vegetação.
- **Listagem de áreas cadastradas**: Exibe uma relação das áreas cadastradas no sistema.
- **Busca por uma área verde específica**: Filtragem por meio do ID, ao digitá-lo busca todas as informações de forma detalhada de uma área verde.
- **Avaliação de uma área verde**: Permite por meio do ID de uma área específica, que avalie todas as características dela como por exemplo: qualidade do ar, coleta de resíduo, etc.


## Tecnologias Utilizadas

| Tecnologia | Descrição |
|------------|-------------|
| **Java** | Linguagem principal para desenvolvimento do sistema |
| **IntelliJ IDEA** | Ambiente de desenvolvimento integrado (IDE) |
| **Git** | Controle de versão e gerenciamento do código |

## Estrutura do Projeto

A organização do código segue um padrão modular, garantindo clareza e manutenção facilitada:
```
Sistema-de-Areas-Verdes/
├── src/
│   ├── br/senai/futurodev/sistemaDeAreasVerdes/
│   │   ├── Main/main.java  # Arquivo e menu principal do programa.
│   │   ├── models/     # Classes de modelo para representar entidades do sistema.
│   │   ├── respositories/   # Classes de armazenamento dos dados em lista.
├── .gitignore          # Arquivo para ignorar arquivos desnecessários no Git
```

## Como Executar o Projeto

1. **Clonar o repositório**
   ```sh
   git clone https://github.com/louisemorais/Sistema-de-Areas-Verdes.git
   ```

2. **Importar no IntelliJ IDEA**
   - Abra o IntelliJ IDEA
   - Selecione **"Open Project"** e escolha o diretório clonado

3. **Compilar e Executar**
   - Navegue até a classe `Main.java`
   - Execute o programa clicando no botão "Run" ou utilizando `Shift + F10`
## Autor

<a href="https://github.com/louisemorais">
 <img style="border-radius: 50%;" src="https://github.com/louisemorais.png" width="100px;" alt=""/>
 <br />
 <sub><b>Louise Morais</b></sub></a> <a href="https://github.com/louisemorais" title="Louise Morais"></a>
 <br />
 <a href="https://www.linkedin.com/in/louisemorais/">
      <img style="margin-top: 12px" src="https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn">
