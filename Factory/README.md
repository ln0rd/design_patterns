## Entendimento

### Por que devemos utilizar o Factory method? 

Precisamos de uma factory quando temos que a geração de objetos parecidas,
com comportamentos diferentes, exemplo prático:

Qual o problema: <br>
```
Preciso gerar uma remessa, mas gero remessa para vários bancos, tenho a necessidade
de ter uma factory para a criação de remessa, e essa factory terá uma implementação
de cada banco;
```

Como resolvo: <br>
Precisamos de uma factory method quando eu desconheço os 
tipos de novos objetos que precisarei criar(exemplo de remessa), e a dependencia que eles
podem precisar para serem criados, caso eu precise de uma nova remessa, eu apenas crio uma factory nova
para aquela criação de objeto;