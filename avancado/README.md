
#
Foi possível calcular o fatorial de números acima de 100, como pode ser visto no método recursivo() da classe Fatorial. Porém é preciso levar em consideração que foi utilizado um tipo de dado da linguagem Java, a saber o BigInteger, que oferece suporte para os números gerados através das operações de multiplicação realizadas para obter o fatorial de n.

O métodos topDown() e bottomUp() foram implementados usando programação dinâmica. 
O método topDown() tem melhor desempenho que o recursivo, já que faz uso de memoização. Além disso, possui complexidade de espaço 
O(n), pois armazena valores de 1! até n!,e a profundidade da pilha de chamadas é equivalente à O(n), vez que o número de chamadas corresponde ao input n. A complexidade de tempo é O(n2logn).

No que diz respeito ao bottomUp(), a complexidade de espaço é O(n), porque armazena n+1 elementos. A complexidade de tempo é de O(n2logn), pois faz n iterações, e a cada multiplicação o número aumenta a quantidade de dígitos.

O algoritmo que seleciona o elemento n da sequência Fibonacci tem complexidade de espaço O(n), vez que armazena os valores da sequência, e além disso a pilha de chamadas corresponde a n vezes, a depender do número escolhido. Já a complexidade de tempo é O(n), pois o resultado do cálculo é armazenado na estrutura, e assim não precisa ser recalculado, sendo o número de chamadas equivalente a n.
