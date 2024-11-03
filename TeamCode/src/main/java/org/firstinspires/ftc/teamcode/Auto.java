package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "SP Auto", group = "2024-25 SP")
public class Auto extends LinearOpMode {

   Drive driveAuto = new Drive();

   @Override
   public void runOpMode() throws InterruptedException {

      waitForStart();

      while (opModeIsActive()){

         straif(1,1000);
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











