//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class SyntheticSequenceGenerator
/**
 * Synthetic frame sequence generator for testing background subtraction algorithms.
 *
 *  It will generate the moving object on top of the background.
 *  It will apply some distortion to the background to make the test more complex.
 */
public class SyntheticSequenceGenerator extends Algorithm {

    protected SyntheticSequenceGenerator(long addr) { super(addr); }

    // internal usage only
    public static SyntheticSequenceGenerator __fromPtr__(long addr) { return new SyntheticSequenceGenerator(addr); }

    //
    // C++:   cv::bgsegm::SyntheticSequenceGenerator::SyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed, double objspeed)
    //

    /**
     * Creates an instance of SyntheticSequenceGenerator.
     *
     *     @param background Background image for object.
     *     @param object Object image which will move slowly over the background.
     *     @param amplitude Amplitude of wave distortion applied to background.
     *     @param wavelength Length of waves in distortion applied to background.
     *     @param wavespeed How fast waves will move.
     *     @param objspeed How fast object will fly over background.
     */
    public SyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed, double objspeed) {
        super(SyntheticSequenceGenerator_0(background.nativeObj, object.nativeObj, amplitude, wavelength, wavespeed, objspeed));
    }


    //
    // C++:  void cv::bgsegm::SyntheticSequenceGenerator::getNextFrame(Mat& frame, Mat& gtMask)
    //

    /**
     * Obtain the next frame in the sequence.
     *
     *     @param frame Output frame.
     *     @param gtMask Output ground-truth (reference) segmentation mask object/background.
     */
    public void getNextFrame(Mat frame, Mat gtMask) {
        getNextFrame_0(nativeObj, frame.nativeObj, gtMask.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::bgsegm::SyntheticSequenceGenerator::SyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed, double objspeed)
    private static native long SyntheticSequenceGenerator_0(long background_nativeObj, long object_nativeObj, double amplitude, double wavelength, double wavespeed, double objspeed);

    // C++:  void cv::bgsegm::SyntheticSequenceGenerator::getNextFrame(Mat& frame, Mat& gtMask)
    private static native void getNextFrame_0(long nativeObj, long frame_nativeObj, long gtMask_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
