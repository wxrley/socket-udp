<p align="center">
  Language:
  <a href="README.md">English</a> | 
  <a href="README.pt.md">Português</a>
</p>

# 📡 UDP Communication

## 💡 About the project
This project demonstrates the workings of inter-process communication via **UDP** protocol using Java's native API. \
Includes examples of how to send and receive datagrams, transmitting information between client and server.

## ⚙️ Features
- Real-time message sending and receiving.
- Continuous message sending via UDP.
- Sensor simulation: temperature + humidity.
- Local network communication via UDP.

## 🧩 Technologies
- Java
- UDP Sockets
- Datagrams

## 📁 Project structure
```
📂 SocketUDP/
├── Client.java
└── Server.java
```

## 🛠️ Installation
**1.** Check if **Java** is installed on your machine:
> To confirm, run in the terminal:
> ```bash
> java -version
> ```
> If not installed, download [Java](https://www.oracle.com/java/technologies/downloads/).

**2.** Download or clone the repository:
> ```bash
> git clone https://github.com/wxrley/socket-udp.git
> ```

## 🚀 Running
### Option 1 — Via Terminal
**1.** Navigate to the project root and compile the files:
> ```bash
> javac Server.java Client.java
> ```
**2.** Run the server:
> ```bash
> java Server
> ```
> The console displays:
> ```bash
> UDP server waiting messages...
> ```
**3.** In another terminal, run the client:
> ```bash
> java Client
> ```
**4.** Output example:
> Client:
> ```bash
> Sent -> Sensor1: 25.4°C, Sensor2: 55%RH
> ```
> Server:
> ```bash
> Message received: Sensor1: 25.4°C, Sensor2: 55%RH
> ```
> The program runs continuously. \
> To exit: `CTRL + C` in each terminal.

### Option 2 — Via IDE (IntelliJ, Eclipse, VS Code, etc.)
**1.** Open the project folder in your preferred IDE. \
**2.** Open the `Server.java` file and click **Run** to start the server. \
**3.** Then, open the `Client.java` file and click **Run**. \
**4.** Use the IDE console to view the messages. \
**5.** To exit, stop the execution.

## 🥷 Author
**Wxrley**
