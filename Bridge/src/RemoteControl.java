
public abstract class RemoteControl {
	protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void setChannel(int channel);
}
