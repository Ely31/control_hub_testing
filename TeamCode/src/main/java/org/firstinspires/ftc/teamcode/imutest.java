package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.hardware.bosch.BNO055IMU.AngleUnit;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous
public class imutest extends OpMode {

    BNO055IMU imu;

    @Override
    public void init() {

        imu = hardwareMap.get(BNO055IMU.class,"imu");
        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
        parameters.angleUnit = AngleUnit.DEGREES;
        imu.initialize(parameters);
    }

    @Override
    public void loop() {
        telemetry.addData("heading", imu.getAngularOrientation().firstAngle);
        telemetry.update();
    }
}