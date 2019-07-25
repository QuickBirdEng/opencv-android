//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import java.lang.String;
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
//javadoc: Ximgproc

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

    //javadoc: createAMFilter(sigma_s, sigma_r, adjust_outliers)
    public static AdaptiveManifoldFilter createAMFilter(double sigma_s, double sigma_r, boolean adjust_outliers)
    {
        
        AdaptiveManifoldFilter retVal = AdaptiveManifoldFilter.__fromPtr__(createAMFilter_0(sigma_s, sigma_r, adjust_outliers));
        
        return retVal;
    }

    //javadoc: createAMFilter(sigma_s, sigma_r)
    public static AdaptiveManifoldFilter createAMFilter(double sigma_s, double sigma_r)
    {
        
        AdaptiveManifoldFilter retVal = AdaptiveManifoldFilter.__fromPtr__(createAMFilter_1(sigma_s, sigma_r));
        
        return retVal;
    }


    //
    // C++:  Ptr_ContourFitting cv::ximgproc::createContourFitting(int ctr = 1024, int fd = 16)
    //

    //javadoc: createContourFitting(ctr, fd)
    public static ContourFitting createContourFitting(int ctr, int fd)
    {
        
        ContourFitting retVal = ContourFitting.__fromPtr__(createContourFitting_0(ctr, fd));
        
        return retVal;
    }

    //javadoc: createContourFitting(ctr)
    public static ContourFitting createContourFitting(int ctr)
    {
        
        ContourFitting retVal = ContourFitting.__fromPtr__(createContourFitting_1(ctr));
        
        return retVal;
    }

    //javadoc: createContourFitting()
    public static ContourFitting createContourFitting()
    {
        
        ContourFitting retVal = ContourFitting.__fromPtr__(createContourFitting_2());
        
        return retVal;
    }


    //
    // C++:  Ptr_DTFilter cv::ximgproc::createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor, int mode = DTF_NC, int numIters = 3)
    //

    //javadoc: createDTFilter(guide, sigmaSpatial, sigmaColor, mode, numIters)
    public static DTFilter createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor, int mode, int numIters)
    {
        
        DTFilter retVal = DTFilter.__fromPtr__(createDTFilter_0(guide.nativeObj, sigmaSpatial, sigmaColor, mode, numIters));
        
        return retVal;
    }

    //javadoc: createDTFilter(guide, sigmaSpatial, sigmaColor, mode)
    public static DTFilter createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor, int mode)
    {
        
        DTFilter retVal = DTFilter.__fromPtr__(createDTFilter_1(guide.nativeObj, sigmaSpatial, sigmaColor, mode));
        
        return retVal;
    }

    //javadoc: createDTFilter(guide, sigmaSpatial, sigmaColor)
    public static DTFilter createDTFilter(Mat guide, double sigmaSpatial, double sigmaColor)
    {
        
        DTFilter retVal = DTFilter.__fromPtr__(createDTFilter_2(guide.nativeObj, sigmaSpatial, sigmaColor));
        
        return retVal;
    }


    //
    // C++:  Ptr_DisparityWLSFilter cv::ximgproc::createDisparityWLSFilter(Ptr_StereoMatcher matcher_left)
    //

    //javadoc: createDisparityWLSFilter(matcher_left)
    public static DisparityWLSFilter createDisparityWLSFilter(StereoMatcher matcher_left)
    {
        
        DisparityWLSFilter retVal = DisparityWLSFilter.__fromPtr__(createDisparityWLSFilter_0(matcher_left.getNativeObjAddr()));
        
        return retVal;
    }


    //
    // C++:  Ptr_DisparityWLSFilter cv::ximgproc::createDisparityWLSFilterGeneric(bool use_confidence)
    //

    //javadoc: createDisparityWLSFilterGeneric(use_confidence)
    public static DisparityWLSFilter createDisparityWLSFilterGeneric(boolean use_confidence)
    {
        
        DisparityWLSFilter retVal = DisparityWLSFilter.__fromPtr__(createDisparityWLSFilterGeneric_0(use_confidence));
        
        return retVal;
    }


    //
    // C++:  Ptr_EdgeAwareInterpolator cv::ximgproc::createEdgeAwareInterpolator()
    //

    //javadoc: createEdgeAwareInterpolator()
    public static EdgeAwareInterpolator createEdgeAwareInterpolator()
    {
        
        EdgeAwareInterpolator retVal = EdgeAwareInterpolator.__fromPtr__(createEdgeAwareInterpolator_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_EdgeBoxes cv::ximgproc::createEdgeBoxes(float alpha = 0.65f, float beta = 0.75f, float eta = 1, float minScore = 0.01f, int maxBoxes = 10000, float edgeMinMag = 0.1f, float edgeMergeThr = 0.5f, float clusterMinMag = 0.5f, float maxAspectRatio = 3, float minBoxArea = 1000, float gamma = 2, float kappa = 1.5f)
    //

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea, gamma, kappa)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea, float gamma, float kappa)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_0(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea, gamma, kappa));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea, gamma)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea, float gamma)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_1(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea, gamma));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio, float minBoxArea)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_2(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio, minBoxArea));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag, float maxAspectRatio)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_3(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag, maxAspectRatio));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr, float clusterMinMag)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_4(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr, clusterMinMag));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag, float edgeMergeThr)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_5(alpha, beta, eta, minScore, maxBoxes, edgeMinMag, edgeMergeThr));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore, maxBoxes, edgeMinMag)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes, float edgeMinMag)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_6(alpha, beta, eta, minScore, maxBoxes, edgeMinMag));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore, maxBoxes)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore, int maxBoxes)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_7(alpha, beta, eta, minScore, maxBoxes));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta, minScore)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta, float minScore)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_8(alpha, beta, eta, minScore));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta, eta)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta, float eta)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_9(alpha, beta, eta));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha, beta)
    public static EdgeBoxes createEdgeBoxes(float alpha, float beta)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_10(alpha, beta));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes(alpha)
    public static EdgeBoxes createEdgeBoxes(float alpha)
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_11(alpha));
        
        return retVal;
    }

    //javadoc: createEdgeBoxes()
    public static EdgeBoxes createEdgeBoxes()
    {
        
        EdgeBoxes retVal = EdgeBoxes.__fromPtr__(createEdgeBoxes_12());
        
        return retVal;
    }


    //
    // C++:  Ptr_FastBilateralSolverFilter cv::ximgproc::createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda = 128.0, int num_iter = 25, double max_tol = 1e-5)
    //

    //javadoc: createFastBilateralSolverFilter(guide, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter, max_tol)
    public static FastBilateralSolverFilter createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter, double max_tol)
    {
        
        FastBilateralSolverFilter retVal = FastBilateralSolverFilter.__fromPtr__(createFastBilateralSolverFilter_0(guide.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter, max_tol));
        
        return retVal;
    }

    //javadoc: createFastBilateralSolverFilter(guide, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter)
    public static FastBilateralSolverFilter createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter)
    {
        
        FastBilateralSolverFilter retVal = FastBilateralSolverFilter.__fromPtr__(createFastBilateralSolverFilter_1(guide.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter));
        
        return retVal;
    }

    //javadoc: createFastBilateralSolverFilter(guide, sigma_spatial, sigma_luma, sigma_chroma, lambda)
    public static FastBilateralSolverFilter createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda)
    {
        
        FastBilateralSolverFilter retVal = FastBilateralSolverFilter.__fromPtr__(createFastBilateralSolverFilter_2(guide.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda));
        
        return retVal;
    }

    //javadoc: createFastBilateralSolverFilter(guide, sigma_spatial, sigma_luma, sigma_chroma)
    public static FastBilateralSolverFilter createFastBilateralSolverFilter(Mat guide, double sigma_spatial, double sigma_luma, double sigma_chroma)
    {
        
        FastBilateralSolverFilter retVal = FastBilateralSolverFilter.__fromPtr__(createFastBilateralSolverFilter_3(guide.nativeObj, sigma_spatial, sigma_luma, sigma_chroma));
        
        return retVal;
    }


    //
    // C++:  Ptr_FastGlobalSmootherFilter cv::ximgproc::createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color, double lambda_attenuation = 0.25, int num_iter = 3)
    //

    //javadoc: createFastGlobalSmootherFilter(guide, lambda, sigma_color, lambda_attenuation, num_iter)
    public static FastGlobalSmootherFilter createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color, double lambda_attenuation, int num_iter)
    {
        
        FastGlobalSmootherFilter retVal = FastGlobalSmootherFilter.__fromPtr__(createFastGlobalSmootherFilter_0(guide.nativeObj, lambda, sigma_color, lambda_attenuation, num_iter));
        
        return retVal;
    }

    //javadoc: createFastGlobalSmootherFilter(guide, lambda, sigma_color, lambda_attenuation)
    public static FastGlobalSmootherFilter createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color, double lambda_attenuation)
    {
        
        FastGlobalSmootherFilter retVal = FastGlobalSmootherFilter.__fromPtr__(createFastGlobalSmootherFilter_1(guide.nativeObj, lambda, sigma_color, lambda_attenuation));
        
        return retVal;
    }

    //javadoc: createFastGlobalSmootherFilter(guide, lambda, sigma_color)
    public static FastGlobalSmootherFilter createFastGlobalSmootherFilter(Mat guide, double lambda, double sigma_color)
    {
        
        FastGlobalSmootherFilter retVal = FastGlobalSmootherFilter.__fromPtr__(createFastGlobalSmootherFilter_2(guide.nativeObj, lambda, sigma_color));
        
        return retVal;
    }


    //
    // C++:  Ptr_FastLineDetector cv::ximgproc::createFastLineDetector(int _length_threshold = 10, float _distance_threshold = 1.414213562f, double _canny_th1 = 50.0, double _canny_th2 = 50.0, int _canny_aperture_size = 3, bool _do_merge = false)
    //

    //javadoc: createFastLineDetector(_length_threshold, _distance_threshold, _canny_th1, _canny_th2, _canny_aperture_size, _do_merge)
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2, int _canny_aperture_size, boolean _do_merge)
    {
        
        FastLineDetector retVal = FastLineDetector.__fromPtr__(createFastLineDetector_0(_length_threshold, _distance_threshold, _canny_th1, _canny_th2, _canny_aperture_size, _do_merge));
        
        return retVal;
    }

    //javadoc: createFastLineDetector(_length_threshold, _distance_threshold, _canny_th1, _canny_th2, _canny_aperture_size)
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2, int _canny_aperture_size)
    {
        
        FastLineDetector retVal = FastLineDetector.__fromPtr__(createFastLineDetector_1(_length_threshold, _distance_threshold, _canny_th1, _canny_th2, _canny_aperture_size));
        
        return retVal;
    }

    //javadoc: createFastLineDetector(_length_threshold, _distance_threshold, _canny_th1, _canny_th2)
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold, double _canny_th1, double _canny_th2)
    {
        
        FastLineDetector retVal = FastLineDetector.__fromPtr__(createFastLineDetector_2(_length_threshold, _distance_threshold, _canny_th1, _canny_th2));
        
        return retVal;
    }

    //javadoc: createFastLineDetector(_length_threshold, _distance_threshold, _canny_th1)
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold, double _canny_th1)
    {
        
        FastLineDetector retVal = FastLineDetector.__fromPtr__(createFastLineDetector_3(_length_threshold, _distance_threshold, _canny_th1));
        
        return retVal;
    }

    //javadoc: createFastLineDetector(_length_threshold, _distance_threshold)
    public static FastLineDetector createFastLineDetector(int _length_threshold, float _distance_threshold)
    {
        
        FastLineDetector retVal = FastLineDetector.__fromPtr__(createFastLineDetector_4(_length_threshold, _distance_threshold));
        
        return retVal;
    }

    //javadoc: createFastLineDetector(_length_threshold)
    public static FastLineDetector createFastLineDetector(int _length_threshold)
    {
        
        FastLineDetector retVal = FastLineDetector.__fromPtr__(createFastLineDetector_5(_length_threshold));
        
        return retVal;
    }

    //javadoc: createFastLineDetector()
    public static FastLineDetector createFastLineDetector()
    {
        
        FastLineDetector retVal = FastLineDetector.__fromPtr__(createFastLineDetector_6());
        
        return retVal;
    }


    //
    // C++:  Ptr_GraphSegmentation cv::ximgproc::segmentation::createGraphSegmentation(double sigma = 0.5, float k = 300, int min_size = 100)
    //

    //javadoc: createGraphSegmentation(sigma, k, min_size)
    public static GraphSegmentation createGraphSegmentation(double sigma, float k, int min_size)
    {
        
        GraphSegmentation retVal = GraphSegmentation.__fromPtr__(createGraphSegmentation_0(sigma, k, min_size));
        
        return retVal;
    }

    //javadoc: createGraphSegmentation(sigma, k)
    public static GraphSegmentation createGraphSegmentation(double sigma, float k)
    {
        
        GraphSegmentation retVal = GraphSegmentation.__fromPtr__(createGraphSegmentation_1(sigma, k));
        
        return retVal;
    }

    //javadoc: createGraphSegmentation(sigma)
    public static GraphSegmentation createGraphSegmentation(double sigma)
    {
        
        GraphSegmentation retVal = GraphSegmentation.__fromPtr__(createGraphSegmentation_2(sigma));
        
        return retVal;
    }

    //javadoc: createGraphSegmentation()
    public static GraphSegmentation createGraphSegmentation()
    {
        
        GraphSegmentation retVal = GraphSegmentation.__fromPtr__(createGraphSegmentation_3());
        
        return retVal;
    }


    //
    // C++:  Ptr_GuidedFilter cv::ximgproc::createGuidedFilter(Mat guide, int radius, double eps)
    //

    //javadoc: createGuidedFilter(guide, radius, eps)
    public static GuidedFilter createGuidedFilter(Mat guide, int radius, double eps)
    {
        
        GuidedFilter retVal = GuidedFilter.__fromPtr__(createGuidedFilter_0(guide.nativeObj, radius, eps));
        
        return retVal;
    }


    //
    // C++:  Ptr_RFFeatureGetter cv::ximgproc::createRFFeatureGetter()
    //

    //javadoc: createRFFeatureGetter()
    public static RFFeatureGetter createRFFeatureGetter()
    {
        
        RFFeatureGetter retVal = RFFeatureGetter.__fromPtr__(createRFFeatureGetter_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentation cv::ximgproc::segmentation::createSelectiveSearchSegmentation()
    //

    //javadoc: createSelectiveSearchSegmentation()
    public static SelectiveSearchSegmentation createSelectiveSearchSegmentation()
    {
        
        SelectiveSearchSegmentation retVal = SelectiveSearchSegmentation.__fromPtr__(createSelectiveSearchSegmentation_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyColor cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyColor()
    //

    //javadoc: createSelectiveSearchSegmentationStrategyColor()
    public static SelectiveSearchSegmentationStrategyColor createSelectiveSearchSegmentationStrategyColor()
    {
        
        SelectiveSearchSegmentationStrategyColor retVal = SelectiveSearchSegmentationStrategyColor.__fromPtr__(createSelectiveSearchSegmentationStrategyColor_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyFill cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyFill()
    //

    //javadoc: createSelectiveSearchSegmentationStrategyFill()
    public static SelectiveSearchSegmentationStrategyFill createSelectiveSearchSegmentationStrategyFill()
    {
        
        SelectiveSearchSegmentationStrategyFill retVal = SelectiveSearchSegmentationStrategyFill.__fromPtr__(createSelectiveSearchSegmentationStrategyFill_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2, Ptr_SelectiveSearchSegmentationStrategy s3, Ptr_SelectiveSearchSegmentationStrategy s4)
    //

    //javadoc: createSelectiveSearchSegmentationStrategyMultiple(s1, s2, s3, s4)
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple(SelectiveSearchSegmentationStrategy s1, SelectiveSearchSegmentationStrategy s2, SelectiveSearchSegmentationStrategy s3, SelectiveSearchSegmentationStrategy s4)
    {
        
        SelectiveSearchSegmentationStrategyMultiple retVal = SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_0(s1.getNativeObjAddr(), s2.getNativeObjAddr(), s3.getNativeObjAddr(), s4.getNativeObjAddr()));
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2, Ptr_SelectiveSearchSegmentationStrategy s3)
    //

    //javadoc: createSelectiveSearchSegmentationStrategyMultiple(s1, s2, s3)
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple(SelectiveSearchSegmentationStrategy s1, SelectiveSearchSegmentationStrategy s2, SelectiveSearchSegmentationStrategy s3)
    {
        
        SelectiveSearchSegmentationStrategyMultiple retVal = SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_1(s1.getNativeObjAddr(), s2.getNativeObjAddr(), s3.getNativeObjAddr()));
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1, Ptr_SelectiveSearchSegmentationStrategy s2)
    //

    //javadoc: createSelectiveSearchSegmentationStrategyMultiple(s1, s2)
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple(SelectiveSearchSegmentationStrategy s1, SelectiveSearchSegmentationStrategy s2)
    {
        
        SelectiveSearchSegmentationStrategyMultiple retVal = SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_2(s1.getNativeObjAddr(), s2.getNativeObjAddr()));
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple(Ptr_SelectiveSearchSegmentationStrategy s1)
    //

    //javadoc: createSelectiveSearchSegmentationStrategyMultiple(s1)
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple(SelectiveSearchSegmentationStrategy s1)
    {
        
        SelectiveSearchSegmentationStrategyMultiple retVal = SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_3(s1.getNativeObjAddr()));
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyMultiple cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyMultiple()
    //

    //javadoc: createSelectiveSearchSegmentationStrategyMultiple()
    public static SelectiveSearchSegmentationStrategyMultiple createSelectiveSearchSegmentationStrategyMultiple()
    {
        
        SelectiveSearchSegmentationStrategyMultiple retVal = SelectiveSearchSegmentationStrategyMultiple.__fromPtr__(createSelectiveSearchSegmentationStrategyMultiple_4());
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategySize cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategySize()
    //

    //javadoc: createSelectiveSearchSegmentationStrategySize()
    public static SelectiveSearchSegmentationStrategySize createSelectiveSearchSegmentationStrategySize()
    {
        
        SelectiveSearchSegmentationStrategySize retVal = SelectiveSearchSegmentationStrategySize.__fromPtr__(createSelectiveSearchSegmentationStrategySize_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_SelectiveSearchSegmentationStrategyTexture cv::ximgproc::segmentation::createSelectiveSearchSegmentationStrategyTexture()
    //

    //javadoc: createSelectiveSearchSegmentationStrategyTexture()
    public static SelectiveSearchSegmentationStrategyTexture createSelectiveSearchSegmentationStrategyTexture()
    {
        
        SelectiveSearchSegmentationStrategyTexture retVal = SelectiveSearchSegmentationStrategyTexture.__fromPtr__(createSelectiveSearchSegmentationStrategyTexture_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_StereoMatcher cv::ximgproc::createRightMatcher(Ptr_StereoMatcher matcher_left)
    //

    //javadoc: createRightMatcher(matcher_left)
    public static StereoMatcher createRightMatcher(StereoMatcher matcher_left)
    {
        
        StereoMatcher retVal = StereoMatcher.__fromPtr__(createRightMatcher_0(matcher_left.getNativeObjAddr()));
        
        return retVal;
    }


    //
    // C++:  Ptr_StructuredEdgeDetection cv::ximgproc::createStructuredEdgeDetection(String model, Ptr_RFFeatureGetter howToGetFeatures = Ptr<RFFeatureGetter>())
    //

    //javadoc: createStructuredEdgeDetection(model, howToGetFeatures)
    public static StructuredEdgeDetection createStructuredEdgeDetection(String model, RFFeatureGetter howToGetFeatures)
    {
        
        StructuredEdgeDetection retVal = StructuredEdgeDetection.__fromPtr__(createStructuredEdgeDetection_0(model, howToGetFeatures.getNativeObjAddr()));
        
        return retVal;
    }

    //javadoc: createStructuredEdgeDetection(model)
    public static StructuredEdgeDetection createStructuredEdgeDetection(String model)
    {
        
        StructuredEdgeDetection retVal = StructuredEdgeDetection.__fromPtr__(createStructuredEdgeDetection_1(model));
        
        return retVal;
    }


    //
    // C++:  Ptr_SuperpixelLSC cv::ximgproc::createSuperpixelLSC(Mat image, int region_size = 10, float ratio = 0.075f)
    //

    //javadoc: createSuperpixelLSC(image, region_size, ratio)
    public static SuperpixelLSC createSuperpixelLSC(Mat image, int region_size, float ratio)
    {
        
        SuperpixelLSC retVal = SuperpixelLSC.__fromPtr__(createSuperpixelLSC_0(image.nativeObj, region_size, ratio));
        
        return retVal;
    }

    //javadoc: createSuperpixelLSC(image, region_size)
    public static SuperpixelLSC createSuperpixelLSC(Mat image, int region_size)
    {
        
        SuperpixelLSC retVal = SuperpixelLSC.__fromPtr__(createSuperpixelLSC_1(image.nativeObj, region_size));
        
        return retVal;
    }

    //javadoc: createSuperpixelLSC(image)
    public static SuperpixelLSC createSuperpixelLSC(Mat image)
    {
        
        SuperpixelLSC retVal = SuperpixelLSC.__fromPtr__(createSuperpixelLSC_2(image.nativeObj));
        
        return retVal;
    }


    //
    // C++:  Ptr_SuperpixelSEEDS cv::ximgproc::createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior = 2, int histogram_bins = 5, bool double_step = false)
    //

    //javadoc: createSuperpixelSEEDS(image_width, image_height, image_channels, num_superpixels, num_levels, prior, histogram_bins, double_step)
    public static SuperpixelSEEDS createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior, int histogram_bins, boolean double_step)
    {
        
        SuperpixelSEEDS retVal = SuperpixelSEEDS.__fromPtr__(createSuperpixelSEEDS_0(image_width, image_height, image_channels, num_superpixels, num_levels, prior, histogram_bins, double_step));
        
        return retVal;
    }

    //javadoc: createSuperpixelSEEDS(image_width, image_height, image_channels, num_superpixels, num_levels, prior, histogram_bins)
    public static SuperpixelSEEDS createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior, int histogram_bins)
    {
        
        SuperpixelSEEDS retVal = SuperpixelSEEDS.__fromPtr__(createSuperpixelSEEDS_1(image_width, image_height, image_channels, num_superpixels, num_levels, prior, histogram_bins));
        
        return retVal;
    }

    //javadoc: createSuperpixelSEEDS(image_width, image_height, image_channels, num_superpixels, num_levels, prior)
    public static SuperpixelSEEDS createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels, int prior)
    {
        
        SuperpixelSEEDS retVal = SuperpixelSEEDS.__fromPtr__(createSuperpixelSEEDS_2(image_width, image_height, image_channels, num_superpixels, num_levels, prior));
        
        return retVal;
    }

    //javadoc: createSuperpixelSEEDS(image_width, image_height, image_channels, num_superpixels, num_levels)
    public static SuperpixelSEEDS createSuperpixelSEEDS(int image_width, int image_height, int image_channels, int num_superpixels, int num_levels)
    {
        
        SuperpixelSEEDS retVal = SuperpixelSEEDS.__fromPtr__(createSuperpixelSEEDS_3(image_width, image_height, image_channels, num_superpixels, num_levels));
        
        return retVal;
    }


    //
    // C++:  Ptr_SuperpixelSLIC cv::ximgproc::createSuperpixelSLIC(Mat image, int algorithm = SLICO, int region_size = 10, float ruler = 10.0f)
    //

    //javadoc: createSuperpixelSLIC(image, algorithm, region_size, ruler)
    public static SuperpixelSLIC createSuperpixelSLIC(Mat image, int algorithm, int region_size, float ruler)
    {
        
        SuperpixelSLIC retVal = SuperpixelSLIC.__fromPtr__(createSuperpixelSLIC_0(image.nativeObj, algorithm, region_size, ruler));
        
        return retVal;
    }

    //javadoc: createSuperpixelSLIC(image, algorithm, region_size)
    public static SuperpixelSLIC createSuperpixelSLIC(Mat image, int algorithm, int region_size)
    {
        
        SuperpixelSLIC retVal = SuperpixelSLIC.__fromPtr__(createSuperpixelSLIC_1(image.nativeObj, algorithm, region_size));
        
        return retVal;
    }

    //javadoc: createSuperpixelSLIC(image, algorithm)
    public static SuperpixelSLIC createSuperpixelSLIC(Mat image, int algorithm)
    {
        
        SuperpixelSLIC retVal = SuperpixelSLIC.__fromPtr__(createSuperpixelSLIC_2(image.nativeObj, algorithm));
        
        return retVal;
    }

    //javadoc: createSuperpixelSLIC(image)
    public static SuperpixelSLIC createSuperpixelSLIC(Mat image)
    {
        
        SuperpixelSLIC retVal = SuperpixelSLIC.__fromPtr__(createSuperpixelSLIC_3(image.nativeObj));
        
        return retVal;
    }


    //
    // C++:  Vec4i cv::ximgproc::HoughPoint2Line(Point houghPoint, Mat srcImgInfo, int angleRange = ARO_315_135, int makeSkew = HDO_DESKEW, int rules = RO_IGNORE_BORDERS)
    //

    // Return type 'Vec4i' is not supported, skipping the function


    //
    // C++:  void cv::ximgproc::FastHoughTransform(Mat src, Mat& dst, int dstMatDepth, int angleRange = ARO_315_135, int op = FHT_ADD, int makeSkew = HDO_DESKEW)
    //

    //javadoc: FastHoughTransform(src, dst, dstMatDepth, angleRange, op, makeSkew)
    public static void FastHoughTransform(Mat src, Mat dst, int dstMatDepth, int angleRange, int op, int makeSkew)
    {
        
        FastHoughTransform_0(src.nativeObj, dst.nativeObj, dstMatDepth, angleRange, op, makeSkew);
        
        return;
    }

    //javadoc: FastHoughTransform(src, dst, dstMatDepth, angleRange, op)
    public static void FastHoughTransform(Mat src, Mat dst, int dstMatDepth, int angleRange, int op)
    {
        
        FastHoughTransform_1(src.nativeObj, dst.nativeObj, dstMatDepth, angleRange, op);
        
        return;
    }

    //javadoc: FastHoughTransform(src, dst, dstMatDepth, angleRange)
    public static void FastHoughTransform(Mat src, Mat dst, int dstMatDepth, int angleRange)
    {
        
        FastHoughTransform_2(src.nativeObj, dst.nativeObj, dstMatDepth, angleRange);
        
        return;
    }

    //javadoc: FastHoughTransform(src, dst, dstMatDepth)
    public static void FastHoughTransform(Mat src, Mat dst, int dstMatDepth)
    {
        
        FastHoughTransform_3(src.nativeObj, dst.nativeObj, dstMatDepth);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::GradientDericheX(Mat op, Mat& dst, double alpha, double omega)
    //

    //javadoc: GradientDericheX(op, dst, alpha, omega)
    public static void GradientDericheX(Mat op, Mat dst, double alpha, double omega)
    {
        
        GradientDericheX_0(op.nativeObj, dst.nativeObj, alpha, omega);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::GradientDericheY(Mat op, Mat& dst, double alpha, double omega)
    //

    //javadoc: GradientDericheY(op, dst, alpha, omega)
    public static void GradientDericheY(Mat op, Mat dst, double alpha, double omega)
    {
        
        GradientDericheY_0(op.nativeObj, dst.nativeObj, alpha, omega);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::PeiLinNormalization(Mat I, Mat& T)
    //

    //javadoc: PeiLinNormalization(I, T)
    public static void PeiLinNormalization(Mat I, Mat T)
    {
        
        PeiLinNormalization_0(I.nativeObj, T.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::amFilter(Mat joint, Mat src, Mat& dst, double sigma_s, double sigma_r, bool adjust_outliers = false)
    //

    //javadoc: amFilter(joint, src, dst, sigma_s, sigma_r, adjust_outliers)
    public static void amFilter(Mat joint, Mat src, Mat dst, double sigma_s, double sigma_r, boolean adjust_outliers)
    {
        
        amFilter_0(joint.nativeObj, src.nativeObj, dst.nativeObj, sigma_s, sigma_r, adjust_outliers);
        
        return;
    }

    //javadoc: amFilter(joint, src, dst, sigma_s, sigma_r)
    public static void amFilter(Mat joint, Mat src, Mat dst, double sigma_s, double sigma_r)
    {
        
        amFilter_1(joint.nativeObj, src.nativeObj, dst.nativeObj, sigma_s, sigma_r);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::anisotropicDiffusion(Mat src, Mat& dst, float alpha, float K, int niters)
    //

    //javadoc: anisotropicDiffusion(src, dst, alpha, K, niters)
    public static void anisotropicDiffusion(Mat src, Mat dst, float alpha, float K, int niters)
    {
        
        anisotropicDiffusion_0(src.nativeObj, dst.nativeObj, alpha, K, niters);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::bilateralTextureFilter(Mat src, Mat& dst, int fr = 3, int numIter = 1, double sigmaAlpha = -1., double sigmaAvg = -1.)
    //

    //javadoc: bilateralTextureFilter(src, dst, fr, numIter, sigmaAlpha, sigmaAvg)
    public static void bilateralTextureFilter(Mat src, Mat dst, int fr, int numIter, double sigmaAlpha, double sigmaAvg)
    {
        
        bilateralTextureFilter_0(src.nativeObj, dst.nativeObj, fr, numIter, sigmaAlpha, sigmaAvg);
        
        return;
    }

    //javadoc: bilateralTextureFilter(src, dst, fr, numIter, sigmaAlpha)
    public static void bilateralTextureFilter(Mat src, Mat dst, int fr, int numIter, double sigmaAlpha)
    {
        
        bilateralTextureFilter_1(src.nativeObj, dst.nativeObj, fr, numIter, sigmaAlpha);
        
        return;
    }

    //javadoc: bilateralTextureFilter(src, dst, fr, numIter)
    public static void bilateralTextureFilter(Mat src, Mat dst, int fr, int numIter)
    {
        
        bilateralTextureFilter_2(src.nativeObj, dst.nativeObj, fr, numIter);
        
        return;
    }

    //javadoc: bilateralTextureFilter(src, dst, fr)
    public static void bilateralTextureFilter(Mat src, Mat dst, int fr)
    {
        
        bilateralTextureFilter_3(src.nativeObj, dst.nativeObj, fr);
        
        return;
    }

    //javadoc: bilateralTextureFilter(src, dst)
    public static void bilateralTextureFilter(Mat src, Mat dst)
    {
        
        bilateralTextureFilter_4(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::colorMatchTemplate(Mat img, Mat templ, Mat& result)
    //

    //javadoc: colorMatchTemplate(img, templ, result)
    public static void colorMatchTemplate(Mat img, Mat templ, Mat result)
    {
        
        colorMatchTemplate_0(img.nativeObj, templ.nativeObj, result.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::contourSampling(Mat src, Mat& out, int nbElt)
    //

    //javadoc: contourSampling(src, out, nbElt)
    public static void contourSampling(Mat src, Mat out, int nbElt)
    {
        
        contourSampling_0(src.nativeObj, out.nativeObj, nbElt);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::covarianceEstimation(Mat src, Mat& dst, int windowRows, int windowCols)
    //

    //javadoc: covarianceEstimation(src, dst, windowRows, windowCols)
    public static void covarianceEstimation(Mat src, Mat dst, int windowRows, int windowCols)
    {
        
        covarianceEstimation_0(src.nativeObj, dst.nativeObj, windowRows, windowCols);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::createQuaternionImage(Mat img, Mat& qimg)
    //

    //javadoc: createQuaternionImage(img, qimg)
    public static void createQuaternionImage(Mat img, Mat qimg)
    {
        
        createQuaternionImage_0(img.nativeObj, qimg.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::dtFilter(Mat guide, Mat src, Mat& dst, double sigmaSpatial, double sigmaColor, int mode = DTF_NC, int numIters = 3)
    //

    //javadoc: dtFilter(guide, src, dst, sigmaSpatial, sigmaColor, mode, numIters)
    public static void dtFilter(Mat guide, Mat src, Mat dst, double sigmaSpatial, double sigmaColor, int mode, int numIters)
    {
        
        dtFilter_0(guide.nativeObj, src.nativeObj, dst.nativeObj, sigmaSpatial, sigmaColor, mode, numIters);
        
        return;
    }

    //javadoc: dtFilter(guide, src, dst, sigmaSpatial, sigmaColor, mode)
    public static void dtFilter(Mat guide, Mat src, Mat dst, double sigmaSpatial, double sigmaColor, int mode)
    {
        
        dtFilter_1(guide.nativeObj, src.nativeObj, dst.nativeObj, sigmaSpatial, sigmaColor, mode);
        
        return;
    }

    //javadoc: dtFilter(guide, src, dst, sigmaSpatial, sigmaColor)
    public static void dtFilter(Mat guide, Mat src, Mat dst, double sigmaSpatial, double sigmaColor)
    {
        
        dtFilter_2(guide.nativeObj, src.nativeObj, dst.nativeObj, sigmaSpatial, sigmaColor);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::edgePreservingFilter(Mat src, Mat& dst, int d, double threshold)
    //

    //javadoc: edgePreservingFilter(src, dst, d, threshold)
    public static void edgePreservingFilter(Mat src, Mat dst, int d, double threshold)
    {
        
        edgePreservingFilter_0(src.nativeObj, dst.nativeObj, d, threshold);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat& dst, double sigma_spatial = 8, double sigma_luma = 8, double sigma_chroma = 8, double lambda = 128.0, int num_iter = 25, double max_tol = 1e-5)
    //

    //javadoc: fastBilateralSolverFilter(guide, src, confidence, dst, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter, max_tol)
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter, double max_tol)
    {
        
        fastBilateralSolverFilter_0(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter, max_tol);
        
        return;
    }

    //javadoc: fastBilateralSolverFilter(guide, src, confidence, dst, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter)
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda, int num_iter)
    {
        
        fastBilateralSolverFilter_1(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda, num_iter);
        
        return;
    }

    //javadoc: fastBilateralSolverFilter(guide, src, confidence, dst, sigma_spatial, sigma_luma, sigma_chroma, lambda)
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma, double sigma_chroma, double lambda)
    {
        
        fastBilateralSolverFilter_2(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma, sigma_chroma, lambda);
        
        return;
    }

    //javadoc: fastBilateralSolverFilter(guide, src, confidence, dst, sigma_spatial, sigma_luma, sigma_chroma)
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma, double sigma_chroma)
    {
        
        fastBilateralSolverFilter_3(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma, sigma_chroma);
        
        return;
    }

    //javadoc: fastBilateralSolverFilter(guide, src, confidence, dst, sigma_spatial, sigma_luma)
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial, double sigma_luma)
    {
        
        fastBilateralSolverFilter_4(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial, sigma_luma);
        
        return;
    }

    //javadoc: fastBilateralSolverFilter(guide, src, confidence, dst, sigma_spatial)
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst, double sigma_spatial)
    {
        
        fastBilateralSolverFilter_5(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj, sigma_spatial);
        
        return;
    }

    //javadoc: fastBilateralSolverFilter(guide, src, confidence, dst)
    public static void fastBilateralSolverFilter(Mat guide, Mat src, Mat confidence, Mat dst)
    {
        
        fastBilateralSolverFilter_6(guide.nativeObj, src.nativeObj, confidence.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::fastGlobalSmootherFilter(Mat guide, Mat src, Mat& dst, double lambda, double sigma_color, double lambda_attenuation = 0.25, int num_iter = 3)
    //

    //javadoc: fastGlobalSmootherFilter(guide, src, dst, lambda, sigma_color, lambda_attenuation, num_iter)
    public static void fastGlobalSmootherFilter(Mat guide, Mat src, Mat dst, double lambda, double sigma_color, double lambda_attenuation, int num_iter)
    {
        
        fastGlobalSmootherFilter_0(guide.nativeObj, src.nativeObj, dst.nativeObj, lambda, sigma_color, lambda_attenuation, num_iter);
        
        return;
    }

    //javadoc: fastGlobalSmootherFilter(guide, src, dst, lambda, sigma_color, lambda_attenuation)
    public static void fastGlobalSmootherFilter(Mat guide, Mat src, Mat dst, double lambda, double sigma_color, double lambda_attenuation)
    {
        
        fastGlobalSmootherFilter_1(guide.nativeObj, src.nativeObj, dst.nativeObj, lambda, sigma_color, lambda_attenuation);
        
        return;
    }

    //javadoc: fastGlobalSmootherFilter(guide, src, dst, lambda, sigma_color)
    public static void fastGlobalSmootherFilter(Mat guide, Mat src, Mat dst, double lambda, double sigma_color)
    {
        
        fastGlobalSmootherFilter_2(guide.nativeObj, src.nativeObj, dst.nativeObj, lambda, sigma_color);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::fourierDescriptor(Mat src, Mat& dst, int nbElt = -1, int nbFD = -1)
    //

    //javadoc: fourierDescriptor(src, dst, nbElt, nbFD)
    public static void fourierDescriptor(Mat src, Mat dst, int nbElt, int nbFD)
    {
        
        fourierDescriptor_0(src.nativeObj, dst.nativeObj, nbElt, nbFD);
        
        return;
    }

    //javadoc: fourierDescriptor(src, dst, nbElt)
    public static void fourierDescriptor(Mat src, Mat dst, int nbElt)
    {
        
        fourierDescriptor_1(src.nativeObj, dst.nativeObj, nbElt);
        
        return;
    }

    //javadoc: fourierDescriptor(src, dst)
    public static void fourierDescriptor(Mat src, Mat dst)
    {
        
        fourierDescriptor_2(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::guidedFilter(Mat guide, Mat src, Mat& dst, int radius, double eps, int dDepth = -1)
    //

    //javadoc: guidedFilter(guide, src, dst, radius, eps, dDepth)
    public static void guidedFilter(Mat guide, Mat src, Mat dst, int radius, double eps, int dDepth)
    {
        
        guidedFilter_0(guide.nativeObj, src.nativeObj, dst.nativeObj, radius, eps, dDepth);
        
        return;
    }

    //javadoc: guidedFilter(guide, src, dst, radius, eps)
    public static void guidedFilter(Mat guide, Mat src, Mat dst, int radius, double eps)
    {
        
        guidedFilter_1(guide.nativeObj, src.nativeObj, dst.nativeObj, radius, eps);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::jointBilateralFilter(Mat joint, Mat src, Mat& dst, int d, double sigmaColor, double sigmaSpace, int borderType = BORDER_DEFAULT)
    //

    //javadoc: jointBilateralFilter(joint, src, dst, d, sigmaColor, sigmaSpace, borderType)
    public static void jointBilateralFilter(Mat joint, Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace, int borderType)
    {
        
        jointBilateralFilter_0(joint.nativeObj, src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace, borderType);
        
        return;
    }

    //javadoc: jointBilateralFilter(joint, src, dst, d, sigmaColor, sigmaSpace)
    public static void jointBilateralFilter(Mat joint, Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace)
    {
        
        jointBilateralFilter_1(joint.nativeObj, src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::l0Smooth(Mat src, Mat& dst, double lambda = 0.02, double kappa = 2.0)
    //

    //javadoc: l0Smooth(src, dst, lambda, kappa)
    public static void l0Smooth(Mat src, Mat dst, double lambda, double kappa)
    {
        
        l0Smooth_0(src.nativeObj, dst.nativeObj, lambda, kappa);
        
        return;
    }

    //javadoc: l0Smooth(src, dst, lambda)
    public static void l0Smooth(Mat src, Mat dst, double lambda)
    {
        
        l0Smooth_1(src.nativeObj, dst.nativeObj, lambda);
        
        return;
    }

    //javadoc: l0Smooth(src, dst)
    public static void l0Smooth(Mat src, Mat dst)
    {
        
        l0Smooth_2(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::niBlackThreshold(Mat _src, Mat& _dst, double maxValue, int type, int blockSize, double k, int binarizationMethod = BINARIZATION_NIBLACK)
    //

    //javadoc: niBlackThreshold(_src, _dst, maxValue, type, blockSize, k, binarizationMethod)
    public static void niBlackThreshold(Mat _src, Mat _dst, double maxValue, int type, int blockSize, double k, int binarizationMethod)
    {
        
        niBlackThreshold_0(_src.nativeObj, _dst.nativeObj, maxValue, type, blockSize, k, binarizationMethod);
        
        return;
    }

    //javadoc: niBlackThreshold(_src, _dst, maxValue, type, blockSize, k)
    public static void niBlackThreshold(Mat _src, Mat _dst, double maxValue, int type, int blockSize, double k)
    {
        
        niBlackThreshold_1(_src.nativeObj, _dst.nativeObj, maxValue, type, blockSize, k);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::qconj(Mat qimg, Mat& qcimg)
    //

    //javadoc: qconj(qimg, qcimg)
    public static void qconj(Mat qimg, Mat qcimg)
    {
        
        qconj_0(qimg.nativeObj, qcimg.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::qdft(Mat img, Mat& qimg, int flags, bool sideLeft)
    //

    //javadoc: qdft(img, qimg, flags, sideLeft)
    public static void qdft(Mat img, Mat qimg, int flags, boolean sideLeft)
    {
        
        qdft_0(img.nativeObj, qimg.nativeObj, flags, sideLeft);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::qmultiply(Mat src1, Mat src2, Mat& dst)
    //

    //javadoc: qmultiply(src1, src2, dst)
    public static void qmultiply(Mat src1, Mat src2, Mat dst)
    {
        
        qmultiply_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::qunitary(Mat qimg, Mat& qnimg)
    //

    //javadoc: qunitary(qimg, qnimg)
    public static void qunitary(Mat qimg, Mat qnimg)
    {
        
        qunitary_0(qimg.nativeObj, qnimg.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::rollingGuidanceFilter(Mat src, Mat& dst, int d = -1, double sigmaColor = 25, double sigmaSpace = 3, int numOfIter = 4, int borderType = BORDER_DEFAULT)
    //

    //javadoc: rollingGuidanceFilter(src, dst, d, sigmaColor, sigmaSpace, numOfIter, borderType)
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace, int numOfIter, int borderType)
    {
        
        rollingGuidanceFilter_0(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace, numOfIter, borderType);
        
        return;
    }

    //javadoc: rollingGuidanceFilter(src, dst, d, sigmaColor, sigmaSpace, numOfIter)
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace, int numOfIter)
    {
        
        rollingGuidanceFilter_1(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace, numOfIter);
        
        return;
    }

    //javadoc: rollingGuidanceFilter(src, dst, d, sigmaColor, sigmaSpace)
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d, double sigmaColor, double sigmaSpace)
    {
        
        rollingGuidanceFilter_2(src.nativeObj, dst.nativeObj, d, sigmaColor, sigmaSpace);
        
        return;
    }

    //javadoc: rollingGuidanceFilter(src, dst, d, sigmaColor)
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d, double sigmaColor)
    {
        
        rollingGuidanceFilter_3(src.nativeObj, dst.nativeObj, d, sigmaColor);
        
        return;
    }

    //javadoc: rollingGuidanceFilter(src, dst, d)
    public static void rollingGuidanceFilter(Mat src, Mat dst, int d)
    {
        
        rollingGuidanceFilter_4(src.nativeObj, dst.nativeObj, d);
        
        return;
    }

    //javadoc: rollingGuidanceFilter(src, dst)
    public static void rollingGuidanceFilter(Mat src, Mat dst)
    {
        
        rollingGuidanceFilter_5(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::thinning(Mat src, Mat& dst, int thinningType = THINNING_ZHANGSUEN)
    //

    //javadoc: thinning(src, dst, thinningType)
    public static void thinning(Mat src, Mat dst, int thinningType)
    {
        
        thinning_0(src.nativeObj, dst.nativeObj, thinningType);
        
        return;
    }

    //javadoc: thinning(src, dst)
    public static void thinning(Mat src, Mat dst)
    {
        
        thinning_1(src.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::transformFD(Mat src, Mat t, Mat& dst, bool fdContour = true)
    //

    //javadoc: transformFD(src, t, dst, fdContour)
    public static void transformFD(Mat src, Mat t, Mat dst, boolean fdContour)
    {
        
        transformFD_0(src.nativeObj, t.nativeObj, dst.nativeObj, fdContour);
        
        return;
    }

    //javadoc: transformFD(src, t, dst)
    public static void transformFD(Mat src, Mat t, Mat dst)
    {
        
        transformFD_1(src.nativeObj, t.nativeObj, dst.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::weightedMedianFilter(Mat joint, Mat src, Mat& dst, int r, double sigma = 25.5, int weightType = WMF_EXP, Mat mask = Mat())
    //

    //javadoc: weightedMedianFilter(joint, src, dst, r, sigma, weightType, mask)
    public static void weightedMedianFilter(Mat joint, Mat src, Mat dst, int r, double sigma, int weightType, Mat mask)
    {
        
        weightedMedianFilter_0(joint.nativeObj, src.nativeObj, dst.nativeObj, r, sigma, weightType, mask.nativeObj);
        
        return;
    }

    //javadoc: weightedMedianFilter(joint, src, dst, r, sigma, weightType)
    public static void weightedMedianFilter(Mat joint, Mat src, Mat dst, int r, double sigma, int weightType)
    {
        
        weightedMedianFilter_1(joint.nativeObj, src.nativeObj, dst.nativeObj, r, sigma, weightType);
        
        return;
    }

    //javadoc: weightedMedianFilter(joint, src, dst, r, sigma)
    public static void weightedMedianFilter(Mat joint, Mat src, Mat dst, int r, double sigma)
    {
        
        weightedMedianFilter_2(joint.nativeObj, src.nativeObj, dst.nativeObj, r, sigma);
        
        return;
    }

    //javadoc: weightedMedianFilter(joint, src, dst, r)
    public static void weightedMedianFilter(Mat joint, Mat src, Mat dst, int r)
    {
        
        weightedMedianFilter_3(joint.nativeObj, src.nativeObj, dst.nativeObj, r);
        
        return;
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
