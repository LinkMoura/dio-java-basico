<div align="center">
  <h1>- Desafio: POO -</h1>
</div>

Este repositório, concebido com propósitos didáticos, representa um desafio de modelagem e diagramação, utilizando UML, para um componente iPhone, abrangendo suas funcionalidades como reprodutor musical, aparelho telefônico e navegador na internet, criado em colaboração entre a [Digital Innovation One](https://www.dio.me/) e o Santander, como parte do Bootcamp Santander 2024 - Backend com Java.

## Objetivo

Aprender e aplicar os fundamentos de Programação Orientada a Objetos (POO) e Linguagem de Modelagem Unificada (UML), os quais incluem:

- Conceito de POO;
- Classes e pacotes;
- Visibilidade dos recursos;
- PIlares do POO;
- Interface.

## Ferramentas e tecnologias
![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)
![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)
![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=openjdk&logoColor=ED8B00) 

## Diagrama UML

O diagrama UML foi criado utilizando a sintaxe [Mermaid](https://mermaid.js.org/), uma alternativa open-source e que é compatível com arquivos Markdown.

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()          
        +pausar()         
        +selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        +ligar(numero: String)
        +atender()              
        +iniciarCorreioVoz() 
    }

    class NavegadorInternet {
        +exibirPagina(url: String)      
        +adicionarNovaAba()             
        +atualizarPagina()
    }

    class Iphone {
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet

    class SistemaOperacional {
    }

    SistemaOperacional --> Iphone
```

## Funcionamento
Os dados são solicitados e inseridos através do terminal, onde o usuário receberá um menu indicando as opções a serem escolhidas e seus repectivos números. Por exemplo:

* Programa:  
---- Escolha o aplicativo ----  
1. Reprodutor musical  
2. Aparelho telefônico  
3. Navegador de internet  
4. Encerrar aparelho
* Usuário: 1 *(depois ENTER para o próximo passo)* 

</br>

> [!NOTE]   
> Achou algum erro ou tem alguma dúvida? Me envie uma mensagem no [linkedin](https://www.linkedin.com/in/veronica-vilas/)
