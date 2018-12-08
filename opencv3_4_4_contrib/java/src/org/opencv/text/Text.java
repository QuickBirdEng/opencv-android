//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfRect;
import org.opencv.text.ERFilter;
import org.opencv.utils.Converters;

// C++: class Text
//javadoc: Text

public class Text {

    public static final int
            ERFILTER_NM_RGBLGrad = 0,
            ERFILTER_NM_IHSGrad = 1,
            ERGROUPING_ORIENTATION_HORIZ = 0,
            ERGROUPING_ORIENTATION_ANY = 1,
            OCR_LEVEL_WORD = 0,
            OCR_LEVEL_TEXTLINE = 1,
            PSM_OSD_ONLY = 0,
            PSM_AUTO_OSD = 1,
            PSM_AUTO_ONLY = 2,
            PSM_AUTO = 3,
            PSM_SINGLE_COLUMN = 4,
            PSM_SINGLE_BLOCK_VERT_TEXT = 5,
            PSM_SINGLE_BLOCK = 6,
            PSM_SINGLE_LINE = 7,
            PSM_SINGLE_WORD = 8,
            PSM_CIRCLE_WORD = 9,
            PSM_SINGLE_CHAR = 10,
            OEM_TESSERACT_ONLY = 0,
            OEM_CUBE_ONLY = 1,
            OEM_TESSERACT_CUBE_COMBINED = 2,
            OEM_DEFAULT = 3,
            OCR_DECODER_VITERBI = 0,
            OCR_KNN_CLASSIFIER = 0,
            OCR_CNN_CLASSIFIER = 1;


    //
    // C++:  Mat cv::text::createOCRHMMTransitionsTable(String vocabulary, vector_String lexicon)
    //

    //javadoc: createOCRHMMTransitionsTable(vocabulary, lexicon)
    public static Mat createOCRHMMTransitionsTable(String vocabulary, List<String> lexicon)
    {
        
        Mat retVal = new Mat(createOCRHMMTransitionsTable_0(vocabulary, lexicon));
        
        return retVal;
    }


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(Ptr_ERFilter_Callback cb, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    //

    // Unknown type 'Ptr_ERFilter_Callback' (I), skipping the function


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(String filename, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    //

    //javadoc: createERFilterNM1(filename, thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression, minProbabilityDiff)
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression, float minProbabilityDiff)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM1_0(filename, thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression, minProbabilityDiff));
        
        return retVal;
    }

    //javadoc: createERFilterNM1(filename, thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression)
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM1_1(filename, thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression));
        
        return retVal;
    }

    //javadoc: createERFilterNM1(filename, thresholdDelta, minArea, maxArea, minProbability)
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM1_2(filename, thresholdDelta, minArea, maxArea, minProbability));
        
        return retVal;
    }

    //javadoc: createERFilterNM1(filename, thresholdDelta, minArea, maxArea)
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM1_3(filename, thresholdDelta, minArea, maxArea));
        
        return retVal;
    }

    //javadoc: createERFilterNM1(filename, thresholdDelta, minArea)
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM1_4(filename, thresholdDelta, minArea));
        
        return retVal;
    }

    //javadoc: createERFilterNM1(filename, thresholdDelta)
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM1_5(filename, thresholdDelta));
        
        return retVal;
    }

    //javadoc: createERFilterNM1(filename)
    public static ERFilter createERFilterNM1(String filename)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM1_6(filename));
        
        return retVal;
    }


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(Ptr_ERFilter_Callback cb, float minProbability = (float)0.3)
    //

    // Unknown type 'Ptr_ERFilter_Callback' (I), skipping the function


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(String filename, float minProbability = (float)0.3)
    //

    //javadoc: createERFilterNM2(filename, minProbability)
    public static ERFilter createERFilterNM2(String filename, float minProbability)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM2_0(filename, minProbability));
        
        return retVal;
    }

    //javadoc: createERFilterNM2(filename)
    public static ERFilter createERFilterNM2(String filename)
    {
        
        ERFilter retVal = ERFilter.__fromPtr__(createERFilterNM2_1(filename));
        
        return retVal;
    }


    //
    // C++:  Ptr_ERFilter_Callback cv::text::loadClassifierNM1(String filename)
    //

    // Return type 'Ptr_ERFilter_Callback' is not supported, skipping the function


    //
    // C++:  Ptr_ERFilter_Callback cv::text::loadClassifierNM2(String filename)
    //

    // Return type 'Ptr_ERFilter_Callback' is not supported, skipping the function


    //
    // C++:  Ptr_OCRBeamSearchDecoder_ClassifierCallback cv::text::loadOCRBeamSearchClassifierCNN(String filename)
    //

    // Return type 'Ptr_OCRBeamSearchDecoder_ClassifierCallback' is not supported, skipping the function


    //
    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifier(String filename, int classifier)
    //

    // Return type 'Ptr_OCRHMMDecoder_ClassifierCallback' is not supported, skipping the function


    //
    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifierCNN(String filename)
    //

    // Return type 'Ptr_OCRHMMDecoder_ClassifierCallback' is not supported, skipping the function


    //
    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifierNM(String filename)
    //

    // Return type 'Ptr_OCRHMMDecoder_ClassifierCallback' is not supported, skipping the function


    //
    // C++:  void cv::text::computeNMChannels(Mat _src, vector_Mat& _channels, int _mode = ERFILTER_NM_RGBLGrad)
    //

    //javadoc: computeNMChannels(_src, _channels, _mode)
    public static void computeNMChannels(Mat _src, List<Mat> _channels, int _mode)
    {
        Mat _channels_mat = new Mat();
        computeNMChannels_0(_src.nativeObj, _channels_mat.nativeObj, _mode);
        Converters.Mat_to_vector_Mat(_channels_mat, _channels);
        _channels_mat.release();
        return;
    }

    //javadoc: computeNMChannels(_src, _channels)
    public static void computeNMChannels(Mat _src, List<Mat> _channels)
    {
        Mat _channels_mat = new Mat();
        computeNMChannels_1(_src.nativeObj, _channels_mat.nativeObj);
        Converters.Mat_to_vector_Mat(_channels_mat, _channels);
        _channels_mat.release();
        return;
    }


    //
    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbability = (float)0.5)
    //

    //javadoc: detectRegions(image, er_filter1, er_filter2, groups_rects, method, filename, minProbability)
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method, String filename, float minProbability)
    {
        Mat groups_rects_mat = groups_rects;
        detectRegions_0(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method, filename, minProbability);
        
        return;
    }

    //javadoc: detectRegions(image, er_filter1, er_filter2, groups_rects, method, filename)
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method, String filename)
    {
        Mat groups_rects_mat = groups_rects;
        detectRegions_1(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method, filename);
        
        return;
    }

    //javadoc: detectRegions(image, er_filter1, er_filter2, groups_rects, method)
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method)
    {
        Mat groups_rects_mat = groups_rects;
        detectRegions_2(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method);
        
        return;
    }

    //javadoc: detectRegions(image, er_filter1, er_filter2, groups_rects)
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects)
    {
        Mat groups_rects_mat = groups_rects;
        detectRegions_3(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_vector_Point& regions)
    //

    //javadoc: detectRegions(image, er_filter1, er_filter2, regions)
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, List<MatOfPoint> regions)
    {
        Mat regions_mat = new Mat();
        detectRegions_4(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), regions_mat.nativeObj);
        Converters.Mat_to_vector_vector_Point(regions_mat, regions);
        regions_mat.release();
        return;
    }


    //
    // C++:  void cv::text::erGrouping(Mat image, Mat channel, vector_vector_Point regions, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbablity = (float)0.5)
    //

    //javadoc: erGrouping(image, channel, regions, groups_rects, method, filename, minProbablity)
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method, String filename, float minProbablity)
    {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_0(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method, filename, minProbablity);
        
        return;
    }

    //javadoc: erGrouping(image, channel, regions, groups_rects, method, filename)
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method, String filename)
    {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_1(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method, filename);
        
        return;
    }

    //javadoc: erGrouping(image, channel, regions, groups_rects, method)
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method)
    {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_2(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method);
        
        return;
    }

    //javadoc: erGrouping(image, channel, regions, groups_rects)
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects)
    {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_3(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj);
        
        return;
    }




    // C++:  Mat cv::text::createOCRHMMTransitionsTable(String vocabulary, vector_String lexicon)
    private static native long createOCRHMMTransitionsTable_0(String vocabulary, List<String> lexicon);

    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(String filename, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    private static native long createERFilterNM1_0(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression, float minProbabilityDiff);
    private static native long createERFilterNM1_1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression);
    private static native long createERFilterNM1_2(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability);
    private static native long createERFilterNM1_3(String filename, int thresholdDelta, float minArea, float maxArea);
    private static native long createERFilterNM1_4(String filename, int thresholdDelta, float minArea);
    private static native long createERFilterNM1_5(String filename, int thresholdDelta);
    private static native long createERFilterNM1_6(String filename);

    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(String filename, float minProbability = (float)0.3)
    private static native long createERFilterNM2_0(String filename, float minProbability);
    private static native long createERFilterNM2_1(String filename);

    // C++:  void cv::text::computeNMChannels(Mat _src, vector_Mat& _channels, int _mode = ERFILTER_NM_RGBLGrad)
    private static native void computeNMChannels_0(long _src_nativeObj, long _channels_mat_nativeObj, int _mode);
    private static native void computeNMChannels_1(long _src_nativeObj, long _channels_mat_nativeObj);

    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbability = (float)0.5)
    private static native void detectRegions_0(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long groups_rects_mat_nativeObj, int method, String filename, float minProbability);
    private static native void detectRegions_1(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long groups_rects_mat_nativeObj, int method, String filename);
    private static native void detectRegions_2(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long groups_rects_mat_nativeObj, int method);
    private static native void detectRegions_3(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long groups_rects_mat_nativeObj);

    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_vector_Point& regions)
    private static native void detectRegions_4(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long regions_mat_nativeObj);

    // C++:  void cv::text::erGrouping(Mat image, Mat channel, vector_vector_Point regions, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbablity = (float)0.5)
    private static native void erGrouping_0(long image_nativeObj, long channel_nativeObj, long regions_mat_nativeObj, long groups_rects_mat_nativeObj, int method, String filename, float minProbablity);
    private static native void erGrouping_1(long image_nativeObj, long channel_nativeObj, long regions_mat_nativeObj, long groups_rects_mat_nativeObj, int method, String filename);
    private static native void erGrouping_2(long image_nativeObj, long channel_nativeObj, long regions_mat_nativeObj, long groups_rects_mat_nativeObj, int method);
    private static native void erGrouping_3(long image_nativeObj, long channel_nativeObj, long regions_mat_nativeObj, long groups_rects_mat_nativeObj);

}
