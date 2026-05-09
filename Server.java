import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {

    private static final int PORT = 12345;

    public static void main(String[] args) {
        // Criando ServerUDP que irá aguardar datagramas na porta definida em PORT
        try (DatagramSocket socket = new DatagramSocket(PORT)) {
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

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
