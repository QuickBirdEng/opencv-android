//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.img_hash;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class ImgHashBase
//javadoc: ImgHashBase

public class ImgHashBase extends Algorithm {

    protected ImgHashBase(long addr) { super(addr); }

    // internal usage only
    public static ImgHashBase __fromPtr__(long addr) { return new ImgHashBase(addr); }

    //
    // C++:  double cv::img_hash::ImgHashBase::compare(Mat hashOne, Mat hashTwo)
    //

    //javadoc: ImgHashBase::compare(hashOne, hashTwo)
    public  double compare(Mat hashOne, Mat hashTwo)
    {
        
        double retVal = compare_0(nativeObj, hashOne.nativeObj, hashTwo.nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::img_hash::ImgHashBase::compute(Mat inputArr, Mat& outputArr)
    //

    //javadoc: ImgHashBase::compute(inputArr, outputArr)
    public  void compute(Mat inputArr, Mat outputArr)
    {
        
        compute_0(nativeObj, inputArr.nativeObj, outputArr.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  double cv::img_hash::ImgHashBase::compare(Mat hashOne, Mat hashTwo)
    private static native double compare_0(long nativeObj, long hashOne_nativeObj, long hashTwo_nativeObj);

    // C++:  void cv::img_hash::ImgHashBase::compute(Mat inputArr, Mat& outputArr)
    private static native void compute_0(long nativeObj, long inputArr_nativeObj, long outputArr_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
