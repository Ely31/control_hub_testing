package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class runtopos_test extends OpMode {

    DcMotor motortest;

    @Override
    public void init() {

        motortest = hardwareMap.dcMotor.get("motortest");
        motortest.setTargetPosition(0);
        motortest.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            motortest.setTargetPosition(0);
        } else {
            motortest.setTargetPosition((int) (180*1.493333333));
        }
        motortest.setPower(0.5);
        motortest.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        telemetry.addData("targetpos", motortest.getTargetPosition());
        telemetry.update();
    }
}