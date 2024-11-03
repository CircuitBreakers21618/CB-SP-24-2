package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "SP Teleop", group = "2024-25 SP")
public class teleop extends LinearOpMode {

    Drive drive = new Drive();

    @Override
    public void runOpMode() throws InterruptedException {

        motor.setmode()
        waitForStart();



        drive.topleft.setPower(-gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        drive.backleft.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        drive.topright.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        drive.backright.setPower(gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        drive.leftliner.setPower(gamepad2.right_stick_y);
        drive.intake.setPower(-gamepad2.left_stick_y);

        if (gamepad2.a){
            drive.arm.setPosition(1);

        }

        if (gamepad2.b){
            drive.arm.setPosition(-1);

        }
    }
}
