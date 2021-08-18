package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class readposition extends OpMode {

    DcMotor motortest;

    @Override
    public void init() {

        motortest = hardwareMap.dcMotor.get("motortest");
        motortest.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motortest.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    @Override
    public void loop() {
        telemetry.addData("pos", (motortest.getCurrentPosition()/19.2)*(360/28));
        telemetry.update();
    }
}