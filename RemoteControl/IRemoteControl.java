package RemoteControl;

interface IRemoteControl {
  public abstract void turnOn();
  public abstract void turnOff();
  public abstract void openMenu();
  public abstract void closeMenu();
  public abstract void volumeUp();
  public abstract void volumeDown();
  public abstract void mute();
  public abstract void unmute();
  public abstract void play();
  public abstract void pause();
}
