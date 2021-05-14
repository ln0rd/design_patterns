### Por que devemos utilizar o Adapter?

Precisamos de um Adpater quando por exemplo, tenho interfaces que são incompativeis e preciso fazer com que elas
conversem entre si, e nesse caso eu crio um adaptador para elas se comunicarem;

#### Qual o problema: <br>
```
Tenho um sistema que gera tudo em XML por exemplo, e preciso fazer ele entender agora
uma nova camada no sistema que entende JSON.
ou
Tenho um gateway de pagamento que se comunica com uma adquirencia e preciso
com que ela se comunique com outra adquirencia porem com uma adaptação nos dados, principalmente
quando já tenho um sistema legado.
```

#### Como resolvo: <br>
Eu crio uma Classe chamada SomethingAdapter do objeto que vc quer adaptar
e nele vai se implementado a interface que já existe, porem onde ele precisar ser instanciado
será instanciado o Adapter dessa Classe e passado por parametro o objeto que precisa ser adaptado.