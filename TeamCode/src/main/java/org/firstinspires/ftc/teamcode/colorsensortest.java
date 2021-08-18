package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

@Autonomous
public class colorsensortest extends OpMode {

    ColorSensor color1;

    @Override
    public void init() {
        color1 = hardwareMap.colorSensor.get("color1");
    }

    @Override
    public void loop() {
        telemetry.addData("alpha",color1.alpha());
        telemetry.addData("R",color1.red());
        telemetry.addData("G",color1.green());
        telemetry.addData("B",color1.blue());
        telemetry.update();
    }
}
