//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class SyntheticSequenceGenerator
//javadoc: SyntheticSequenceGenerator

public class SyntheticSequenceGenerator extends Algorithm {

    protected SyntheticSequenceGenerator(long addr) { super(addr); }

    // internal usage only
    public static SyntheticSequenceGenerator __fromPtr__(long addr) { return new SyntheticSequenceGenerator(addr); }

    //
    // C++:   cv::bgsegm::SyntheticSequenceGenerator::SyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed, double objspeed)
    //

    //javadoc: SyntheticSequenceGenerator::SyntheticSequenceGenerator(background, object, amplitude, wavelength, wavespeed, objspeed)
    public   SyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed, double objspeed)
    {
        
        super( SyntheticSequenceGenerator_0(background.nativeObj, object.nativeObj, amplitude, wavelength, wavespeed, objspeed) );
        
        return;
    }


    //
    // C++:  void cv::bgsegm::SyntheticSequenceGenerator::getNextFrame(Mat& frame, Mat& gtMask)
    //

    //javadoc: SyntheticSequenceGenerator::getNextFrame(frame, gtMask)
    public  void getNextFrame(Mat frame, Mat gtMask)
    {
        
        getNextFrame_0(nativeObj, frame.nativeObj, gtMask.nativeObj);
        
        return;
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
