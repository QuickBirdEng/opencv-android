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

public class Bgsegm {

    // C++: enum LSBPCameraMotionCompensation
    public static final int
            LSBP_CAMERA_MOTION_COMPENSATION_NONE = 0,
            LSBP_CAMERA_MOTION_COMPENSATION_LK = 0+1;


    //
    // C++:  Ptr_BackgroundSubtractorCNT cv::bgsegm::createBackgroundSubtractorCNT(int minPixelStability = 15, bool useHistory = true, int maxPixelStability = 15*60, bool isParallel = true)
    //

    /**
     * Creates a CNT Background Subtractor
     *
     * @param minPixelStability number of frames with same pixel color to consider stable
     * @param useHistory determines if we're giving a pixel credit for being stable for a long time
     * @param maxPixelStability maximum allowed credit for a pixel in history
     * @param isParallel determines if we're parallelizing the algorithm
     * @return automatically generated
     */
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability, boolean useHistory, int maxPixelStability, boolean isParallel) {
        return BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_0(minPixelStability, useHistory, maxPixelStability, isParallel));
    }

    /**
     * Creates a CNT Background Subtractor
     *
     * @param minPixelStability number of frames with same pixel color to consider stable
     * @param useHistory determines if we're giving a pixel credit for being stable for a long time
     * @param maxPixelStability maximum allowed credit for a pixel in history
     * @return automatically generated
     */
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability, boolean useHistory, int maxPixelStability) {
        return BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_1(minPixelStability, useHistory, maxPixelStability));
    }

    /**
     * Creates a CNT Background Subtractor
     *
     * @param minPixelStability number of frames with same pixel color to consider stable
     * @param useHistory determines if we're giving a pixel credit for being stable for a long time
     * @return automatically generated
     */
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability, boolean useHistory) {
        return BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_2(minPixelStability, useHistory));
    }

    /**
     * Creates a CNT Background Subtractor
     *
     * @param minPixelStability number of frames with same pixel color to consider stable
     * @return automatically generated
     */
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability) {
        return BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_3(minPixelStability));
    }

    /**
     * Creates a CNT Background Subtractor
     *
     * @return automatically generated
     */
    public static BackgroundSubtractorCNT createBackgroundSubtractorCNT() {
        return BackgroundSubtractorCNT.__fromPtr__(createBackgroundSubtractorCNT_4());
    }


    //
    // C++:  Ptr_BackgroundSubtractorGMG cv::bgsegm::createBackgroundSubtractorGMG(int initializationFrames = 120, double decisionThreshold = 0.8)
    //

    /**
     * Creates a GMG Background Subtractor
     *
     * @param initializationFrames number of frames used to initialize the background models.
     * @param decisionThreshold Threshold value, above which it is marked foreground, else background.
     * @return automatically generated
     */
    public static BackgroundSubtractorGMG createBackgroundSubtractorGMG(int initializationFrames, double decisionThreshold) {
        return BackgroundSubtractorGMG.__fromPtr__(createBackgroundSubtractorGMG_0(initializationFrames, decisionThreshold));
    }

    /**
     * Creates a GMG Background Subtractor
     *
     * @param initializationFrames number of frames used to initialize the background models.
     * @return automatically generated
     */
    public static BackgroundSubtractorGMG createBackgroundSubtractorGMG(int initializationFrames) {
        return BackgroundSubtractorGMG.__fromPtr__(createBackgroundSubtractorGMG_1(initializationFrames));
    }

    /**
     * Creates a GMG Background Subtractor
     *
     * @return automatically generated
     */
    public static BackgroundSubtractorGMG createBackgroundSubtractorGMG() {
        return BackgroundSubtractorGMG.__fromPtr__(createBackgroundSubtractorGMG_2());
    }


    //
    // C++:  Ptr_BackgroundSubtractorGSOC cv::bgsegm::createBackgroundSubtractorGSOC(int mc = LSBP_CAMERA_MOTION_COMPENSATION_NONE, int nSamples = 20, float replaceRate = 0.003f, float propagationRate = 0.01f, int hitsThreshold = 32, float alpha = 0.01f, float beta = 0.0022f, float blinkingSupressionDecay = 0.1f, float blinkingSupressionMultiplier = 0.1f, float noiseRemovalThresholdFacBG = 0.0004f, float noiseRemovalThresholdFacFG = 0.0008f)
    //

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @param propagationRate Probability of propagating to neighbors.
     * @param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
     * @param alpha Scale coefficient for threshold.
     * @param beta Bias coefficient for threshold.
     * @param blinkingSupressionDecay Blinking supression decay factor.
     * @param blinkingSupressionMultiplier Blinking supression multiplier.
     * @param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
     * @param noiseRemovalThresholdFacFG Strength of the noise removal for foreground points.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_0(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @param propagationRate Probability of propagating to neighbors.
     * @param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
     * @param alpha Scale coefficient for threshold.
     * @param beta Bias coefficient for threshold.
     * @param blinkingSupressionDecay Blinking supression decay factor.
     * @param blinkingSupressionMultiplier Blinking supression multiplier.
     * @param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier, float noiseRemovalThresholdFacBG) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_1(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier, noiseRemovalThresholdFacBG));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @param propagationRate Probability of propagating to neighbors.
     * @param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
     * @param alpha Scale coefficient for threshold.
     * @param beta Bias coefficient for threshold.
     * @param blinkingSupressionDecay Blinking supression decay factor.
     * @param blinkingSupressionMultiplier Blinking supression multiplier.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay, float blinkingSupressionMultiplier) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_2(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay, blinkingSupressionMultiplier));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @param propagationRate Probability of propagating to neighbors.
     * @param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
     * @param alpha Scale coefficient for threshold.
     * @param beta Bias coefficient for threshold.
     * @param blinkingSupressionDecay Blinking supression decay factor.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta, float blinkingSupressionDecay) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_3(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta, blinkingSupressionDecay));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @param propagationRate Probability of propagating to neighbors.
     * @param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
     * @param alpha Scale coefficient for threshold.
     * @param beta Bias coefficient for threshold.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha, float beta) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_4(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha, beta));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @param propagationRate Probability of propagating to neighbors.
     * @param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
     * @param alpha Scale coefficient for threshold.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold, float alpha) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_5(mc, nSamples, replaceRate, propagationRate, hitsThreshold, alpha));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @param propagationRate Probability of propagating to neighbors.
     * @param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate, int hitsThreshold) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_6(mc, nSamples, replaceRate, propagationRate, hitsThreshold));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @param propagationRate Probability of propagating to neighbors.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate, float propagationRate) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_7(mc, nSamples, replaceRate, propagationRate));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param replaceRate Probability of replacing the old sample - how fast the model will update itself.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples, float replaceRate) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_8(mc, nSamples, replaceRate));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc, int nSamples) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_9(mc, nSamples));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @param mc Whether to use camera motion compensation.
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc) {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_10(mc));
    }

    /**
     * Creates an instance of BackgroundSubtractorGSOC algorithm.
     *
     * Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
     *
     * @return automatically generated
     */
    public static BackgroundSubtractorGSOC createBackgroundSubtractorGSOC() {
        return BackgroundSubtractorGSOC.__fromPtr__(createBackgroundSubtractorGSOC_11());
    }


    //
    // C++:  Ptr_BackgroundSubtractorLSBP cv::bgsegm::createBackgroundSubtractorLSBP(int mc = LSBP_CAMERA_MOTION_COMPENSATION_NONE, int nSamples = 20, int LSBPRadius = 16, float Tlower = 2.0f, float Tupper = 32.0f, float Tinc = 1.0f, float Tdec = 0.05f, float Rscale = 10.0f, float Rincdec = 0.005f, float noiseRemovalThresholdFacBG = 0.0004f, float noiseRemovalThresholdFacFG = 0.0008f, int LSBPthreshold = 8, int minCount = 2)
    //

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @param Tinc Increase step for T-values. See CITE: LGuo2016 for details.
     * @param Tdec Decrease step for T-values. See CITE: LGuo2016 for details.
     * @param Rscale Scale coefficient for threshold values.
     * @param Rincdec Increase/Decrease step for threshold values.
     * @param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
     * @param noiseRemovalThresholdFacFG Strength of the noise removal for foreground points.
     * @param LSBPthreshold Threshold for LSBP binary string.
     * @param minCount Minimal number of matches for sample to be considered as foreground.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG, int LSBPthreshold, int minCount) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_0(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG, LSBPthreshold, minCount));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @param Tinc Increase step for T-values. See CITE: LGuo2016 for details.
     * @param Tdec Decrease step for T-values. See CITE: LGuo2016 for details.
     * @param Rscale Scale coefficient for threshold values.
     * @param Rincdec Increase/Decrease step for threshold values.
     * @param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
     * @param noiseRemovalThresholdFacFG Strength of the noise removal for foreground points.
     * @param LSBPthreshold Threshold for LSBP binary string.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG, int LSBPthreshold) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_1(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG, LSBPthreshold));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @param Tinc Increase step for T-values. See CITE: LGuo2016 for details.
     * @param Tdec Decrease step for T-values. See CITE: LGuo2016 for details.
     * @param Rscale Scale coefficient for threshold values.
     * @param Rincdec Increase/Decrease step for threshold values.
     * @param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
     * @param noiseRemovalThresholdFacFG Strength of the noise removal for foreground points.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG, float noiseRemovalThresholdFacFG) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_2(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG, noiseRemovalThresholdFacFG));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @param Tinc Increase step for T-values. See CITE: LGuo2016 for details.
     * @param Tdec Decrease step for T-values. See CITE: LGuo2016 for details.
     * @param Rscale Scale coefficient for threshold values.
     * @param Rincdec Increase/Decrease step for threshold values.
     * @param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec, float noiseRemovalThresholdFacBG) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_3(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec, noiseRemovalThresholdFacBG));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @param Tinc Increase step for T-values. See CITE: LGuo2016 for details.
     * @param Tdec Decrease step for T-values. See CITE: LGuo2016 for details.
     * @param Rscale Scale coefficient for threshold values.
     * @param Rincdec Increase/Decrease step for threshold values.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale, float Rincdec) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_4(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale, Rincdec));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @param Tinc Increase step for T-values. See CITE: LGuo2016 for details.
     * @param Tdec Decrease step for T-values. See CITE: LGuo2016 for details.
     * @param Rscale Scale coefficient for threshold values.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec, float Rscale) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_5(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec, Rscale));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @param Tinc Increase step for T-values. See CITE: LGuo2016 for details.
     * @param Tdec Decrease step for T-values. See CITE: LGuo2016 for details.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc, float Tdec) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_6(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc, Tdec));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @param Tinc Increase step for T-values. See CITE: LGuo2016 for details.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper, float Tinc) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_7(mc, nSamples, LSBPRadius, Tlower, Tupper, Tinc));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @param Tupper Upper bound for T-values. See CITE: LGuo2016 for details.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower, float Tupper) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_8(mc, nSamples, LSBPRadius, Tlower, Tupper));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @param Tlower Lower bound for T-values. See CITE: LGuo2016 for details.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius, float Tlower) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_9(mc, nSamples, LSBPRadius, Tlower));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @param LSBPRadius LSBP descriptor radius.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples, int LSBPRadius) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_10(mc, nSamples, LSBPRadius));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @param nSamples Number of samples to maintain at each point of the frame.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc, int nSamples) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_11(mc, nSamples));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @param mc Whether to use camera motion compensation.
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc) {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_12(mc));
    }

    /**
     * Creates an instance of BackgroundSubtractorLSBP algorithm.
     *
     * Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at CITE: LGuo2016
     *
     * @return automatically generated
     */
    public static BackgroundSubtractorLSBP createBackgroundSubtractorLSBP() {
        return BackgroundSubtractorLSBP.__fromPtr__(createBackgroundSubtractorLSBP_13());
    }


    //
    // C++:  Ptr_BackgroundSubtractorMOG cv::bgsegm::createBackgroundSubtractorMOG(int history = 200, int nmixtures = 5, double backgroundRatio = 0.7, double noiseSigma = 0)
    //

    /**
     * Creates mixture-of-gaussian background subtractor
     *
     * @param history Length of the history.
     * @param nmixtures Number of Gaussian mixtures.
     * @param backgroundRatio Background ratio.
     * @param noiseSigma Noise strength (standard deviation of the brightness or each color channel). 0
     * means some automatic value.
     * @return automatically generated
     */
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history, int nmixtures, double backgroundRatio, double noiseSigma) {
        return BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_0(history, nmixtures, backgroundRatio, noiseSigma));
    }

    /**
     * Creates mixture-of-gaussian background subtractor
     *
     * @param history Length of the history.
     * @param nmixtures Number of Gaussian mixtures.
     * @param backgroundRatio Background ratio.
     * means some automatic value.
     * @return automatically generated
     */
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history, int nmixtures, double backgroundRatio) {
        return BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_1(history, nmixtures, backgroundRatio));
    }

    /**
     * Creates mixture-of-gaussian background subtractor
     *
     * @param history Length of the history.
     * @param nmixtures Number of Gaussian mixtures.
     * means some automatic value.
     * @return automatically generated
     */
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history, int nmixtures) {
        return BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_2(history, nmixtures));
    }

    /**
     * Creates mixture-of-gaussian background subtractor
     *
     * @param history Length of the history.
     * means some automatic value.
     * @return automatically generated
     */
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history) {
        return BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_3(history));
    }

    /**
     * Creates mixture-of-gaussian background subtractor
     *
     * means some automatic value.
     * @return automatically generated
     */
    public static BackgroundSubtractorMOG createBackgroundSubtractorMOG() {
        return BackgroundSubtractorMOG.__fromPtr__(createBackgroundSubtractorMOG_4());
    }


    //
    // C++:  Ptr_SyntheticSequenceGenerator cv::bgsegm::createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude = 2.0, double wavelength = 20.0, double wavespeed = 0.2, double objspeed = 6.0)
    //

    /**
     * Creates an instance of SyntheticSequenceGenerator.
     *
     * @param background Background image for object.
     * @param object Object image which will move slowly over the background.
     * @param amplitude Amplitude of wave distortion applied to background.
     * @param wavelength Length of waves in distortion applied to background.
     * @param wavespeed How fast waves will move.
     * @param objspeed How fast object will fly over background.
     * @return automatically generated
     */
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed, double objspeed) {
        return SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_0(background.nativeObj, object.nativeObj, amplitude, wavelength, wavespeed, objspeed));
    }

    /**
     * Creates an instance of SyntheticSequenceGenerator.
     *
     * @param background Background image for object.
     * @param object Object image which will move slowly over the background.
     * @param amplitude Amplitude of wave distortion applied to background.
     * @param wavelength Length of waves in distortion applied to background.
     * @param wavespeed How fast waves will move.
     * @return automatically generated
     */
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength, double wavespeed) {
        return SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_1(background.nativeObj, object.nativeObj, amplitude, wavelength, wavespeed));
    }

    /**
     * Creates an instance of SyntheticSequenceGenerator.
     *
     * @param background Background image for object.
     * @param object Object image which will move slowly over the background.
     * @param amplitude Amplitude of wave distortion applied to background.
     * @param wavelength Length of waves in distortion applied to background.
     * @return automatically generated
     */
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude, double wavelength) {
        return SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_2(background.nativeObj, object.nativeObj, amplitude, wavelength));
    }

    /**
     * Creates an instance of SyntheticSequenceGenerator.
     *
     * @param background Background image for object.
     * @param object Object image which will move slowly over the background.
     * @param amplitude Amplitude of wave distortion applied to background.
     * @return automatically generated
     */
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object, double amplitude) {
        return SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_3(background.nativeObj, object.nativeObj, amplitude));
    }

    /**
     * Creates an instance of SyntheticSequenceGenerator.
     *
     * @param background Background image for object.
     * @param object Object image which will move slowly over the background.
     * @return automatically generated
     */
    public static SyntheticSequenceGenerator createSyntheticSequenceGenerator(Mat background, Mat object) {
        return SyntheticSequenceGenerator.__fromPtr__(createSyntheticSequenceGenerator_4(background.nativeObj, object.nativeObj));
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
