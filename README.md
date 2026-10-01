# BlackJack

Jogo de Blackjack (21) no terminal, feito em Java. Você joga contra o dealer, com cartas desenhadas na tela e apostas.

## Requisitos

- Windows
- JDK 21 ou mais novo (é preciso o JDK, que traz o compilador `javac`; só o Java para rodar programas não basta)

Para conferir se o JDK está instalado, abra o Prompt de Comando e digite:

```
javac -version
```

Se aparecer a versão, está tudo certo. Se aparecer que o comando não foi encontrado, instale o JDK antes de continuar.

## Como rodar

1. Baixe o projeto: na página do repositório, clique em **Code** e depois em **Download ZIP**.
2. Extraia o arquivo ZIP em qualquer pasta.
3. Abra a pasta extraída e dê dois cliques em `run.bat`.

Quem usa Git também pode baixar com:

```
git clone https://github.com/JoaaoPaulo/BlackJack.git
```

## Como jogar

- Você começa com 10000 de saldo.
- No começo de cada rodada, digite quanto quer apostar.
- Durante a sua vez, digite `1` para pedir carta (hit) ou `2` para parar (stand).
- O objetivo é chegar o mais perto possível de 21 sem passar. Se passar de 21, você perde.
- O Ás vale 11 ou 1, o que for melhor para a mão. Valete, Dama e Rei valem 10.
- Depois que você para, o dealer compra cartas até ter 17 ou mais.
- Se você ganhar, recebe o valor apostado como prêmio.
- No fim de cada rodada, digite `y` para jogar de novo ou `n` para sair.
