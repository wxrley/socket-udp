import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {

    public static void main(String[] args) {
        try {
            // Criando ServerUDP que irá aguardar datagramas na porta=12345
            DatagramSocket socket = new DatagramSocket(12345);
            System.out.println("UDP server waiting messages...");

            byte[] buffer = new byte[1024];

            while (true) {
                /*
                 * DatagramPacket: pacote que o servidor irá guardar a mensagem recebida do cliente.
                 * buffer: espaço na memória onde os dados recebidos serão armazenados.
                 * buffer.length: tamanho máximo de dados que o servidor aceita receber por vez.
                 */
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                /*
                 * String: converte os bytes recebidos pelo servidor em texto.
                 * packet.getData(): retorna os bytes da mensagem enviada pelo cliente.
                 * 0: indica que a conversão começa no primeiro byte do array.
                 * packet.getLength(): usa somente os bytes válidos da mensagem (ignora espaço vazio do buffer).
                 */
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Message received: " + message);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
