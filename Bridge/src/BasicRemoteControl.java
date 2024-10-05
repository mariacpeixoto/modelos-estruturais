
public class BasicRemoteControl extends RemoteControl {
	public BasicRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Controle remoto: Alterando para o canal " + channel);
        tv.tuneChannel(channel);
    }
}
