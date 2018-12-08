//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.img_hash;

import org.opencv.img_hash.ImgHashBase;
import org.opencv.img_hash.MarrHildrethHash;

// C++: class MarrHildrethHash
//javadoc: MarrHildrethHash

public class MarrHildrethHash extends ImgHashBase {

    protected MarrHildrethHash(long addr) { super(addr); }

    // internal usage only
    public static MarrHildrethHash __fromPtr__(long addr) { return new MarrHildrethHash(addr); }

    //
    // C++: static Ptr_MarrHildrethHash cv::img_hash::MarrHildrethHash::create(float alpha = 2.0f, float scale = 1.0f)
    //

    //javadoc: MarrHildrethHash::create(alpha, scale)
    public static MarrHildrethHash create(float alpha, float scale)
    {
        
        MarrHildrethHash retVal = MarrHildrethHash.__fromPtr__(create_0(alpha, scale));
        
        return retVal;
    }

    //javadoc: MarrHildrethHash::create(alpha)
    public static MarrHildrethHash create(float alpha)
    {
        
        MarrHildrethHash retVal = MarrHildrethHash.__fromPtr__(create_1(alpha));
        
        return retVal;
    }

    //javadoc: MarrHildrethHash::create()
    public static MarrHildrethHash create()
    {
        
        MarrHildrethHash retVal = MarrHildrethHash.__fromPtr__(create_2());
        
        return retVal;
    }


    //
    // C++:  float cv::img_hash::MarrHildrethHash::getAlpha()
    //

    //javadoc: MarrHildrethHash::getAlpha()
    public  float getAlpha()
    {
        
        float retVal = getAlpha_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::img_hash::MarrHildrethHash::getScale()
    //

    //javadoc: MarrHildrethHash::getScale()
    public  float getScale()
    {
        
        float retVal = getScale_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::img_hash::MarrHildrethHash::setKernelParam(float alpha, float scale)
    //

    //javadoc: MarrHildrethHash::setKernelParam(alpha, scale)
    public  void setKernelParam(float alpha, float scale)
    {
        
        setKernelParam_0(nativeObj, alpha, scale);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_MarrHildrethHash cv::img_hash::MarrHildrethHash::create(float alpha = 2.0f, float scale = 1.0f)
    private static native long create_0(float alpha, float scale);
    private static native long create_1(float alpha);
    private static native long create_2();

    // C++:  float cv::img_hash::MarrHildrethHash::getAlpha()
    private static native float getAlpha_0(long nativeObj);

    // C++:  float cv::img_hash::MarrHildrethHash::getScale()
    private static native float getScale_0(long nativeObj);

    // C++:  void cv::img_hash::MarrHildrethHash::setKernelParam(float alpha, float scale)
    private static native void setKernelParam_0(long nativeObj, float alpha, float scale);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
