package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "drive")
public class drive extends OpMode {

    DcMotor topleft, topright;
    DcMotor backleft, backright;
    DcMotor leftliner;
    DcMotor intake;


    Servo arm;


    @Override
    public void init() {
        topleft = hardwareMap.get(DcMotor.class, "topleft");
        backleft = hardwareMap.get(DcMotor.class, "backleft");
        topright = hardwareMap.get(DcMotor.class, "topright");
        backright = hardwareMap.get(DcMotor.class, "backright");
        leftliner = hardwareMap.get(DcMotor.class, "leftliner");
        intake = hardwareMap.get(DcMotor.class, "intake");


        arm = hardwareMap.get(Servo.class, "arm");



    }

    @Override
    public void loop() {
        topleft.setPower(-gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        backleft.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        topright.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        backright.setPower(gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        leftliner.setPower(gamepad2.right_stick_y);
        intake.setPower(-gamepad2.left_stick_y);

        if (gamepad2.a){
            arm.setPosition(1);

        }

        if (gamepad2.b){
            arm.setPosition(-1);

        }


    }
}