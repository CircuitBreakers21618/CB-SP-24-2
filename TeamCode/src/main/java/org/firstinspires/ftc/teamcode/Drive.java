 package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name ="drive")
public class Drive extends OpMode {

    Drive2 driveteleop = new Drive2();



    @Override
    public void init() {

        driveteleop.init(hardwareMap);


    }

    @Override
    public void loop() {
        driveteleop.topleft.setPower(-gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        driveteleop.backleft.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        driveteleop.topright.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        driveteleop.backright.setPower(gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
//        leftliner.setPower(gamepad2.right_stick_y);
//
//        intake.setPower(gamepad2.left_stick_y);
//
//        if (gamepad2.a){
//            arm.setPosition(1);
//
//        }
//
//        if (gamepad2.b){
//            arm.setPosition(-1);
//
//        }


        }
}