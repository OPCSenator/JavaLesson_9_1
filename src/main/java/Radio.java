public class Radio {

    private final int minChannelNumber = 0;
    private final int maxChannelNumber = 9;
    private final int maxSoundLevel = 10;
    private final int minSoundLevel = 0;

    private int currentChannel = 0;
    private int currentLoud = 0;

    public void setNextChannel() {
        if (currentChannel < maxChannelNumber) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }

    }

    public void setPreviosChannel() {
        if (currentChannel > minChannelNumber) {
            currentChannel--;
        } else {
            currentChannel = 9;
        }

    }


    public void setChannel(int myChannel) {
        if ((myChannel >= 0) & (myChannel <= 9)) {
            currentChannel = myChannel;
        }

    }

    public void setMoreLoud() {
        if (currentLoud < maxSoundLevel) {
            currentLoud++;
        }

    }

    public void setLessLoud() {
        if (currentLoud > minSoundLevel) {
            currentLoud--;}

    }

    public void setSoundLevel(int mySound) {
        if ((mySound >= 0) & (mySound <= 10)) {
            currentLoud = mySound;
        }

    }

    public int getCurrentChannel() {
        return currentChannel;

    }

    public int getCurrentLoud() {
        return currentLoud;

    }


}
