package com.hundredwordsgof.flyweight;

// I'm a comment for Michael Scales

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {

  void operation(Object extrinsicState);
}
