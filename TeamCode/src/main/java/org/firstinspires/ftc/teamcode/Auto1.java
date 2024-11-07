package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "SP Auto1", group = "2024-25 SP")
public class Auto1 extends LinearOpMode {

    Drive2 driveAuto = new Drive2();
    //calls instilization of motors and servos
    @Override
    public void runOpMode() throws InterruptedException {

        driveAuto.init(hardwareMap);
        waitForStart();

        moveforward(1, 220);
        stopmotor();
        sleep(10);
        turn(1, 500);
        stopmotor();
        sleep(10);
        moveforward(1, 750);
        stopmotor();
        sleep(10);
        turn(-1, 300);
        stopmotor();
        moveforward(-1, 220);
        stopmotor();
    }

    public void moveforward(double power, long time){
        driveAuto.backleft.setPower(-power);
        driveAuto.backright.setPower(-power);
        driveAuto.topleft.setPower(power);
        driveAuto.topright.setPower(power);
        //how long it waits
        sleep(time);

    }

    public void straif(double power, long time){
        driveAuto.backleft.setPower(power);
        driveAuto.backright.setPower(-power);
        driveAuto.topleft.setPower(-power);
        driveAuto.topright.setPower(power);
        //how long it waits
        sleep(time);

    }


    public void stopmotor(){
        driveAuto.backleft.setPower(0);
        driveAuto.backright.setPower(0);
        driveAuto.topleft.setPower(0);
        driveAuto.topright.setPower(0);

    }
    public void turn(double power, long time){
        driveAuto.backleft.setPower(-power);
        driveAuto.backright.setPower(power);
        driveAuto.topleft.setPower(power);
        driveAuto.topright.setPower(-power);
        //how long it waits
        sleep(time);

    }
}











