package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "SP Auto1", group = "2024-25 SP")
public class Auto1 extends LinearOpMode {

   Drive driveAuto = new Drive();
   Lift_Mecanizm lift_mecanizmAuto = new Lift_Mecanizm();
   //calls instilization of motors and servos
   @Override
   public void runOpMode() throws InterruptedException {

      waitForStart();

      while (opModeIsActive()){
//this is for Auto #1
       moveforward(1, 44);
       stopmotor();
       straif(1, 263);
       stopmotor();
       moveforward(-1, 44);
       stopmotor();
      }
   }

   public void moveforward(double power, long time){
      driveAuto.backleft.setPower(power);
      driveAuto.backright.setPower(power);
      driveAuto.topleft.setPower(-power);
      driveAuto.topright.setPower(-power);
      //how long it waits
      sleep(time);

   }

   public void straif(double power, long time){
      driveAuto.backleft.setPower(-power);
      driveAuto.backright.setPower(power);
      driveAuto.topleft.setPower(-power);
      driveAuto.topright.setPower(power);
      //how long it waits
      sleep(time);

   }


   public void turn(double power, long time){
      driveAuto.backleft.setPower(-power);
      driveAuto.backright.setPower(power);
      driveAuto.topleft.setPower(power);
      driveAuto.topright.setPower(-power);
      //how long it waits
      sleep(time);

   }

   public void stopmotor(){
      driveAuto.backleft.setPower(0);
      driveAuto.backright.setPower(0);
      driveAuto.topleft.setPower(0);
      driveAuto.topright.setPower(0);

   }
}











