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

    //calls instilization of motors and servos
    Drive2 driveAuto = new Drive2();

    int forwardSpeed = 1;
    int backwardSpeed = -1;

    //in milliseconds
    int startTime = 220;
    int firstTurnTime = 500;
    int howFarSideways = 1295;
    int secondTurnTime = 375;
    int backwardTime = 220;

    int sleepTime = 10;

    @Override
    public void runOpMode() throws InterruptedException {

        //geting hardwareMap
        driveAuto.init(hardwareMap);
        waitForStart();

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
        sleep(sleepTime);
        driveAuto.moveforward(backwardSpeed, backwardTime);
        driveAuto.stopmotor();


    }

}











