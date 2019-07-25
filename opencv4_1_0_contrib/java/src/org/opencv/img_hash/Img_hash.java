//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.img_hash;

import org.opencv.core.Mat;

// C++: class Img_hash
//javadoc: Img_hash

public class Img_hash {

    // C++: enum BlockMeanHashMode
    public static final int
            BLOCK_MEAN_HASH_MODE_0 = 0,
            BLOCK_MEAN_HASH_MODE_1 = 1;


    //
    // C++:  void cv::img_hash::averageHash(Mat inputArr, Mat& outputArr)
    //

    //javadoc: averageHash(inputArr, outputArr)
    public static void averageHash(Mat inputArr, Mat outputArr)
    {
        
        averageHash_0(inputArr.nativeObj, outputArr.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::img_hash::blockMeanHash(Mat inputArr, Mat& outputArr, int mode = BLOCK_MEAN_HASH_MODE_0)
    //

    //javadoc: blockMeanHash(inputArr, outputArr, mode)
    public static void blockMeanHash(Mat inputArr, Mat outputArr, int mode)
    {
        
        blockMeanHash_0(inputArr.nativeObj, outputArr.nativeObj, mode);
        
        return;
    }

    //javadoc: blockMeanHash(inputArr, outputArr)
    public static void blockMeanHash(Mat inputArr, Mat outputArr)
    {
        
        blockMeanHash_1(inputArr.nativeObj, outputArr.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::img_hash::colorMomentHash(Mat inputArr, Mat& outputArr)
    //

    //javadoc: colorMomentHash(inputArr, outputArr)
    public static void colorMomentHash(Mat inputArr, Mat outputArr)
    {
        
        colorMomentHash_0(inputArr.nativeObj, outputArr.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::img_hash::marrHildrethHash(Mat inputArr, Mat& outputArr, float alpha = 2.0f, float scale = 1.0f)
    //

    //javadoc: marrHildrethHash(inputArr, outputArr, alpha, scale)
    public static void marrHildrethHash(Mat inputArr, Mat outputArr, float alpha, float scale)
    {
        
        marrHildrethHash_0(inputArr.nativeObj, outputArr.nativeObj, alpha, scale);
        
        return;
    }

    //javadoc: marrHildrethHash(inputArr, outputArr, alpha)
    public static void marrHildrethHash(Mat inputArr, Mat outputArr, float alpha)
    {
        
        marrHildrethHash_1(inputArr.nativeObj, outputArr.nativeObj, alpha);
        
        return;
    }

    //javadoc: marrHildrethHash(inputArr, outputArr)
    public static void marrHildrethHash(Mat inputArr, Mat outputArr)
    {
        
        marrHildrethHash_2(inputArr.nativeObj, outputArr.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::img_hash::pHash(Mat inputArr, Mat& outputArr)
    //

    //javadoc: pHash(inputArr, outputArr)
    public static void pHash(Mat inputArr, Mat outputArr)
    {
        
        pHash_0(inputArr.nativeObj, outputArr.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::img_hash::radialVarianceHash(Mat inputArr, Mat& outputArr, double sigma = 1, int numOfAngleLine = 180)
    //

    //javadoc: radialVarianceHash(inputArr, outputArr, sigma, numOfAngleLine)
    public static void radialVarianceHash(Mat inputArr, Mat outputArr, double sigma, int numOfAngleLine)
    {
        
        radialVarianceHash_0(inputArr.nativeObj, outputArr.nativeObj, sigma, numOfAngleLine);
        
        return;
    }

    //javadoc: radialVarianceHash(inputArr, outputArr, sigma)
    public static void radialVarianceHash(Mat inputArr, Mat outputArr, double sigma)
    {
        
        radialVarianceHash_1(inputArr.nativeObj, outputArr.nativeObj, sigma);
        
        return;
    }

    //javadoc: radialVarianceHash(inputArr, outputArr)
    public static void radialVarianceHash(Mat inputArr, Mat outputArr)
    {
        
        radialVarianceHash_2(inputArr.nativeObj, outputArr.nativeObj);
        
        return;
    }




    // C++:  void cv::img_hash::averageHash(Mat inputArr, Mat& outputArr)
    private static native void averageHash_0(long inputArr_nativeObj, long outputArr_nativeObj);

    // C++:  void cv::img_hash::blockMeanHash(Mat inputArr, Mat& outputArr, int mode = BLOCK_MEAN_HASH_MODE_0)
    private static native void blockMeanHash_0(long inputArr_nativeObj, long outputArr_nativeObj, int mode);
    private static native void blockMeanHash_1(long inputArr_nativeObj, long outputArr_nativeObj);

    // C++:  void cv::img_hash::colorMomentHash(Mat inputArr, Mat& outputArr)
    private static native void colorMomentHash_0(long inputArr_nativeObj, long outputArr_nativeObj);

    // C++:  void cv::img_hash::marrHildrethHash(Mat inputArr, Mat& outputArr, float alpha = 2.0f, float scale = 1.0f)
    private static native void marrHildrethHash_0(long inputArr_nativeObj, long outputArr_nativeObj, float alpha, float scale);
    private static native void marrHildrethHash_1(long inputArr_nativeObj, long outputArr_nativeObj, float alpha);
    private static native void marrHildrethHash_2(long inputArr_nativeObj, long outputArr_nativeObj);

    // C++:  void cv::img_hash::pHash(Mat inputArr, Mat& outputArr)
    private static native void pHash_0(long inputArr_nativeObj, long outputArr_nativeObj);

    // C++:  void cv::img_hash::radialVarianceHash(Mat inputArr, Mat& outputArr, double sigma = 1, int numOfAngleLine = 180)
    private static native void radialVarianceHash_0(long inputArr_nativeObj, long outputArr_nativeObj, double sigma, int numOfAngleLine);
    private static native void radialVarianceHash_1(long inputArr_nativeObj, long outputArr_nativeObj, double sigma);
    private static native void radialVarianceHash_2(long inputArr_nativeObj, long outputArr_nativeObj);

}
