package realworldclasses.anima;

public class Animal {

    // has tail?
    public boolean tail = true;

    private int eyesCount = 2;

    public int getEyesCount() {
      return eyesCount;
    }

    public void setEyesCount(int eyesCount) {
      this.eyesCount = eyesCount;
    }

    private int earsCount = 2;

    public int getEarsCount() {
      return earsCount;
    }

    public void setEarsCount(int earsCount) {
      this.earsCount = earsCount;
    }

    private int noseCount = 1;

    public int getNoseCount() {
      return noseCount;
    }

    public void setNoseCount(int noseCount) {
      this.noseCount = noseCount;
    }

    public int getMouthCount() {
      return mouthCount;
    }

    public void setMouthCount(int mouthCount) {
      this.mouthCount = mouthCount;
    }

    private int legsCount = 2;

    public int getLegsCount() {
      return legsCount;
    }

    public void setLegsCount(int legsCount) {
      this.legsCount = legsCount;
    }

    private int mouthCount = 1;

    private boolean walking;

    private int movingSpeed;

    // can walk?
    private boolean walk = true;

    // can fly?
    private boolean _fly = false;

    public boolean getFly()
    {
        return _fly;
    }

    public void setFly(boolean _fly) {
        this._fly = _fly;
    }

    // in inches
    //in cms
    public abstract int legsHeight;

    //in cms
    public abstract int tailLength;
}
