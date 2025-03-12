package com.navi92.test;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber.Exception;
import org.bytedeco.javacv.Java2DFrameConverter;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, Exception {
        convertMovieToJPG(
                "C:\\Users\\ikidu\\Ivan\\leetcode_assingments\\leetcode\\src\\main\\java\\com\\navi92\\test\\2_mp4_1.mp4",
                "C:\\Users\\ikidu\\Ivan\\leetcode_assingments\\leetcode\\src\\main\\java\\com\\navi92\\test\\images\\4_1",
                "png");
    }

    public static void convertMovieToJPG(String mp4Path, String imagePath, String imgType)
            throws IOException, FFmpegFrameGrabber.Exception {

        Java2DFrameConverter converter = new Java2DFrameConverter();

        try (FFmpegFrameGrabber frameGrabber = new FFmpegFrameGrabber(mp4Path)) {
            frameGrabber.setAudioChannels(0);
            frameGrabber.setOption("loglevel", "error");
            frameGrabber.start();

            double rate = frameGrabber.getFrameRate();
            double percentage = 20 / rate;

            int totalFrames = frameGrabber.getLengthInFrames();
            int framesToKeep = (int) (totalFrames * percentage);
            double frameInterval = (double) totalFrames / framesToKeep;

            System.out.println("Going from " + rate + "fps to 20.0 fps.");
            System.out.println("Total Frames: " + totalFrames + ", Keeping " + framesToKeep + " frames.");
            System.out.println("Frame Interval: " + frameInterval);

            int imgNum = 0;
            for (int i = 0; i < framesToKeep; i++) {
                int frameNumber = (int) Math.round(i * frameInterval);
                frameGrabber.setFrameNumber(frameNumber);

                Frame frame = frameGrabber.grabImage();
                if (frame == null) break;

                BufferedImage image = converter.convert(frame);
                if (image == null) continue;

                String path = imagePath + File.separator + new DecimalFormat("0000").format((++imgNum)) + "." + imgType;
                ImageIO.write(image, imgType, new File(path));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}