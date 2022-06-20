Strategy Pattern (Padrao de Comportamento)

Responsavel por extrair os comportamentos comuns do codigo para uma interface.

Como no exemplo, temos:

Dice (dado) cuja a função é roll (rolar).

Cada dado pode ter um diferente numero de lado, portando os resultados podem variar conforme o numero de lados.

Foi utilizado o padrão Strategy, criando a iterface Dice com o metodo roll, no qual cada classe que implemente a interface Dice, deve fazer a sua sobrescrita, considerando sua propria regra para o método rolar.
