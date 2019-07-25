//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class RFFeatureGetter
//javadoc: RFFeatureGetter

public class RFFeatureGetter extends Algorithm {

    protected RFFeatureGetter(long addr) { super(addr); }

    // internal usage only
    public static RFFeatureGetter __fromPtr__(long addr) { return new RFFeatureGetter(addr); }

    //
    // C++:  void cv::ximgproc::RFFeatureGetter::getFeatures(Mat src, Mat features, int gnrmRad, int gsmthRad, int shrink, int outNum, int gradNum)
    //

    //javadoc: RFFeatureGetter::getFeatures(src, features, gnrmRad, gsmthRad, shrink, outNum, gradNum)
    public  void getFeatures(Mat src, Mat features, int gnrmRad, int gsmthRad, int shrink, int outNum, int gradNum)
    {
        
        getFeatures_0(nativeObj, src.nativeObj, features.nativeObj, gnrmRad, gsmthRad, shrink, outNum, gradNum);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::RFFeatureGetter::getFeatures(Mat src, Mat features, int gnrmRad, int gsmthRad, int shrink, int outNum, int gradNum)
    private static native void getFeatures_0(long nativeObj, long src_nativeObj, long features_nativeObj, int gnrmRad, int gsmthRad, int shrink, int outNum, int gradNum);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
