//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.calib3d;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class StereoMatcher
//javadoc: StereoMatcher

public class StereoMatcher extends Algorithm {

    public static final int
            DISP_SHIFT = 4,
            DISP_SCALE = (1 << DISP_SHIFT);

    protected StereoMatcher(long addr) { super(addr); }

    // internal usage only
    public static StereoMatcher __fromPtr__(long addr) { return new StereoMatcher(addr); }


    //
    // C++:  int getBlockSize()
    //

    // C++:  int getBlockSize()
    private static native int getBlockSize_0(long nativeObj);


    //
    // C++:  int getDisp12MaxDiff()
    //

    // C++:  int getDisp12MaxDiff()
    private static native int getDisp12MaxDiff_0(long nativeObj);


    //
    // C++:  int getMinDisparity()
    //

    // C++:  int getMinDisparity()
    private static native int getMinDisparity_0(long nativeObj);


    //
    // C++:  int getNumDisparities()
    //

    // C++:  int getNumDisparities()
    private static native int getNumDisparities_0(long nativeObj);


    //
    // C++:  int getSpeckleRange()
    //

    // C++:  int getSpeckleRange()
    private static native int getSpeckleRange_0(long nativeObj);


    //
    // C++:  int getSpeckleWindowSize()
    //

    // C++:  int getSpeckleWindowSize()
    private static native int getSpeckleWindowSize_0(long nativeObj);


    //
    // C++:  void compute(Mat left, Mat right, Mat& disparity)
    //

    // C++:  void compute(Mat left, Mat right, Mat& disparity)
    private static native void compute_0(long nativeObj, long left_nativeObj, long right_nativeObj, long disparity_nativeObj);


    //
    // C++:  void setBlockSize(int blockSize)
    //

    // C++:  void setBlockSize(int blockSize)
    private static native void setBlockSize_0(long nativeObj, int blockSize);


    //
    // C++:  void setDisp12MaxDiff(int disp12MaxDiff)
    //

    // C++:  void setDisp12MaxDiff(int disp12MaxDiff)
    private static native void setDisp12MaxDiff_0(long nativeObj, int disp12MaxDiff);


    //
    // C++:  void setMinDisparity(int minDisparity)
    //

    // C++:  void setMinDisparity(int minDisparity)
    private static native void setMinDisparity_0(long nativeObj, int minDisparity);


    //
    // C++:  void setNumDisparities(int numDisparities)
    //

    // C++:  void setNumDisparities(int numDisparities)
    private static native void setNumDisparities_0(long nativeObj, int numDisparities);


    //
    // C++:  void setSpeckleRange(int speckleRange)
    //

    // C++:  void setSpeckleRange(int speckleRange)
    private static native void setSpeckleRange_0(long nativeObj, int speckleRange);


    //
    // C++:  void setSpeckleWindowSize(int speckleWindowSize)
    //

    // C++:  void setSpeckleWindowSize(int speckleWindowSize)
    private static native void setSpeckleWindowSize_0(long nativeObj, int speckleWindowSize);

    // native support for java finalize()
    private static native void delete(long nativeObj);

    //javadoc: StereoMatcher::getBlockSize()
    public  int getBlockSize()
    {

        int retVal = getBlockSize_0(nativeObj);

        return retVal;
    }

    //javadoc: StereoMatcher::getDisp12MaxDiff()
    public  int getDisp12MaxDiff()
    {

        int retVal = getDisp12MaxDiff_0(nativeObj);

        return retVal;
    }

    //javadoc: StereoMatcher::getMinDisparity()
    public  int getMinDisparity()
    {

        int retVal = getMinDisparity_0(nativeObj);

        return retVal;
    }

    //javadoc: StereoMatcher::getNumDisparities()
    public  int getNumDisparities()
    {

        int retVal = getNumDisparities_0(nativeObj);

        return retVal;
    }

    //javadoc: StereoMatcher::getSpeckleRange()
    public  int getSpeckleRange()
    {

        int retVal = getSpeckleRange_0(nativeObj);

        return retVal;
    }

    //javadoc: StereoMatcher::getSpeckleWindowSize()
    public  int getSpeckleWindowSize()
    {

        int retVal = getSpeckleWindowSize_0(nativeObj);

        return retVal;
    }

    //javadoc: StereoMatcher::compute(left, right, disparity)
    public  void compute(Mat left, Mat right, Mat disparity)
    {

        compute_0(nativeObj, left.nativeObj, right.nativeObj, disparity.nativeObj);

        return;
    }

    //javadoc: StereoMatcher::setBlockSize(blockSize)
    public  void setBlockSize(int blockSize)
    {

        setBlockSize_0(nativeObj, blockSize);

        return;
    }

    //javadoc: StereoMatcher::setDisp12MaxDiff(disp12MaxDiff)
    public  void setDisp12MaxDiff(int disp12MaxDiff)
    {

        setDisp12MaxDiff_0(nativeObj, disp12MaxDiff);

        return;
    }

    //javadoc: StereoMatcher::setMinDisparity(minDisparity)
    public  void setMinDisparity(int minDisparity)
    {

        setMinDisparity_0(nativeObj, minDisparity);

        return;
    }

    //javadoc: StereoMatcher::setNumDisparities(numDisparities)
    public  void setNumDisparities(int numDisparities)
    {

        setNumDisparities_0(nativeObj, numDisparities);

        return;
    }

    //javadoc: StereoMatcher::setSpeckleRange(speckleRange)
    public  void setSpeckleRange(int speckleRange)
    {

        setSpeckleRange_0(nativeObj, speckleRange);

        return;
    }

    //javadoc: StereoMatcher::setSpeckleWindowSize(speckleWindowSize)
    public  void setSpeckleWindowSize(int speckleWindowSize)
    {

        setSpeckleWindowSize_0(nativeObj, speckleWindowSize);

        return;
    }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }

}
