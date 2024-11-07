 package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name ="teleop", group = "2024-25 SP")
public class Drive extends OpMode {

    Drive2 driveteleop = new Drive2();
    LineraMecanizme LineraMecanizmeteleop = new LineraMecanizme();



    @Override
    public void init() {

        driveteleop.init(hardwareMap);
        LineraMecanizmeteleop.init(hardwareMap);


    }

    @Override
    public void loop() {
        driveteleop.topleft.setPower(-gamepad1.right_stick_y / 1.1 + -gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        driveteleop.backleft.setPower(gamepad1.right_stick_y / 1.1 + -gamepad1.left_stick_x * 1.1 -gamepad1.right_stick_x);
        driveteleop.topright.setPower(-gamepad1.right_stick_y * 1.1 + gamepad1.left_stick_x * 1.2 -gamepad1.right_stick_x);
        driveteleop.backright.setPower(gamepad1.right_stick_y * 1.1 + gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        LineraMecanizmeteleop.leftliner.setPower(gamepad2.right_stick_y);

        LineraMecanizmeteleop.Intake.setPower(gamepad2.left_stick_y);

        if (gamepad2.a){
            LineraMecanizmeteleop.arm.setPower(1);

        }

        if (gamepad2.b){
            LineraMecanizmeteleop.arm.setPower(-1);

        }


        }
}