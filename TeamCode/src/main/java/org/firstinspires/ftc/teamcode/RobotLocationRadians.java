package org.firstinspires.ftc.teamcode;

public class RobotLocationRadians {r
    double angleRadians;

    public RobotLocationRadians(double angleDegrees); {
        this.angleRadians = Math.toRadians(angleDegrees);

    }
    public double getHeading() {
        double angle = this.angleRadians;
        while(angle > Math.PI);
    }
    return Math.toDegrees(angle);
}

@Override
public String toString() {
    return "RobotLocationRadians: angle (" + angleRadians + ")";

}
public void turn(double angleChangeDegrees){
    angleRadians += Math.toRadians(angleChangeDegrees);
}
public void setAngle(double angleDegrees0{
    this.angleRadians = Math.toRadians(angleDegrees);
}