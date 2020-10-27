package RemoteControl;

public class RemoteControl implements IRemoteControl {
  private int volume;
  private boolean on;
  private boolean playing;

  // GETTERS and SETTERS
  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public boolean isPlaying() {
    return playing;
  }

  public void setPlaying(boolean playing) {
    this.playing = playing;
  }

  // Methods
  @Override
  public void turnOn() {
    this.setOn(true);
  }

  @Override
  public void turnOff() {
    this.setOn(false);
  }

  @Override
  public void openMenu() {
    System.out.println("====== MENU ======");
    System.out.println("Está ligado? " + this.isOn());
    System.out.println("Está tocando? " + this.isPlaying());
    System.out.println("Volume: " + this.getVolume());
    System.out.println("");
  }

  @Override
  public void closeMenu() {
    System.out.println("Fechando menu");
  }

  @Override
  public void volumeUp() {
    if (this.isOn()) {
      this.setVolume(this.getVolume() + 5);
    }
  }

  @Override
  public void volumeDown() {
    if (this.isOn()) {
      this.setVolume(this.getVolume() - 5);
    }
  }

  @Override
  public void mute() {
    if (this.isOn() && this.getVolume() > 0) {
      this.setVolume(0);
    }
  }

  @Override
  public void unmute() {
    if (this.isOn() && this.getVolume() == 0) {
      this.setVolume(50);
    }
  }

  @Override
  public void play() {
    if (this.isOn() && !(this.isPlaying())) {
      this.setPlaying(true);
    }
  }

  @Override
  public void pause() {
    if (this.isOn() && this.isPlaying()) {
      this.setPlaying(false);
    }
  }

  // Constructor
  public RemoteControl() {
    this.setVolume(50);
    this.setOn(false);
    this.setPlaying(false);
  }

  public static void main(String[] args) {
    RemoteControl c1 = new RemoteControl();

    c1.turnOn();
    c1.openMenu();

    c1.volumeUp();
    c1.openMenu();

    c1.mute();
    c1.openMenu();

    c1.turnOff();
    c1.openMenu();
  }
}
