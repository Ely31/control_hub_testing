package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

@TeleOp
public class touchsensortest extends OpMode {

    DcMotor motortest;
    TouchSensor digitalTouch;

    @Override
    public void init() {

        motortest = hardwareMap.dcMotor.get("motortest");
        motortest.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        digitalTouch = hardwareMap.get(TouchSensor.class, "digitaltouch");
    }

    @Override
    public void loop() {
        if (digitalTouch.isPressed()) motortest.setPower(Math.abs(-gamepad1.left_stick_y));

        else if (!digitalTouch.isPressed()) motortest.setPower(-gamepad1.left_stick_y);

        telemetry.addData("touch",digitalTouch.isPressed());
        telemetry.update();
    }
}