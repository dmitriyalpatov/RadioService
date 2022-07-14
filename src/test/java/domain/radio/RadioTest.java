package domain.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {



    @Test
    public void SetVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(7);

        int expected = 7;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeVimit() {
        Radio service = new Radio();

        service.setCurrentVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void negativeVolumeValues() {
        Radio service = new Radio();

        service.setCurrentVolume(-5);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(5);
        service.increaseVolume();

        int expected = 6;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeAboveAcceptableValues() {
        Radio service = new Radio();

        service.setCurrentVolume(10);
        service.increaseVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(5);
        service.decreaseVolume();

        int expected = 4;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeUnder0() {
        Radio service = new Radio();

        service.setCurrentVolume(0);
        service.decreaseVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }



    @Test
    public void setStation() {
        Radio service = new Radio();

        service.setCurrentStation(8);

        int expected = 8;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationOverLimit() {
        Radio service = new Radio();

        service.setCurrentStation(10);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setStationBelowLimit() {
        Radio service = new Radio();

        service.setCurrentStation(-1);

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio service = new Radio();

        service.setCurrentStation(1);
        service.nextStation();

        int expected = 2;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchingToTeginningAfterReaching9Stations() {
        Radio service = new Radio();

        service.setCurrentStation(9);
        service.nextStation();

        int expected = 0;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {
        Radio service = new Radio();

        service.setCurrentStation(4);
        service.prevStation();

        int expected = 3;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchingToTheEndOfSearchAfterReaching0Stations() {
        Radio service = new Radio();

        service.setCurrentStation(0);
        service.prevStation();

        int expected = 9;
        int actual = service.getCurrentStation();

        assertEquals(expected, actual);

    }

}
