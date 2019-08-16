Restaurant Election
=============

Requisitos do sistema:
-------

* jdk8
* gradle 4.4

Modo de uso:
-------

Há 4 opções:
* New vote
* Winners
* Help
* Exit

Em "New Vote" você digita seu nome e o restaurante que está votando;
Não é aceito a mesma pessoa votar repetidas vezes na mesma eleição;
Não é aceito  votos em um restaurante que já ganhou uma das ultimas 7 eleições.

Em "Winners" você recebe o resultado de quem venceu a eleição atual;
Por regra de uso essa opção só pode ser usada uma vez por dia para que cada eleição represente um dia.

Em "Help" você encontra uma breve explicação de cada opção.

Em "Exit" a execução do programa é terminada.

Destaque:
-------

Acredito que o sistema tem uma lógica sólida e bem compartimentada.

Melhorias:
-------

Há diversas melhorias que poderiam ser implemetada como o uso de Dockers para uma garantia de que o 
sistema executaria de forma correta em qualquer sistema, uso de Mockit para uma maior gama de testes
possíveis, uso de um banco de dados real e assim abrindo possibilidade para diversos computadores 
utilizarem a eleição ao mesmo tempo, implementação de login para garantir unicidade dos votos.
