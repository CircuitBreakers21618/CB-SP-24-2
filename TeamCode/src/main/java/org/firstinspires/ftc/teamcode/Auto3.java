package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class Auto3 extends LinearOpMode {

   Drive driveAuto = new Drive();
   //calls instilization of motors and servos
   @Override
   public void runOpMode() throws InterruptedException {

      waitForStart();

      while (opModeIsActive()) {
// this is the code for Auto #3
       moveforward(1, 46);
       stopmotor();
       straif(1, 817);
       stopmotor();
       moveforward(-1, 46);
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











