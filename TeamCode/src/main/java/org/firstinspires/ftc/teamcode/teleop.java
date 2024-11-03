package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "SP Teleop", group = "2024-25 SP")
public class teleop extends LinearOpMode {

    Drive driveTeleOp = new Drive();
    Lift_Mecanizm lift_mecanizmTeleOp = new Lift_Mecanizm();
    //calls instilization of motors and servos


    @Override
    public void runOpMode() throws InterruptedException {

        lift_mecanizmTeleOp.leftliner.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        lift_mecanizmTeleOp.leftliner.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lift_mecanizmTeleOp.leftliner.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        waitForStart();



        driveTeleOp.topleft.setPower(-gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        driveTeleOp.backleft.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        driveTeleOp.topright.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        driveTeleOp.backright.setPower(gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        lift_mecanizmTeleOp.leftliner.setPower(gamepad2.right_stick_y);
        lift_mecanizmTeleOp.intake.setPower(-gamepad2.left_stick_y);

        if (gamepad2.a){
            lift_mecanizmTeleOp.arm.setPosition(1);

        }

        if (gamepad2.b){
            lift_mecanizmTeleOp.arm.setPosition(-1);

        }
    }
}
