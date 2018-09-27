package br.org.catolicasc.parking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parking {
  private int parkingSize;
  private Date timeOfEnter;
  private Date timeOfExit;
  private List<Vehicle> parkingLots = new ArrayList<Vehicle>();

  public Parking() { }

  public Parking(int size) {
    this.parkingSize = size;
  }

  public int getParkingSize() { return this.parkingSize; }

  public void setParkingSize(int size) { this.parkingSize = size; }

  public Date getTimeOfEnter() { return this.timeOfEnter; }

  public void setTimeOfEnter(Date timeOfEnter) { this.timeOfEnter = timeOfEnter; }

  public Date getTimeOfExit() { return this.timeOfExit; }

  public void setTimeOfExit(Date timeOfExit) { this.timeOfExit = timeOfExit; }
}
