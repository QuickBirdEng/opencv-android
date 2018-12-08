//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.face.BIF;

// C++: class BIF
//javadoc: BIF

public class BIF extends Algorithm {

    protected BIF(long addr) { super(addr); }

    // internal usage only
    public static BIF __fromPtr__(long addr) { return new BIF(addr); }

    //
    // C++: static Ptr_BIF cv::face::BIF::create(int num_bands = 8, int num_rotations = 12)
    //

    //javadoc: BIF::create(num_bands, num_rotations)
    public static BIF create(int num_bands, int num_rotations)
    {
        
        BIF retVal = BIF.__fromPtr__(create_0(num_bands, num_rotations));
        
        return retVal;
    }

    //javadoc: BIF::create(num_bands)
    public static BIF create(int num_bands)
    {
        
        BIF retVal = BIF.__fromPtr__(create_1(num_bands));
        
        return retVal;
    }

    //javadoc: BIF::create()
    public static BIF create()
    {
        
        BIF retVal = BIF.__fromPtr__(create_2());
        
        return retVal;
    }


    //
    // C++:  int cv::face::BIF::getNumBands()
    //

    //javadoc: BIF::getNumBands()
    public  int getNumBands()
    {
        
        int retVal = getNumBands_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::face::BIF::getNumRotations()
    //

    //javadoc: BIF::getNumRotations()
    public  int getNumRotations()
    {
        
        int retVal = getNumRotations_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::face::BIF::compute(Mat image, Mat& features)
    //

    //javadoc: BIF::compute(image, features)
    public  void compute(Mat image, Mat features)
    {
        
        compute_0(nativeObj, image.nativeObj, features.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_BIF cv::face::BIF::create(int num_bands = 8, int num_rotations = 12)
    private static native long create_0(int num_bands, int num_rotations);
    private static native long create_1(int num_bands);
    private static native long create_2();

    // C++:  int cv::face::BIF::getNumBands()
    private static native int getNumBands_0(long nativeObj);

    // C++:  int cv::face::BIF::getNumRotations()
    private static native int getNumRotations_0(long nativeObj);

    // C++:  void cv::face::BIF::compute(Mat image, Mat& features)
    private static native void compute_0(long nativeObj, long image_nativeObj, long features_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
