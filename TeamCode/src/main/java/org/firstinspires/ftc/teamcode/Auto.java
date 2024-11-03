package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "SP Auto", group = "2024-25 SP")
public class Auto extends LinearOpMode {

   Drive drive = new Drive();

   @Override
   public void runOpMode() throws InterruptedException {

      waitForStart();

      while (opModeIsActive()){

         straif(1,1000);
         stopmotor();
      }
   }

   public void moveforward(double power, long time){
      drive.backleft.setPower(power);
      drive.backright.setPower(power);
      drive.topleft.setPower(-power);
      drive.topright.setPower(-power);
      //how long it waits
      sleep(time);

   }

   public void straif(double power, long time){
      drive.backleft.setPower(-power);
      drive.backright.setPower(power);
      drive.topleft.setPower(-power);
      drive.topright.setPower(power);
      //how long it waits
      sleep(time);

   }


   public void turn(double power, long time){
      drive.backleft.setPower(-power);
      drive.backright.setPower(power);
      drive.topleft.setPower(power);
      drive.topright.setPower(-power);
      //how long it waits
      sleep(time);

   }

   public void stopmotor(){
      drive.backleft.setPower(0);
      drive.backright.setPower(0);
      drive.topleft.setPower(0);
      drive.topright.setPower(0);

   }
}











