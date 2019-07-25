//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xphoto;

import org.opencv.xphoto.WhiteBalancer;

// C++: class GrayworldWB
//javadoc: GrayworldWB

public class GrayworldWB extends WhiteBalancer {

    protected GrayworldWB(long addr) { super(addr); }

    // internal usage only
    public static GrayworldWB __fromPtr__(long addr) { return new GrayworldWB(addr); }

    //
    // C++:  float cv::xphoto::GrayworldWB::getSaturationThreshold()
    //

    //javadoc: GrayworldWB::getSaturationThreshold()
    public  float getSaturationThreshold()
    {
        
        float retVal = getSaturationThreshold_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::xphoto::GrayworldWB::setSaturationThreshold(float val)
    //

    //javadoc: GrayworldWB::setSaturationThreshold(val)
    public  void setSaturationThreshold(float val)
    {
        
        setSaturationThreshold_0(nativeObj, val);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  float cv::xphoto::GrayworldWB::getSaturationThreshold()
    private static native float getSaturationThreshold_0(long nativeObj);

    // C++:  void cv::xphoto::GrayworldWB::setSaturationThreshold(float val)
    private static native void setSaturationThreshold_0(long nativeObj, float val);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
