
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
