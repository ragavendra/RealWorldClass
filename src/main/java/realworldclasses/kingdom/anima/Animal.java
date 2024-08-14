package realworldclasses.kingdom.anima;

public abstract class Animal implements IAnimal {

    // has tail?
    public boolean tail;

    public void setTail(boolean tail) {
      this.tail = tail;
    }

    public boolean hasTail() {
      return tail;
    }

    private int eyesCount = 2;

    public void setEyesCount(int eyesCount) {
      this.eyesCount = eyesCount;
    }

    public void setEarsCount(int earsCount) {
      this.earsCount = earsCount;
    }

    public void setNoseCount(int noseCount) {
      this.noseCount = noseCount;
    }

    public void setMouthCount(int mouthCount) {
      this.mouthCount = mouthCount;
    }

    public void setLegsCount(int legsCount) {
      this.legsCount = legsCount;
    }

    public boolean isWalk() {
      return walk;
    }

    public void setWalk(boolean walk) {
      this.walk = walk;
    }

    public void setLegsHeight(int legsHeight) {
      this.legsHeight = legsHeight;
    }

    public void setTailLength(int tailLength) {
      this.tailLength = tailLength;
    }

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
