class Guittar extends Instrument {
  Console console = new Console();

  @Override
  void sound() {
    console.log("Strings thrum");
  }
}