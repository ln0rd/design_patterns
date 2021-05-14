### Por que devemos utilizar o Abstract Factory method?

Termo bem legal, a fabrica das fábricas;

Precisamos de um Abstract factory quando temos uma criação
de objetos que tem semelhança mas que tem muitas caracteriscas
que podm ser diferentes, com comportamentos diferentes, 
exemplo prático abaixo:

#### Qual o problema: <br>
```
Preciso criar um objeto de movimento financeiro, porem esse movimento pode ser um
crédito ou debito e pode ter vários tipos de cada um, nesse caso para lidar com cada 
um de forma diferente posso criar uma Abstract factory que lida com todos eles.
```
Exemplo 2
```
Preciso criar um objeto pizza, eu posso criar uma pizza doce, salgada ou ambas, meio a meio
de cada, são muitas possibilidades, nesse caso eu posso criar um abstract factory que vai 
isolar a logica de criação de cada um na camada da factory.
```