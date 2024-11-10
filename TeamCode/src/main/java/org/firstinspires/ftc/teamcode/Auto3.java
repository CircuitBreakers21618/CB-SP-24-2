package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "SP Auto3", group = "2024-25 SP")
public class Auto3 extends LinearOpMode {

    /*
Bryce
11/10/2024

This code is for starting spot number 2 and ending spot 1

Starting spot 2 is farthest from observation zone
ending spot 1 is closest to corner of field

Drives forward 11 mm
turns 90 degrees right
goes forward 245 mm
turns 90 left
goes backwards 11 mm
 */
    Drive2 driveAuto = new Drive2();
    //calls instilization of motors and servos
    @Override
    public void runOpMode() throws InterruptedException {

        driveAuto.init(hardwareMap);
        //geting hardwareMap
        waitForStart();

        driveAuto.moveforward(1, 220);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.turn(1, 500);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.moveforward(1, 1295);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.turn(-1, 375);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.moveforward(-1, 260);
        driveAuto.stopmotor();


    }

}











