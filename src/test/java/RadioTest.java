import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testWorkRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoWorkRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoWorkRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoWorkRadioVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNextMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrevMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNextBorder1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNextBorder3() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNextBorder2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testStationPrevBorder() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrevBorder1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrevBorder2() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrevBorder3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNextMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePrevMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoVolumePrevMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testVolumeNextBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNextBorder1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNextBorder2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNextBorder3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePrevBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePrevBorder1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.reduceVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePrevBorder2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.reduceVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePrevBorder3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.reduceVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void costructWorkTestStationAndVolume() {
        Radio radio = new Radio(20, 100);
        radio.setCurrentStation(15);
        radio.setCurrentVolume(59);
        int expectedVolume = 59;
        int actualVolume = radio.getCurrentVolume();
        int expectedStations = 15;
        int actualStations = radio.getCurrentStation();
        Assertions.assertEquals(expectedStations, actualStations);
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void costructTestStationNext() {
        Radio radio = new Radio(20, 100);
        radio.setCurrentStation(19);
        radio.setCurrentVolume(100);
        radio.next();
        radio.increaseVolume();
        int expectedVolume = 100;
        int actualVolume = radio.getCurrentVolume();
        int expectedStations = 0;
        int actualStations = radio.getCurrentStation();
        Assertions.assertEquals(expectedStations, actualStations);
        Assertions.assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void costructTestStationPrev() {
        Radio radio = new Radio(20, 100);
        radio.setCurrentStation(0);
        radio.setCurrentVolume(0);
        radio.prev();
        radio.reduceVolume();
        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();
        int expectedStations = 19;
        int actualStations = radio.getCurrentStation();
        Assertions.assertEquals(expectedStations, actualStations);
        Assertions.assertEquals(expectedVolume, actualVolume);
    }


    @Test
    public void costructNoWorkTestStationAndVolume() {
        Radio radio = new Radio(20, 100);
        radio.setCurrentStation(21);
        radio.setCurrentVolume(101);
        int expectedStations = 0;
        int expectedVolume = 0;
        int actualVolume = radio.getCurrentVolume();
        int actualStations = radio.getCurrentStation();
        Assertions.assertEquals(expectedVolume, actualVolume);
        Assertions.assertEquals(expectedStations, actualStations);
    }

}



