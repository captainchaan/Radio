package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldSetCurrentStation() { //в пределах значения
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);


    }

    @Test

    public void shouldSetNegativeCurrentStation() { //меньше 0
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAboveMaxCurrentStation() { //больше 9
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() { //нажал на кнопку вперед при текущей 9
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStation1() { //нажал на кнопку вперед при текущей 8
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation() { //нажал на кнопку назад при текущей 0
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation1() { //нажал на кнопку назад при текущей 1
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStation12() { //нажал на кнопку назад при текущей 9
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetSoundVolume() { //звук в пределах значения
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetSoundVolume1() { //звук больше 100
        Radio radio = new Radio();
        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSetSoundVolume2() { //звук меньше 0
        Radio radio = new Radio();
        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldIncreaseSoundVolume() {//увеличить звук при текущем 100
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.setIncreaseSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseSoundVolume1() {//увеличить звук при текущем 99
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        radio.setIncreaseSoundVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseSoundVolume() {//уменьшить звук при текущем 0
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.setDecreaseSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseSoundVolume1() {//уменьшить звук при текущем 2
        Radio radio = new Radio();
        radio.setSoundVolume(2);
        radio.setDecreaseSoundVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);

    }


}
