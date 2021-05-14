### Por que devemos utilizar o Builder?

Precisamos de um Builder quando precisamos criar objetos complexos, por exemplo
quando temos um objeto com inumeros parametros, ou precisamos construir partes de um objeto em
momentos diferentes

#### Qual o problema: <br>
```
Preciso criar um objeto mas ele tem uma lista de parametros muito grande
ou
Preciso criar um objeto mas em momentos diferentes e tem muitos parametros
```

#### Como resolvo: <br>
Crio uma classe com o nome de builder do objeto que preciso criar, nesse objeto tenho
as mesmas propriedades nele, que no final vai criar meu objeto;