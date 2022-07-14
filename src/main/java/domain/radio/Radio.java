package domain.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }


    public void increaseTheVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reducingTheVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }

    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }

    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;

        }
        this.currentStation = currentStation;
    }

}
