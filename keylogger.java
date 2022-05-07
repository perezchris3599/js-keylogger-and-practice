package main;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class Main implements NativeKeyListener {
    public static void main(string[] args) {

        try {
            GlobalScreen.registerNativeHook();
        ) catch (NativeHookException e) {
            e.printStackTrace
        }
        GlobalScreen.getInstance().addNativeKeyListener(new Main());


    }
}

@override
public void nativeKeyReleased(NativeKeyEvent arg0) {
    System.out.println("Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode)));

}
@override
public void nativeKeyReleased(NativeKeyEvent arg0) {
    System.out.println("Released: " + NativeKeyEvent.getKeyText(e.getKeyCode)));

}
@override
public void nativeKeyReleased(NativeKeyEvent arg0) {

}
@override
public void nativeKeyReleased(NativeKeyEvent arg0) {

}