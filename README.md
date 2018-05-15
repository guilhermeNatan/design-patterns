# Padrões de projeto 
## Strategy 
O padrão Strategy define uma família de algoritmos, encapsula cada um e os fazem intercâmbiaveis. 
Strategy deixa o algoritmo variar independente dos clientes que o usam 

##### [Príncipios de padrões] Identify the aspects of your application that vary and separate them from what stays the same.
- Separe da classe Quack os QuackBehavios e FlyBehavios 

##### [Príncipios de padrões] Program to an interface, not an implementation.
- A classe Duck não precisa saber os detalhes de implementação de seus próprios comportamentos. Criamos interfaces QuackBehavios  e FlyBehavios  e classe que implementam essas interfaces 

##### [Príncipios de padrões] Favor composition over inheritance.
- A classe Duck TEM-UM FlyBehavior pode ser melhor do que RocketDuck é um Duck   

## Observer Pattern
O Observer Pattern  define uma dependencia one-to-many entre os objetos para que quando um objeto mudar o seu estado, todos seus dependentes sejam notificados e atualizados automaticamente. 

![alt text](imagens/observerpattern.png)

##### [Príncipios de padrões] Strive for loosely coupled designs between objects that interact.
No padrão observer tanto o observador(assinante) quanto sujeito(editora) podem sofrer mudanças de forma que um não afeta o outro
o observador precisa saber apenas que o sujeito implementa uma interface 'subject' e o sujeito precisa apenas 
saber que o observador implementa a interface 'observer' e como registrar um novo observador na sua lista de observadores 


**Identify the aspects of your application that vary and separate them from what stays the same.**

` The thing that varies in the Observer Pattern       
  is the state of the Subject and the number and     
  types of Observers. With this pattern, you can      
  vary the objects that are dependent on the state    
  of the Subject, without having to change that       
  Subject. That’s called planning ahead!`

**Program to an interface, not an implementation.**

` Both the Subject and Observer use interfaces.      
  The Subject keeps track of objects implementing    
  the Observer interface, while the observers         
  register with, and get notified by, the Subject       
  interface. As we’ve seen, this keeps things nice and      
  loosely coupled.     `  
  
  **Favor composition over inheritance.** 
  
`  O observador tem um sujeito, e o sujeito tem uma lista de observadores . 
    The Observer Pattern uses composition to compose  
    any number of Observers with their Subjects.        
    These relationships aren’t set up by some kind of     
    inheritance hierarchy. No, they are set up at     
    runtime by composition!`