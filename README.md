# Padrões de projeto 
## Príncipios de padrões 

##### Identify the aspects of your application that vary and separate them from what stays the same.
- Separe da classe Quack os QuackBehavios e FlyBehavios 

##### Program to an interface, not an implementation.
- A classe Duck não precisa saber os detalhes de implementação de seus próprios comportamentos. Criamos interfaces QuackBehavios  e FlyBehavios  e classe que implementam essas interfaces 

##### Favor composition over inheritance.
- A classe Duck TEM-UM FlyBehavior pode ser melhor do que RocketDuck é um Duck   

## Strategy 
O padrão Strategy define uma família de algoritmos, encapsula cada um e os fazem intercâmbiaveis. 
Strategy deixa o algoritmo variar independente dos clientes que o usam 

## Observer Pattern
O Observer Pattern  define uma dependencia one-to-many entre os objetos para que quando um objeto mudar os estado, todos seus dependentes sejam notificados e atualizados automaticamente. 

![alt text](imagens/observerpattern.png)