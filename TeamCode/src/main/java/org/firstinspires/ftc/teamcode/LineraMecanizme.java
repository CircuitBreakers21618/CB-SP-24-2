package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class LineraMecanizme {
    public DcMotor Intake;
    public DcMotor leftliner;
    public Servo arm;


    public void init(HardwareMap hwMap){
        Intake = hwMap.get(DcMotor.class, "Intake");
        leftliner = hwMap.get(DcMotor.class, "leftliner");
        arm = hwMap.get(Servo.class, "arm");
        leftliner.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftliner.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftliner.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);    }
}
