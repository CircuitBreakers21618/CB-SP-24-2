package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Lift_Mecanizm {

    public HardwareMap hardwaremap;
    public DcMotor intake;
    public DcMotor leftliner;



    public Servo arm;

    public Lift_Mecanizm(){

        intake = hardwaremap.get(DcMotor.class, "intake");
        leftliner = hardwaremap.get(DcMotor.class, "leftliner");

        arm = hardwaremap.get(Servo.class, "arm");


    }
}
