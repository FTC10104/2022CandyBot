package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp
public class ArmandoCode extends OpMode {
    DcMotor fLMotor;
    DcMotor fRMotor;
    DcMotor bLMotor;
    DcMotor bRMotor;

    @Override
    public void init() {
        fLMotor = hardwareMap.get(DcMotor.class, "fl");
        fRMotor = hardwareMap.get(DcMotor.class, "fr");
        bLMotor = hardwareMap.get(DcMotor.class, "bl");
        bRMotor = hardwareMap.get(DcMotor.class, "br");

        fLMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        fRMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        bLMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        bRMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        fLMotor.setPower(gamepad1.left_stick_y);
        fRMotor.setPower(gamepad1.right_stick_y);
        bLMotor.setPower(gamepad1.left_stick_y);
        bRMotor.setPower(gamepad1.right_stick_y);

    }
}
