
# C Simplificaodo
## Descrição 

Este projeto é uma implementação do Front-End de um Compilador e faz parte de um trabalho avaliativo da disciplina de Compiladores ministrada pelo professor Dr. Wilson Castello Branco Neto do curso de Ciência da Computação do IFSC de Lages-SC.





## Requerimento
1. JDK 17 (não testado com outras versões)

2. Maven

3. NetBeans
## Execução 

Compile o projeto clicando em "Clean and Build" no NetBeans e execute clicando em "Run"
    
## Funcionalidades

- Análise Léxica
- Análise Sintática
- Análise Semântica
- Geração de LLVM IR



## Documentação o LLVM IR
https://llvm.org/docs/LangRef.html



## Bugs conhecidos e limitações
Nao aceita constantes em operações logicas e chamadas de função. Exemplo:
```
println(1);
if(x > 20)
```
O bloco de codigo do While e IF não está executando as funções corretamente, funcionando apenas chamadas de função e atribuições basicas.

Não suporta instruções complexas, como "2*3*4", sem uso de parênteses.
```
x = 2*3*4 // Não funciona

x = 2*3
x = x*4 // Funciona

x = (2*3)*4 // Funciona
```

## Autores

- [@FranciscoPaixao](https://www.github.com/FranciscoPaixao) Análise Léxica, Sintática, Semântica e Geração de LLVM IR
- [@EveliseOlivera](https://github.com/eveliseoliveira) Análise Léxica e Sintática



## Créditos
GUI baseada no projeto [Compiler](https://www.youtube.com/watch?v=AHGe8l_yG6s)

[Projeto ANTLR](https://www.antlr.org/)  - Gerador de Analisador Léxico, Sintático e ambiente de desenvolvimento.

[Projeto LLVM](https://llvm.org/) - Ferramentas para desenvolvimento de Compiladores.

Gramática LL fornecida pelo professor Wilson.

## Licença

[LGPL 3.0](https://choosealicense.com/licenses/lgpl-3.0/)

