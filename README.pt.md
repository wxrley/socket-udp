<p align="center">
  Language:
  <a href="README.md">English</a> | 
  <a href="README.pt.md">Português</a>
</p>

# Comunicação UDP
Este projeto demonstra o funcionamento da comunicação entre processos via protocolo **UDP** com a API nativa do Java. \
Inclui exemplos de como enviar e receber datagramas, transmitindo informações entre cliente e servidor.

## Funcionalidades
- Envio e recebimento de mensagens em tempo real.
- Envio contínuo de mensagens por UDP.
- Simulação de sensores: temperatura + umidade.
- Comunicação em rede local via UDP.

## Tecnologias
- Java
- Sockets UDP
- Datagramas

## Estrutura
```
📂 socket-udp/
├── Client.java
├── README.md
├── README.pt.md
└── Server.java
```

## Instalação
**1.** Verifique se o **Java** está instalado em sua máquina:
> Para confirmar, execute no terminal:
> ```bash
> java -version
> ```
> Caso não esteja instalado, baixe o [Java](https://www.oracle.com/java/technologies/downloads/).

**2.** Baixe ou clone o repositório:
> ```bash
> git clone https://github.com/wxrley/socket-udp.git
> ```

## Execução
### Opção 1 — Via Terminal
**1.** Navegue até a raiz do projeto e compile os arquivos:
> ```bash
> javac Server.java Client.java
> ```

**2.** Execute o servidor:
> ```bash
> java Server
> ```

**3.** Em outro terminal, execute o cliente:
> ```bash
> java Client
> ```
> O programa roda continuamente. \
> Para encerrar, digite `ctrl + c` em cada terminal.

### Opção 2 — Via IDE (IntelliJ, Eclipse, VS Code, etc.)
**1.** Abra a pasta do projeto na sua IDE preferida. \
**2.** Abra o arquivo `Server.java` e clique em **Run** para iniciar o servidor. \
**3.** Em seguida, abra o arquivo `Client.java` e clique em **Run** para iniciar o cliente. \
**4.** Use o console da IDE para visualizar as mensagens. \
**5.** Para finalizar a comunicação, pare a execução.
