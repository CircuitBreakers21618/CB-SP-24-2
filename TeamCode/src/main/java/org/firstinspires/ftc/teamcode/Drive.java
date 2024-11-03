package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Drive{

    public HardwareMap hardwaremap;
    public DcMotor topleft;
    public DcMotor topright;
    public DcMotor backleft;
    public DcMotor backright;


    public Drive(){

        topleft = hardwaremap.get(DcMotor.class, "topleft");
        backleft = hardwaremap.get(DcMotor.class, "backleft");
        topright = hardwaremap.get(DcMotor.class, "topright");
        backright = hardwaremap.get(DcMotor.class, "backright");



    }
}