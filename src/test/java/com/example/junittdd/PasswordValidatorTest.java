package com.example.junittdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PasswordValidatorTest {
    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    void shouldAcceptPasswordLongerThanSixCharacters() {
        String passwordToCheck = "1234567";

        boolean result = passwordValidator.validate(passwordToCheck);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldAcceptPasswordWithSixCharacters() {
        String passwordToCheck = "123456";

        boolean result = passwordValidator.validate(passwordToCheck);

        Assertions.assertThat(result).isTrue();
    }

    @Test
    void shouldNotAcceptPasswordShorterThanSixCharacters() {
        String passwordToTest = "1234";

        boolean result = passwordValidator.validate(passwordToTest);

        Assertions.assertThat(result).isFalse();
    }

}