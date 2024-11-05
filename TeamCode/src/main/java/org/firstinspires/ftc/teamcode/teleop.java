package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "SP Teleop")
public class teleop extends LinearOpMode {
    //calls instilization of motors and servos

    public HardwareMap hardwaremap;

    public DcMotor leftliner;


    public DcMotor topleft;
    public DcMotor topright;
    public DcMotor backleft;
    public DcMotor backright;
    @Override
    public void runOpMode() throws InterruptedException {

        topleft = hardwareMap.get(DcMotor.class, "topleft");
        backleft = hardwareMap.get(DcMotor.class, "backleft");
        topright = hardwareMap.get(DcMotor.class, "topright");
        backright = hardwareMap.get(DcMotor.class, "backright");

        leftliner = hardwareMap.get(DcMotor.class, "leftliner");


        waitForStart();



        topleft.setPower(-gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        backleft.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        topright.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        backright.setPower(gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        leftliner.setPower(gamepad2.right_stick_y);
    }
}
