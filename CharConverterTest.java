package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharConverterTest {
  private final CharConverter converter = new CharConverter();

  // test cases
  // 64, 65, 66, 71, 89, 90, 91

  @Test
  void convert_64_to_at_sign_returns_empty_string() {
    assertEquals("", converter.convertIntToLetter(64));
  }

  @Test
  void convert_65_to_char_A_succeeds() {
    assertEquals("A", converter.convertIntToLetter(65));
  }

  @Test
  void convert_66_to_char_B_succeeds() {
    assertEquals("B", converter.convertIntToLetter(66));
  }

  @Test
  void convert_80_to_char_P_succeeds() {
    assertEquals("P", converter.convertIntToLetter(80));
  }

  @Test
  void convert_89_to_char_Y_succeeds() {
    assertEquals("Y", converter.convertIntToLetter(89));
  }

  @Test
  void convert_90_to_char_Z_succeeds() {
    assertEquals("Z", converter.convertIntToLetter(90));
  }

  @Test
  void convert_91_to_square_bracket_returns_empty_string() {
    assertEquals("", converter.convertIntToLetter(91));
  }

  // lowercase test scenarios
  // 96, 97, 98, 110, 121, 122, 123
  @Test
  void convert_96_to_backtick_returns_empty_string() {
    assertEquals("", converter.convertIntToLetter(96));
  }

  @Test
  void convert_97_to_char_a_succeeds() {
    assertEquals("a", converter.convertIntToLetter(97));
  }

  @Test
  void convert_98_to_char_b_succeeds() {
    assertEquals("b", converter.convertIntToLetter(98));
  }

  @Test
  void convert_110_to_char_P_succeeds() {
    assertEquals("n", converter.convertIntToLetter(110));
  }

  @Test
  void convert_121_to_char_y_succeeds() {
    assertEquals("y", converter.convertIntToLetter(121));
  }

  @Test
  void convert_122_to_char_z_succeeds() {
    assertEquals("z", converter.convertIntToLetter(122));
  }

  @Test
  void convert_123_to_curly_bracket_returns_empty_string() {
    assertEquals("", converter.convertIntToLetter(123));
  }
}
