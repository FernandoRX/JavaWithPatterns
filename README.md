# JavaWithPatterns
projeto em java desenvolvido utilizando quatro patterns

Descrição do trabalho 

O projeto é um sistema de vendas, onde um cliente pode comprar vários produtos, após escolher os produtos ele passa seu cartão de crédito para efetuar o pagamento e o sistema tenta encontrar qual banco aquele cartão pertence, logo após o sistema gera uma nota fiscal e deixa o cliente decidir como ele quer receber a sua via.

Patterns: Composite , Builder , Chain of Responsibility e Bridge
Linguagem: Java
 
Composite 

   O composite foi usado para poder cadastrar os diversos produtos que o fornecedor pode oferecer, e esses produtos podem se juntar e formar kits, porém os produtos normais e os kits são tratados da mesma maneira.

Vantagem → quando um cliente comprar mais de um produto no mesmo pedido, ele adiciona esses produtos em uma lista, com o composite eu posso adicionar tanto kits como produtos simples nesta mesma lista.

Builder

   Utilizei o builder somente para deixar a construção dos produtos simples e dos produtos composto mais coesa e fluente.

Vantagem → Main mais limpo e legível.

Bridge 

   O Bridge foi utilizado para gerar a nota fiscal, pois o processo de gerar a nota é um Template que varia somente o tipo de arquivo exportado . O Strategy foi  usado para o cliente poder decidir como ele quer receber sua via em tempo de execução.

Vantagem → O bridge garante que a nota vai ser emitida com rigidez , seguindo sempre o modelo.
    
Chain Of Responsibility

   O Chain foi utilizado como um buscador de Bancos, um caso de uso seria assim que o cartão do cliente entrasse no leitor , ele iria buscar e verificar se o cartão é de algum banco válido.

Vantagem → Caso fosse ocorrer futuras manutenções, como adicionar outros bancos, seria simplesmente criar uma nova classe e fazer ela implementar a interface de buscadores.


