//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.bgsegm.BackgroundSubtractorCNT;
import org.opencv.bgsegm.BackgroundSubtractorGMG;
import org.opencv.bgsegm.BackgroundSubtractorGSOC;
import org.opencv.bgsegm.BackgroundSubtractorLSBP;
import org.opencv.bgsegm.BackgroundSubtractorMOG;
import org.opencv.bgsegm.SyntheticSequenceGenerator;
import org.opencv.core.Mat;

// C++: class Bgsegm
//javadoc: Bgsegm

public class Bgsegm {

    // C++: enum LSBPCameraMotionCompensation
    public static final int
            LSBP_CAMERA_MOTION_COMPENSATION_NONE = 0,
            LSBP_CAMERA_MOTION_COMPENSATION_LK = 0+1;


    //
    // C++:  Ptr_BackgroundSubtractorCNT cv::bgsegm::createBackgroundSubtractorCNT(int minPixelStability = 15, bool useHistory = true, int maxPixelStability = 15*60, bool isParallel = true)
    //

    //javadoc: createBackgroundSubtractorCNT(minPixelStability, useHistory, maxPixelStability, isParallel)
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability, boolean useHistory, int maxPixelStability, boolean isParallel)
    {
        
        BackgroundSubtractorCNT retVal = BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_0(minPixelStability, useHistory, maxPixelStability, isParallel));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorCNT(minPixelStability, useHistory, maxPixelStability)
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability, boolean useHistory, int maxPixelStability)
    {
        
        BackgroundSubtractorCNT retVal = BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_1(minPixelStability, useHistory, maxPixelStability));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorCNT(minPixelStability, useHistory)
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability, boolean useHistory)
    {
        
        BackgroundSubtractorCNT retVal = BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_2(minPixelStability, useHistory));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorCNT(minPixelStability)
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability)
    {
        
        BackgroundSubtractorCNT retVal = BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_3(minPixelStability));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorCNT()
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT()
    {
        
        BackgroundSubtractorCNT retVal = BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_4());
        
        return retVal;
    }


    //
    // C++:  Ptr_BackgroundSubtractorGMG cv::bgsegm::createBackgroundSubtractorGMG(int initializationFrames = 120, double decisionThreshold = 0.8)
    //

    //javadoc: createBackgroundSubtractorGMG(initializationFrames, decisionThreshold)
    public static BackgroundSubtractorGMG createBackgroundSubtractorGMG(int initializationFrames, double decisionThreshold)
    {
        
        BackgroundSubtractorGMG retVal = BackgroundSubtractorGMG.__fromPtr__(createBackgroundSubtractorGMG_0(initializationFrames, decisionThreshold));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGMG(initializationFrames)
    public static BackgroundSubtractorGMG createBackgroundSubtractorGMG(int initializationFrames)
    {
        
        BackgroundSubtractorGMG retVal = BackgroundSubtractorGMG.__fromPtr__(createBackgroundSubtractorGMG_1(initializationFrames));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGMG()
    public static BackgroundSubtractorGMG createBackgroundSubtractorGMG()
    {
        
        BackgroundSubtractorGMG retVal = BackgroundSubtractorGMG.__fromPtr__(createBackgroundSubtractorGMG_2());
        
        return retVal;
    }


    //
    // C++:  Ptr_BackgroundSubtractorGSOC cv::bgsegm::createBackgroundSubtractorGSOC(int mc = LSBP_CAMERA_MOTION_COMPENSATION_NONE, int nSamples = 20, float replaceRate = 0.003f, float propagationRate = 0.01f, int hitsThreshold = 32, float alpha = 0.01f, float beta = 0.0022f, float blinkingSupressionDecay = 0.1f, float blinkingSupressionMultiplier = 0.1f, float noiseRemovalThresholdFacBG = 0.0004f, float noiseRemovalThresholdFacFG = 0.0008f)
    //

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_0(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier, noiseRemovalThresholdFacBG)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier, float noiseRemovalThresholdFacBG)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_1(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier, noiseRemovalThresholdFacBG));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_2(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_3(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_4(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_5(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate, propagationRate, hitsThreshold)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_6(mc, nSamples, replaceRate, propagationRate, hitsThreshold));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate, propagationRate)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_7(mc, nSamples, replaceRate, propagationRate));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples, replaceRate)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_8(mc, nSamples, replaceRate));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc, nSamples)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_9(mc, nSamples));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC(mc)
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc)
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_10(mc));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorGSOC()
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC()
    {
        
        BackgroundSubtractorGSOC retVal = BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_11());
        
        return retVal;
    }


    //
    // C++:  Ptr_BackgroundSubtractorLSBP cv::bgsegm::createBackgroundSubtractorLSBP(int mc = LSBP_CAMERA_MOTION_COMPENSATION_NONE, int nSamples = 20, int LSBPRadius = 16, float Tlower = 2.0f, float Tupper = 32.0f, float Tinc = 1.0f, float Tdec = 0.05f, float Rscale = 10.0f, float Rincdec = 0.005f, float noiseRemovalThresholdFacBG = 0.0004f, float noiseRemovalThresholdFacFG = 0.0008f, int LSBPthreshold = 8, int minCount = 2)
    //

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG, LSBPthreshold, minCount)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG, int LSBPthreshold, int minCount)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_0(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG, LSBPthreshold, minCount));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG, LSBPthreshold)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG, int LSBPthreshold)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_1(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG, LSBPthreshold));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_2(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_3(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_4(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_5(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_6(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_7(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower, Tupper)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_8(mc, nSamples, LSBPRadius, Tlower, Tupper));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius, Tlower)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_9(mc, nSamples, LSBPRadius, Tlower));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples, LSBPRadius)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_10(mc, nSamples, LSBPRadius));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc, nSamples)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_11(mc, nSamples));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP(mc)
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc)
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_12(mc));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorLSBP()
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP()
    {
        
        BackgroundSubtractorLSBP retVal = BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_13());
        
        return retVal;
    }


    //
    // C++:  Ptr_BackgroundSubtractorMOG cv::bgsegm::createBackgroundSubtractorMOG(int history = 200, int nmixtures = 5, double backgroundRatio = 0.7, double noiseSigma = 0)
    //

    //javadoc: createBackgroundSubtractorMOG(history, nmixtures, backgroundRatio, noiseSigma)
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history, int nmixtures, double backgroundRatio, double noiseSigma)
    {
        
        BackgroundSubtractorMOG retVal = BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_0(history, nmixtures, backgroundRatio, noiseSigma));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorMOG(history, nmixtures, backgroundRatio)
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history, int nmixtures, double backgroundRatio)
    {
        
        BackgroundSubtractorMOG retVal = BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_1(history, nmixtures, backgroundRatio));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorMOG(history, nmixtures)
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history, int nmixtures)
    {
        
        BackgroundSubtractorMOG retVal = BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_2(history, nmixtures));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorMOG(history)
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history)
    {
        
        BackgroundSubtractorMOG retVal = BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_3(history));
        
        return retVal;
    }

    //javadoc: createBackgroundSubtractorMOG()
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG()
    {
        
        BackgroundSubtractorMOG retVal = BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_4());
        
        return retVal;
    }


    //
    // C++:  Ptr_SyntheticSequenceGenerator cv::bgsegm::createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude = 2.0, double wavelength = 20.0, double wavespeed = 0.2, double objspeed = 6.0)
    //

    //javadoc: createSyntheticSequenceGenerator(background, object, amplitude, wavelength, wavespeed, objspeed)
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed, double objspeed)
    {
        
        SyntheticSequenceGenerator retVal = SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_0(background.nativeObj, object.nativeObj, amplitude, wavelength, wavespeed, objspeed));
        
        return retVal;
    }

    //javadoc: createSyntheticSequenceGenerator(background, object, amplitude, wavelength, wavespeed)
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed)
    {
        
        SyntheticSequenceGenerator retVal = SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_1(background.nativeObj, object.nativeObj, amplitude, wavelength, wavespeed));
        
        return retVal;
    }

    //javadoc: createSyntheticSequenceGenerator(background, object, amplitude, wavelength)
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength)
    {
        
        SyntheticSequenceGenerator retVal = SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_2(background.nativeObj, object.nativeObj, amplitude, wavelength));
        
        return retVal;
    }

    //javadoc: createSyntheticSequenceGenerator(background, object, amplitude)
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude)
    {
        
        SyntheticSequenceGenerator retVal = SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_3(background.nativeObj, object.nativeObj, amplitude));
        
        return retVal;
    }

    //javadoc: createSyntheticSequenceGenerator(background, object)
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object)
    {
        
        SyntheticSequenceGenerator retVal = SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_4(background.nativeObj, object.nativeObj));
        
        return retVal;
    }




    // C++:  Ptr_BackgroundSubtractorCNT cv::bgsegm::createBackgroundSubtractorCNT(int minPixelStability = 15, bool useHistory = true, int maxPixelStability = 15*60, bool isParallel = true)
    private static native long createBackgroundSubtractorCNT_0(int minPixelStability, boolean useHistory, int maxPixelStability, boolean isParallel);
    private static native long createBackgroundSubtractorCNT_1(int minPixelStability, boolean useHistory, int maxPixelStability);
    private static native long createBackgroundSubtractorCNT_2(int minPixelStability, boolean useHistory);
    private static native long createBackgroundSubtractorCNT_3(int minPixelStability);
    private static native long createBackgroundSubtractorCNT_4();

    // C++:  Ptr_BackgroundSubtractorGMG cv::bgsegm::createBackgroundSubtractorGMG(int initializationFrames = 120, double decisionThreshold = 0.8)
    private static native long createBackgroundSubtractorGMG_0(int initializationFrames, double decisionThreshold);
    private static native long createBackgroundSubtractorGMG_1(int initializationFrames);
    private static native long createBackgroundSubtractorGMG_2();

    // C++:  Ptr_BackgroundSubtractorGSOC cv::bgsegm::createBackgroundSubtractorGSOC(int mc = LSBP_CAMERA_MOTION_COMPENSATION_NONE, int nSamples = 20, float replaceRate = 0.003f, float propagationRate = 0.01f, int hitsThreshold = 32, float alpha = 0.01f, float beta = 0.0022f, float blinkingSupressionDecay = 0.1f, float blinkingSupressionMultiplier = 0.1f, float noiseRemovalThresholdFacBG = 0.0004f, float noiseRemovalThresholdFacFG = 0.0008f)
    private static native long createBackgroundSubtractorGSOC_0(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG);
    private static native long createBackgroundSubtractorGSOC_1(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier, float noiseRemovalThresholdFacBG);
    private static native long createBackgroundSubtractorGSOC_2(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier);
    private static native long createBackgroundSubtractorGSOC_3(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay);
    private static native long createBackgroundSubtractorGSOC_4(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta);
    private static native long createBackgroundSubtractorGSOC_5(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha);
    private static native long createBackgroundSubtractorGSOC_6(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold);
    private static native long createBackgroundSubtractorGSOC_7(int mc, int nSamples, float replaceRate, float propagationRate);
    private static native long createBackgroundSubtractorGSOC_8(int mc, int nSamples, float replaceRate);
    private static native long createBackgroundSubtractorGSOC_9(int mc, int nSamples);
    private static native long createBackgroundSubtractorGSOC_10(int mc);
    private static native long createBackgroundSubtractorGSOC_11();

    // C++:  Ptr_BackgroundSubtractorLSBP cv::bgsegm::createBackgroundSubtractorLSBP(int mc = LSBP_CAMERA_MOTION_COMPENSATION_NONE, int nSamples = 20, int LSBPRadius = 16, float Tlower = 2.0f, float Tupper = 32.0f, float Tinc = 1.0f, float Tdec = 0.05f, float Rscale = 10.0f, float Rincdec = 0.005f, float noiseRemovalThresholdFacBG = 0.0004f, float noiseRemovalThresholdFacFG = 0.0008f, int LSBPthreshold = 8, int minCount = 2)
    private static native long createBackgroundSubtractorLSBP_0(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG, int LSBPthreshold, int minCount);
    private static native long createBackgroundSubtractorLSBP_1(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG, int LSBPthreshold);
    private static native long createBackgroundSubtractorLSBP_2(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG);
    private static native long createBackgroundSubtractorLSBP_3(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG);
    private static native long createBackgroundSubtractorLSBP_4(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec);
    private static native long createBackgroundSubtractorLSBP_5(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale);
    private static native long createBackgroundSubtractorLSBP_6(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec);
    private static native long createBackgroundSubtractorLSBP_7(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc);
    private static native long createBackgroundSubtractorLSBP_8(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper);
    private static native long createBackgroundSubtractorLSBP_9(int mc, int nSamples, int LSBPRadius, float Tlower);
    private static native long createBackgroundSubtractorLSBP_10(int mc, int nSamples, int LSBPRadius);
    private static native long createBackgroundSubtractorLSBP_11(int mc, int nSamples);
    private static native long createBackgroundSubtractorLSBP_12(int mc);
    private static native long createBackgroundSubtractorLSBP_13();

    // C++:  Ptr_BackgroundSubtractorMOG cv::bgsegm::createBackgroundSubtractorMOG(int history = 200, int nmixtures = 5, double backgroundRatio = 0.7, double noiseSigma = 0)
    private static native long createBackgroundSubtractorMOG_0(int history, int nmixtures, double backgroundRatio, double noiseSigma);
    private static native long createBackgroundSubtractorMOG_1(int history, int nmixtures, double backgroundRatio);
    private static native long createBackgroundSubtractorMOG_2(int history, int nmixtures);
    private static native long createBackgroundSubtractorMOG_3(int history);
    private static native long createBackgroundSubtractorMOG_4();

    // C++:  Ptr_SyntheticSequenceGenerator cv::bgsegm::createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude = 2.0, double wavelength = 20.0, double wavespeed = 0.2, double objspeed = 6.0)
    private static native long createSyntheticSequenceGenerator_0(long background_nativeObj, long object_nativeObj, double amplitude, double wavelength, double wavespeed, double objspeed);
    private static native long createSyntheticSequenceGenerator_1(long background_nativeObj, long object_nativeObj, double amplitude, double wavelength, double wavespeed);
    private static native long createSyntheticSequenceGenerator_2(long background_nativeObj, long object_nativeObj, double amplitude, double wavelength);
    private static native long createSyntheticSequenceGenerator_3(long background_nativeObj, long object_nativeObj, double amplitude);
    private static native long createSyntheticSequenceGenerator_4(long background_nativeObj, long object_nativeObj);

}
