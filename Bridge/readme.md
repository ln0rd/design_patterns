### Por que devemos utilizar Bridge?

O Bridge é um padrão de projeto estrutural que permite dividir uma classe
grande ou um conjunto de classes  intimamente ligadas em duas hierarquias separadas

Melhor explicação: [link](https://refactoring.guru/pt-br/design-patterns/bridge)

No código faremos o exemplo de Live, tendo que realizar um stream para 3 plataformas.

#### Qual o problema: <br>
```
Tenho duas classes, A e B, mas preciso que a classe C tenha todos os metodos 
de A + B exemplo do site do guru: 

Tenho a Classe Forma, e a Classe Cor, e quero criar um Circulo Azul, precisamos
de uma "PONTE", para que a Classe do circulo Azul tenha as caracteristicas de
ambos.
```
