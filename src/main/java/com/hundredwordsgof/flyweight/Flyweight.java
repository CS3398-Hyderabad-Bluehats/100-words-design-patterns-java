package com.hundredwordsgof.flyweight;

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 * Ryan Howard edited this file :D
 */
public interface Flyweight {

  void operation(Object extrinsicState);
}
