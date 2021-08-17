package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class motortest extends OpMode {

    DcMotor motortest;

    @Override
    public void init() {
        motortest = hardwareMap.dcMotor.get("motortest");
        motortest.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    @Override
    public void loop() {
        motortest.setPower(-gamepad1.left_stick_y);

        telemetry.addData("power",-gamepad1.left_stick_y);
        telemetry.update();
    }
}