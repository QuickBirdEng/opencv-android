//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import org.opencv.core.Mat;

// C++: class CalibrateRobertson
//javadoc: CalibrateRobertson

public class CalibrateRobertson extends CalibrateCRF {

    protected CalibrateRobertson(long addr) { super(addr); }

    // internal usage only
    public static CalibrateRobertson __fromPtr__(long addr) { return new CalibrateRobertson(addr); }

    //
    // C++:  Mat getRadiance()
    //

    // C++:  Mat getRadiance()
    private static native long getRadiance_0(long nativeObj);


    //
    // C++:  float getThreshold()
    //

    // C++:  float getThreshold()
    private static native float getThreshold_0(long nativeObj);


    //
    // C++:  int getMaxIter()
    //

    // C++:  int getMaxIter()
    private static native int getMaxIter_0(long nativeObj);


    //
    // C++:  void setMaxIter(int max_iter)
    //

    // C++:  void setMaxIter(int max_iter)
    private static native void setMaxIter_0(long nativeObj, int max_iter);


    //
    // C++:  void setThreshold(float threshold)
    //

    // C++:  void setThreshold(float threshold)
    private static native void setThreshold_0(long nativeObj, float threshold);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: CalibrateRobertson::getRadiance()
    public  Mat getRadiance()
    {

        Mat retVal = new Mat(getRadiance_0(nativeObj));

        return retVal;
    }

    //javadoc: CalibrateRobertson::getThreshold()
    public  float getThreshold()
    {

        float retVal = getThreshold_0(nativeObj);

        return retVal;
    }

    //javadoc: CalibrateRobertson::getMaxIter()
    public  int getMaxIter()
    {

        int retVal = getMaxIter_0(nativeObj);

        return retVal;
    }

    //javadoc: CalibrateRobertson::setMaxIter(max_iter)
    public  void setMaxIter(int max_iter)
    {

        setMaxIter_0(nativeObj, max_iter);

        return;
    }

    //javadoc: CalibrateRobertson::setThreshold(threshold)
    public  void setThreshold(float threshold)
    {

        setThreshold_0(nativeObj, threshold);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
