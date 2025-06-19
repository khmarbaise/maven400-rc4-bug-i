package com.soebes.examples.j2ee.service.impl;

import com.soebes.examples.j2ee.domain.Name;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleGreeterTest {

  @Test
  void name() {
    SimpleGreeter simpleGreeter = new SimpleGreeter();
    Name firstName = new Name("FirstName");
    String greetResult = simpleGreeter.greet(firstName);
    assertThat(greetResult).isEqualTo("Hello FirstName!");
  }
}