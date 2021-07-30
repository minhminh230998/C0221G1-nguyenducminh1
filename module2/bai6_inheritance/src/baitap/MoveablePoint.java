package baitap;

public class MoveablePoint extends Point2D {
    private float XSpeed=5.0f;
    private float YSpeed=5.0f;

    public MoveablePoint(float x, float y) {
        super(x, y);
    }

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float XSpeed, float YSpeed) {
        super(x, y);
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }
    public void setSpeed(float XSpeed,float YSpeed){
        this.XSpeed=XSpeed;
        this.YSpeed=YSpeed;
    }
    public float[] getSpeed(){
        float[] array=new float[2];
        array[0]=XSpeed;
        array[1]=YSpeed;
        return array;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                super.toString()+
                "XSpeed=" + XSpeed +
                ", YSpeed=" + YSpeed +
                '}';
    }
    public MoveablePoint move(){
        x+=XSpeed;
        y+=YSpeed;

        return this;

    }
}
