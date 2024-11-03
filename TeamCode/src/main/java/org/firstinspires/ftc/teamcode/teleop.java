package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "SP Teleop", group = "2024-25 SP")
public class teleop extends LinearOpMode {

    Drive driveTeleOp = new Drive();

    @Override
    public void runOpMode() throws InterruptedException {

        driveTeleOp.leftliner.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        driveTeleOp.leftliner.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        driveTeleOp.leftliner.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        waitForStart();



        driveTeleOp.topleft.setPower(-gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        driveTeleOp.backleft.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        driveTeleOp.topright.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        driveTeleOp.backright.setPower(gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        driveTeleOp.leftliner.setPower(gamepad2.right_stick_y);
        driveTeleOp.intake.setPower(-gamepad2.left_stick_y);

        if (gamepad2.a){
            driveTeleOp.arm.setPosition(1);

        }

        if (gamepad2.b){
            driveTeleOp.arm.setPosition(-1);

        }
    }
}
