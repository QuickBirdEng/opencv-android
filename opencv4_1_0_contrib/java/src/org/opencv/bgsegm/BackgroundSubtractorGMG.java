//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.video.BackgroundSubtractor;

// C++: class BackgroundSubtractorGMG
//javadoc: BackgroundSubtractorGMG

public class BackgroundSubtractorGMG extends BackgroundSubtractor {

    protected BackgroundSubtractorGMG(long addr) { super(addr); }

    // internal usage only
    public static BackgroundSubtractorGMG __fromPtr__(long addr) { return new BackgroundSubtractorGMG(addr); }

    //
    // C++:  bool cv::bgsegm::BackgroundSubtractorGMG::getUpdateBackgroundModel()
    //

    //javadoc: BackgroundSubtractorGMG::getUpdateBackgroundModel()
    public  boolean getUpdateBackgroundModel()
    {
        
        boolean retVal = getUpdateBackgroundModel_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getBackgroundPrior()
    //

    //javadoc: BackgroundSubtractorGMG::getBackgroundPrior()
    public  double getBackgroundPrior()
    {
        
        double retVal = getBackgroundPrior_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getDecisionThreshold()
    //

    //javadoc: BackgroundSubtractorGMG::getDecisionThreshold()
    public  double getDecisionThreshold()
    {
        
        double retVal = getDecisionThreshold_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getDefaultLearningRate()
    //

    //javadoc: BackgroundSubtractorGMG::getDefaultLearningRate()
    public  double getDefaultLearningRate()
    {
        
        double retVal = getDefaultLearningRate_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getMaxVal()
    //

    //javadoc: BackgroundSubtractorGMG::getMaxVal()
    public  double getMaxVal()
    {
        
        double retVal = getMaxVal_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getMinVal()
    //

    //javadoc: BackgroundSubtractorGMG::getMinVal()
    public  double getMinVal()
    {
        
        double retVal = getMinVal_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getMaxFeatures()
    //

    //javadoc: BackgroundSubtractorGMG::getMaxFeatures()
    public  int getMaxFeatures()
    {
        
        int retVal = getMaxFeatures_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getNumFrames()
    //

    //javadoc: BackgroundSubtractorGMG::getNumFrames()
    public  int getNumFrames()
    {
        
        int retVal = getNumFrames_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getQuantizationLevels()
    //

    //javadoc: BackgroundSubtractorGMG::getQuantizationLevels()
    public  int getQuantizationLevels()
    {
        
        int retVal = getQuantizationLevels_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getSmoothingRadius()
    //

    //javadoc: BackgroundSubtractorGMG::getSmoothingRadius()
    public  int getSmoothingRadius()
    {
        
        int retVal = getSmoothingRadius_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setBackgroundPrior(double bgprior)
    //

    //javadoc: BackgroundSubtractorGMG::setBackgroundPrior(bgprior)
    public  void setBackgroundPrior(double bgprior)
    {
        
        setBackgroundPrior_0(nativeObj, bgprior);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setDecisionThreshold(double thresh)
    //

    //javadoc: BackgroundSubtractorGMG::setDecisionThreshold(thresh)
    public  void setDecisionThreshold(double thresh)
    {
        
        setDecisionThreshold_0(nativeObj, thresh);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setDefaultLearningRate(double lr)
    //

    //javadoc: BackgroundSubtractorGMG::setDefaultLearningRate(lr)
    public  void setDefaultLearningRate(double lr)
    {
        
        setDefaultLearningRate_0(nativeObj, lr);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMaxFeatures(int maxFeatures)
    //

    //javadoc: BackgroundSubtractorGMG::setMaxFeatures(maxFeatures)
    public  void setMaxFeatures(int maxFeatures)
    {
        
        setMaxFeatures_0(nativeObj, maxFeatures);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMaxVal(double val)
    //

    //javadoc: BackgroundSubtractorGMG::setMaxVal(val)
    public  void setMaxVal(double val)
    {
        
        setMaxVal_0(nativeObj, val);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMinVal(double val)
    //

    //javadoc: BackgroundSubtractorGMG::setMinVal(val)
    public  void setMinVal(double val)
    {
        
        setMinVal_0(nativeObj, val);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setNumFrames(int nframes)
    //

    //javadoc: BackgroundSubtractorGMG::setNumFrames(nframes)
    public  void setNumFrames(int nframes)
    {
        
        setNumFrames_0(nativeObj, nframes);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setQuantizationLevels(int nlevels)
    //

    //javadoc: BackgroundSubtractorGMG::setQuantizationLevels(nlevels)
    public  void setQuantizationLevels(int nlevels)
    {
        
        setQuantizationLevels_0(nativeObj, nlevels);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setSmoothingRadius(int radius)
    //

    //javadoc: BackgroundSubtractorGMG::setSmoothingRadius(radius)
    public  void setSmoothingRadius(int radius)
    {
        
        setSmoothingRadius_0(nativeObj, radius);
        
        return;
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setUpdateBackgroundModel(bool update)
    //

    //javadoc: BackgroundSubtractorGMG::setUpdateBackgroundModel(update)
    public  void setUpdateBackgroundModel(boolean update)
    {
        
        setUpdateBackgroundModel_0(nativeObj, update);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::bgsegm::BackgroundSubtractorGMG::getUpdateBackgroundModel()
    private static native boolean getUpdateBackgroundModel_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getBackgroundPrior()
    private static native double getBackgroundPrior_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getDecisionThreshold()
    private static native double getDecisionThreshold_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getDefaultLearningRate()
    private static native double getDefaultLearningRate_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getMaxVal()
    private static native double getMaxVal_0(long nativeObj);

    // C++:  double cv::bgsegm::BackgroundSubtractorGMG::getMinVal()
    private static native double getMinVal_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getMaxFeatures()
    private static native int getMaxFeatures_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getNumFrames()
    private static native int getNumFrames_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getQuantizationLevels()
    private static native int getQuantizationLevels_0(long nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorGMG::getSmoothingRadius()
    private static native int getSmoothingRadius_0(long nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setBackgroundPrior(double bgprior)
    private static native void setBackgroundPrior_0(long nativeObj, double bgprior);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setDecisionThreshold(double thresh)
    private static native void setDecisionThreshold_0(long nativeObj, double thresh);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setDefaultLearningRate(double lr)
    private static native void setDefaultLearningRate_0(long nativeObj, double lr);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMaxFeatures(int maxFeatures)
    private static native void setMaxFeatures_0(long nativeObj, int maxFeatures);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMaxVal(double val)
    private static native void setMaxVal_0(long nativeObj, double val);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setMinVal(double val)
    private static native void setMinVal_0(long nativeObj, double val);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setNumFrames(int nframes)
    private static native void setNumFrames_0(long nativeObj, int nframes);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setQuantizationLevels(int nlevels)
    private static native void setQuantizationLevels_0(long nativeObj, int nlevels);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setSmoothingRadius(int radius)
    private static native void setSmoothingRadius_0(long nativeObj, int radius);

    // C++:  void cv::bgsegm::BackgroundSubtractorGMG::setUpdateBackgroundModel(bool update)
    private static native void setUpdateBackgroundModel_0(long nativeObj, boolean update);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
