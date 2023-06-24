package com.jandrespardos.registerBlossom.util;

import java.io.FileOutputStream;
import java.io.IOException;

public class ScreenshotUtil {

    public static void saveScreenshot(byte[] screenshot, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}