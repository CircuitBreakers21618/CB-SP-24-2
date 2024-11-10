package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "SP Auto2", group = "2024-25 SP")
public class Auto2 extends LinearOpMode {
     /*
Bryce
11/10/2024

This code is for starting spot number 2 and ending spot 2

Starting spot 2 is farthest from the observation zone
ending spot 2 is farthest from the corner of field

Drives forward 11 mm
turns 90 degrees right
goes forward 192 mm
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
        driveAuto.moveforward(1, 1700);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.turn(-1, 375);
        driveAuto.stopmotor();
        sleep(10);
        driveAuto.moveforward(-1, 260);
        driveAuto.stopmotor();


    }
}
