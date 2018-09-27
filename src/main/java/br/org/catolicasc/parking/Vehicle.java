package br.org.catolicasc.parking;

public abstract class Vehicle implements IVehicle {
  protected String plate;
  protected String model;
  protected String color;

  /**
   * Return the car plate as string
   * @return
   */
  public String getPlate() { return this.plate; }

  /***
   * Set the car plate
   * @param plate
   */
  public void setPlate(String plate) { this.plate = plate; }

  /***
   * Return the car model
   * @return
   */
  public String getModel() { return this.model; }

  /***
   * Set the car model
   * @param model
   */
  public void setModel(String model) {this.model = model; }

  /***
   * Return the color of the car
   * @return
   */
  public String getColor() {return this.color; }

  /***
   * Set the car color
   * @param color
   */
  public void setColor(String color) {this.color = color; }
}

