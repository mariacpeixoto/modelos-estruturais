
public class Main {
	public static void main(String[] args) {
        // Cria uma SonyTV
        TV sonyTV = new SonyTV();

        // Usa um controle remoto básico para controlar a SonyTV
        RemoteControl remoteControl = new BasicRemoteControl(sonyTV);

        // Muda o canal
        remoteControl.setChannel(5);
    }
}
