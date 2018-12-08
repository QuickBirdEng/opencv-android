//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.SURF;

// C++: class SURF
//javadoc: SURF

public class SURF extends Feature2D {

    protected SURF(long addr) { super(addr); }

    // internal usage only
    public static SURF __fromPtr__(long addr) { return new SURF(addr); }

    //
    // C++: static Ptr_SURF cv::xfeatures2d::SURF::create(double hessianThreshold = 100, int nOctaves = 4, int nOctaveLayers = 3, bool extended = false, bool upright = false)
    //

    //javadoc: SURF::create(hessianThreshold, nOctaves, nOctaveLayers, extended, upright)
    public static SURF create(double hessianThreshold, int nOctaves, int nOctaveLayers, boolean extended, boolean upright)
    {
        
        SURF retVal = SURF.__fromPtr__(create_0(hessianThreshold, nOctaves, nOctaveLayers, extended, upright));
        
        return retVal;
    }

    //javadoc: SURF::create(hessianThreshold, nOctaves, nOctaveLayers, extended)
    public static SURF create(double hessianThreshold, int nOctaves, int nOctaveLayers, boolean extended)
    {
        
        SURF retVal = SURF.__fromPtr__(create_1(hessianThreshold, nOctaves, nOctaveLayers, extended));
        
        return retVal;
    }

    //javadoc: SURF::create(hessianThreshold, nOctaves, nOctaveLayers)
    public static SURF create(double hessianThreshold, int nOctaves, int nOctaveLayers)
    {
        
        SURF retVal = SURF.__fromPtr__(create_2(hessianThreshold, nOctaves, nOctaveLayers));
        
        return retVal;
    }

    //javadoc: SURF::create(hessianThreshold, nOctaves)
    public static SURF create(double hessianThreshold, int nOctaves)
    {
        
        SURF retVal = SURF.__fromPtr__(create_3(hessianThreshold, nOctaves));
        
        return retVal;
    }

    //javadoc: SURF::create(hessianThreshold)
    public static SURF create(double hessianThreshold)
    {
        
        SURF retVal = SURF.__fromPtr__(create_4(hessianThreshold));
        
        return retVal;
    }

    //javadoc: SURF::create()
    public static SURF create()
    {
        
        SURF retVal = SURF.__fromPtr__(create_5());
        
        return retVal;
    }


    //
    // C++:  bool cv::xfeatures2d::SURF::getExtended()
    //

    //javadoc: SURF::getExtended()
    public  boolean getExtended()
    {
        
        boolean retVal = getExtended_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  bool cv::xfeatures2d::SURF::getUpright()
    //

    //javadoc: SURF::getUpright()
    public  boolean getUpright()
    {
        
        boolean retVal = getUpright_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  double cv::xfeatures2d::SURF::getHessianThreshold()
    //

    //javadoc: SURF::getHessianThreshold()
    public  double getHessianThreshold()
    {
        
        double retVal = getHessianThreshold_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::SURF::getNOctaveLayers()
    //

    //javadoc: SURF::getNOctaveLayers()
    public  int getNOctaveLayers()
    {
        
        int retVal = getNOctaveLayers_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::SURF::getNOctaves()
    //

    //javadoc: SURF::getNOctaves()
    public  int getNOctaves()
    {
        
        int retVal = getNOctaves_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setExtended(bool extended)
    //

    //javadoc: SURF::setExtended(extended)
    public  void setExtended(boolean extended)
    {
        
        setExtended_0(nativeObj, extended);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setHessianThreshold(double hessianThreshold)
    //

    //javadoc: SURF::setHessianThreshold(hessianThreshold)
    public  void setHessianThreshold(double hessianThreshold)
    {
        
        setHessianThreshold_0(nativeObj, hessianThreshold);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setNOctaveLayers(int nOctaveLayers)
    //

    //javadoc: SURF::setNOctaveLayers(nOctaveLayers)
    public  void setNOctaveLayers(int nOctaveLayers)
    {
        
        setNOctaveLayers_0(nativeObj, nOctaveLayers);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setNOctaves(int nOctaves)
    //

    //javadoc: SURF::setNOctaves(nOctaves)
    public  void setNOctaves(int nOctaves)
    {
        
        setNOctaves_0(nativeObj, nOctaves);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::SURF::setUpright(bool upright)
    //

    //javadoc: SURF::setUpright(upright)
    public  void setUpright(boolean upright)
    {
        
        setUpright_0(nativeObj, upright);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_SURF cv::xfeatures2d::SURF::create(double hessianThreshold = 100, int nOctaves = 4, int nOctaveLayers = 3, bool extended = false, bool upright = false)
    private static native long create_0(double hessianThreshold, int nOctaves, int nOctaveLayers, boolean extended, boolean upright);
    private static native long create_1(double hessianThreshold, int nOctaves, int nOctaveLayers, boolean extended);
    private static native long create_2(double hessianThreshold, int nOctaves, int nOctaveLayers);
    private static native long create_3(double hessianThreshold, int nOctaves);
    private static native long create_4(double hessianThreshold);
    private static native long create_5();

    // C++:  bool cv::xfeatures2d::SURF::getExtended()
    private static native boolean getExtended_0(long nativeObj);

    // C++:  bool cv::xfeatures2d::SURF::getUpright()
    private static native boolean getUpright_0(long nativeObj);

    // C++:  double cv::xfeatures2d::SURF::getHessianThreshold()
    private static native double getHessianThreshold_0(long nativeObj);

    // C++:  int cv::xfeatures2d::SURF::getNOctaveLayers()
    private static native int getNOctaveLayers_0(long nativeObj);

    // C++:  int cv::xfeatures2d::SURF::getNOctaves()
    private static native int getNOctaves_0(long nativeObj);

    // C++:  void cv::xfeatures2d::SURF::setExtended(bool extended)
    private static native void setExtended_0(long nativeObj, boolean extended);

    // C++:  void cv::xfeatures2d::SURF::setHessianThreshold(double hessianThreshold)
    private static native void setHessianThreshold_0(long nativeObj, double hessianThreshold);

    // C++:  void cv::xfeatures2d::SURF::setNOctaveLayers(int nOctaveLayers)
    private static native void setNOctaveLayers_0(long nativeObj, int nOctaveLayers);

    // C++:  void cv::xfeatures2d::SURF::setNOctaves(int nOctaves)
    private static native void setNOctaves_0(long nativeObj, int nOctaves);

    // C++:  void cv::xfeatures2d::SURF::setUpright(bool upright)
    private static native void setUpright_0(long nativeObj, boolean upright);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
