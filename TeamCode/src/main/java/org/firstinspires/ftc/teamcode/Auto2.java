package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "SP Auto2", group = "2024-25 SP")
public class Auto2 extends LinearOpMode {

   Drive driveAuto = new Drive();
   //calls instilization of motors and servos
   @Override
   public void runOpMode() throws InterruptedException {

      waitForStart();

      while (opModeIsActive()) {
//this code is for Auto #2
      moveforward(1, 46);
      stopmotor();
      straif(1, 1042);
      stopmotor();
      moveforward(-1, 46);
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



   public void stopmotor(){
      driveAuto.backleft.setPower(0);
      driveAuto.backright.setPower(0);
      driveAuto.topleft.setPower(0);
      driveAuto.topright.setPower(0);

   }
}











