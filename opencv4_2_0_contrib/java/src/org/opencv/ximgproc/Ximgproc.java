//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.calib3d.StereoMatcher;
import org.opencv.core.Mat;
import org.opencv.ximgproc.AdaptiveManifoldFilter;
import org.opencv.ximgproc.ContourFitting;
import org.opencv.ximgproc.DTFilter;
import org.opencv.ximgproc.DisparityWLSFilter;
import org.opencv.ximgproc.EdgeAwareInterpolator;
import org.opencv.ximgproc.EdgeBoxes;
import org.opencv.ximgproc.FastBilateralSolverFilter;
import org.opencv.ximgproc.FastGlobalSmootherFilter;
import org.opencv.ximgproc.FastLineDetector;
import org.opencv.ximgproc.GraphSegmentation;
import org.opencv.ximgproc.GuidedFilter;
import org.opencv.ximgproc.RFFeatureGetter;
import org.opencv.ximgproc.RICInterpolator;
import org.opencv.ximgproc.SelectiveSearchSegmentation;
import org.opencv.ximgproc.SelectiveSearchSegmentationStrategy;
import org.opencv.ximgproc.SelectiveSearchSegmentationStrategyColor;
import org.opencv.ximgproc.SelectiveSearchSegmentationStrategyFill;
import org.opencv.ximgproc.SelectiveSearchSegmentationStrategyMultiple;
import org.opencv.ximgproc.SelectiveSearchSegmentationStrategySize;
import org.opencv.ximgproc.SelectiveSearchSegmentationStrategyTexture;
import org.opencv.ximgproc.StructuredEdgeDetection;
import org.opencv.ximgproc.SuperpixelLSC;
import org.opencv.ximgproc.SuperpixelSEEDS;
import org.opencv.ximgproc.SuperpixelSLIC;

// C++: class Ximgproc

public class Ximgproc {

    // C++: enum LocalBinarizationMethods
    public static final int
            BINARIZATION_NIBLACK = 0,
            BINARIZATION_SAUVOLA = 1,
            BINARIZATION_WOLF = 2,
            BINARIZATION_NICK = 3;


    // C++: enum HoughDeskewOption
    public static final int
            HDO_RAW = 0,
            HDO_DESKEW = 1;


    // C++: enum WMFWeightType
    public static final int
            WMF_EXP = 1,
            WMF_IV1 = 1 << 1,
            WMF_IV2 = 1 << 2,
            WMF_COS = 1 << 3,
            WMF_JAC = 1 << 4,
            WMF_OFF = 1 << 5;


    // C++: enum EdgeAwareFiltersList
    public static final int
            DTF_NC = 0,
            DTF_IC = 1,
            DTF_RF = 2,
            GUIDED_FILTER = 3,
            AM_FILTER = 4;


    // C++: enum ThinningTypes
    public static final int
            THINNING_ZHANGSUEN = 0,
            THINNING_GUOHALL = 1;


    // C++: enum HoughOp
    public static final int
            FHT_MIN = 0,
            FHT_MAX = 1,
            FHT_ADD = 2,
            FHT_AVE = 3;


    // C++: enum SLICType
    public static final int
            SLIC = 100,
            SLICO = 101,
            MSLIC = 102;


    // C++: enum AngleRangeOption
    public static final int
            ARO_0_45 = 0,
            ARO_45_90 = 1,
            ARO_90_135 = 2,
            ARO_315_0 = 3,
            ARO_315_45 = 4,
            ARO_45_135 = 5,
            ARO_315_135 = 6,
            ARO_CTR_HOR = 7,
            ARO_CTR_VER = 8;


    //
    // C++:  Ptr_AdaptiveManifoldFilter cv::ximgproc::createAMFilter(double sigma_s, double sigma_r, bool adjust_outliers = false)
    //

    /**
     * Factory method, create instance of AdaptiveManifoldFilter and produce some initialization routines.
     *
     * @param sigma_s spatial standard deviation.
     *
     * @param sigma_r color space standard deviation, it is similar to the sigma in the color space into
     * bilateralFilter.
     *
     * @param adjust_outliers optional, specify perform outliers adjust operation or not, (Eq. 9) in the
     * original paper.
     *
     * For more details about Adaptive Manifold Filter parameters, see the original article CITE: Gastal12 .
     *
     * <b>Note:</b> Joint images with CV_8U and CV_16U depth converted to images with CV_32F depth and [0; 1]
     * color range before processing. Hence color space sigma sigma_r must be in [0; 1] range, unlike same
     * sigmas in bilateralFilter and dtFilter functions.
     * @return automatically generated
     */
    public static AdaptiveManifoldFilter createAMFilter(double sigma_s, double sigma_r, boolean adjust_outliers) {
        return AdaptiveManifoldFilter.__fromPtr__(createAMFilter_0(sigma_s, sigma_r, adjust_outliers));
    }

    /**
     * Factory method, create instance of AdaptiveManifoldFilter and produce some initialization routines.
     *
     * @param sigma_s spatial standard deviation.
     *
     * @param sigma_r color space standard deviation, it is similar to the sigma in the color space into
     * bilateralFilter.
     *
     * original paper.
     *
     * For more details about Adaptive Manifold Filter parameters, see the original article CITE: Gastal12 .
     *
     * <b>Note:</b> Joint images with CV_8U and CV_16U depth converted to images with CV_32F depth and [0; 1]
     * color range before processing. Hence color space sigma sigma_r must be in [0; 1] range, unlike same
     * sigmas in bilateralFilter and dtFilter functions.
     * @return automatically generated
     */
    public static AdaptiveManifoldFilter createAMFilter(double sigma_s, double sigma_r) {
        return AdaptiveManifoldFilter.__fromPtr__(createAMFilter_1(sigma_s, sigma_r));
    }


    //
    // C++:  Ptr_ContourFitting cv::ximgproc::createContourFitting(int ctr = 1024, int fd = 16)
    //

    /**
     * create ContourFitting algorithm object
     *
     * @param ctr number of Fourier descriptors equal to number of contour points after resampling.
     * @param fd Contour defining second shape (Target).
     * @return automatically generated
     */
    public static ContourFitting createContourFitting(int ctr, int fd) {
        return ContourFitting.__fromPtr__(createContourFitting_0(ctr, fd));
    }

    /**
     * create ContourFitting algorithm object
     *
     * @param ctr number of Fourier descriptors equal to number of contour points after resampling.
     * @return automatically generated
     */
    public static ContourFitting createContourFitting(int ctr) {
        return ContourFitting.__fromPtr__(createContourFitting_1(ctr));
    }

    /**
     * create ContourFitting algorithm object
     *
     * @return automatically generated
     */
    public static ContourFitting createContourFitting() {
        return ContourFitting.__fromPtr__(createContourFitting_2());
    }


    //
    // C++:  Ptr_DTFilter cv::ximgproc::createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor, int mode = DTF_NC, int numIters = 3)
    //

    /**
     * Factory method, create instance of DTFilter and produce initialization routines.
     *
     * @param guide guided image (used to build transformed distance, which describes edge structure of
     * guided image).
     *
     * @param sigmaSpatial \({\sigma}_H\) parameter in the original article, it's similar to the sigma in the
     * coordinate space into bilateralFilter.
     *
     * @param sigmaColor \({\sigma}_r\) parameter in the original article, it's similar to the sigma in the
     * color space into bilateralFilter.
     *
     * @param mode one form three modes DTF_NC, DTF_RF and DTF_IC which corresponds to three modes for
     * filtering 2D signals in the article.
     *
     * @param numIters optional number of iterations used for filtering, 3 is quite enough.
     *
     * For more details about Domain Transform filter parameters, see the original article CITE: Gastal11 and
     * [Domain Transform filter homepage](http://www.inf.ufrgs.br/~eslgastal/DomainTransform/).
     * @return automatically generated
     */
    public static DTFilter createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor, int mode, int numIters) {
        return DTFilter.__fromPtr__(createDTFilter_0(guide.nativeObj, sigmaSpatial, sigmaColor, mode, numIters));
    }

    /**
     * Factory method, create instance of DTFilter and produce initialization routines.
     *
     * @param guide guided image (used to build transformed distance, which describes edge structure of
     * guided image).
     *
     * @param sigmaSpatial \({\sigma}_H\) parameter in the original article, it's similar to the sigma in the
     * coordinate space into bilateralFilter.
     *
     * @param sigmaColor \({\sigma}_r\) parameter in the original article, it's similar to the sigma in the
     * color space into bilateralFilter.
     *
     * @param mode one form three modes DTF_NC, DTF_RF and DTF_IC which corresponds to three modes for
     * filtering 2D signals in the article.
     *
     *
     * For more details about Domain Transform filter parameters, see the original article CITE: Gastal11 and
     * [Domain Transform filter homepage](http://www.inf.ufrgs.br/~eslgastal/DomainTransform/).
     * @return automatically generated
     */
    public static DTFilter createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor, int mode) {
        return DTFilter.__fromPtr__(createDTFilter_1(guide.nativeObj, sigmaSpatial, sigmaColor, mode));
    }

    /**
     * Factory method, create instance of DTFilter and produce initialization routines.
     *
     * @param guide guided image (used to build transformed distance, which describes edge structure of
     * guided image).
     *
     * @param sigmaSpatial \({\sigma}_H\) parameter in the original article, it's similar to the sigma in the
     * coordinate space into bilateralFilter.
     *
     * @param sigmaColor \({\sigma}_r\) parameter in the original article, it's similar to the sigma in the
     * color space into bilateralFilter.
     *
     * filtering 2D signals in the article.
     *
     *
     * For more details about Domain Transform filter parameters, see the original article CITE: Gastal11 and
     * [Domain Transform filter homepage](http://www.inf.ufrgs.br/~eslgastal/DomainTransform/).
     * @return automatically generated
     */
    public static DTFilter createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor) {
        return DTFilter.__fromPtr__(createDTFilter_2(guide.nativeObj, sigmaSpatial, sigmaColor));
    }


    //
    // C++:  Ptr_DisparityWLSFilter cv::ximgproc::createDisparityWLSFilter(Ptr_StereoMatcher matcher_left)
    //

    /**
     * Convenience factory method that creates an instance of DisparityWLSFilter and sets up all the relevant
     * filter parameters automatically based on the matcher instance. Currently supports only StereoBM and StereoSGBM.
     *
     * @param matcher_left stereo matcher instance that will be used with the filter
     * @return automatically generated
     */
    public static DisparityWLSFilter createDisparityWLSFilter(StereoMatcher matcher_left) {
        return DisparityWLSFilter.__fromPtr__(createDisparityWLSFilter_0(matcher_left.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_DisparityWLSFilter cv::ximgproc::createDisparityWLSFilterGeneric(bool use_confidence)
    //

    /**
     * More generic factory method, create instance of DisparityWLSFilter and execute basic
     * initialization routines. When using this method you will need to set-up the ROI, matchers and
     * other parameters by yourself.
     *
     * @param use_confidence filtering with confidence requires two disparity maps (for the left and right views) and is
     * approximately two times slower. However, quality is typically significantly better.
     * @return automatically generated
     */
    public static DisparityWLSFilter createDisparityWLSFilterGeneric(boolean use_confidence) {
        return DisparityWLSFilter.__fromPtr__(createDisparityWLSFilterGeneric_0(use_confidence));
    }


    //
    // C++:  Ptr_EdgeAwareInterpolator cv::ximgproc::createEdgeAwareInterpolator()
    //

    /**
     * Factory method that creates an instance of the
     * EdgeAwareInterpolator.
     * @return automatically generated
     */
    public static EdgeAwareInterpolator createEdgeAwareInterpolator() {
        return EdgeAwareInterpolator.__fromPtr__(createEdgeAwareInterpolator_0());
    }


    //
    // C++:  Ptr_EdgeBoxes cv::ximgproc::createEdgeBoxes(float alpha = 0.65f, float beta = 0.75f, float eta = 1, float minScore = 0.01f, int maxBoxes = 10000, float edgeMinMag = 0.1f, float edgeMergeThr = 0.5f, float clusterMinMag = 0.5f, float maxAspectRatio = 3, float minBoxArea = 1000, float gamma = 2, float kappa = 1.5f)
    //

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @param maxBoxes max number of boxes to detect.
     * @param edgeMinMag edge min magnitude. Increase to trade off accuracy for speed.
     * @param edgeMergeThr edge merge threshold. Increase to trade off accuracy for speed.
     * @param clusterMinMag cluster min magnitude. Increase to trade off accuracy for speed.
     * @param maxAspectRatio max aspect ratio of boxes.
     * @param minBoxArea minimum area of boxes.
     * @param gamma affinity sensitivity.
     * @param kappa scale sensitivity.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea, float gamma, float kappa) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_0(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea, gamma, kappa));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @param maxBoxes max number of boxes to detect.
     * @param edgeMinMag edge min magnitude. Increase to trade off accuracy for speed.
     * @param edgeMergeThr edge merge threshold. Increase to trade off accuracy for speed.
     * @param clusterMinMag cluster min magnitude. Increase to trade off accuracy for speed.
     * @param maxAspectRatio max aspect ratio of boxes.
     * @param minBoxArea minimum area of boxes.
     * @param gamma affinity sensitivity.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea, float gamma) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_1(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea, gamma));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @param maxBoxes max number of boxes to detect.
     * @param edgeMinMag edge min magnitude. Increase to trade off accuracy for speed.
     * @param edgeMergeThr edge merge threshold. Increase to trade off accuracy for speed.
     * @param clusterMinMag cluster min magnitude. Increase to trade off accuracy for speed.
     * @param maxAspectRatio max aspect ratio of boxes.
     * @param minBoxArea minimum area of boxes.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_2(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @param maxBoxes max number of boxes to detect.
     * @param edgeMinMag edge min magnitude. Increase to trade off accuracy for speed.
     * @param edgeMergeThr edge merge threshold. Increase to trade off accuracy for speed.
     * @param clusterMinMag cluster min magnitude. Increase to trade off accuracy for speed.
     * @param maxAspectRatio max aspect ratio of boxes.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_3(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @param maxBoxes max number of boxes to detect.
     * @param edgeMinMag edge min magnitude. Increase to trade off accuracy for speed.
     * @param edgeMergeThr edge merge threshold. Increase to trade off accuracy for speed.
     * @param clusterMinMag cluster min magnitude. Increase to trade off accuracy for speed.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_4(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @param maxBoxes max number of boxes to detect.
     * @param edgeMinMag edge min magnitude. Increase to trade off accuracy for speed.
     * @param edgeMergeThr edge merge threshold. Increase to trade off accuracy for speed.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_5(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @param maxBoxes max number of boxes to detect.
     * @param edgeMinMag edge min magnitude. Increase to trade off accuracy for speed.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_6(alpha, beta, eta, minScore, maxBoxes, edgeMinMag));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @param maxBoxes max number of boxes to detect.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_7(alpha, beta, eta, minScore, maxBoxes));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @param minScore min score of boxes to detect.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_8(alpha, beta, eta, minScore));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @param eta adaptation rate for nms threshold.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_9(alpha, beta, eta));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @param beta nms threshold for object proposals.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_10(alpha, beta));
    }

    /**
     * Creates a Edgeboxes
     *
     * @param alpha step size of sliding window search.
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes(float alpha) {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_11(alpha));
    }

    /**
     * Creates a Edgeboxes
     *
     * @return automatically generated
     */
    public static EdgeBoxes createEdgeBoxes() {
        return EdgeBoxes.__fromPtr__(createEdgeBoxes_12());
    }


    //
    // C++:  Ptr_FastBilateralSolverFilter cv::ximgproc::createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda = 128.0, int num_iter = 25, double max_tol = 1e-5)
    //

    /**
     * Factory method, create instance of FastBilateralSolverFilter and execute the initialization routines.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_chroma parameter, that is similar to chroma space sigma (bandwidth) in bilateralFilter.
     *
     * @param lambda smoothness strength parameter for solver.
     *
     * @param num_iter number of iterations used for solver, 25 is usually enough.
     *
     * @param max_tol convergence tolerance used for solver.
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     * @return automatically generated
     */
    public static FastBilateralSolverFilter createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter, double max_tol) {
        return FastBilateralSolverFilter.__fromPtr__(createFastBilateralSolverFilter_0(guide.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter, max_tol));
    }

    /**
     * Factory method, create instance of FastBilateralSolverFilter and execute the initialization routines.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_chroma parameter, that is similar to chroma space sigma (bandwidth) in bilateralFilter.
     *
     * @param lambda smoothness strength parameter for solver.
     *
     * @param num_iter number of iterations used for solver, 25 is usually enough.
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     * @return automatically generated
     */
    public static FastBilateralSolverFilter createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter) {
        return FastBilateralSolverFilter.__fromPtr__(createFastBilateralSolverFilter_1(guide.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter));
    }

    /**
     * Factory method, create instance of FastBilateralSolverFilter and execute the initialization routines.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_chroma parameter, that is similar to chroma space sigma (bandwidth) in bilateralFilter.
     *
     * @param lambda smoothness strength parameter for solver.
     *
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     * @return automatically generated
     */
    public static FastBilateralSolverFilter createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda) {
        return FastBilateralSolverFilter.__fromPtr__(createFastBilateralSolverFilter_2(guide.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda));
    }

    /**
     * Factory method, create instance of FastBilateralSolverFilter and execute the initialization routines.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_chroma parameter, that is similar to chroma space sigma (bandwidth) in bilateralFilter.
     *
     *
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     * @return automatically generated
     */
    public static FastBilateralSolverFilter createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma) {
        return FastBilateralSolverFilter.__fromPtr__(createFastBilateralSolverFilter_3(guide.nativeObj, sigma_spatial, sigma_luma, sigma_chroma));
    }


    //
    // C++:  Ptr_FastGlobalSmootherFilter cv::ximgproc::createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color, double lambda_attenuation = 0.25, int num_iter = 3)
    //

    /**
     * Factory method, create instance of FastGlobalSmootherFilter and execute the initialization routines.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param lambda parameter defining the amount of regularization
     *
     * @param sigma_color parameter, that is similar to color space sigma in bilateralFilter.
     *
     * @param lambda_attenuation internal parameter, defining how much lambda decreases after each iteration. Normally,
     * it should be 0.25. Setting it to 1.0 may lead to streaking artifacts.
     *
     * @param num_iter number of iterations used for filtering, 3 is usually enough.
     *
     * For more details about Fast Global Smoother parameters, see the original paper CITE: Min2014. However, please note that
     * there are several differences. Lambda attenuation described in the paper is implemented a bit differently so do not
     * expect the results to be identical to those from the paper; sigma_color values from the paper should be multiplied by 255.0 to
     * achieve the same effect. Also, in case of image filtering where source and guide image are the same, authors
     * propose to dynamically update the guide image after each iteration. To maximize the performance this feature
     * was not implemented here.
     * @return automatically generated
     */
    public static FastGlobalSmootherFilter createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color, double lambda_attenuation, int num_iter) {
        return FastGlobalSmootherFilter.__fromPtr__(createFastGlobalSmootherFilter_0(guide.nativeObj, lambda, sigma_color, lambda_attenuation, num_iter));
    }

    /**
     * Factory method, create instance of FastGlobalSmootherFilter and execute the initialization routines.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param lambda parameter defining the amount of regularization
     *
     * @param sigma_color parameter, that is similar to color space sigma in bilateralFilter.
     *
     * @param lambda_attenuation internal parameter, defining how much lambda decreases after each iteration. Normally,
     * it should be 0.25. Setting it to 1.0 may lead to streaking artifacts.
     *
     *
     * For more details about Fast Global Smoother parameters, see the original paper CITE: Min2014. However, please note that
     * there are several differences. Lambda attenuation described in the paper is implemented a bit differently so do not
     * expect the results to be identical to those from the paper; sigma_color values from the paper should be multiplied by 255.0 to
     * achieve the same effect. Also, in case of image filtering where source and guide image are the same, authors
     * propose to dynamically update the guide image after each iteration. To maximize the performance this feature
     * was not implemented here.
     * @return automatically generated
     */
    public static FastGlobalSmootherFilter createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color, double lambda_attenuation) {
        return FastGlobalSmootherFilter.__fromPtr__(createFastGlobalSmootherFilter_1(guide.nativeObj, lambda, sigma_color, lambda_attenuation));
    }

    /**
     * Factory method, create instance of FastGlobalSmootherFilter and execute the initialization routines.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param lambda parameter defining the amount of regularization
     *
     * @param sigma_color parameter, that is similar to color space sigma in bilateralFilter.
     *
     * it should be 0.25. Setting it to 1.0 may lead to streaking artifacts.
     *
     *
     * For more details about Fast Global Smoother parameters, see the original paper CITE: Min2014. However, please note that
     * there are several differences. Lambda attenuation described in the paper is implemented a bit differently so do not
     * expect the results to be identical to those from the paper; sigma_color values from the paper should be multiplied by 255.0 to
     * achieve the same effect. Also, in case of image filtering where source and guide image are the same, authors
     * propose to dynamically update the guide image after each iteration. To maximize the performance this feature
     * was not implemented here.
     * @return automatically generated
     */
    public static FastGlobalSmootherFilter createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color) {
        return FastGlobalSmootherFilter.__fromPtr__(createFastGlobalSmootherFilter_2(guide.nativeObj, lambda, sigma_color));
    }


    //
    // C++:  Ptr_FastLineDetector cv::ximgproc::createFastLineDetector(int _length_threshold = 10, float _distance_threshold = 1.414213562f, double _canny_th1 = 50.0, double _canny_th2 = 50.0, int _canny_aperture_size = 3, bool _do_merge = false)
    //

    /**
     * Creates a smart pointer to a FastLineDetector object and initializes it
     *
     * @param _length_threshold    10         - Segment shorter than this will be discarded
     * @param _distance_threshold  1.41421356 - A point placed from a hypothesis line
     *                                          segment farther than this will be
     *                                          regarded as an outlier
     * @param _canny_th1           50         - First threshold for
     *                                          hysteresis procedure in Canny()
     * @param _canny_th2           50         - Second threshold for
     *                                          hysteresis procedure in Canny()
     * @param _canny_aperture_size 3          - Aperturesize for the sobel
     *                                          operator in Canny()
     * @param _do_merge            false      - If true, incremental merging of segments
     *                                          will be perfomred
     * @return automatically generated
     */
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2, int _canny_aperture_size, boolean _do_merge) {
        return FastLineDetector.__fromPtr__(createFastLineDetector_0(_length_threshold, _distance_threshold, _canny_th1, _canny_th2, _canny_aperture_size, _do_merge));
    }

    /**
     * Creates a smart pointer to a FastLineDetector object and initializes it
     *
     * @param _length_threshold    10         - Segment shorter than this will be discarded
     * @param _distance_threshold  1.41421356 - A point placed from a hypothesis line
     *                                          segment farther than this will be
     *                                          regarded as an outlier
     * @param _canny_th1           50         - First threshold for
     *                                          hysteresis procedure in Canny()
     * @param _canny_th2           50         - Second threshold for
     *                                          hysteresis procedure in Canny()
     * @param _canny_aperture_size 3          - Aperturesize for the sobel
     *                                          operator in Canny()
     *                                          will be perfomred
     * @return automatically generated
     */
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2, int _canny_aperture_size) {
        return FastLineDetector.__fromPtr__(createFastLineDetector_1(_length_threshold, _distance_threshold, _canny_th1, _canny_th2, _canny_aperture_size));
    }

    /**
     * Creates a smart pointer to a FastLineDetector object and initializes it
     *
     * @param _length_threshold    10         - Segment shorter than this will be discarded
     * @param _distance_threshold  1.41421356 - A point placed from a hypothesis line
     *                                          segment farther than this will be
     *                                          regarded as an outlier
     * @param _canny_th1           50         - First threshold for
     *                                          hysteresis procedure in Canny()
     * @param _canny_th2           50         - Second threshold for
     *                                          hysteresis procedure in Canny()
     *                                          operator in Canny()
     *                                          will be perfomred
     * @return automatically generated
     */
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2) {
        return FastLineDetector.__fromPtr__(createFastLineDetector_2(_length_threshold, _distance_threshold, _canny_th1, _canny_th2));
    }

    /**
     * Creates a smart pointer to a FastLineDetector object and initializes it
     *
     * @param _length_threshold    10         - Segment shorter than this will be discarded
     * @param _distance_threshold  1.41421356 - A point placed from a hypothesis line
     *                                          segment farther than this will be
     *                                          regarded as an outlier
     * @param _canny_th1           50         - First threshold for
     *                                          hysteresis procedure in Canny()
     *                                          hysteresis procedure in Canny()
     *                                          operator in Canny()
     *                                          will be perfomred
     * @return automatically generated
     */
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold, double _canny_th1) {
        return FastLineDetector.__fromPtr__(createFastLineDetector_3(_length_threshold, _distance_threshold, _canny_th1));
    }

    /**
     * Creates a smart pointer to a FastLineDetector object and initializes it
     *
     * @param _length_threshold    10         - Segment shorter than this will be discarded
     * @param _distance_threshold  1.41421356 - A point placed from a hypothesis line
     *                                          segment farther than this will be
     *                                          regarded as an outlier
     *                                          hysteresis procedure in Canny()
     *                                          hysteresis procedure in Canny()
     *                                          operator in Canny()
     *                                          will be perfomred
     * @return automatically generated
     */
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold) {
        return FastLineDetector.__fromPtr__(createFastLineDetector_4(_length_threshold, _distance_threshold));
    }

    /**
     * Creates a smart pointer to a FastLineDetector object and initializes it
     *
     * @param _length_threshold    10         - Segment shorter than this will be discarded
     *                                          segment farther than this will be
     *                                          regarded as an outlier
     *                                          hysteresis procedure in Canny()
     *                                          hysteresis procedure in Canny()
     *                                          operator in Canny()
     *                                          will be perfomred
     * @return automatically generated
     */
    public static FastLineDetector createFastLineDetector(int _length_threshold) {
        return FastLineDetector.__fromPtr__(createFastLineDetector_5(_length_threshold));
    }

    /**
     * Creates a smart pointer to a FastLineDetector object and initializes it
     *
     *                                          segment farther than this will be
     *                                          regarded as an outlier
     *                                          hysteresis procedure in Canny()
     *                                          hysteresis procedure in Canny()
     *                                          operator in Canny()
     *                                          will be perfomred
     * @return automatically generated
     */
    public static FastLineDetector createFastLineDetector() {
        return FastLineDetector.__fromPtr__(createFastLineDetector_6());
    }


    //
    // C++:  Ptr_GraphSegmentation cv::ximgproc::segmentation::createGraphSegmentation(double sigma = 0.5, float k = 300, int min_size = 100)
    //

    /**
     * Creates a graph based segmentor
     *                         @param sigma The sigma parameter, used to smooth image
     *                         @param k The k parameter of the algorythm
     *                         @param min_size The minimum size of segments
     * @return automatically generated
     */
    public static GraphSegmentation createGraphSegmentation(double sigma, float k, int min_size) {
        return GraphSegmentation.__fromPtr__(createGraphSegmentation_0(sigma, k, min_size));
    }

    /**
     * Creates a graph based segmentor
     *                         @param sigma The sigma parameter, used to smooth image
     *                         @param k The k parameter of the algorythm
     * @return automatically generated
     */
    public static GraphSegmentation createGraphSegmentation(double sigma, float k) {
        return GraphSegmentation.__fromPtr__(createGraphSegmentation_1(sigma, k));
    }

    /**
     * Creates a graph based segmentor
     *                         @param sigma The sigma parameter, used to smooth image
     * @return automatically generated
     */
    public static GraphSegmentation createGraphSegmentation(double sigma) {
        return GraphSegmentation.__fromPtr__(createGraphSegmentation_2(sigma));
    }

    /**
     * Creates a graph based segmentor
     * @return automatically generated
     */
    public static GraphSegmentation createGraphSegmentation() {
        return GraphSegmentation.__fromPtr__(createGraphSegmentation_3());
    }


    //
    // C++:  Ptr_GuidedFilter cv::ximgproc::createGuidedFilter(Mat guide, int radius, double eps)
    //

    /**
     * Factory method, create instance of GuidedFilter and produce initialization routines.
     *
     * @param guide guided image (or array of images) with up to 3 channels, if it have more then 3
     * channels then only first 3 channels will be used.
     *
     * @param radius radius of Guided Filter.
     *
     * @param eps regularization term of Guided Filter. \({eps}^2\) is similar to the sigma in the color
     * space into bilateralFilter.
     *
     * For more details about Guided Filter parameters, see the original article CITE: Kaiming10 .
     * @return automatically generated
     */
    public static GuidedFilter createGuidedFilter(Mat guide, int radius, double eps) {
        return GuidedFilter.__fromPtr__(createGuidedFilter_0(guide.nativeObj, radius, eps));
    }


    //
    // C++:  Ptr_RFFeatureGetter cv::ximgproc::createRFFeatureGetter()
    //

    public static RFFeatureGetter createRFFeatureGetter() {
        return RFFeatureGetter.__fromPtr__(createRFFeatureGetter_0());
    }


    //
    // C++:  Ptr_RICInterpolator cv::ximgproc::createRICInterpolator()
    //

    /**
     * Factory method that creates an instance of the
     * RICInterpolator.
     * @return automatically generated
     */
    public static RICInterpolator createRICInterpolator() {
        return RICInterpolator.__fromPtr__(createRICInterpolator_0());
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentation cv::ximgproc::segmentation::createSelectiveSearchSegmentation()
    //

    /**
     * Create a new SelectiveSearchSegmentation class.
     * @return automatically generated
     */
    public static SelectiveSearchSegmentation createSelectiveSearchSegmentation() {
        return SelectiveSearchSegmentation.__fromPtr__(createSelectiveSearchSegmentation_0());
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyColor cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyColor()
    //

    /**
     * Create a new color-based strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategyColor createSelectiveSearchSegmentationStrategyColor() {
        return SelectiveSearchSegmentationStrategyColor.__fromPtr__(createSelectiveSearchSegmentationStrategyColor_0());
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyFill cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyFill()
    //

    /**
     * Create a new fill-based strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategyFill createSelectiveSearchSegmentationStrategyFill() {
        return SelectiveSearchSegmentationStrategyFill.__fromPtr__(createSelectiveSearchSegmentationStrategyFill_0());
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2, Ptr_SelectiveSearchSegmentationStrategy s3, Ptr_SelectiveSearchSegmentationStrategy s4)
    //

    /**
     * Create a new multiple strategy and set four subtrategies, with equal weights
     *                         @param s1 The first strategy
     *                         @param s2 The second strategy
     *                         @param s3 The third strategy
     *                         @param s4 The forth strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple(SelectiveSearchSegmentationStrategy s1, SelectiveSearchSegmentationStrategy s2, SelectiveSearchSegmentationStrategy s3, SelectiveSearchSegmentationStrategy s4) {
        return SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_0(s1.getNativeObjAddr(), s2.getNativeObjAddr(), s3.getNativeObjAddr(), s4.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2, Ptr_SelectiveSearchSegmentationStrategy s3)
    //

    /**
     * Create a new multiple strategy and set three subtrategies, with equal weights
     *                         @param s1 The first strategy
     *                         @param s2 The second strategy
     *                         @param s3 The third strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple(SelectiveSearchSegmentationStrategy s1, SelectiveSearchSegmentationStrategy s2, SelectiveSearchSegmentationStrategy s3) {
        return SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_1(s1.getNativeObjAddr(), s2.getNativeObjAddr(), s3.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2)
    //

    /**
     * Create a new multiple strategy and set two subtrategies, with equal weights
     *                         @param s1 The first strategy
     *                         @param s2 The second strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple(SelectiveSearchSegmentationStrategy s1, SelectiveSearchSegmentationStrategy s2) {
        return SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_2(s1.getNativeObjAddr(), s2.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1)
    //

    /**
     * Create a new multiple strategy and set one subtrategy
     *                         @param s1 The first strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple(SelectiveSearchSegmentationStrategy s1) {
        return SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_3(s1.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple()
    //

    /**
     * Create a new multiple strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple() {
        return SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_4());
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategySize cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategySize()
    //

    /**
     * Create a new size-based strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategySize createSelectiveSearchSegmentationStrategySize() {
        return SelectiveSearchSegmentationStrategySize.__fromPtr__(createSelectiveSearchSegmentationStrategySize_0());
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyTexture cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyTexture()
    //

    /**
     * Create a new size-based strategy
     * @return automatically generated
     */
    public static SelectiveSearchSegmentationStrategyTexture createSelectiveSearchSegmentationStrategyTexture() {
        return SelectiveSearchSegmentationStrategyTexture.__fromPtr__(createSelectiveSearchSegmentationStrategyTexture_0());
    }


    //
    // C++:  Ptr_StereoMatcher cv::ximgproc::createRightMatcher(Ptr_StereoMatcher matcher_left)
    //

    /**
     * Convenience method to set up the matcher for computing the right-view disparity map
     * that is required in case of filtering with confidence.
     *
     * @param matcher_left main stereo matcher instance that will be used with the filter
     * @return automatically generated
     */
    public static StereoMatcher createRightMatcher(StereoMatcher matcher_left) {
        return StereoMatcher.__fromPtr__(createRightMatcher_0(matcher_left.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_StructuredEdgeDetection cv::ximgproc::createStructuredEdgeDetection(String model, Ptr_RFFeatureGetter howToGetFeatures = Ptr<RFFeatureGetter>())
    //

    public static StructuredEdgeDetection createStructuredEdgeDetection(String model, RFFeatureGetter howToGetFeatures) {
        return StructuredEdgeDetection.__fromPtr__(createStructuredEdgeDetection_0(model, howToGetFeatures.getNativeObjAddr()));
    }

    public static StructuredEdgeDetection createStructuredEdgeDetection(String model) {
        return StructuredEdgeDetection.__fromPtr__(createStructuredEdgeDetection_1(model));
    }


    //
    // C++:  Ptr_SuperpixelLSC cv::ximgproc::createSuperpixelLSC(Mat image, int region_size = 10, float ratio = 0.075f)
    //

    /**
     * Class implementing the LSC (Linear Spectral Clustering) superpixels
     *
     * @param image Image to segment
     * @param region_size Chooses an average superpixel size measured in pixels
     * @param ratio Chooses the enforcement of superpixel compactness factor of superpixel
     *
     * The function initializes a SuperpixelLSC object for the input image. It sets the parameters of
     * superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
     * computing iterations over the given image. An example of LSC is ilustrated in the following picture.
     * For enanched results it is recommended for color images to preprocess image with little gaussian blur
     * with a small 3 x 3 kernel and additional conversion into CieLAB color space.
     *
     * ![image](pics/superpixels_lsc.png)
     * @return automatically generated
     */
    public static SuperpixelLSC createSuperpixelLSC(Mat image, int region_size, float ratio) {
        return SuperpixelLSC.__fromPtr__(createSuperpixelLSC_0(image.nativeObj, region_size, ratio));
    }

    /**
     * Class implementing the LSC (Linear Spectral Clustering) superpixels
     *
     * @param image Image to segment
     * @param region_size Chooses an average superpixel size measured in pixels
     *
     * The function initializes a SuperpixelLSC object for the input image. It sets the parameters of
     * superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
     * computing iterations over the given image. An example of LSC is ilustrated in the following picture.
     * For enanched results it is recommended for color images to preprocess image with little gaussian blur
     * with a small 3 x 3 kernel and additional conversion into CieLAB color space.
     *
     * ![image](pics/superpixels_lsc.png)
     * @return automatically generated
     */
    public static SuperpixelLSC createSuperpixelLSC(Mat image, int region_size) {
        return SuperpixelLSC.__fromPtr__(createSuperpixelLSC_1(image.nativeObj, region_size));
    }

    /**
     * Class implementing the LSC (Linear Spectral Clustering) superpixels
     *
     * @param image Image to segment
     *
     * The function initializes a SuperpixelLSC object for the input image. It sets the parameters of
     * superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
     * computing iterations over the given image. An example of LSC is ilustrated in the following picture.
     * For enanched results it is recommended for color images to preprocess image with little gaussian blur
     * with a small 3 x 3 kernel and additional conversion into CieLAB color space.
     *
     * ![image](pics/superpixels_lsc.png)
     * @return automatically generated
     */
    public static SuperpixelLSC createSuperpixelLSC(Mat image) {
        return SuperpixelLSC.__fromPtr__(createSuperpixelLSC_2(image.nativeObj));
    }


    //
    // C++:  Ptr_SuperpixelSEEDS cv::ximgproc::createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior = 2, int histogram_bins = 5, bool double_step = false)
    //

    /**
     * Initializes a SuperpixelSEEDS object.
     *
     * @param image_width Image width.
     * @param image_height Image height.
     * @param image_channels Number of channels of the image.
     * @param num_superpixels Desired number of superpixels. Note that the actual number may be smaller
     * due to restrictions (depending on the image size and num_levels). Use getNumberOfSuperpixels() to
     * get the actual number.
     * @param num_levels Number of block levels. The more levels, the more accurate is the segmentation,
     * but needs more memory and CPU time.
     * @param prior enable 3x3 shape smoothing term if &gt;0. A larger value leads to smoother shapes. prior
     * must be in the range [0, 5].
     * @param histogram_bins Number of histogram bins.
     * @param double_step If true, iterate each block level twice for higher accuracy.
     *
     * The function initializes a SuperpixelSEEDS object for the input image. It stores the parameters of
     * the image: image_width, image_height and image_channels. It also sets the parameters of the SEEDS
     * superpixel algorithm, which are: num_superpixels, num_levels, use_prior, histogram_bins and
     * double_step.
     *
     * The number of levels in num_levels defines the amount of block levels that the algorithm use in the
     * optimization. The initialization is a grid, in which the superpixels are equally distributed through
     * the width and the height of the image. The larger blocks correspond to the superpixel size, and the
     * levels with smaller blocks are formed by dividing the larger blocks into 2 x 2 blocks of pixels,
     * recursively until the smaller block level. An example of initialization of 4 block levels is
     * illustrated in the following figure.
     *
     * ![image](pics/superpixels_blocks.png)
     * @return automatically generated
     */
    public static SuperpixelSEEDS createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior, int histogram_bins, boolean double_step) {
        return SuperpixelSEEDS.__fromPtr__(createSuperpixelSEEDS_0(image_width, image_height, image_channels, num_superpixels, num_levels, prior, histogram_bins, double_step));
    }

    /**
     * Initializes a SuperpixelSEEDS object.
     *
     * @param image_width Image width.
     * @param image_height Image height.
     * @param image_channels Number of channels of the image.
     * @param num_superpixels Desired number of superpixels. Note that the actual number may be smaller
     * due to restrictions (depending on the image size and num_levels). Use getNumberOfSuperpixels() to
     * get the actual number.
     * @param num_levels Number of block levels. The more levels, the more accurate is the segmentation,
     * but needs more memory and CPU time.
     * @param prior enable 3x3 shape smoothing term if &gt;0. A larger value leads to smoother shapes. prior
     * must be in the range [0, 5].
     * @param histogram_bins Number of histogram bins.
     *
     * The function initializes a SuperpixelSEEDS object for the input image. It stores the parameters of
     * the image: image_width, image_height and image_channels. It also sets the parameters of the SEEDS
     * superpixel algorithm, which are: num_superpixels, num_levels, use_prior, histogram_bins and
     * double_step.
     *
     * The number of levels in num_levels defines the amount of block levels that the algorithm use in the
     * optimization. The initialization is a grid, in which the superpixels are equally distributed through
     * the width and the height of the image. The larger blocks correspond to the superpixel size, and the
     * levels with smaller blocks are formed by dividing the larger blocks into 2 x 2 blocks of pixels,
     * recursively until the smaller block level. An example of initialization of 4 block levels is
     * illustrated in the following figure.
     *
     * ![image](pics/superpixels_blocks.png)
     * @return automatically generated
     */
    public static SuperpixelSEEDS createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior, int histogram_bins) {
        return SuperpixelSEEDS.__fromPtr__(createSuperpixelSEEDS_1(image_width, image_height, image_channels, num_superpixels, num_levels, prior, histogram_bins));
    }

    /**
     * Initializes a SuperpixelSEEDS object.
     *
     * @param image_width Image width.
     * @param image_height Image height.
     * @param image_channels Number of channels of the image.
     * @param num_superpixels Desired number of superpixels. Note that the actual number may be smaller
     * due to restrictions (depending on the image size and num_levels). Use getNumberOfSuperpixels() to
     * get the actual number.
     * @param num_levels Number of block levels. The more levels, the more accurate is the segmentation,
     * but needs more memory and CPU time.
     * @param prior enable 3x3 shape smoothing term if &gt;0. A larger value leads to smoother shapes. prior
     * must be in the range [0, 5].
     *
     * The function initializes a SuperpixelSEEDS object for the input image. It stores the parameters of
     * the image: image_width, image_height and image_channels. It also sets the parameters of the SEEDS
     * superpixel algorithm, which are: num_superpixels, num_levels, use_prior, histogram_bins and
     * double_step.
     *
     * The number of levels in num_levels defines the amount of block levels that the algorithm use in the
     * optimization. The initialization is a grid, in which the superpixels are equally distributed through
     * the width and the height of the image. The larger blocks correspond to the superpixel size, and the
     * levels with smaller blocks are formed by dividing the larger blocks into 2 x 2 blocks of pixels,
     * recursively until the smaller block level. An example of initialization of 4 block levels is
     * illustrated in the following figure.
     *
     * ![image](pics/superpixels_blocks.png)
     * @return automatically generated
     */
    public static SuperpixelSEEDS createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior) {
        return SuperpixelSEEDS.__fromPtr__(createSuperpixelSEEDS_2(image_width, image_height, image_channels, num_superpixels, num_levels, prior));
    }

    /**
     * Initializes a SuperpixelSEEDS object.
     *
     * @param image_width Image width.
     * @param image_height Image height.
     * @param image_channels Number of channels of the image.
     * @param num_superpixels Desired number of superpixels. Note that the actual number may be smaller
     * due to restrictions (depending on the image size and num_levels). Use getNumberOfSuperpixels() to
     * get the actual number.
     * @param num_levels Number of block levels. The more levels, the more accurate is the segmentation,
     * but needs more memory and CPU time.
     * must be in the range [0, 5].
     *
     * The function initializes a SuperpixelSEEDS object for the input image. It stores the parameters of
     * the image: image_width, image_height and image_channels. It also sets the parameters of the SEEDS
     * superpixel algorithm, which are: num_superpixels, num_levels, use_prior, histogram_bins and
     * double_step.
     *
     * The number of levels in num_levels defines the amount of block levels that the algorithm use in the
     * optimization. The initialization is a grid, in which the superpixels are equally distributed through
     * the width and the height of the image. The larger blocks correspond to the superpixel size, and the
     * levels with smaller blocks are formed by dividing the larger blocks into 2 x 2 blocks of pixels,
     * recursively until the smaller block level. An example of initialization of 4 block levels is
     * illustrated in the following figure.
     *
     * ![image](pics/superpixels_blocks.png)
     * @return automatically generated
     */
    public static SuperpixelSEEDS createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels) {
        return SuperpixelSEEDS.__fromPtr__(createSuperpixelSEEDS_3(image_width, image_height, image_channels, num_superpixels, num_levels));
    }


    //
    // C++:  Ptr_SuperpixelSLIC cv::ximgproc::createSuperpixelSLIC(Mat image, int algorithm = SLICO, int region_size = 10, float ruler = 10.0f)
    //

    /**
     * Initialize a SuperpixelSLIC object
     *
     * @param image Image to segment
     * @param algorithm Chooses the algorithm variant to use:
     * SLIC segments image using a desired region_size, and in addition SLICO will optimize using adaptive compactness factor,
     * while MSLIC will optimize using manifold methods resulting in more content-sensitive superpixels.
     * @param region_size Chooses an average superpixel size measured in pixels
     * @param ruler Chooses the enforcement of superpixel smoothness factor of superpixel
     *
     * The function initializes a SuperpixelSLIC object for the input image. It sets the parameters of choosed
     * superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
     * computing iterations over the given image. For enanched results it is recommended for color images to
     * preprocess image with little gaussian blur using a small 3 x 3 kernel and additional conversion into
     * CieLAB color space. An example of SLIC versus SLICO and MSLIC is ilustrated in the following picture.
     *
     * ![image](pics/superpixels_slic.png)
     * @return automatically generated
     */
    public static SuperpixelSLIC createSuperpixelSLIC(Mat image, int algorithm, int region_size, float ruler) {
        return SuperpixelSLIC.__fromPtr__(createSuperpixelSLIC_0(image.nativeObj, algorithm, region_size, ruler));
    }

    /**
     * Initialize a SuperpixelSLIC object
     *
     * @param image Image to segment
     * @param algorithm Chooses the algorithm variant to use:
     * SLIC segments image using a desired region_size, and in addition SLICO will optimize using adaptive compactness factor,
     * while MSLIC will optimize using manifold methods resulting in more content-sensitive superpixels.
     * @param region_size Chooses an average superpixel size measured in pixels
     *
     * The function initializes a SuperpixelSLIC object for the input image. It sets the parameters of choosed
     * superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
     * computing iterations over the given image. For enanched results it is recommended for color images to
     * preprocess image with little gaussian blur using a small 3 x 3 kernel and additional conversion into
     * CieLAB color space. An example of SLIC versus SLICO and MSLIC is ilustrated in the following picture.
     *
     * ![image](pics/superpixels_slic.png)
     * @return automatically generated
     */
    public static SuperpixelSLIC createSuperpixelSLIC(Mat image, int algorithm, int region_size) {
        return SuperpixelSLIC.__fromPtr__(createSuperpixelSLIC_1(image.nativeObj, algorithm, region_size));
    }

    /**
     * Initialize a SuperpixelSLIC object
     *
     * @param image Image to segment
     * @param algorithm Chooses the algorithm variant to use:
     * SLIC segments image using a desired region_size, and in addition SLICO will optimize using adaptive compactness factor,
     * while MSLIC will optimize using manifold methods resulting in more content-sensitive superpixels.
     *
     * The function initializes a SuperpixelSLIC object for the input image. It sets the parameters of choosed
     * superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
     * computing iterations over the given image. For enanched results it is recommended for color images to
     * preprocess image with little gaussian blur using a small 3 x 3 kernel and additional conversion into
     * CieLAB color space. An example of SLIC versus SLICO and MSLIC is ilustrated in the following picture.
     *
     * ![image](pics/superpixels_slic.png)
     * @return automatically generated
     */
    public static SuperpixelSLIC createSuperpixelSLIC(Mat image, int algorithm) {
        return SuperpixelSLIC.__fromPtr__(createSuperpixelSLIC_2(image.nativeObj, algorithm));
    }

    /**
     * Initialize a SuperpixelSLIC object
     *
     * @param image Image to segment
     * SLIC segments image using a desired region_size, and in addition SLICO will optimize using adaptive compactness factor,
     * while MSLIC will optimize using manifold methods resulting in more content-sensitive superpixels.
     *
     * The function initializes a SuperpixelSLIC object for the input image. It sets the parameters of choosed
     * superpixel algorithm, which are: region_size and ruler. It preallocate some buffers for future
     * computing iterations over the given image. For enanched results it is recommended for color images to
     * preprocess image with little gaussian blur using a small 3 x 3 kernel and additional conversion into
     * CieLAB color space. An example of SLIC versus SLICO and MSLIC is ilustrated in the following picture.
     *
     * ![image](pics/superpixels_slic.png)
     * @return automatically generated
     */
    public static SuperpixelSLIC createSuperpixelSLIC(Mat image) {
        return SuperpixelSLIC.__fromPtr__(createSuperpixelSLIC_3(image.nativeObj));
    }


    //
    // C++:  Vec4i cv::ximgproc::HoughPoint2Line(Point houghPoint, Mat srcImgInfo, int angleRange = ARO_315_135, int makeSkew = HDO_DESKEW, int rules = RO_IGNORE_BORDERS)
    //

    // Return type 'Vec4i' is not supported, skipping the function


    //
    // C++:  void cv::ximgproc::FastHoughTransform(Mat src, Mat& dst, int dstMatDepth, int angleRange = ARO_315_135, int op = FHT_ADD, int makeSkew = HDO_DESKEW)
    //

    /**
     * Calculates 2D Fast Hough transform of an image.
     *
     * The function calculates the fast Hough transform for full, half or quarter
     * range of angles.
     * @param src automatically generated
     * @param dst automatically generated
     * @param dstMatDepth automatically generated
     * @param angleRange automatically generated
     * @param op automatically generated
     * @param makeSkew automatically generated
     */
    public static void FastHoughTransform(Mat src, Mat dst, int dstMatDepth, int angleRange, int op, int makeSkew) {
        FastHoughTransform_0(src.nativeObj, dst.nativeObj, dstMatDepth, angleRange, op, makeSkew);
    }

    /**
     * Calculates 2D Fast Hough transform of an image.
     *
     * The function calculates the fast Hough transform for full, half or quarter
     * range of angles.
     * @param src automatically generated
     * @param dst automatically generated
     * @param dstMatDepth automatically generated
     * @param angleRange automatically generated
     * @param op automatically generated
     */
    public static void FastHoughTransform(Mat src, Mat dst, int dstMatDepth, int angleRange, int op) {
        FastHoughTransform_1(src.nativeObj, dst.nativeObj, dstMatDepth, angleRange, op);
    }

    /**
     * Calculates 2D Fast Hough transform of an image.
     *
     * The function calculates the fast Hough transform for full, half or quarter
     * range of angles.
     * @param src automatically generated
     * @param dst automatically generated
     * @param dstMatDepth automatically generated
     * @param angleRange automatically generated
     */
    public static void FastHoughTransform(Mat src, Mat dst, int dstMatDepth, int angleRange) {
        FastHoughTransform_2(src.nativeObj, dst.nativeObj, dstMatDepth, angleRange);
    }

    /**
     * Calculates 2D Fast Hough transform of an image.
     *
     * The function calculates the fast Hough transform for full, half or quarter
     * range of angles.
     * @param src automatically generated
     * @param dst automatically generated
     * @param dstMatDepth automatically generated
     */
    public static void FastHoughTransform(Mat src, Mat dst, int dstMatDepth) {
        FastHoughTransform_3(src.nativeObj, dst.nativeObj, dstMatDepth);
    }


    //
    // C++:  void cv::ximgproc::GradientDericheX(Mat op, Mat& dst, double alpha, double omega)
    //

    /**
     * Applies X Deriche filter to an image.
     *
     * For more details about this implementation, please see http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.476.5736&amp;rep=rep1&amp;type=pdf
     *
     *
     * @param op automatically generated
     * @param dst automatically generated
     * @param alpha automatically generated
     * @param omega automatically generated
     */
    public static void GradientDericheX(Mat op, Mat dst, double alpha, double omega) {
        GradientDericheX_0(op.nativeObj, dst.nativeObj, alpha, omega);
    }


    //
    // C++:  void cv::ximgproc::GradientDericheY(Mat op, Mat& dst, double alpha, double omega)
    //

    /**
     * Applies Y Deriche filter to an image.
     *
     * For more details about this implementation, please see http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.476.5736&amp;rep=rep1&amp;type=pdf
     *
     *
     * @param op automatically generated
     * @param dst automatically generated
     * @param alpha automatically generated
     * @param omega automatically generated
     */
    public static void GradientDericheY(Mat op, Mat dst, double alpha, double omega) {
        GradientDericheY_0(op.nativeObj, dst.nativeObj, alpha, omega);
    }


    //
    // C++:  void cv::ximgproc::PeiLinNormalization(Mat I, Mat& T)
    //

    public static void PeiLinNormalization(Mat I, Mat T) {
        PeiLinNormalization_0(I.nativeObj, T.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::amFilter(Mat joint, Mat src, Mat& dst, double sigma_s, double sigma_r, bool adjust_outliers = false)
    //

    /**
     * Simple one-line Adaptive Manifold Filter call.
     *
     * @param joint joint (also called as guided) image or array of images with any numbers of channels.
     *
     * @param src filtering image with any numbers of channels.
     *
     * @param dst output image.
     *
     * @param sigma_s spatial standard deviation.
     *
     * @param sigma_r color space standard deviation, it is similar to the sigma in the color space into
     * bilateralFilter.
     *
     * @param adjust_outliers optional, specify perform outliers adjust operation or not, (Eq. 9) in the
     * original paper.
     *
     * <b>Note:</b> Joint images with CV_8U and CV_16U depth converted to images with CV_32F depth and [0; 1]
     * color range before processing. Hence color space sigma sigma_r must be in [0; 1] range, unlike same
     * sigmas in bilateralFilter and dtFilter functions. SEE: bilateralFilter, dtFilter, guidedFilter
     */
    public static void amFilter(Mat joint, Mat src, Mat dst, double sigma_s, double sigma_r, boolean adjust_outliers) {
        amFilter_0(joint.nativeObj, src.nativeObj, dst.nativeObj, sigma_s, sigma_r, adjust_outliers);
    }

    /**
     * Simple one-line Adaptive Manifold Filter call.
     *
     * @param joint joint (also called as guided) image or array of images with any numbers of channels.
     *
     * @param src filtering image with any numbers of channels.
     *
     * @param dst output image.
     *
     * @param sigma_s spatial standard deviation.
     *
     * @param sigma_r color space standard deviation, it is similar to the sigma in the color space into
     * bilateralFilter.
     *
     * original paper.
     *
     * <b>Note:</b> Joint images with CV_8U and CV_16U depth converted to images with CV_32F depth and [0; 1]
     * color range before processing. Hence color space sigma sigma_r must be in [0; 1] range, unlike same
     * sigmas in bilateralFilter and dtFilter functions. SEE: bilateralFilter, dtFilter, guidedFilter
     */
    public static void amFilter(Mat joint, Mat src, Mat dst, double sigma_s, double sigma_r) {
        amFilter_1(joint.nativeObj, src.nativeObj, dst.nativeObj, sigma_s, sigma_r);
    }


    //
    // C++:  void cv::ximgproc::anisotropicDiffusion(Mat src, Mat& dst, float alpha, float K, int niters)
    //

    /**
     * Performs anisotropic diffusian on an image.
     *
     *  The function applies Perona-Malik anisotropic diffusion to an image. This is the solution to the partial differential equation:
     *
     *  \({\frac  {\partial I}{\partial t}}={\mathrm  {div}}\left(c(x,y,t)\nabla I\right)=\nabla c\cdot \nabla I+c(x,y,t)\Delta I\)
     *
     *  Suggested functions for c(x,y,t) are:
     *
     *  \(c\left(\|\nabla I\|\right)=e^{{-\left(\|\nabla I\|/K\right)^{2}}}\)
     *
     *  or
     *
     *  \( c\left(\|\nabla I\|\right)={\frac {1}{1+\left({\frac  {\|\nabla I\|}{K}}\right)^{2}}} \)
     *
     *  @param src Source image with 3 channels.
     *  @param dst Destination image of the same size and the same number of channels as src .
     *  @param alpha The amount of time to step forward by on each iteration (normally, it's between 0 and 1).
     *  @param K sensitivity to the edges
     *  @param niters The number of iterations
     */
    public static void anisotropicDiffusion(Mat src, Mat dst, float alpha, float K, int niters) {
        anisotropicDiffusion_0(src.nativeObj, dst.nativeObj, alpha, K, niters);
    }


    //
    // C++:  void cv::ximgproc::bilateralTextureFilter(Mat src, Mat& dst, int fr = 3, int numIter = 1, double sigmaAlpha = -1., double sigmaAvg = -1.)
    //

    /**
     * Applies the bilateral texture filter to an image. It performs structure-preserving texture filter.
     * For more details about this filter see CITE: Cho2014.
     *
     * @param src Source image whose depth is 8-bit UINT or 32-bit FLOAT
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param fr Radius of kernel to be used for filtering. It should be positive integer
     *
     * @param numIter Number of iterations of algorithm, It should be positive integer
     *
     * @param sigmaAlpha Controls the sharpness of the weight transition from edges to smooth/texture regions, where
     * a bigger value means sharper transition. When the value is negative, it is automatically calculated.
     *
     * @param sigmaAvg Range blur parameter for texture blurring. Larger value makes result to be more blurred. When the
     * value is negative, it is automatically calculated as described in the paper.
     *
     * SEE: rollingGuidanceFilter, bilateralFilter
     */
    public static void bilateralTextureFilter(Mat src, Mat dst, int fr, int numIter, double sigmaAlpha, double sigmaAvg) {
        bilateralTextureFilter_0(src.nativeObj, dst.nativeObj, fr, numIter, sigmaAlpha, sigmaAvg);
    }

    /**
     * Applies the bilateral texture filter to an image. It performs structure-preserving texture filter.
     * For more details about this filter see CITE: Cho2014.
     *
     * @param src Source image whose depth is 8-bit UINT or 32-bit FLOAT
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param fr Radius of kernel to be used for filtering. It should be positive integer
     *
     * @param numIter Number of iterations of algorithm, It should be positive integer
     *
     * @param sigmaAlpha Controls the sharpness of the weight transition from edges to smooth/texture regions, where
     * a bigger value means sharper transition. When the value is negative, it is automatically calculated.
     *
     * value is negative, it is automatically calculated as described in the paper.
     *
     * SEE: rollingGuidanceFilter, bilateralFilter
     */
    public static void bilateralTextureFilter(Mat src, Mat dst, int fr, int numIter, double sigmaAlpha) {
        bilateralTextureFilter_1(src.nativeObj, dst.nativeObj, fr, numIter, sigmaAlpha);
    }

    /**
     * Applies the bilateral texture filter to an image. It performs structure-preserving texture filter.
     * For more details about this filter see CITE: Cho2014.
     *
     * @param src Source image whose depth is 8-bit UINT or 32-bit FLOAT
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param fr Radius of kernel to be used for filtering. It should be positive integer
     *
     * @param numIter Number of iterations of algorithm, It should be positive integer
     *
     * a bigger value means sharper transition. When the value is negative, it is automatically calculated.
     *
     * value is negative, it is automatically calculated as described in the paper.
     *
     * SEE: rollingGuidanceFilter, bilateralFilter
     */
    public static void bilateralTextureFilter(Mat src, Mat dst, int fr, int numIter) {
        bilateralTextureFilter_2(src.nativeObj, dst.nativeObj, fr, numIter);
    }

    /**
     * Applies the bilateral texture filter to an image. It performs structure-preserving texture filter.
     * For more details about this filter see CITE: Cho2014.
     *
     * @param src Source image whose depth is 8-bit UINT or 32-bit FLOAT
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param fr Radius of kernel to be used for filtering. It should be positive integer
     *
     *
     * a bigger value means sharper transition. When the value is negative, it is automatically calculated.
     *
     * value is negative, it is automatically calculated as described in the paper.
     *
     * SEE: rollingGuidanceFilter, bilateralFilter
     */
    public static void bilateralTextureFilter(Mat src, Mat dst, int fr) {
        bilateralTextureFilter_3(src.nativeObj, dst.nativeObj, fr);
    }

    /**
     * Applies the bilateral texture filter to an image. It performs structure-preserving texture filter.
     * For more details about this filter see CITE: Cho2014.
     *
     * @param src Source image whose depth is 8-bit UINT or 32-bit FLOAT
     *
     * @param dst Destination image of the same size and type as src.
     *
     *
     *
     * a bigger value means sharper transition. When the value is negative, it is automatically calculated.
     *
     * value is negative, it is automatically calculated as described in the paper.
     *
     * SEE: rollingGuidanceFilter, bilateralFilter
     */
    public static void bilateralTextureFilter(Mat src, Mat dst) {
        bilateralTextureFilter_4(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::colorMatchTemplate(Mat img, Mat templ, Mat& result)
    //

    /**
     * Compares a color template against overlapped color image regions.
     *
     * @param img automatically generated
     * @param templ automatically generated
     * @param result automatically generated
     */
    public static void colorMatchTemplate(Mat img, Mat templ, Mat result) {
        colorMatchTemplate_0(img.nativeObj, templ.nativeObj, result.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::contourSampling(Mat src, Mat& out, int nbElt)
    //

    /**
     * Contour sampling .
     *
     *
     * @param src automatically generated
     * @param out automatically generated
     * @param nbElt automatically generated
     */
    public static void contourSampling(Mat src, Mat out, int nbElt) {
        contourSampling_0(src.nativeObj, out.nativeObj, nbElt);
    }


    //
    // C++:  void cv::ximgproc::covarianceEstimation(Mat src, Mat& dst, int windowRows, int windowCols)
    //

    /**
     * Computes the estimated covariance matrix of an image using the sliding
     * window forumlation.
     *
     * @param src The source image. Input image must be of a complex type.
     * @param dst The destination estimated covariance matrix. Output matrix will be size (windowRows*windowCols, windowRows*windowCols).
     * @param windowRows The number of rows in the window.
     * @param windowCols The number of cols in the window.
     * The window size parameters control the accuracy of the estimation.
     * The sliding window moves over the entire image from the top-left corner
     * to the bottom right corner. Each location of the window represents a sample.
     * If the window is the size of the image, then this gives the exact covariance matrix.
     * For all other cases, the sizes of the window will impact the number of samples
     * and the number of elements in the estimated covariance matrix.
     */
    public static void covarianceEstimation(Mat src, Mat dst, int windowRows, int windowCols) {
        covarianceEstimation_0(src.nativeObj, dst.nativeObj, windowRows, windowCols);
    }


    //
    // C++:  void cv::ximgproc::createQuaternionImage(Mat img, Mat& qimg)
    //

    /**
     * creates a quaternion image.
     *
     * @param img automatically generated
     * @param qimg automatically generated
     */
    public static void createQuaternionImage(Mat img, Mat qimg) {
        createQuaternionImage_0(img.nativeObj, qimg.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::dtFilter(Mat guide, Mat src, Mat& dst, double sigmaSpatial, double sigmaColor, int mode = DTF_NC, int numIters = 3)
    //

    /**
     * Simple one-line Domain Transform filter call. If you have multiple images to filter with the same
     * guided image then use DTFilter interface to avoid extra computations on initialization stage.
     *
     * @param guide guided image (also called as joint image) with unsigned 8-bit or floating-point 32-bit
     * depth and up to 4 channels.
     * @param src filtering image with unsigned 8-bit or floating-point 32-bit depth and up to 4 channels.
     * @param dst destination image
     * @param sigmaSpatial \({\sigma}_H\) parameter in the original article, it's similar to the sigma in the
     * coordinate space into bilateralFilter.
     * @param sigmaColor \({\sigma}_r\) parameter in the original article, it's similar to the sigma in the
     * color space into bilateralFilter.
     * @param mode one form three modes DTF_NC, DTF_RF and DTF_IC which corresponds to three modes for
     * filtering 2D signals in the article.
     * @param numIters optional number of iterations used for filtering, 3 is quite enough.
     * SEE: bilateralFilter, guidedFilter, amFilter
     */
    public static void dtFilter(Mat guide, Mat src, Mat dst, double sigmaSpatial, double sigmaColor, int mode, int numIters) {
        dtFilter_0(guide.nativeObj, src.nativeObj, dst.nativeObj, sigmaSpatial, sigmaColor, mode, numIters);
    }

    /**
     * Simple one-line Domain Transform filter call. If you have multiple images to filter with the same
     * guided image then use DTFilter interface to avoid extra computations on initialization stage.
     *
     * @param guide guided image (also called as joint image) with unsigned 8-bit or floating-point 32-bit
     * depth and up to 4 channels.
     * @param src filtering image with unsigned 8-bit or floating-point 32-bit depth and up to 4 channels.
     * @param dst destination image
     * @param sigmaSpatial \({\sigma}_H\) parameter in the original article, it's similar to the sigma in the
     * coordinate space into bilateralFilter.
     * @param sigmaColor \({\sigma}_r\) parameter in the original article, it's similar to the sigma in the
     * color space into bilateralFilter.
     * @param mode one form three modes DTF_NC, DTF_RF and DTF_IC which corresponds to three modes for
     * filtering 2D signals in the article.
     * SEE: bilateralFilter, guidedFilter, amFilter
     */
    public static void dtFilter(Mat guide, Mat src, Mat dst, double sigmaSpatial, double sigmaColor, int mode) {
        dtFilter_1(guide.nativeObj, src.nativeObj, dst.nativeObj, sigmaSpatial, sigmaColor, mode);
    }

    /**
     * Simple one-line Domain Transform filter call. If you have multiple images to filter with the same
     * guided image then use DTFilter interface to avoid extra computations on initialization stage.
     *
     * @param guide guided image (also called as joint image) with unsigned 8-bit or floating-point 32-bit
     * depth and up to 4 channels.
     * @param src filtering image with unsigned 8-bit or floating-point 32-bit depth and up to 4 channels.
     * @param dst destination image
     * @param sigmaSpatial \({\sigma}_H\) parameter in the original article, it's similar to the sigma in the
     * coordinate space into bilateralFilter.
     * @param sigmaColor \({\sigma}_r\) parameter in the original article, it's similar to the sigma in the
     * color space into bilateralFilter.
     * filtering 2D signals in the article.
     * SEE: bilateralFilter, guidedFilter, amFilter
     */
    public static void dtFilter(Mat guide, Mat src, Mat dst, double sigmaSpatial, double sigmaColor) {
        dtFilter_2(guide.nativeObj, src.nativeObj, dst.nativeObj, sigmaSpatial, sigmaColor);
    }


    //
    // C++:  void cv::ximgproc::edgePreservingFilter(Mat src, Mat& dst, int d, double threshold)
    //

    /**
     * Smoothes an image using the Edge-Preserving filter.
     *
     * The function smoothes Gaussian noise as well as salt &amp; pepper noise.
     * For more details about this implementation, please see
     * [ReiWoe18]  Reich, S. and Wörgötter, F. and Dellen, B. (2018). A Real-Time Edge-Preserving Denoising Filter. Proceedings of the 13th International Joint Conference on Computer Vision, Imaging and Computer Graphics Theory and Applications (VISIGRAPP): Visapp, 85-94, 4. DOI: 10.5220/0006509000850094.
     *
     * @param src Source 8-bit 3-channel image.
     * @param dst Destination image of the same size and type as src.
     * @param d Diameter of each pixel neighborhood that is used during filtering. Must be greater or equal 3.
     * @param threshold Threshold, which distinguishes between noise, outliers, and data.
     */
    public static void edgePreservingFilter(Mat src, Mat dst, int d, double threshold) {
        edgePreservingFilter_0(src.nativeObj, dst.nativeObj, d, threshold);
    }


    //
    // C++:  void cv::ximgproc::fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat& dst, double sigma_spatial = 8, double sigma_luma = 8, double sigma_chroma = 8, double lambda = 128.0, int num_iter = 25, double max_tol = 1e-5)
    //

    /**
     * Simple one-line Fast Bilateral Solver filter call. If you have multiple images to filter with the same
     * guide then use FastBilateralSolverFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
     *
     * @param dst destination image.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_chroma parameter, that is similar to chroma space sigma (bandwidth) in bilateralFilter.
     *
     * @param lambda smoothness strength parameter for solver.
     *
     * @param num_iter number of iterations used for solver, 25 is usually enough.
     *
     * @param max_tol convergence tolerance used for solver.
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     *
     * <b>Note:</b> Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
     */
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter, double max_tol) {
        fastBilateralSolverFilter_0(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter, max_tol);
    }

    /**
     * Simple one-line Fast Bilateral Solver filter call. If you have multiple images to filter with the same
     * guide then use FastBilateralSolverFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
     *
     * @param dst destination image.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_chroma parameter, that is similar to chroma space sigma (bandwidth) in bilateralFilter.
     *
     * @param lambda smoothness strength parameter for solver.
     *
     * @param num_iter number of iterations used for solver, 25 is usually enough.
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     *
     * <b>Note:</b> Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
     */
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter) {
        fastBilateralSolverFilter_1(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter);
    }

    /**
     * Simple one-line Fast Bilateral Solver filter call. If you have multiple images to filter with the same
     * guide then use FastBilateralSolverFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
     *
     * @param dst destination image.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_chroma parameter, that is similar to chroma space sigma (bandwidth) in bilateralFilter.
     *
     * @param lambda smoothness strength parameter for solver.
     *
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     *
     * <b>Note:</b> Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
     */
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda) {
        fastBilateralSolverFilter_2(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda);
    }

    /**
     * Simple one-line Fast Bilateral Solver filter call. If you have multiple images to filter with the same
     * guide then use FastBilateralSolverFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
     *
     * @param dst destination image.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_chroma parameter, that is similar to chroma space sigma (bandwidth) in bilateralFilter.
     *
     *
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     *
     * <b>Note:</b> Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
     */
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma, double sigma_chroma) {
        fastBilateralSolverFilter_3(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma, sigma_chroma);
    }

    /**
     * Simple one-line Fast Bilateral Solver filter call. If you have multiple images to filter with the same
     * guide then use FastBilateralSolverFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
     *
     * @param dst destination image.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     * @param sigma_luma parameter, that is similar to luma space sigma (bandwidth) in bilateralFilter.
     *
     *
     *
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     *
     * <b>Note:</b> Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
     */
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma) {
        fastBilateralSolverFilter_4(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma);
    }

    /**
     * Simple one-line Fast Bilateral Solver filter call. If you have multiple images to filter with the same
     * guide then use FastBilateralSolverFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
     *
     * @param dst destination image.
     *
     * @param sigma_spatial parameter, that is similar to spatial space sigma (bandwidth) in bilateralFilter.
     *
     *
     *
     *
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     *
     * <b>Note:</b> Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
     */
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial) {
        fastBilateralSolverFilter_5(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial);
    }

    /**
     * Simple one-line Fast Bilateral Solver filter call. If you have multiple images to filter with the same
     * guide then use FastBilateralSolverFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param confidence confidence image with unsigned 8-bit or floating-point 32-bit confidence and 1 channel.
     *
     * @param dst destination image.
     *
     *
     *
     *
     *
     *
     *
     * For more details about the Fast Bilateral Solver parameters, see the original paper CITE: BarronPoole2016.
     *
     * <b>Note:</b> Confidence images with CV_8U depth are expected to in [0, 255] and CV_32F in [0, 1] range.
     */
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst) {
        fastBilateralSolverFilter_6(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::fastGlobalSmootherFilter(Mat guide, Mat src, Mat& dst, double lambda, double sigma_color, double lambda_attenuation = 0.25, int num_iter = 3)
    //

    /**
     * Simple one-line Fast Global Smoother filter call. If you have multiple images to filter with the same
     * guide then use FastGlobalSmootherFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param dst destination image.
     *
     * @param lambda parameter defining the amount of regularization
     *
     * @param sigma_color parameter, that is similar to color space sigma in bilateralFilter.
     *
     * @param lambda_attenuation internal parameter, defining how much lambda decreases after each iteration. Normally,
     * it should be 0.25. Setting it to 1.0 may lead to streaking artifacts.
     *
     * @param num_iter number of iterations used for filtering, 3 is usually enough.
     */
    public static void fastGlobalSmootherFilter(Mat guide, Mat src, Mat dst, double lambda, double sigma_color, double lambda_attenuation, int num_iter) {
        fastGlobalSmootherFilter_0(guide.nativeObj, src.nativeObj, dst.nativeObj, lambda, sigma_color, lambda_attenuation, num_iter);
    }

    /**
     * Simple one-line Fast Global Smoother filter call. If you have multiple images to filter with the same
     * guide then use FastGlobalSmootherFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param dst destination image.
     *
     * @param lambda parameter defining the amount of regularization
     *
     * @param sigma_color parameter, that is similar to color space sigma in bilateralFilter.
     *
     * @param lambda_attenuation internal parameter, defining how much lambda decreases after each iteration. Normally,
     * it should be 0.25. Setting it to 1.0 may lead to streaking artifacts.
     *
     */
    public static void fastGlobalSmootherFilter(Mat guide, Mat src, Mat dst, double lambda, double sigma_color, double lambda_attenuation) {
        fastGlobalSmootherFilter_1(guide.nativeObj, src.nativeObj, dst.nativeObj, lambda, sigma_color, lambda_attenuation);
    }

    /**
     * Simple one-line Fast Global Smoother filter call. If you have multiple images to filter with the same
     * guide then use FastGlobalSmootherFilter interface to avoid extra computations.
     *
     * @param guide image serving as guide for filtering. It should have 8-bit depth and either 1 or 3 channels.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point 32-bit depth and up to 4 channels.
     *
     * @param dst destination image.
     *
     * @param lambda parameter defining the amount of regularization
     *
     * @param sigma_color parameter, that is similar to color space sigma in bilateralFilter.
     *
     * it should be 0.25. Setting it to 1.0 may lead to streaking artifacts.
     *
     */
    public static void fastGlobalSmootherFilter(Mat guide, Mat src, Mat dst, double lambda, double sigma_color) {
        fastGlobalSmootherFilter_2(guide.nativeObj, src.nativeObj, dst.nativeObj, lambda, sigma_color);
    }


    //
    // C++:  void cv::ximgproc::fourierDescriptor(Mat src, Mat& dst, int nbElt = -1, int nbFD = -1)
    //

    /**
     * Fourier descriptors for planed closed curves
     *
     * For more details about this implementation, please see CITE: PersoonFu1977
     *
     *
     * @param src automatically generated
     * @param dst automatically generated
     * @param nbElt automatically generated
     * @param nbFD automatically generated
     */
    public static void fourierDescriptor(Mat src, Mat dst, int nbElt, int nbFD) {
        fourierDescriptor_0(src.nativeObj, dst.nativeObj, nbElt, nbFD);
    }

    /**
     * Fourier descriptors for planed closed curves
     *
     * For more details about this implementation, please see CITE: PersoonFu1977
     *
     *
     * @param src automatically generated
     * @param dst automatically generated
     * @param nbElt automatically generated
     */
    public static void fourierDescriptor(Mat src, Mat dst, int nbElt) {
        fourierDescriptor_1(src.nativeObj, dst.nativeObj, nbElt);
    }

    /**
     * Fourier descriptors for planed closed curves
     *
     * For more details about this implementation, please see CITE: PersoonFu1977
     *
     *
     * @param src automatically generated
     * @param dst automatically generated
     */
    public static void fourierDescriptor(Mat src, Mat dst) {
        fourierDescriptor_2(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::guidedFilter(Mat guide, Mat src, Mat& dst, int radius, double eps, int dDepth = -1)
    //

    /**
     * Simple one-line Guided Filter call.
     *
     * If you have multiple images to filter with the same guided image then use GuidedFilter interface to
     * avoid extra computations on initialization stage.
     *
     * @param guide guided image (or array of images) with up to 3 channels, if it have more then 3
     * channels then only first 3 channels will be used.
     *
     * @param src filtering image with any numbers of channels.
     *
     * @param dst output image.
     *
     * @param radius radius of Guided Filter.
     *
     * @param eps regularization term of Guided Filter. \({eps}^2\) is similar to the sigma in the color
     * space into bilateralFilter.
     *
     * @param dDepth optional depth of the output image.
     *
     * SEE: bilateralFilter, dtFilter, amFilter
     */
    public static void guidedFilter(Mat guide, Mat src, Mat dst, int radius, double eps, int dDepth) {
        guidedFilter_0(guide.nativeObj, src.nativeObj, dst.nativeObj, radius, eps, dDepth);
    }

    /**
     * Simple one-line Guided Filter call.
     *
     * If you have multiple images to filter with the same guided image then use GuidedFilter interface to
     * avoid extra computations on initialization stage.
     *
     * @param guide guided image (or array of images) with up to 3 channels, if it have more then 3
     * channels then only first 3 channels will be used.
     *
     * @param src filtering image with any numbers of channels.
     *
     * @param dst output image.
     *
     * @param radius radius of Guided Filter.
     *
     * @param eps regularization term of Guided Filter. \({eps}^2\) is similar to the sigma in the color
     * space into bilateralFilter.
     *
     *
     * SEE: bilateralFilter, dtFilter, amFilter
     */
    public static void guidedFilter(Mat guide, Mat src, Mat dst, int radius, double eps) {
        guidedFilter_1(guide.nativeObj, src.nativeObj, dst.nativeObj, radius, eps);
    }


    //
    // C++:  void cv::ximgproc::jointBilateralFilter(Mat joint, Mat src, Mat& dst, int d, double sigmaColor, double sigmaSpace, int borderType = BORDER_DEFAULT)
    //

    /**
     * Applies the joint bilateral filter to an image.
     *
     * @param joint Joint 8-bit or floating-point, 1-channel or 3-channel image.
     *
     * @param src Source 8-bit or floating-point, 1-channel or 3-channel image with the same depth as joint
     * image.
     *
     * @param dst Destination image of the same size and type as src .
     *
     * @param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
     * it is computed from sigmaSpace .
     *
     * @param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
     * farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
     * larger areas of semi-equal color.
     *
     * @param sigmaSpace Filter sigma in the coordinate space. A larger value of the parameter means that
     * farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
     * When d&gt;0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
     * proportional to sigmaSpace .
     *
     * @param borderType
     *
     * <b>Note:</b> bilateralFilter and jointBilateralFilter use L1 norm to compute difference between colors.
     *
     * SEE: bilateralFilter, amFilter
     */
    public static void jointBilateralFilter(Mat joint, Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace, int borderType) {
        jointBilateralFilter_0(joint.nativeObj, src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace, borderType);
    }

    /**
     * Applies the joint bilateral filter to an image.
     *
     * @param joint Joint 8-bit or floating-point, 1-channel or 3-channel image.
     *
     * @param src Source 8-bit or floating-point, 1-channel or 3-channel image with the same depth as joint
     * image.
     *
     * @param dst Destination image of the same size and type as src .
     *
     * @param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
     * it is computed from sigmaSpace .
     *
     * @param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
     * farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
     * larger areas of semi-equal color.
     *
     * @param sigmaSpace Filter sigma in the coordinate space. A larger value of the parameter means that
     * farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
     * When d&gt;0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
     * proportional to sigmaSpace .
     *
     *
     * <b>Note:</b> bilateralFilter and jointBilateralFilter use L1 norm to compute difference between colors.
     *
     * SEE: bilateralFilter, amFilter
     */
    public static void jointBilateralFilter(Mat joint, Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace) {
        jointBilateralFilter_1(joint.nativeObj, src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace);
    }


    //
    // C++:  void cv::ximgproc::l0Smooth(Mat src, Mat& dst, double lambda = 0.02, double kappa = 2.0)
    //

    /**
     * Global image smoothing via L0 gradient minimization.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point depth.
     *
     * @param dst destination image.
     *
     * @param lambda parameter defining the smooth term weight.
     *
     * @param kappa parameter defining the increasing factor of the weight of the gradient data term.
     *
     * For more details about L0 Smoother, see the original paper CITE: xu2011image.
     */
    public static void l0Smooth(Mat src, Mat dst, double lambda, double kappa) {
        l0Smooth_0(src.nativeObj, dst.nativeObj, lambda, kappa);
    }

    /**
     * Global image smoothing via L0 gradient minimization.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point depth.
     *
     * @param dst destination image.
     *
     * @param lambda parameter defining the smooth term weight.
     *
     *
     * For more details about L0 Smoother, see the original paper CITE: xu2011image.
     */
    public static void l0Smooth(Mat src, Mat dst, double lambda) {
        l0Smooth_1(src.nativeObj, dst.nativeObj, lambda);
    }

    /**
     * Global image smoothing via L0 gradient minimization.
     *
     * @param src source image for filtering with unsigned 8-bit or signed 16-bit or floating-point depth.
     *
     * @param dst destination image.
     *
     *
     *
     * For more details about L0 Smoother, see the original paper CITE: xu2011image.
     */
    public static void l0Smooth(Mat src, Mat dst) {
        l0Smooth_2(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::niBlackThreshold(Mat _src, Mat& _dst, double maxValue, int type, int blockSize, double k, int binarizationMethod = BINARIZATION_NIBLACK)
    //

    /**
     * Performs thresholding on input images using Niblack's technique or some of the
     * popular variations it inspired.
     *
     * The function transforms a grayscale image to a binary image according to the formulae:
     * <ul>
     *   <li>
     *    <b>THRESH_BINARY</b>
     *     \(dst(x,y) =  \fork{\texttt{maxValue}}{if \(src(x,y) &gt; T(x,y)\)}{0}{otherwise}\)
     *   </li>
     *   <li>
     *    <b>THRESH_BINARY_INV</b>
     *     \(dst(x,y) =  \fork{0}{if \(src(x,y) &gt; T(x,y)\)}{\texttt{maxValue}}{otherwise}\)
     * where \(T(x,y)\) is a threshold calculated individually for each pixel.
     *   </li>
     * </ul>
     *
     * The threshold value \(T(x, y)\) is determined based on the binarization method chosen. For
     * classic Niblack, it is the mean minus \( k \) times standard deviation of
     * \(\texttt{blockSize} \times\texttt{blockSize}\) neighborhood of \((x, y)\).
     *
     * The function can't process the image in-place.
     *
     * @param _src Source 8-bit single-channel image.
     * @param _dst Destination image of the same size and the same type as src.
     * @param maxValue Non-zero value assigned to the pixels for which the condition is satisfied,
     * used with the THRESH_BINARY and THRESH_BINARY_INV thresholding types.
     * @param type Thresholding type, see cv::ThresholdTypes.
     * @param blockSize Size of a pixel neighborhood that is used to calculate a threshold value
     * for the pixel: 3, 5, 7, and so on.
     * @param k The user-adjustable parameter used by Niblack and inspired techniques. For Niblack, this is
     * normally a value between 0 and 1 that is multiplied with the standard deviation and subtracted from
     * the mean.
     * @param binarizationMethod Binarization method to use. By default, Niblack's technique is used.
     * Other techniques can be specified, see cv::ximgproc::LocalBinarizationMethods.
     *
     * SEE:  threshold, adaptiveThreshold
     */
    public static void niBlackThreshold(Mat _src, Mat _dst, double maxValue, int type, int blockSize, double k, int binarizationMethod) {
        niBlackThreshold_0(_src.nativeObj, _dst.nativeObj, maxValue, type, blockSize, k, binarizationMethod);
    }

    /**
     * Performs thresholding on input images using Niblack's technique or some of the
     * popular variations it inspired.
     *
     * The function transforms a grayscale image to a binary image according to the formulae:
     * <ul>
     *   <li>
     *    <b>THRESH_BINARY</b>
     *     \(dst(x,y) =  \fork{\texttt{maxValue}}{if \(src(x,y) &gt; T(x,y)\)}{0}{otherwise}\)
     *   </li>
     *   <li>
     *    <b>THRESH_BINARY_INV</b>
     *     \(dst(x,y) =  \fork{0}{if \(src(x,y) &gt; T(x,y)\)}{\texttt{maxValue}}{otherwise}\)
     * where \(T(x,y)\) is a threshold calculated individually for each pixel.
     *   </li>
     * </ul>
     *
     * The threshold value \(T(x, y)\) is determined based on the binarization method chosen. For
     * classic Niblack, it is the mean minus \( k \) times standard deviation of
     * \(\texttt{blockSize} \times\texttt{blockSize}\) neighborhood of \((x, y)\).
     *
     * The function can't process the image in-place.
     *
     * @param _src Source 8-bit single-channel image.
     * @param _dst Destination image of the same size and the same type as src.
     * @param maxValue Non-zero value assigned to the pixels for which the condition is satisfied,
     * used with the THRESH_BINARY and THRESH_BINARY_INV thresholding types.
     * @param type Thresholding type, see cv::ThresholdTypes.
     * @param blockSize Size of a pixel neighborhood that is used to calculate a threshold value
     * for the pixel: 3, 5, 7, and so on.
     * @param k The user-adjustable parameter used by Niblack and inspired techniques. For Niblack, this is
     * normally a value between 0 and 1 that is multiplied with the standard deviation and subtracted from
     * the mean.
     * Other techniques can be specified, see cv::ximgproc::LocalBinarizationMethods.
     *
     * SEE:  threshold, adaptiveThreshold
     */
    public static void niBlackThreshold(Mat _src, Mat _dst, double maxValue, int type, int blockSize, double k) {
        niBlackThreshold_1(_src.nativeObj, _dst.nativeObj, maxValue, type, blockSize, k);
    }


    //
    // C++:  void cv::ximgproc::qconj(Mat qimg, Mat& qcimg)
    //

    /**
     * calculates conjugate of a quaternion image.
     *
     * @param qimg automatically generated
     * @param qcimg automatically generated
     */
    public static void qconj(Mat qimg, Mat qcimg) {
        qconj_0(qimg.nativeObj, qcimg.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::qdft(Mat img, Mat& qimg, int flags, bool sideLeft)
    //

    /**
     * Performs a forward or inverse Discrete quaternion Fourier transform of a 2D quaternion array.
     *
     * @param img automatically generated
     * @param qimg automatically generated
     * @param flags automatically generated
     * @param sideLeft automatically generated
     */
    public static void qdft(Mat img, Mat qimg, int flags, boolean sideLeft) {
        qdft_0(img.nativeObj, qimg.nativeObj, flags, sideLeft);
    }


    //
    // C++:  void cv::ximgproc::qmultiply(Mat src1, Mat src2, Mat& dst)
    //

    /**
     * Calculates the per-element quaternion product of two arrays
     *
     * @param src1 automatically generated
     * @param src2 automatically generated
     * @param dst automatically generated
     */
    public static void qmultiply(Mat src1, Mat src2, Mat dst) {
        qmultiply_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::qunitary(Mat qimg, Mat& qnimg)
    //

    /**
     * divides each element by its modulus.
     *
     * @param qimg automatically generated
     * @param qnimg automatically generated
     */
    public static void qunitary(Mat qimg, Mat qnimg) {
        qunitary_0(qimg.nativeObj, qnimg.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::rollingGuidanceFilter(Mat src, Mat& dst, int d = -1, double sigmaColor = 25, double sigmaSpace = 3, int numOfIter = 4, int borderType = BORDER_DEFAULT)
    //

    /**
     * Applies the rolling guidance filter to an image.
     *
     * For more details, please see CITE: zhang2014rolling
     *
     * @param src Source 8-bit or floating-point, 1-channel or 3-channel image.
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
     * it is computed from sigmaSpace .
     *
     * @param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
     * farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
     * larger areas of semi-equal color.
     *
     * @param sigmaSpace Filter sigma in the coordinate space. A larger value of the parameter means that
     * farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
     * When d&gt;0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
     * proportional to sigmaSpace .
     *
     * @param numOfIter Number of iterations of joint edge-preserving filtering applied on the source image.
     *
     * @param borderType
     *
     * <b>Note:</b>  rollingGuidanceFilter uses jointBilateralFilter as the edge-preserving filter.
     *
     * SEE: jointBilateralFilter, bilateralFilter, amFilter
     */
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace, int numOfIter, int borderType) {
        rollingGuidanceFilter_0(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace, numOfIter, borderType);
    }

    /**
     * Applies the rolling guidance filter to an image.
     *
     * For more details, please see CITE: zhang2014rolling
     *
     * @param src Source 8-bit or floating-point, 1-channel or 3-channel image.
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
     * it is computed from sigmaSpace .
     *
     * @param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
     * farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
     * larger areas of semi-equal color.
     *
     * @param sigmaSpace Filter sigma in the coordinate space. A larger value of the parameter means that
     * farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
     * When d&gt;0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
     * proportional to sigmaSpace .
     *
     * @param numOfIter Number of iterations of joint edge-preserving filtering applied on the source image.
     *
     *
     * <b>Note:</b>  rollingGuidanceFilter uses jointBilateralFilter as the edge-preserving filter.
     *
     * SEE: jointBilateralFilter, bilateralFilter, amFilter
     */
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace, int numOfIter) {
        rollingGuidanceFilter_1(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace, numOfIter);
    }

    /**
     * Applies the rolling guidance filter to an image.
     *
     * For more details, please see CITE: zhang2014rolling
     *
     * @param src Source 8-bit or floating-point, 1-channel or 3-channel image.
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
     * it is computed from sigmaSpace .
     *
     * @param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
     * farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
     * larger areas of semi-equal color.
     *
     * @param sigmaSpace Filter sigma in the coordinate space. A larger value of the parameter means that
     * farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
     * When d&gt;0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
     * proportional to sigmaSpace .
     *
     *
     *
     * <b>Note:</b>  rollingGuidanceFilter uses jointBilateralFilter as the edge-preserving filter.
     *
     * SEE: jointBilateralFilter, bilateralFilter, amFilter
     */
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace) {
        rollingGuidanceFilter_2(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace);
    }

    /**
     * Applies the rolling guidance filter to an image.
     *
     * For more details, please see CITE: zhang2014rolling
     *
     * @param src Source 8-bit or floating-point, 1-channel or 3-channel image.
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
     * it is computed from sigmaSpace .
     *
     * @param sigmaColor Filter sigma in the color space. A larger value of the parameter means that
     * farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
     * larger areas of semi-equal color.
     *
     * farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
     * When d&gt;0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
     * proportional to sigmaSpace .
     *
     *
     *
     * <b>Note:</b>  rollingGuidanceFilter uses jointBilateralFilter as the edge-preserving filter.
     *
     * SEE: jointBilateralFilter, bilateralFilter, amFilter
     */
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d, double sigmaColor) {
        rollingGuidanceFilter_3(src.nativeObj, dst.nativeObj, d, sigmaColor);
    }

    /**
     * Applies the rolling guidance filter to an image.
     *
     * For more details, please see CITE: zhang2014rolling
     *
     * @param src Source 8-bit or floating-point, 1-channel or 3-channel image.
     *
     * @param dst Destination image of the same size and type as src.
     *
     * @param d Diameter of each pixel neighborhood that is used during filtering. If it is non-positive,
     * it is computed from sigmaSpace .
     *
     * farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
     * larger areas of semi-equal color.
     *
     * farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
     * When d&gt;0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
     * proportional to sigmaSpace .
     *
     *
     *
     * <b>Note:</b>  rollingGuidanceFilter uses jointBilateralFilter as the edge-preserving filter.
     *
     * SEE: jointBilateralFilter, bilateralFilter, amFilter
     */
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d) {
        rollingGuidanceFilter_4(src.nativeObj, dst.nativeObj, d);
    }

    /**
     * Applies the rolling guidance filter to an image.
     *
     * For more details, please see CITE: zhang2014rolling
     *
     * @param src Source 8-bit or floating-point, 1-channel or 3-channel image.
     *
     * @param dst Destination image of the same size and type as src.
     *
     * it is computed from sigmaSpace .
     *
     * farther colors within the pixel neighborhood (see sigmaSpace ) will be mixed together, resulting in
     * larger areas of semi-equal color.
     *
     * farther pixels will influence each other as long as their colors are close enough (see sigmaColor ).
     * When d&gt;0 , it specifies the neighborhood size regardless of sigmaSpace . Otherwise, d is
     * proportional to sigmaSpace .
     *
     *
     *
     * <b>Note:</b>  rollingGuidanceFilter uses jointBilateralFilter as the edge-preserving filter.
     *
     * SEE: jointBilateralFilter, bilateralFilter, amFilter
     */
    public static void rollingGuidanceFilter(Mat src, Mat dst) {
        rollingGuidanceFilter_5(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::thinning(Mat src, Mat& dst, int thinningType = THINNING_ZHANGSUEN)
    //

    /**
     * Applies a binary blob thinning operation, to achieve a skeletization of the input image.
     *
     * The function transforms a binary blob image into a skeletized form using the technique of Zhang-Suen.
     *
     * @param src Source 8-bit single-channel image, containing binary blobs, with blobs having 255 pixel values.
     * @param dst Destination image of the same size and the same type as src. The function can work in-place.
     * @param thinningType Value that defines which thinning algorithm should be used. See cv::ximgproc::ThinningTypes
     */
    public static void thinning(Mat src, Mat dst, int thinningType) {
        thinning_0(src.nativeObj, dst.nativeObj, thinningType);
    }

    /**
     * Applies a binary blob thinning operation, to achieve a skeletization of the input image.
     *
     * The function transforms a binary blob image into a skeletized form using the technique of Zhang-Suen.
     *
     * @param src Source 8-bit single-channel image, containing binary blobs, with blobs having 255 pixel values.
     * @param dst Destination image of the same size and the same type as src. The function can work in-place.
     */
    public static void thinning(Mat src, Mat dst) {
        thinning_1(src.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::transformFD(Mat src, Mat t, Mat& dst, bool fdContour = true)
    //

    /**
     * transform a contour
     *
     *
     * @param src automatically generated
     * @param t automatically generated
     * @param dst automatically generated
     * @param fdContour automatically generated
     */
    public static void transformFD(Mat src, Mat t, Mat dst, boolean fdContour) {
        transformFD_0(src.nativeObj, t.nativeObj, dst.nativeObj, fdContour);
    }

    /**
     * transform a contour
     *
     *
     * @param src automatically generated
     * @param t automatically generated
     * @param dst automatically generated
     */
    public static void transformFD(Mat src, Mat t, Mat dst) {
        transformFD_1(src.nativeObj, t.nativeObj, dst.nativeObj);
    }


    //
    // C++:  void cv::ximgproc::weightedMedianFilter(Mat joint, Mat src, Mat& dst, int r, double sigma = 25.5, int weightType = WMF_EXP, Mat mask = Mat())
    //

    /**
     * Applies weighted median filter to an image.
     *
     * For more details about this implementation, please see CITE: zhang2014100+
     *
     * the pixel will be ignored when maintaining the joint-histogram. This is useful for applications like optical flow occlusion handling.
     *
     * SEE: medianBlur, jointBilateralFilter
     * @param joint automatically generated
     * @param src automatically generated
     * @param dst automatically generated
     * @param r automatically generated
     * @param sigma automatically generated
     * @param weightType automatically generated
     * @param mask automatically generated
     */
    public static void weightedMedianFilter(Mat joint, Mat src, Mat dst, int r, double sigma, int weightType, Mat mask) {
        weightedMedianFilter_0(joint.nativeObj, src.nativeObj, dst.nativeObj, r, sigma, weightType, mask.nativeObj);
    }

    /**
     * Applies weighted median filter to an image.
     *
     * For more details about this implementation, please see CITE: zhang2014100+
     *
     * the pixel will be ignored when maintaining the joint-histogram. This is useful for applications like optical flow occlusion handling.
     *
     * SEE: medianBlur, jointBilateralFilter
     * @param joint automatically generated
     * @param src automatically generated
     * @param dst automatically generated
     * @param r automatically generated
     * @param sigma automatically generated
     * @param weightType automatically generated
     */
    public static void weightedMedianFilter(Mat joint, Mat src, Mat dst, int r, double sigma, int weightType) {
        weightedMedianFilter_1(joint.nativeObj, src.nativeObj, dst.nativeObj, r, sigma, weightType);
    }

    /**
     * Applies weighted median filter to an image.
     *
     * For more details about this implementation, please see CITE: zhang2014100+
     *
     * the pixel will be ignored when maintaining the joint-histogram. This is useful for applications like optical flow occlusion handling.
     *
     * SEE: medianBlur, jointBilateralFilter
     * @param joint automatically generated
     * @param src automatically generated
     * @param dst automatically generated
     * @param r automatically generated
     * @param sigma automatically generated
     */
    public static void weightedMedianFilter(Mat joint, Mat src, Mat dst, int r, double sigma) {
        weightedMedianFilter_2(joint.nativeObj, src.nativeObj, dst.nativeObj, r, sigma);
    }

    /**
     * Applies weighted median filter to an image.
     *
     * For more details about this implementation, please see CITE: zhang2014100+
     *
     * the pixel will be ignored when maintaining the joint-histogram. This is useful for applications like optical flow occlusion handling.
     *
     * SEE: medianBlur, jointBilateralFilter
     * @param joint automatically generated
     * @param src automatically generated
     * @param dst automatically generated
     * @param r automatically generated
     */
    public static void weightedMedianFilter(Mat joint, Mat src, Mat dst, int r) {
        weightedMedianFilter_3(joint.nativeObj, src.nativeObj, dst.nativeObj, r);
    }




    // C++:  Ptr_AdaptiveManifoldFilter cv::ximgproc::createAMFilter(double sigma_s, double sigma_r, bool adjust_outliers = false)
    private static native long createAMFilter_0(double sigma_s, double sigma_r, boolean adjust_outliers);
    private static native long createAMFilter_1(double sigma_s, double sigma_r);

    // C++:  Ptr_ContourFitting cv::ximgproc::createContourFitting(int ctr = 1024, int fd = 16)
    private static native long createContourFitting_0(int ctr, int fd);
    private static native long createContourFitting_1(int ctr);
    private static native long createContourFitting_2();

    // C++:  Ptr_DTFilter cv::ximgproc::createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor, int mode = DTF_NC, int numIters = 3)
    private static native long createDTFilter_0(long guide_nativeObj, double sigmaSpatial, double sigmaColor, int mode, int numIters);
    private static native long createDTFilter_1(long guide_nativeObj, double sigmaSpatial, double sigmaColor, int mode);
    private static native long createDTFilter_2(long guide_nativeObj, double sigmaSpatial, double sigmaColor);

    // C++:  Ptr_DisparityWLSFilter cv::ximgproc::createDisparityWLSFilter(Ptr_StereoMatcher matcher_left)
    private static native long createDisparityWLSFilter_0(long matcher_left_nativeObj);

    // C++:  Ptr_DisparityWLSFilter cv::ximgproc::createDisparityWLSFilterGeneric(bool use_confidence)
    private static native long createDisparityWLSFilterGeneric_0(boolean use_confidence);

    // C++:  Ptr_EdgeAwareInterpolator cv::ximgproc::createEdgeAwareInterpolator()
    private static native long createEdgeAwareInterpolator_0();

    // C++:  Ptr_EdgeBoxes cv::ximgproc::createEdgeBoxes(float alpha = 0.65f, float beta = 0.75f, float eta = 1, float minScore = 0.01f, int maxBoxes = 10000, float edgeMinMag = 0.1f, float edgeMergeThr = 0.5f, float clusterMinMag = 0.5f, float maxAspectRatio = 3, float minBoxArea = 1000, float gamma = 2, float kappa = 1.5f)
    private static native long createEdgeBoxes_0(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea, float gamma, float kappa);
    private static native long createEdgeBoxes_1(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea, float gamma);
    private static native long createEdgeBoxes_2(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea);
    private static native long createEdgeBoxes_3(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio);
    private static native long createEdgeBoxes_4(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag);
    private static native long createEdgeBoxes_5(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr);
    private static native long createEdgeBoxes_6(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag);
    private static native long createEdgeBoxes_7(float alpha, float beta, float eta, float minScore, int maxBoxes);
    private static native long createEdgeBoxes_8(float alpha, float beta, float eta, float minScore);
    private static native long createEdgeBoxes_9(float alpha, float beta, float eta);
    private static native long createEdgeBoxes_10(float alpha, float beta);
    private static native long createEdgeBoxes_11(float alpha);
    private static native long createEdgeBoxes_12();

    // C++:  Ptr_FastBilateralSolverFilter cv::ximgproc::createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda = 128.0, int num_iter = 25, double max_tol = 1e-5)
    private static native long createFastBilateralSolverFilter_0(long guide_nativeObj, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter, double max_tol);
    private static native long createFastBilateralSolverFilter_1(long guide_nativeObj, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter);
    private static native long createFastBilateralSolverFilter_2(long guide_nativeObj, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda);
    private static native long createFastBilateralSolverFilter_3(long guide_nativeObj, double sigma_spatial, double sigma_luma, double sigma_chroma);

    // C++:  Ptr_FastGlobalSmootherFilter cv::ximgproc::createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color, double lambda_attenuation = 0.25, int num_iter = 3)
    private static native long createFastGlobalSmootherFilter_0(long guide_nativeObj, double lambda, double sigma_color, double lambda_attenuation, int num_iter);
    private static native long createFastGlobalSmootherFilter_1(long guide_nativeObj, double lambda, double sigma_color, double lambda_attenuation);
    private static native long createFastGlobalSmootherFilter_2(long guide_nativeObj, double lambda, double sigma_color);

    // C++:  Ptr_FastLineDetector cv::ximgproc::createFastLineDetector(int _length_threshold = 10, float _distance_threshold = 1.414213562f, double _canny_th1 = 50.0, double _canny_th2 = 50.0, int _canny_aperture_size = 3, bool _do_merge = false)
    private static native long createFastLineDetector_0(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2, int _canny_aperture_size, boolean _do_merge);
    private static native long createFastLineDetector_1(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2, int _canny_aperture_size);
    private static native long createFastLineDetector_2(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2);
    private static native long createFastLineDetector_3(int _length_threshold, float _distance_threshold, double _canny_th1);
    private static native long createFastLineDetector_4(int _length_threshold, float _distance_threshold);
    private static native long createFastLineDetector_5(int _length_threshold);
    private static native long createFastLineDetector_6();

    // C++:  Ptr_GraphSegmentation cv::ximgproc::segmentation::createGraphSegmentation(double sigma = 0.5, float k = 300, int min_size = 100)
    private static native long createGraphSegmentation_0(double sigma, float k, int min_size);
    private static native long createGraphSegmentation_1(double sigma, float k);
    private static native long createGraphSegmentation_2(double sigma);
    private static native long createGraphSegmentation_3();

    // C++:  Ptr_GuidedFilter cv::ximgproc::createGuidedFilter(Mat guide, int radius, double eps)
    private static native long createGuidedFilter_0(long guide_nativeObj, int radius, double eps);

    // C++:  Ptr_RFFeatureGetter cv::ximgproc::createRFFeatureGetter()
    private static native long createRFFeatureGetter_0();

    // C++:  Ptr_RICInterpolator cv::ximgproc::createRICInterpolator()
    private static native long createRICInterpolator_0();

    // C++:  Ptr_SelectiveSearchSegmentation cv::ximgproc::segmentation::createSelectiveSearchSegmentation()
    private static native long createSelectiveSearchSegmentation_0();

    // C++:  Ptr_SelectiveSearchSegmentationStrategyColor cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyColor()
    private static native long createSelectiveSearchSegmentationStrategyColor_0();

    // C++:  Ptr_SelectiveSearchSegmentationStrategyFill cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyFill()
    private static native long createSelectiveSearchSegmentationStrategyFill_0();

    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2, Ptr_SelectiveSearchSegmentationStrategy s3, Ptr_SelectiveSearchSegmentationStrategy s4)
    private static native long createSelectiveSearchSegmentationStrategyMultiple_0(long s1_nativeObj, long s2_nativeObj, long s3_nativeObj, long s4_nativeObj);

    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2, Ptr_SelectiveSearchSegmentationStrategy s3)
    private static native long createSelectiveSearchSegmentationStrategyMultiple_1(long s1_nativeObj, long s2_nativeObj, long s3_nativeObj);

    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2)
    private static native long createSelectiveSearchSegmentationStrategyMultiple_2(long s1_nativeObj, long s2_nativeObj);

    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1)
    private static native long createSelectiveSearchSegmentationStrategyMultiple_3(long s1_nativeObj);

    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple()
    private static native long createSelectiveSearchSegmentationStrategyMultiple_4();

    // C++:  Ptr_SelectiveSearchSegmentationStrategySize cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategySize()
    private static native long createSelectiveSearchSegmentationStrategySize_0();

    // C++:  Ptr_SelectiveSearchSegmentationStrategyTexture cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyTexture()
    private static native long createSelectiveSearchSegmentationStrategyTexture_0();

    // C++:  Ptr_StereoMatcher cv::ximgproc::createRightMatcher(Ptr_StereoMatcher matcher_left)
    private static native long createRightMatcher_0(long matcher_left_nativeObj);

    // C++:  Ptr_StructuredEdgeDetection cv::ximgproc::createStructuredEdgeDetection(String model, Ptr_RFFeatureGetter howToGetFeatures = Ptr<RFFeatureGetter>())
    private static native long createStructuredEdgeDetection_0(String model, long howToGetFeatures_nativeObj);
    private static native long createStructuredEdgeDetection_1(String model);

    // C++:  Ptr_SuperpixelLSC cv::ximgproc::createSuperpixelLSC(Mat image, int region_size = 10, float ratio = 0.075f)
    private static native long createSuperpixelLSC_0(long image_nativeObj, int region_size, float ratio);
    private static native long createSuperpixelLSC_1(long image_nativeObj, int region_size);
    private static native long createSuperpixelLSC_2(long image_nativeObj);

    // C++:  Ptr_SuperpixelSEEDS cv::ximgproc::createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior = 2, int histogram_bins = 5, bool double_step = false)
    private static native long createSuperpixelSEEDS_0(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior, int histogram_bins, boolean double_step);
    private static native long createSuperpixelSEEDS_1(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior, int histogram_bins);
    private static native long createSuperpixelSEEDS_2(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior);
    private static native long createSuperpixelSEEDS_3(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels);

    // C++:  Ptr_SuperpixelSLIC cv::ximgproc::createSuperpixelSLIC(Mat image, int algorithm = SLICO, int region_size = 10, float ruler = 10.0f)
    private static native long createSuperpixelSLIC_0(long image_nativeObj, int algorithm, int region_size, float ruler);
    private static native long createSuperpixelSLIC_1(long image_nativeObj, int algorithm, int region_size);
    private static native long createSuperpixelSLIC_2(long image_nativeObj, int algorithm);
    private static native long createSuperpixelSLIC_3(long image_nativeObj);

    // C++:  void cv::ximgproc::FastHoughTransform(Mat src, Mat& dst, int dstMatDepth, int angleRange = ARO_315_135, int op = FHT_ADD, int makeSkew = HDO_DESKEW)
    private static native void FastHoughTransform_0(long src_nativeObj, long dst_nativeObj, int dstMatDepth, int angleRange, int op, int makeSkew);
    private static native void FastHoughTransform_1(long src_nativeObj, long dst_nativeObj, int dstMatDepth, int angleRange, int op);
    private static native void FastHoughTransform_2(long src_nativeObj, long dst_nativeObj, int dstMatDepth, int angleRange);
    private static native void FastHoughTransform_3(long src_nativeObj, long dst_nativeObj, int dstMatDepth);

    // C++:  void cv::ximgproc::GradientDericheX(Mat op, Mat& dst, double alpha, double omega)
    private static native void GradientDericheX_0(long op_nativeObj, long dst_nativeObj, double alpha, double omega);

    // C++:  void cv::ximgproc::GradientDericheY(Mat op, Mat& dst, double alpha, double omega)
    private static native void GradientDericheY_0(long op_nativeObj, long dst_nativeObj, double alpha, double omega);

    // C++:  void cv::ximgproc::PeiLinNormalization(Mat I, Mat& T)
    private static native void PeiLinNormalization_0(long I_nativeObj, long T_nativeObj);

    // C++:  void cv::ximgproc::amFilter(Mat joint, Mat src, Mat& dst, double sigma_s, double sigma_r, bool adjust_outliers = false)
    private static native void amFilter_0(long joint_nativeObj, long src_nativeObj, long dst_nativeObj, double sigma_s, double sigma_r, boolean adjust_outliers);
    private static native void amFilter_1(long joint_nativeObj, long src_nativeObj, long dst_nativeObj, double sigma_s, double sigma_r);

    // C++:  void cv::ximgproc::anisotropicDiffusion(Mat src, Mat& dst, float alpha, float K, int niters)
    private static native void anisotropicDiffusion_0(long src_nativeObj, long dst_nativeObj, float alpha, float K, int niters);

    // C++:  void cv::ximgproc::bilateralTextureFilter(Mat src, Mat& dst, int fr = 3, int numIter = 1, double sigmaAlpha = -1., double sigmaAvg = -1.)
    private static native void bilateralTextureFilter_0(long src_nativeObj, long dst_nativeObj, int fr, int numIter, double sigmaAlpha, double sigmaAvg);
    private static native void bilateralTextureFilter_1(long src_nativeObj, long dst_nativeObj, int fr, int numIter, double sigmaAlpha);
    private static native void bilateralTextureFilter_2(long src_nativeObj, long dst_nativeObj, int fr, int numIter);
    private static native void bilateralTextureFilter_3(long src_nativeObj, long dst_nativeObj, int fr);
    private static native void bilateralTextureFilter_4(long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::colorMatchTemplate(Mat img, Mat templ, Mat& result)
    private static native void colorMatchTemplate_0(long img_nativeObj, long templ_nativeObj, long result_nativeObj);

    // C++:  void cv::ximgproc::contourSampling(Mat src, Mat& out, int nbElt)
    private static native void contourSampling_0(long src_nativeObj, long out_nativeObj, int nbElt);

    // C++:  void cv::ximgproc::covarianceEstimation(Mat src, Mat& dst, int windowRows, int windowCols)
    private static native void covarianceEstimation_0(long src_nativeObj, long dst_nativeObj, int windowRows, int windowCols);

    // C++:  void cv::ximgproc::createQuaternionImage(Mat img, Mat& qimg)
    private static native void createQuaternionImage_0(long img_nativeObj, long qimg_nativeObj);

    // C++:  void cv::ximgproc::dtFilter(Mat guide, Mat src, Mat& dst, double sigmaSpatial, double sigmaColor, int mode = DTF_NC, int numIters = 3)
    private static native void dtFilter_0(long guide_nativeObj, long src_nativeObj, long dst_nativeObj, double sigmaSpatial, double sigmaColor, int mode, int numIters);
    private static native void dtFilter_1(long guide_nativeObj, long src_nativeObj, long dst_nativeObj, double sigmaSpatial, double sigmaColor, int mode);
    private static native void dtFilter_2(long guide_nativeObj, long src_nativeObj, long dst_nativeObj, double sigmaSpatial, double sigmaColor);

    // C++:  void cv::ximgproc::edgePreservingFilter(Mat src, Mat& dst, int d, double threshold)
    private static native void edgePreservingFilter_0(long src_nativeObj, long dst_nativeObj, int d, double threshold);

    // C++:  void cv::ximgproc::fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat& dst, double sigma_spatial = 8, double sigma_luma = 8, double sigma_chroma = 8, double lambda = 128.0, int num_iter = 25, double max_tol = 1e-5)
    private static native void fastBilateralSolverFilter_0(long guide_nativeObj, long src_nativeObj, long confidence_nativeObj, long dst_nativeObj, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter, double max_tol);
    private static native void fastBilateralSolverFilter_1(long guide_nativeObj, long src_nativeObj, long confidence_nativeObj, long dst_nativeObj, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter);
    private static native void fastBilateralSolverFilter_2(long guide_nativeObj, long src_nativeObj, long confidence_nativeObj, long dst_nativeObj, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda);
    private static native void fastBilateralSolverFilter_3(long guide_nativeObj, long src_nativeObj, long confidence_nativeObj, long dst_nativeObj, double sigma_spatial, double sigma_luma, double sigma_chroma);
    private static native void fastBilateralSolverFilter_4(long guide_nativeObj, long src_nativeObj, long confidence_nativeObj, long dst_nativeObj, double sigma_spatial, double sigma_luma);
    private static native void fastBilateralSolverFilter_5(long guide_nativeObj, long src_nativeObj, long confidence_nativeObj, long dst_nativeObj, double sigma_spatial);
    private static native void fastBilateralSolverFilter_6(long guide_nativeObj, long src_nativeObj, long confidence_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::fastGlobalSmootherFilter(Mat guide, Mat src, Mat& dst, double lambda, double sigma_color, double lambda_attenuation = 0.25, int num_iter = 3)
    private static native void fastGlobalSmootherFilter_0(long guide_nativeObj, long src_nativeObj, long dst_nativeObj, double lambda, double sigma_color, double lambda_attenuation, int num_iter);
    private static native void fastGlobalSmootherFilter_1(long guide_nativeObj, long src_nativeObj, long dst_nativeObj, double lambda, double sigma_color, double lambda_attenuation);
    private static native void fastGlobalSmootherFilter_2(long guide_nativeObj, long src_nativeObj, long dst_nativeObj, double lambda, double sigma_color);

    // C++:  void cv::ximgproc::fourierDescriptor(Mat src, Mat& dst, int nbElt = -1, int nbFD = -1)
    private static native void fourierDescriptor_0(long src_nativeObj, long dst_nativeObj, int nbElt, int nbFD);
    private static native void fourierDescriptor_1(long src_nativeObj, long dst_nativeObj, int nbElt);
    private static native void fourierDescriptor_2(long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::guidedFilter(Mat guide, Mat src, Mat& dst, int radius, double eps, int dDepth = -1)
    private static native void guidedFilter_0(long guide_nativeObj, long src_nativeObj, long dst_nativeObj, int radius, double eps, int dDepth);
    private static native void guidedFilter_1(long guide_nativeObj, long src_nativeObj, long dst_nativeObj, int radius, double eps);

    // C++:  void cv::ximgproc::jointBilateralFilter(Mat joint, Mat src, Mat& dst, int d, double sigmaColor, double sigmaSpace, int borderType = BORDER_DEFAULT)
    private static native void jointBilateralFilter_0(long joint_nativeObj, long src_nativeObj, long dst_nativeObj, int d, double sigmaColor, double sigmaSpace, int borderType);
    private static native void jointBilateralFilter_1(long joint_nativeObj, long src_nativeObj, long dst_nativeObj, int d, double sigmaColor, double sigmaSpace);

    // C++:  void cv::ximgproc::l0Smooth(Mat src, Mat& dst, double lambda = 0.02, double kappa = 2.0)
    private static native void l0Smooth_0(long src_nativeObj, long dst_nativeObj, double lambda, double kappa);
    private static native void l0Smooth_1(long src_nativeObj, long dst_nativeObj, double lambda);
    private static native void l0Smooth_2(long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::niBlackThreshold(Mat _src, Mat& _dst, double maxValue, int type, int blockSize, double k, int binarizationMethod = BINARIZATION_NIBLACK)
    private static native void niBlackThreshold_0(long _src_nativeObj, long _dst_nativeObj, double maxValue, int type, int blockSize, double k, int binarizationMethod);
    private static native void niBlackThreshold_1(long _src_nativeObj, long _dst_nativeObj, double maxValue, int type, int blockSize, double k);

    // C++:  void cv::ximgproc::qconj(Mat qimg, Mat& qcimg)
    private static native void qconj_0(long qimg_nativeObj, long qcimg_nativeObj);

    // C++:  void cv::ximgproc::qdft(Mat img, Mat& qimg, int flags, bool sideLeft)
    private static native void qdft_0(long img_nativeObj, long qimg_nativeObj, int flags, boolean sideLeft);

    // C++:  void cv::ximgproc::qmultiply(Mat src1, Mat src2, Mat& dst)
    private static native void qmultiply_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::qunitary(Mat qimg, Mat& qnimg)
    private static native void qunitary_0(long qimg_nativeObj, long qnimg_nativeObj);

    // C++:  void cv::ximgproc::rollingGuidanceFilter(Mat src, Mat& dst, int d = -1, double sigmaColor = 25, double sigmaSpace = 3, int numOfIter = 4, int borderType = BORDER_DEFAULT)
    private static native void rollingGuidanceFilter_0(long src_nativeObj, long dst_nativeObj, int d, double sigmaColor, double sigmaSpace, int numOfIter, int borderType);
    private static native void rollingGuidanceFilter_1(long src_nativeObj, long dst_nativeObj, int d, double sigmaColor, double sigmaSpace, int numOfIter);
    private static native void rollingGuidanceFilter_2(long src_nativeObj, long dst_nativeObj, int d, double sigmaColor, double sigmaSpace);
    private static native void rollingGuidanceFilter_3(long src_nativeObj, long dst_nativeObj, int d, double sigmaColor);
    private static native void rollingGuidanceFilter_4(long src_nativeObj, long dst_nativeObj, int d);
    private static native void rollingGuidanceFilter_5(long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::thinning(Mat src, Mat& dst, int thinningType = THINNING_ZHANGSUEN)
    private static native void thinning_0(long src_nativeObj, long dst_nativeObj, int thinningType);
    private static native void thinning_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::transformFD(Mat src, Mat t, Mat& dst, bool fdContour = true)
    private static native void transformFD_0(long src_nativeObj, long t_nativeObj, long dst_nativeObj, boolean fdContour);
    private static native void transformFD_1(long src_nativeObj, long t_nativeObj, long dst_nativeObj);

    // C++:  void cv::ximgproc::weightedMedianFilter(Mat joint, Mat src, Mat& dst, int r, double sigma = 25.5, int weightType = WMF_EXP, Mat mask = Mat())
    private static native void weightedMedianFilter_0(long joint_nativeObj, long src_nativeObj, long dst_nativeObj, int r, double sigma, int weightType, long mask_nativeObj);
    private static native void weightedMedianFilter_1(long joint_nativeObj, long src_nativeObj, long dst_nativeObj, int r, double sigma, int weightType);
    private static native void weightedMedianFilter_2(long joint_nativeObj, long src_nativeObj, long dst_nativeObj, int r, double sigma);
    private static native void weightedMedianFilter_3(long joint_nativeObj, long src_nativeObj, long dst_nativeObj, int r);

}
