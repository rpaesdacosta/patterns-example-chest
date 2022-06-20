Singleton Pattern (Padrao de Criação)

Responsavel por centralizar e compartilhar recursos, mantendo apenas uma instancia de uma classe disponivel.

No exemplo temos a classe MagicDice, que tem seu construtor privado, e precisa do metodo "getInstance" para que uma nova instancia seja iniciada caso a atual seja nula, do contrario é retornada a instancia atual.
