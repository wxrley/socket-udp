import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        try {
            // Criando SocketUDP e definindo no InetAddress o IP do servidor que receberá os pacotes
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            System.out.println("UDP client started!");

            while (true) {
                Random random = new Random();
                double temperature = 20 + random.nextDouble() * 10;
                int humidity = 40 + random.nextInt(30);
                
                String message = String.format("Sensor1: %.1f°C, Sensor2: %d%%RH", temperature, humidity);

                // Convertendo string em bytes
                byte[] data = message.getBytes();
                
                /*
                 * DatagramPacket: Pacote que carrega a mensagem que o cliente quer enviar ao servidor.
                 * data: A mensagem já convertida em bytes para ser transmitida.
                 * data.length: Tamanho do conteúdo a ser enviado.
                 * address: IP do servidor que deve receber o pacote.
                 * 12345: porta onde o servidor está aguardando o recebimento.
                 */
                DatagramPacket packet = new DatagramPacket(data, data.length, address, 12345);
                socket.send(packet);

                System.out.println("Sent -> " + message);

                Thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
