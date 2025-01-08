
# Complexidade assintótica

Lista encadeada:
- push(): O(1) - Já existe referência para o Tail da estrutura, bastando que esse nó aponte para o novo, e em seguida referenciar o novo nó como Tail.
- pop(): O(n) - No pior caso é necessário percorrer a lista até encontrar o Tail e guardar a referência ao nó anterior, que será o novo Tail.
- insert(int value,int position): O(n) - No pior cenário é preciso percorrer a lista até encontrar a posição indicada.
- remove(int position): O(n) - No pior caso se faz necessário percorrer a lista até encontrar a posição escolhida.
- elementAt(int position): O(n) - No pior caso se faz necessário percorrer a lista até encontrar o elemento da posição escolhida.  
#
Pilha:
- push(int value): O(1) - Existe referência ao nó que está no topo, e basta fazer com que esse aponte para o novo nó, bem como o novo nó aponte para aquele usando a referência previous, e por fim fazer a referência top apontar para o novo nó.
- pop(): O(1) - A referência ao nó que está no topo apontará para o nó anterior a ele, e em seguida o nó que passou a ser considerado o topo não apontará para nenhum nó.
#
Fila:
- enqueue(int value): O(1) - O último nó da fila é referenciado (back), bastando fazer esse apontar para o novo nó e em seguida usar a referência ao último nó da fila para apontar para o novo. 
- dequeue(int value): O(1) - A referência ao primeiro nó (front) passa a apontar para o próximo, e o nó que era referenciado como primeiro não apontará para outro.
- rear(): O(1) - Retorna o nó referenciado na estrutura como back.
- front(): O(1) - Retorna o nó referenciado na estrutura como front.
#
Tabela Hash:
- Para a função Hash optei por utilizar o método da multiplicação, pela qual usamos uma chave constante (número decimal), a parte fracionária do resultado anterior é retirada, o número anterior é multiplicado pelo tamanho da tabela e a parte inteira do resultado anterior é extraída.