package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "SP Auto1", group = "2024-25 SP")
public class Auto1 extends LinearOpMode {
/*
Bryce
11/10/2024

This code is for starting spot number 1 and ending spot 1

Starting spot 1 is closest to observation zone
ending spot 1 is closest to corner of field

Drives forward 10.5 mm
turns 90 degrees right
goes forward 62 mm
turns 90 left
goes backwards 10.5 mm
 */


    //calls instilization of motors and servos
    Drive2 driveAuto = new Drive2();
    LineraMecanizme LineraMecanizmeteleop = new LineraMecanizme();
    double forwardSpeed = 0.5;
    double backwardSpeed = -0.5;

    //in milliseconds
    int startTime = 300;
    int firstTurnTime = 1000;
    int howFarSideways = 2150;
    int secondTurnTime = 1000;
    int backwardTime = 300;

    int sleepTime = 10;
    int sleepArm = 1000;

    @Override
    public void runOpMode() throws InterruptedException {

        //geting hardwareMap
        driveAuto.init(hardwareMap);
        LineraMecanizmeteleop.init(hardwareMap);
        waitForStart();

        LineraMecanizmeteleop.arm.setPosition(1);
        driveAuto.moveforward(forwardSpeed, startTime);
        driveAuto.stopmotor();
        sleep(sleepTime);
        driveAuto.RightTurn(forwardSpeed, firstTurnTime);
        driveAuto.stopmotor();
        sleep(sleepTime);
        driveAuto.moveforward(forwardSpeed, howFarSideways);
        driveAuto.stopmotor();
        sleep(sleepTime);
        driveAuto.LeftTurn(forwardSpeed, secondTurnTime);
        driveAuto.stopmotor();
        driveAuto.moveforward(backwardSpeed, backwardTime);
        driveAuto.stopmotor();
        LineraMecanizmeteleop.arm.setPosition(1);
        sleep(sleepArm);
    }
}











