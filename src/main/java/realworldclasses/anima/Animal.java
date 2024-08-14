package realworldclasses.anima;

public class Animal {

    // has tail?
    public boolean tail = true;

    public boolean isTail() {
      return tail;
    }

    private int eyesCount = 2;

    public int getEyesCount() {
      return eyesCount;
    }

    private int earsCount = 2;

    public int getEarsCount() {
      return earsCount;
    }

    private int noseCount = 1;

    public int getNoseCount() {
      return noseCount;
    }

    private int mouthCount = 1;

    public int getMouthCount() {
      return mouthCount;
    }

    private int legsCount = 2;

    public int getLegsCount() {
      return legsCount;
    }

    private boolean walking;

    public boolean isWalking() {
      return walking;
    }

    public void setWalking(boolean walking) {
      this.walking = walking;
    }

    public int getMovingSpeed() {
      return movingSpeed;
    }

    public void setMovingSpeed(int movingSpeed) {
      this.movingSpeed = movingSpeed;
    }

    private int movingSpeed;

    // can walk?
    private boolean walk = true;

    // can fly?
    private boolean fly = false;

    public boolean getFly()
    {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    // in inches
    //in cms
    private int legsHeight;

    public int getLegsHeight() {
      return legsHeight;
    }

    //in cms
    private int tailLength;

    public int getTailLength() {
      return tailLength;
    }
}
