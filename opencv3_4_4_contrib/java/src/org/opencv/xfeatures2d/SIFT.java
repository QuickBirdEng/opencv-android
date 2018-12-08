//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.SIFT;

// C++: class SIFT
//javadoc: SIFT

public class SIFT extends Feature2D {

    protected SIFT(long addr) { super(addr); }

    // internal usage only
    public static SIFT __fromPtr__(long addr) { return new SIFT(addr); }

    //
    // C++: static Ptr_SIFT cv::xfeatures2d::SIFT::create(int nfeatures = 0, int nOctaveLayers = 3, double contrastThreshold = 0.04, double edgeThreshold = 10, double sigma = 1.6)
    //

    //javadoc: SIFT::create(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold, sigma)
    public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma)
    {
        
        SIFT retVal = SIFT.__fromPtr__(create_0(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold, sigma));
        
        return retVal;
    }

    //javadoc: SIFT::create(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold)
    public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold)
    {
        
        SIFT retVal = SIFT.__fromPtr__(create_1(nfeatures, nOctaveLayers, contrastThreshold, edgeThreshold));
        
        return retVal;
    }

    //javadoc: SIFT::create(nfeatures, nOctaveLayers, contrastThreshold)
    public static SIFT create(int nfeatures, int nOctaveLayers, double contrastThreshold)
    {
        
        SIFT retVal = SIFT.__fromPtr__(create_2(nfeatures, nOctaveLayers, contrastThreshold));
        
        return retVal;
    }

    //javadoc: SIFT::create(nfeatures, nOctaveLayers)
    public static SIFT create(int nfeatures, int nOctaveLayers)
    {
        
        SIFT retVal = SIFT.__fromPtr__(create_3(nfeatures, nOctaveLayers));
        
        return retVal;
    }

    //javadoc: SIFT::create(nfeatures)
    public static SIFT create(int nfeatures)
    {
        
        SIFT retVal = SIFT.__fromPtr__(create_4(nfeatures));
        
        return retVal;
    }

    //javadoc: SIFT::create()
    public static SIFT create()
    {
        
        SIFT retVal = SIFT.__fromPtr__(create_5());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_SIFT cv::xfeatures2d::SIFT::create(int nfeatures = 0, int nOctaveLayers = 3, double contrastThreshold = 0.04, double edgeThreshold = 10, double sigma = 1.6)
    private static native long create_0(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold, double sigma);
    private static native long create_1(int nfeatures, int nOctaveLayers, double contrastThreshold, double edgeThreshold);
    private static native long create_2(int nfeatures, int nOctaveLayers, double contrastThreshold);
    private static native long create_3(int nfeatures, int nOctaveLayers);
    private static native long create_4(int nfeatures);
    private static native long create_5();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
