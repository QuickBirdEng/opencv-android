//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.img_hash;

import org.opencv.img_hash.ImgHashBase;
import org.opencv.img_hash.RadialVarianceHash;

// C++: class RadialVarianceHash
//javadoc: RadialVarianceHash

public class RadialVarianceHash extends ImgHashBase {

    protected RadialVarianceHash(long addr) { super(addr); }

    // internal usage only
    public static RadialVarianceHash __fromPtr__(long addr) { return new RadialVarianceHash(addr); }

    //
    // C++: static Ptr_RadialVarianceHash cv::img_hash::RadialVarianceHash::create(double sigma = 1, int numOfAngleLine = 180)
    //

    //javadoc: RadialVarianceHash::create(sigma, numOfAngleLine)
    public static RadialVarianceHash create(double sigma, int numOfAngleLine)
    {
        
        RadialVarianceHash retVal = RadialVarianceHash.__fromPtr__(create_0(sigma, numOfAngleLine));
        
        return retVal;
    }

    //javadoc: RadialVarianceHash::create(sigma)
    public static RadialVarianceHash create(double sigma)
    {
        
        RadialVarianceHash retVal = RadialVarianceHash.__fromPtr__(create_1(sigma));
        
        return retVal;
    }

    //javadoc: RadialVarianceHash::create()
    public static RadialVarianceHash create()
    {
        
        RadialVarianceHash retVal = RadialVarianceHash.__fromPtr__(create_2());
        
        return retVal;
    }


    //
    // C++:  double cv::img_hash::RadialVarianceHash::getSigma()
    //

    //javadoc: RadialVarianceHash::getSigma()
    public  double getSigma()
    {
        
        double retVal = getSigma_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::img_hash::RadialVarianceHash::getNumOfAngleLine()
    //

    //javadoc: RadialVarianceHash::getNumOfAngleLine()
    public  int getNumOfAngleLine()
    {
        
        int retVal = getNumOfAngleLine_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::img_hash::RadialVarianceHash::setNumOfAngleLine(int value)
    //

    //javadoc: RadialVarianceHash::setNumOfAngleLine(value)
    public  void setNumOfAngleLine(int value)
    {
        
        setNumOfAngleLine_0(nativeObj, value);
        
        return;
    }


    //
    // C++:  void cv::img_hash::RadialVarianceHash::setSigma(double value)
    //

    //javadoc: RadialVarianceHash::setSigma(value)
    public  void setSigma(double value)
    {
        
        setSigma_0(nativeObj, value);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_RadialVarianceHash cv::img_hash::RadialVarianceHash::create(double sigma = 1, int numOfAngleLine = 180)
    private static native long create_0(double sigma, int numOfAngleLine);
    private static native long create_1(double sigma);
    private static native long create_2();

    // C++:  double cv::img_hash::RadialVarianceHash::getSigma()
    private static native double getSigma_0(long nativeObj);

    // C++:  int cv::img_hash::RadialVarianceHash::getNumOfAngleLine()
    private static native int getNumOfAngleLine_0(long nativeObj);

    // C++:  void cv::img_hash::RadialVarianceHash::setNumOfAngleLine(int value)
    private static native void setNumOfAngleLine_0(long nativeObj, int value);

    // C++:  void cv::img_hash::RadialVarianceHash::setSigma(double value)
    private static native void setSigma_0(long nativeObj, double value);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
