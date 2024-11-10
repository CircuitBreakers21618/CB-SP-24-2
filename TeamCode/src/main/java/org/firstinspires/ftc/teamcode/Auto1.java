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

    @Override
    public void runOpMode() throws InterruptedException {

        //geting hardwareMap
        driveAuto.init(hardwareMap);
        waitForStart();

        driveAuto.moveforward(1, 220);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.turn(1, 500);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.moveforward(1, 750);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.turn(-1, 300);
        driveAuto.stopmotor();
        driveAuto.moveforward(-1, 220);
        driveAuto.stopmotor();
    }
}











