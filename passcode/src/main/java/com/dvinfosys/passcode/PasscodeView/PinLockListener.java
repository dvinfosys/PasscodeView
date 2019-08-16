package com.dvinfosys.passcode.PasscodeView;

public interface PinLockListener {

    void onComplete(String pin);
    void onEmpty();
    void onPinChange(int pinLength,String intermediatePin);
}
