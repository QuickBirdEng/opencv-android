//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.aruco;

import org.opencv.aruco.DetectorParameters;

// C++: class DetectorParameters
/**
 * Parameters for the detectMarker process:
 * - adaptiveThreshWinSizeMin: minimum window size for adaptive thresholding before finding
 * contours (default 3).
 * - adaptiveThreshWinSizeMax: maximum window size for adaptive thresholding before finding
 * contours (default 23).
 * - adaptiveThreshWinSizeStep: increments from adaptiveThreshWinSizeMin to adaptiveThreshWinSizeMax
 * during the thresholding (default 10).
 * - adaptiveThreshConstant: constant for adaptive thresholding before finding contours (default 7)
 * - minMarkerPerimeterRate: determine minimum perimeter for marker contour to be detected. This
 * is defined as a rate respect to the maximum dimension of the input image (default 0.03).
 * - maxMarkerPerimeterRate:  determine maximum perimeter for marker contour to be detected. This
 * is defined as a rate respect to the maximum dimension of the input image (default 4.0).
 * - polygonalApproxAccuracyRate: minimum accuracy during the polygonal approximation process to
 * determine which contours are squares.
 * - minCornerDistanceRate: minimum distance between corners for detected markers relative to its
 * perimeter (default 0.05)
 * - minDistanceToBorder: minimum distance of any corner to the image border for detected markers
 * (in pixels) (default 3)
 * - minMarkerDistanceRate: minimum mean distance beetween two marker corners to be considered
 * similar, so that the smaller one is removed. The rate is relative to the smaller perimeter
 * of the two markers (default 0.05).
 * - cornerRefinementMethod: corner refinement method. (CORNER_REFINE_NONE, no refinement.
 * CORNER_REFINE_SUBPIX, do subpixel refinement. CORNER_REFINE_CONTOUR use contour-Points,
 * CORNER_REFINE_APRILTAG  use the AprilTag2 approach)
 * - cornerRefinementWinSize: window size for the corner refinement process (in pixels) (default 5).
 * - cornerRefinementMaxIterations: maximum number of iterations for stop criteria of the corner
 * refinement process (default 30).
 * - cornerRefinementMinAccuracy: minimum error for the stop cristeria of the corner refinement
 * process (default: 0.1)
 * - markerBorderBits: number of bits of the marker border, i.e. marker border width (default 1).
 * - perspectiveRemovePixelPerCell: number of bits (per dimension) for each cell of the marker
 * when removing the perspective (default 8).
 * - perspectiveRemoveIgnoredMarginPerCell: width of the margin of pixels on each cell not
 * considered for the determination of the cell bit. Represents the rate respect to the total
 * size of the cell, i.e. perspectiveRemovePixelPerCell (default 0.13)
 * - maxErroneousBitsInBorderRate: maximum number of accepted erroneous bits in the border (i.e.
 * number of allowed white bits in the border). Represented as a rate respect to the total
 * number of bits per marker (default 0.35).
 * - minOtsuStdDev: minimun standard deviation in pixels values during the decodification step to
 * apply Otsu thresholding (otherwise, all the bits are set to 0 or 1 depending on mean higher
 * than 128 or not) (default 5.0)
 * - errorCorrectionRate error correction rate respect to the maximun error correction capability
 * for each dictionary. (default 0.6).
 * - aprilTagMinClusterPixels: reject quads containing too few pixels.
 * - aprilTagMaxNmaxima: how many corner candidates to consider when segmenting a group of pixels into a quad.
 * - aprilTagCriticalRad: Reject quads where pairs of edges have angles that are close to straight or close to
 * 180 degrees. Zero means that no quads are rejected. (In radians).
 * - aprilTagMaxLineFitMse:  When fitting lines to the contours, what is the maximum mean squared error
 * allowed?  This is useful in rejecting contours that are far from being quad shaped; rejecting
 * these quads "early" saves expensive decoding processing.
 * - aprilTagMinWhiteBlackDiff: When we build our model of black &amp; white pixels, we add an extra check that
 * the white model must be (overall) brighter than the black model.  How much brighter? (in pixel values, [0,255]).
 * - aprilTagDeglitch:  should the thresholded image be deglitched? Only useful for very noisy images
 * - aprilTagQuadDecimate: Detection of quads can be done on a lower-resolution image, improving speed at a
 * cost of pose accuracy and a slight decrease in detection rate. Decoding the binary payload is still
 * done at full resolution.
 * - aprilTagQuadSigma: What Gaussian blur should be applied to the segmented image (used for quad detection?)
 * Parameter is the standard deviation in pixels.  Very noisy images benefit from non-zero values (e.g. 0.8).
 * - detectInvertedMarker: to check if there is a white marker. In order to generate a "white" marker just
 * invert a normal marker by using a tilde, ~markerImage. (default false)
 */
public class DetectorParameters {

    protected final long nativeObj;
    protected DetectorParameters(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static DetectorParameters __fromPtr__(long addr) { return new DetectorParameters(addr); }

    //
    // C++: static Ptr_DetectorParameters cv::aruco::DetectorParameters::create()
    //

    public static DetectorParameters create() {
        return DetectorParameters.__fromPtr__(create_0());
    }


    //
    // C++: int DetectorParameters::adaptiveThreshWinSizeMin
    //

    public int get_adaptiveThreshWinSizeMin() {
        return get_adaptiveThreshWinSizeMin_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::adaptiveThreshWinSizeMin
    //

    public void set_adaptiveThreshWinSizeMin(int adaptiveThreshWinSizeMin) {
        set_adaptiveThreshWinSizeMin_0(nativeObj, adaptiveThreshWinSizeMin);
    }


    //
    // C++: int DetectorParameters::adaptiveThreshWinSizeMax
    //

    public int get_adaptiveThreshWinSizeMax() {
        return get_adaptiveThreshWinSizeMax_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::adaptiveThreshWinSizeMax
    //

    public void set_adaptiveThreshWinSizeMax(int adaptiveThreshWinSizeMax) {
        set_adaptiveThreshWinSizeMax_0(nativeObj, adaptiveThreshWinSizeMax);
    }


    //
    // C++: int DetectorParameters::adaptiveThreshWinSizeStep
    //

    public int get_adaptiveThreshWinSizeStep() {
        return get_adaptiveThreshWinSizeStep_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::adaptiveThreshWinSizeStep
    //

    public void set_adaptiveThreshWinSizeStep(int adaptiveThreshWinSizeStep) {
        set_adaptiveThreshWinSizeStep_0(nativeObj, adaptiveThreshWinSizeStep);
    }


    //
    // C++: double DetectorParameters::adaptiveThreshConstant
    //

    public double get_adaptiveThreshConstant() {
        return get_adaptiveThreshConstant_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::adaptiveThreshConstant
    //

    public void set_adaptiveThreshConstant(double adaptiveThreshConstant) {
        set_adaptiveThreshConstant_0(nativeObj, adaptiveThreshConstant);
    }


    //
    // C++: double DetectorParameters::minMarkerPerimeterRate
    //

    public double get_minMarkerPerimeterRate() {
        return get_minMarkerPerimeterRate_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::minMarkerPerimeterRate
    //

    public void set_minMarkerPerimeterRate(double minMarkerPerimeterRate) {
        set_minMarkerPerimeterRate_0(nativeObj, minMarkerPerimeterRate);
    }


    //
    // C++: double DetectorParameters::maxMarkerPerimeterRate
    //

    public double get_maxMarkerPerimeterRate() {
        return get_maxMarkerPerimeterRate_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::maxMarkerPerimeterRate
    //

    public void set_maxMarkerPerimeterRate(double maxMarkerPerimeterRate) {
        set_maxMarkerPerimeterRate_0(nativeObj, maxMarkerPerimeterRate);
    }


    //
    // C++: double DetectorParameters::polygonalApproxAccuracyRate
    //

    public double get_polygonalApproxAccuracyRate() {
        return get_polygonalApproxAccuracyRate_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::polygonalApproxAccuracyRate
    //

    public void set_polygonalApproxAccuracyRate(double polygonalApproxAccuracyRate) {
        set_polygonalApproxAccuracyRate_0(nativeObj, polygonalApproxAccuracyRate);
    }


    //
    // C++: double DetectorParameters::minCornerDistanceRate
    //

    public double get_minCornerDistanceRate() {
        return get_minCornerDistanceRate_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::minCornerDistanceRate
    //

    public void set_minCornerDistanceRate(double minCornerDistanceRate) {
        set_minCornerDistanceRate_0(nativeObj, minCornerDistanceRate);
    }


    //
    // C++: int DetectorParameters::minDistanceToBorder
    //

    public int get_minDistanceToBorder() {
        return get_minDistanceToBorder_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::minDistanceToBorder
    //

    public void set_minDistanceToBorder(int minDistanceToBorder) {
        set_minDistanceToBorder_0(nativeObj, minDistanceToBorder);
    }


    //
    // C++: double DetectorParameters::minMarkerDistanceRate
    //

    public double get_minMarkerDistanceRate() {
        return get_minMarkerDistanceRate_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::minMarkerDistanceRate
    //

    public void set_minMarkerDistanceRate(double minMarkerDistanceRate) {
        set_minMarkerDistanceRate_0(nativeObj, minMarkerDistanceRate);
    }


    //
    // C++: int DetectorParameters::cornerRefinementMethod
    //

    public int get_cornerRefinementMethod() {
        return get_cornerRefinementMethod_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::cornerRefinementMethod
    //

    public void set_cornerRefinementMethod(int cornerRefinementMethod) {
        set_cornerRefinementMethod_0(nativeObj, cornerRefinementMethod);
    }


    //
    // C++: int DetectorParameters::cornerRefinementWinSize
    //

    public int get_cornerRefinementWinSize() {
        return get_cornerRefinementWinSize_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::cornerRefinementWinSize
    //

    public void set_cornerRefinementWinSize(int cornerRefinementWinSize) {
        set_cornerRefinementWinSize_0(nativeObj, cornerRefinementWinSize);
    }


    //
    // C++: int DetectorParameters::cornerRefinementMaxIterations
    //

    public int get_cornerRefinementMaxIterations() {
        return get_cornerRefinementMaxIterations_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::cornerRefinementMaxIterations
    //

    public void set_cornerRefinementMaxIterations(int cornerRefinementMaxIterations) {
        set_cornerRefinementMaxIterations_0(nativeObj, cornerRefinementMaxIterations);
    }


    //
    // C++: double DetectorParameters::cornerRefinementMinAccuracy
    //

    public double get_cornerRefinementMinAccuracy() {
        return get_cornerRefinementMinAccuracy_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::cornerRefinementMinAccuracy
    //

    public void set_cornerRefinementMinAccuracy(double cornerRefinementMinAccuracy) {
        set_cornerRefinementMinAccuracy_0(nativeObj, cornerRefinementMinAccuracy);
    }


    //
    // C++: int DetectorParameters::markerBorderBits
    //

    public int get_markerBorderBits() {
        return get_markerBorderBits_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::markerBorderBits
    //

    public void set_markerBorderBits(int markerBorderBits) {
        set_markerBorderBits_0(nativeObj, markerBorderBits);
    }


    //
    // C++: int DetectorParameters::perspectiveRemovePixelPerCell
    //

    public int get_perspectiveRemovePixelPerCell() {
        return get_perspectiveRemovePixelPerCell_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::perspectiveRemovePixelPerCell
    //

    public void set_perspectiveRemovePixelPerCell(int perspectiveRemovePixelPerCell) {
        set_perspectiveRemovePixelPerCell_0(nativeObj, perspectiveRemovePixelPerCell);
    }


    //
    // C++: double DetectorParameters::perspectiveRemoveIgnoredMarginPerCell
    //

    public double get_perspectiveRemoveIgnoredMarginPerCell() {
        return get_perspectiveRemoveIgnoredMarginPerCell_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::perspectiveRemoveIgnoredMarginPerCell
    //

    public void set_perspectiveRemoveIgnoredMarginPerCell(double perspectiveRemoveIgnoredMarginPerCell) {
        set_perspectiveRemoveIgnoredMarginPerCell_0(nativeObj, perspectiveRemoveIgnoredMarginPerCell);
    }


    //
    // C++: double DetectorParameters::maxErroneousBitsInBorderRate
    //

    public double get_maxErroneousBitsInBorderRate() {
        return get_maxErroneousBitsInBorderRate_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::maxErroneousBitsInBorderRate
    //

    public void set_maxErroneousBitsInBorderRate(double maxErroneousBitsInBorderRate) {
        set_maxErroneousBitsInBorderRate_0(nativeObj, maxErroneousBitsInBorderRate);
    }


    //
    // C++: double DetectorParameters::minOtsuStdDev
    //

    public double get_minOtsuStdDev() {
        return get_minOtsuStdDev_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::minOtsuStdDev
    //

    public void set_minOtsuStdDev(double minOtsuStdDev) {
        set_minOtsuStdDev_0(nativeObj, minOtsuStdDev);
    }


    //
    // C++: double DetectorParameters::errorCorrectionRate
    //

    public double get_errorCorrectionRate() {
        return get_errorCorrectionRate_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::errorCorrectionRate
    //

    public void set_errorCorrectionRate(double errorCorrectionRate) {
        set_errorCorrectionRate_0(nativeObj, errorCorrectionRate);
    }


    //
    // C++: float DetectorParameters::aprilTagQuadDecimate
    //

    public float get_aprilTagQuadDecimate() {
        return get_aprilTagQuadDecimate_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::aprilTagQuadDecimate
    //

    public void set_aprilTagQuadDecimate(float aprilTagQuadDecimate) {
        set_aprilTagQuadDecimate_0(nativeObj, aprilTagQuadDecimate);
    }


    //
    // C++: float DetectorParameters::aprilTagQuadSigma
    //

    public float get_aprilTagQuadSigma() {
        return get_aprilTagQuadSigma_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::aprilTagQuadSigma
    //

    public void set_aprilTagQuadSigma(float aprilTagQuadSigma) {
        set_aprilTagQuadSigma_0(nativeObj, aprilTagQuadSigma);
    }


    //
    // C++: int DetectorParameters::aprilTagMinClusterPixels
    //

    public int get_aprilTagMinClusterPixels() {
        return get_aprilTagMinClusterPixels_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::aprilTagMinClusterPixels
    //

    public void set_aprilTagMinClusterPixels(int aprilTagMinClusterPixels) {
        set_aprilTagMinClusterPixels_0(nativeObj, aprilTagMinClusterPixels);
    }


    //
    // C++: int DetectorParameters::aprilTagMaxNmaxima
    //

    public int get_aprilTagMaxNmaxima() {
        return get_aprilTagMaxNmaxima_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::aprilTagMaxNmaxima
    //

    public void set_aprilTagMaxNmaxima(int aprilTagMaxNmaxima) {
        set_aprilTagMaxNmaxima_0(nativeObj, aprilTagMaxNmaxima);
    }


    //
    // C++: float DetectorParameters::aprilTagCriticalRad
    //

    public float get_aprilTagCriticalRad() {
        return get_aprilTagCriticalRad_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::aprilTagCriticalRad
    //

    public void set_aprilTagCriticalRad(float aprilTagCriticalRad) {
        set_aprilTagCriticalRad_0(nativeObj, aprilTagCriticalRad);
    }


    //
    // C++: float DetectorParameters::aprilTagMaxLineFitMse
    //

    public float get_aprilTagMaxLineFitMse() {
        return get_aprilTagMaxLineFitMse_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::aprilTagMaxLineFitMse
    //

    public void set_aprilTagMaxLineFitMse(float aprilTagMaxLineFitMse) {
        set_aprilTagMaxLineFitMse_0(nativeObj, aprilTagMaxLineFitMse);
    }


    //
    // C++: int DetectorParameters::aprilTagMinWhiteBlackDiff
    //

    public int get_aprilTagMinWhiteBlackDiff() {
        return get_aprilTagMinWhiteBlackDiff_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::aprilTagMinWhiteBlackDiff
    //

    public void set_aprilTagMinWhiteBlackDiff(int aprilTagMinWhiteBlackDiff) {
        set_aprilTagMinWhiteBlackDiff_0(nativeObj, aprilTagMinWhiteBlackDiff);
    }


    //
    // C++: int DetectorParameters::aprilTagDeglitch
    //

    public int get_aprilTagDeglitch() {
        return get_aprilTagDeglitch_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::aprilTagDeglitch
    //

    public void set_aprilTagDeglitch(int aprilTagDeglitch) {
        set_aprilTagDeglitch_0(nativeObj, aprilTagDeglitch);
    }


    //
    // C++: bool DetectorParameters::detectInvertedMarker
    //

    public boolean get_detectInvertedMarker() {
        return get_detectInvertedMarker_0(nativeObj);
    }


    //
    // C++: void DetectorParameters::detectInvertedMarker
    //

    public void set_detectInvertedMarker(boolean detectInvertedMarker) {
        set_detectInvertedMarker_0(nativeObj, detectInvertedMarker);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_DetectorParameters cv::aruco::DetectorParameters::create()
    private static native long create_0();

    // C++: int DetectorParameters::adaptiveThreshWinSizeMin
    private static native int get_adaptiveThreshWinSizeMin_0(long nativeObj);

    // C++: void DetectorParameters::adaptiveThreshWinSizeMin
    private static native void set_adaptiveThreshWinSizeMin_0(long nativeObj, int adaptiveThreshWinSizeMin);

    // C++: int DetectorParameters::adaptiveThreshWinSizeMax
    private static native int get_adaptiveThreshWinSizeMax_0(long nativeObj);

    // C++: void DetectorParameters::adaptiveThreshWinSizeMax
    private static native void set_adaptiveThreshWinSizeMax_0(long nativeObj, int adaptiveThreshWinSizeMax);

    // C++: int DetectorParameters::adaptiveThreshWinSizeStep
    private static native int get_adaptiveThreshWinSizeStep_0(long nativeObj);

    // C++: void DetectorParameters::adaptiveThreshWinSizeStep
    private static native void set_adaptiveThreshWinSizeStep_0(long nativeObj, int adaptiveThreshWinSizeStep);

    // C++: double DetectorParameters::adaptiveThreshConstant
    private static native double get_adaptiveThreshConstant_0(long nativeObj);

    // C++: void DetectorParameters::adaptiveThreshConstant
    private static native void set_adaptiveThreshConstant_0(long nativeObj, double adaptiveThreshConstant);

    // C++: double DetectorParameters::minMarkerPerimeterRate
    private static native double get_minMarkerPerimeterRate_0(long nativeObj);

    // C++: void DetectorParameters::minMarkerPerimeterRate
    private static native void set_minMarkerPerimeterRate_0(long nativeObj, double minMarkerPerimeterRate);

    // C++: double DetectorParameters::maxMarkerPerimeterRate
    private static native double get_maxMarkerPerimeterRate_0(long nativeObj);

    // C++: void DetectorParameters::maxMarkerPerimeterRate
    private static native void set_maxMarkerPerimeterRate_0(long nativeObj, double maxMarkerPerimeterRate);

    // C++: double DetectorParameters::polygonalApproxAccuracyRate
    private static native double get_polygonalApproxAccuracyRate_0(long nativeObj);

    // C++: void DetectorParameters::polygonalApproxAccuracyRate
    private static native void set_polygonalApproxAccuracyRate_0(long nativeObj, double polygonalApproxAccuracyRate);

    // C++: double DetectorParameters::minCornerDistanceRate
    private static native double get_minCornerDistanceRate_0(long nativeObj);

    // C++: void DetectorParameters::minCornerDistanceRate
    private static native void set_minCornerDistanceRate_0(long nativeObj, double minCornerDistanceRate);

    // C++: int DetectorParameters::minDistanceToBorder
    private static native int get_minDistanceToBorder_0(long nativeObj);

    // C++: void DetectorParameters::minDistanceToBorder
    private static native void set_minDistanceToBorder_0(long nativeObj, int minDistanceToBorder);

    // C++: double DetectorParameters::minMarkerDistanceRate
    private static native double get_minMarkerDistanceRate_0(long nativeObj);

    // C++: void DetectorParameters::minMarkerDistanceRate
    private static native void set_minMarkerDistanceRate_0(long nativeObj, double minMarkerDistanceRate);

    // C++: int DetectorParameters::cornerRefinementMethod
    private static native int get_cornerRefinementMethod_0(long nativeObj);

    // C++: void DetectorParameters::cornerRefinementMethod
    private static native void set_cornerRefinementMethod_0(long nativeObj, int cornerRefinementMethod);

    // C++: int DetectorParameters::cornerRefinementWinSize
    private static native int get_cornerRefinementWinSize_0(long nativeObj);

    // C++: void DetectorParameters::cornerRefinementWinSize
    private static native void set_cornerRefinementWinSize_0(long nativeObj, int cornerRefinementWinSize);

    // C++: int DetectorParameters::cornerRefinementMaxIterations
    private static native int get_cornerRefinementMaxIterations_0(long nativeObj);

    // C++: void DetectorParameters::cornerRefinementMaxIterations
    private static native void set_cornerRefinementMaxIterations_0(long nativeObj, int cornerRefinementMaxIterations);

    // C++: double DetectorParameters::cornerRefinementMinAccuracy
    private static native double get_cornerRefinementMinAccuracy_0(long nativeObj);

    // C++: void DetectorParameters::cornerRefinementMinAccuracy
    private static native void set_cornerRefinementMinAccuracy_0(long nativeObj, double cornerRefinementMinAccuracy);

    // C++: int DetectorParameters::markerBorderBits
    private static native int get_markerBorderBits_0(long nativeObj);

    // C++: void DetectorParameters::markerBorderBits
    private static native void set_markerBorderBits_0(long nativeObj, int markerBorderBits);

    // C++: int DetectorParameters::perspectiveRemovePixelPerCell
    private static native int get_perspectiveRemovePixelPerCell_0(long nativeObj);

    // C++: void DetectorParameters::perspectiveRemovePixelPerCell
    private static native void set_perspectiveRemovePixelPerCell_0(long nativeObj, int perspectiveRemovePixelPerCell);

    // C++: double DetectorParameters::perspectiveRemoveIgnoredMarginPerCell
    private static native double get_perspectiveRemoveIgnoredMarginPerCell_0(long nativeObj);

    // C++: void DetectorParameters::perspectiveRemoveIgnoredMarginPerCell
    private static native void set_perspectiveRemoveIgnoredMarginPerCell_0(long nativeObj, double perspectiveRemoveIgnoredMarginPerCell);

    // C++: double DetectorParameters::maxErroneousBitsInBorderRate
    private static native double get_maxErroneousBitsInBorderRate_0(long nativeObj);

    // C++: void DetectorParameters::maxErroneousBitsInBorderRate
    private static native void set_maxErroneousBitsInBorderRate_0(long nativeObj, double maxErroneousBitsInBorderRate);

    // C++: double DetectorParameters::minOtsuStdDev
    private static native double get_minOtsuStdDev_0(long nativeObj);

    // C++: void DetectorParameters::minOtsuStdDev
    private static native void set_minOtsuStdDev_0(long nativeObj, double minOtsuStdDev);

    // C++: double DetectorParameters::errorCorrectionRate
    private static native double get_errorCorrectionRate_0(long nativeObj);

    // C++: void DetectorParameters::errorCorrectionRate
    private static native void set_errorCorrectionRate_0(long nativeObj, double errorCorrectionRate);

    // C++: float DetectorParameters::aprilTagQuadDecimate
    private static native float get_aprilTagQuadDecimate_0(long nativeObj);

    // C++: void DetectorParameters::aprilTagQuadDecimate
    private static native void set_aprilTagQuadDecimate_0(long nativeObj, float aprilTagQuadDecimate);

    // C++: float DetectorParameters::aprilTagQuadSigma
    private static native float get_aprilTagQuadSigma_0(long nativeObj);

    // C++: void DetectorParameters::aprilTagQuadSigma
    private static native void set_aprilTagQuadSigma_0(long nativeObj, float aprilTagQuadSigma);

    // C++: int DetectorParameters::aprilTagMinClusterPixels
    private static native int get_aprilTagMinClusterPixels_0(long nativeObj);

    // C++: void DetectorParameters::aprilTagMinClusterPixels
    private static native void set_aprilTagMinClusterPixels_0(long nativeObj, int aprilTagMinClusterPixels);

    // C++: int DetectorParameters::aprilTagMaxNmaxima
    private static native int get_aprilTagMaxNmaxima_0(long nativeObj);

    // C++: void DetectorParameters::aprilTagMaxNmaxima
    private static native void set_aprilTagMaxNmaxima_0(long nativeObj, int aprilTagMaxNmaxima);

    // C++: float DetectorParameters::aprilTagCriticalRad
    private static native float get_aprilTagCriticalRad_0(long nativeObj);

    // C++: void DetectorParameters::aprilTagCriticalRad
    private static native void set_aprilTagCriticalRad_0(long nativeObj, float aprilTagCriticalRad);

    // C++: float DetectorParameters::aprilTagMaxLineFitMse
    private static native float get_aprilTagMaxLineFitMse_0(long nativeObj);

    // C++: void DetectorParameters::aprilTagMaxLineFitMse
    private static native void set_aprilTagMaxLineFitMse_0(long nativeObj, float aprilTagMaxLineFitMse);

    // C++: int DetectorParameters::aprilTagMinWhiteBlackDiff
    private static native int get_aprilTagMinWhiteBlackDiff_0(long nativeObj);

    // C++: void DetectorParameters::aprilTagMinWhiteBlackDiff
    private static native void set_aprilTagMinWhiteBlackDiff_0(long nativeObj, int aprilTagMinWhiteBlackDiff);

    // C++: int DetectorParameters::aprilTagDeglitch
    private static native int get_aprilTagDeglitch_0(long nativeObj);

    // C++: void DetectorParameters::aprilTagDeglitch
    private static native void set_aprilTagDeglitch_0(long nativeObj, int aprilTagDeglitch);

    // C++: bool DetectorParameters::detectInvertedMarker
    private static native boolean get_detectInvertedMarker_0(long nativeObj);

    // C++: void DetectorParameters::detectInvertedMarker
    private static native void set_detectInvertedMarker_0(long nativeObj, boolean detectInvertedMarker);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
