//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bioinspired;

import org.opencv.bioinspired.RetinaFastToneMapping;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.Size;

// C++: class RetinaFastToneMapping
//javadoc: RetinaFastToneMapping

public class RetinaFastToneMapping extends Algorithm {

    protected RetinaFastToneMapping(long addr) { super(addr); }

    // internal usage only
    public static RetinaFastToneMapping __fromPtr__(long addr) { return new RetinaFastToneMapping(addr); }

    //
    // C++: static Ptr_RetinaFastToneMapping cv::bioinspired::RetinaFastToneMapping::create(Size inputSize)
    //

    //javadoc: RetinaFastToneMapping::create(inputSize)
    public static RetinaFastToneMapping create(Size inputSize)
    {
        
        RetinaFastToneMapping retVal = RetinaFastToneMapping.__fromPtr__(create_0(inputSize.width, inputSize.height));
        
        return retVal;
    }


    //
    // C++:  void cv::bioinspired::RetinaFastToneMapping::applyFastToneMapping(Mat inputImage, Mat& outputToneMappedImage)
    //

    //javadoc: RetinaFastToneMapping::applyFastToneMapping(inputImage, outputToneMappedImage)
    public  void applyFastToneMapping(Mat inputImage, Mat outputToneMappedImage)
    {
        
        applyFastToneMapping_0(nativeObj, inputImage.nativeObj, outputToneMappedImage.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::bioinspired::RetinaFastToneMapping::setup(float photoreceptorsNeighborhoodRadius = 3.f, float ganglioncellsNeighborhoodRadius = 1.f, float meanLuminanceModulatorK = 1.f)
    //

    //javadoc: RetinaFastToneMapping::setup(photoreceptorsNeighborhoodRadius, ganglioncellsNeighborhoodRadius, meanLuminanceModulatorK)
    public  void setup(float photoreceptorsNeighborhoodRadius, float ganglioncellsNeighborhoodRadius, float meanLuminanceModulatorK)
    {
        
        setup_0(nativeObj, photoreceptorsNeighborhoodRadius, ganglioncellsNeighborhoodRadius, meanLuminanceModulatorK);
        
        return;
    }

    //javadoc: RetinaFastToneMapping::setup(photoreceptorsNeighborhoodRadius, ganglioncellsNeighborhoodRadius)
    public  void setup(float photoreceptorsNeighborhoodRadius, float ganglioncellsNeighborhoodRadius)
    {
        
        setup_1(nativeObj, photoreceptorsNeighborhoodRadius, ganglioncellsNeighborhoodRadius);
        
        return;
    }

    //javadoc: RetinaFastToneMapping::setup(photoreceptorsNeighborhoodRadius)
    public  void setup(float photoreceptorsNeighborhoodRadius)
    {
        
        setup_2(nativeObj, photoreceptorsNeighborhoodRadius);
        
        return;
    }

    //javadoc: RetinaFastToneMapping::setup()
    public  void setup()
    {
        
        setup_3(nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_RetinaFastToneMapping cv::bioinspired::RetinaFastToneMapping::create(Size inputSize)
    private static native long create_0(double inputSize_width, double inputSize_height);

    // C++:  void cv::bioinspired::RetinaFastToneMapping::applyFastToneMapping(Mat inputImage, Mat& outputToneMappedImage)
    private static native void applyFastToneMapping_0(long nativeObj, long inputImage_nativeObj, long outputToneMappedImage_nativeObj);

    // C++:  void cv::bioinspired::RetinaFastToneMapping::setup(float photoreceptorsNeighborhoodRadius = 3.f, float ganglioncellsNeighborhoodRadius = 1.f, float meanLuminanceModulatorK = 1.f)
    private static native void setup_0(long nativeObj, float photoreceptorsNeighborhoodRadius, float ganglioncellsNeighborhoodRadius, float meanLuminanceModulatorK);
    private static native void setup_1(long nativeObj, float photoreceptorsNeighborhoodRadius, float ganglioncellsNeighborhoodRadius);
    private static native void setup_2(long nativeObj, float photoreceptorsNeighborhoodRadius);
    private static native void setup_3(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
