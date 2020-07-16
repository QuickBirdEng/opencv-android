//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfRect;
import org.opencv.text.ERFilter;
import org.opencv.utils.Converters;

// C++: class Text

public class Text {

    // C++: enum <unnamed>
    public static final int
            OCR_LEVEL_WORD = 0,
            OCR_LEVEL_TEXTLINE = 1,
            ERFILTER_NM_RGBLGrad = 0,
            ERFILTER_NM_IHSGrad = 1;


    // C++: enum decoder_mode
    public static final int
            OCR_DECODER_VITERBI = 0;


    // C++: enum erGrouping_Modes
    public static final int
            ERGROUPING_ORIENTATION_HORIZ = 0,
            ERGROUPING_ORIENTATION_ANY = 1;


    // C++: enum page_seg_mode
    public static final int
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
            PSM_SINGLE_CHAR = 10;


    // C++: enum classifier_type
    public static final int
            OCR_KNN_CLASSIFIER = 0,
            OCR_CNN_CLASSIFIER = 1;


    // C++: enum ocr_engine_mode
    public static final int
            OEM_TESSERACT_ONLY = 0,
            OEM_CUBE_ONLY = 1,
            OEM_TESSERACT_CUBE_COMBINED = 2,
            OEM_DEFAULT = 3;


    //
    // C++:  Mat cv::text::createOCRHMMTransitionsTable(String vocabulary, vector_String lexicon)
    //

    /**
     * Utility function to create a tailored language model transitions table from a given list of words (lexicon).
     *
     * @param vocabulary The language vocabulary (chars when ASCII English text).
     *
     * @param lexicon The list of words that are expected to be found in a particular image.
     *
     *
     * The function calculate frequency statistics of character pairs from the given lexicon and fills the output transition_probabilities_table with them. The transition_probabilities_table can be used as input in the OCRHMMDecoder::create() and OCRBeamSearchDecoder::create() methods.
     * <b>Note:</b>
     * -   (C++) An alternative would be to load the default generic language transition table provided in the text module samples folder (created from ispell 42869 english words list) :
     * &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/OCRHMM_transitions_table.xml&gt;
     *
     * @return automatically generated
     */
    public static Mat createOCRHMMTransitionsTable(String vocabulary, List<String> lexicon) {
        return new Mat(createOCRHMMTransitionsTable_0(vocabulary, lexicon));
    }


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(Ptr_ERFilter_Callback cb, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    //

    // Unknown type 'Ptr_ERFilter_Callback' (I), skipping the function


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(String filename, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    //

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @param nonMaxSuppression automatically generated
     * @param minProbabilityDiff automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression, float minProbabilityDiff) {
        return ERFilter.__fromPtr__(createERFilterNM1_0(filename, thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression, minProbabilityDiff));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @param nonMaxSuppression automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression) {
        return ERFilter.__fromPtr__(createERFilterNM1_1(filename, thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability) {
        return ERFilter.__fromPtr__(createERFilterNM1_2(filename, thresholdDelta, minArea, maxArea, minProbability));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea) {
        return ERFilter.__fromPtr__(createERFilterNM1_3(filename, thresholdDelta, minArea, maxArea));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea) {
        return ERFilter.__fromPtr__(createERFilterNM1_4(filename, thresholdDelta, minArea));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta) {
        return ERFilter.__fromPtr__(createERFilterNM1_5(filename, thresholdDelta));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename) {
        return ERFilter.__fromPtr__(createERFilterNM1_6(filename));
    }


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(Ptr_ERFilter_Callback cb, float minProbability = (float)0.3)
    //

    // Unknown type 'Ptr_ERFilter_Callback' (I), skipping the function


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(String filename, float minProbability = (float)0.3)
    //

    /**
     * Reads an Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM2.xml
     *
     * @param filename automatically generated
     * @param minProbability automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM2(String filename, float minProbability) {
        return ERFilter.__fromPtr__(createERFilterNM2_0(filename, minProbability));
    }

    /**
     * Reads an Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM2.xml
     *
     * @param filename automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM2(String filename) {
        return ERFilter.__fromPtr__(createERFilterNM2_1(filename));
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

    /**
     * Compute the different channels to be processed independently in the N&amp;M algorithm CITE: Neumann12.
     *
     * @param _src Source image. Must be RGB CV_8UC3.
     *
     * @param _channels Output vector&lt;Mat&gt; where computed channels are stored.
     *
     * @param _mode Mode of operation. Currently the only available options are:
     * <b>ERFILTER_NM_RGBLGrad</b> (used by default) and <b>ERFILTER_NM_IHSGrad</b>.
     *
     * In N&amp;M algorithm, the combination of intensity (I), hue (H), saturation (S), and gradient magnitude
     * channels (Grad) are used in order to obtain high localization recall. This implementation also
     * provides an alternative combination of red (R), green (G), blue (B), lightness (L), and gradient
     * magnitude (Grad).
     */
    public static void computeNMChannels(Mat _src, List<Mat> _channels, int _mode) {
        Mat _channels_mat = new Mat();
        computeNMChannels_0(_src.nativeObj, _channels_mat.nativeObj, _mode);
        Converters.Mat_to_vector_Mat(_channels_mat, _channels);
        _channels_mat.release();
    }

    /**
     * Compute the different channels to be processed independently in the N&amp;M algorithm CITE: Neumann12.
     *
     * @param _src Source image. Must be RGB CV_8UC3.
     *
     * @param _channels Output vector&lt;Mat&gt; where computed channels are stored.
     *
     * <b>ERFILTER_NM_RGBLGrad</b> (used by default) and <b>ERFILTER_NM_IHSGrad</b>.
     *
     * In N&amp;M algorithm, the combination of intensity (I), hue (H), saturation (S), and gradient magnitude
     * channels (Grad) are used in order to obtain high localization recall. This implementation also
     * provides an alternative combination of red (R), green (G), blue (B), lightness (L), and gradient
     * magnitude (Grad).
     */
    public static void computeNMChannels(Mat _src, List<Mat> _channels) {
        Mat _channels_mat = new Mat();
        computeNMChannels_1(_src.nativeObj, _channels_mat.nativeObj);
        Converters.Mat_to_vector_Mat(_channels_mat, _channels);
        _channels_mat.release();
    }


    //
    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbability = (float)0.5)
    //

    /**
     * Extracts text regions from image.
     *
     * @param image Source image where text blocks needs to be extracted from.  Should be CV_8UC3 (color).
     * @param er_filter1 Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param er_filter2 Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param groups_rects Output list of rectangle blocks with text
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ, ERGROUPING_ORIENTATION_ANY.
     * @param filename The XML or YAML file with the classifier model (e.g. samples/trained_classifier_erGrouping.xml). Only to use when grouping method is ERGROUPING_ORIENTATION_ANY.
     * @param minProbability The minimum probability for accepting a group. Only to use when grouping method is ERGROUPING_ORIENTATION_ANY.
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method, String filename, float minProbability) {
        Mat groups_rects_mat = groups_rects;
        detectRegions_0(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method, filename, minProbability);
    }

    /**
     * Extracts text regions from image.
     *
     * @param image Source image where text blocks needs to be extracted from.  Should be CV_8UC3 (color).
     * @param er_filter1 Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param er_filter2 Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param groups_rects Output list of rectangle blocks with text
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ, ERGROUPING_ORIENTATION_ANY.
     * @param filename The XML or YAML file with the classifier model (e.g. samples/trained_classifier_erGrouping.xml). Only to use when grouping method is ERGROUPING_ORIENTATION_ANY.
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method, String filename) {
        Mat groups_rects_mat = groups_rects;
        detectRegions_1(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method, filename);
    }

    /**
     * Extracts text regions from image.
     *
     * @param image Source image where text blocks needs to be extracted from.  Should be CV_8UC3 (color).
     * @param er_filter1 Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param er_filter2 Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param groups_rects Output list of rectangle blocks with text
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ, ERGROUPING_ORIENTATION_ANY.
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method) {
        Mat groups_rects_mat = groups_rects;
        detectRegions_2(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method);
    }

    /**
     * Extracts text regions from image.
     *
     * @param image Source image where text blocks needs to be extracted from.  Should be CV_8UC3 (color).
     * @param er_filter1 Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param er_filter2 Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param groups_rects Output list of rectangle blocks with text
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects) {
        Mat groups_rects_mat = groups_rects;
        detectRegions_3(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj);
    }


    //
    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_vector_Point& regions)
    //

    /**
     * Converts MSER contours (vector&lt;Point&gt;) to ERStat regions.
     *
     * @param image Source image CV_8UC1 from which the MSERs where extracted.
     *
     *
     * @param regions Output where the ERStat regions are stored.
     *
     * It takes as input the contours provided by the OpenCV MSER feature detector and returns as output
     * two vectors of ERStats. This is because MSER() output contains both MSER+ and MSER- regions in a
     * single vector&lt;Point&gt;, the function separates them in two different vectors (this is as if the
     * ERStats where extracted from two different channels).
     *
     * An example of MSERsToERStats in use can be found in the text detection webcam_demo:
     * &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/webcam_demo.cpp&gt;
     * @param er_filter1 automatically generated
     * @param er_filter2 automatically generated
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, List<MatOfPoint> regions) {
        Mat regions_mat = new Mat();
        detectRegions_4(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), regions_mat.nativeObj);
        Converters.Mat_to_vector_vector_Point(regions_mat, regions);
        regions_mat.release();
    }


    //
    // C++:  void cv::text::erGrouping(Mat image, Mat channel, vector_vector_Point regions, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbablity = (float)0.5)
    //

    /**
     * Find groups of Extremal Regions that are organized as text blocks.
     *
     *
     *
     * @param regions Vector of ER's retrieved from the ERFilter algorithm from each channel.
     *
     * provided regions.
     *
     * @param groups_rects The output of the algorithm are stored in this parameter as list of rectangles.
     *
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ,
     * ERGROUPING_ORIENTATION_ANY.
     *
     * @param filename The XML or YAML file with the classifier model (e.g.
     * samples/trained_classifier_erGrouping.xml). Only to use when grouping method is
     * ERGROUPING_ORIENTATION_ANY.
     *
     * @param minProbablity The minimum probability for accepting a group. Only to use when grouping
     * method is ERGROUPING_ORIENTATION_ANY.
     * @param image automatically generated
     * @param channel automatically generated
     */
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method, String filename, float minProbablity) {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_0(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method, filename, minProbablity);
    }

    /**
     * Find groups of Extremal Regions that are organized as text blocks.
     *
     *
     *
     * @param regions Vector of ER's retrieved from the ERFilter algorithm from each channel.
     *
     * provided regions.
     *
     * @param groups_rects The output of the algorithm are stored in this parameter as list of rectangles.
     *
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ,
     * ERGROUPING_ORIENTATION_ANY.
     *
     * @param filename The XML or YAML file with the classifier model (e.g.
     * samples/trained_classifier_erGrouping.xml). Only to use when grouping method is
     * ERGROUPING_ORIENTATION_ANY.
     *
     * method is ERGROUPING_ORIENTATION_ANY.
     * @param image automatically generated
     * @param channel automatically generated
     */
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method, String filename) {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_1(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method, filename);
    }

    /**
     * Find groups of Extremal Regions that are organized as text blocks.
     *
     *
     *
     * @param regions Vector of ER's retrieved from the ERFilter algorithm from each channel.
     *
     * provided regions.
     *
     * @param groups_rects The output of the algorithm are stored in this parameter as list of rectangles.
     *
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ,
     * ERGROUPING_ORIENTATION_ANY.
     *
     * samples/trained_classifier_erGrouping.xml). Only to use when grouping method is
     * ERGROUPING_ORIENTATION_ANY.
     *
     * method is ERGROUPING_ORIENTATION_ANY.
     * @param image automatically generated
     * @param channel automatically generated
     */
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method) {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_2(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method);
    }

    /**
     * Find groups of Extremal Regions that are organized as text blocks.
     *
     *
     *
     * @param regions Vector of ER's retrieved from the ERFilter algorithm from each channel.
     *
     * provided regions.
     *
     * @param groups_rects The output of the algorithm are stored in this parameter as list of rectangles.
     *
     * ERGROUPING_ORIENTATION_ANY.
     *
     * samples/trained_classifier_erGrouping.xml). Only to use when grouping method is
     * ERGROUPING_ORIENTATION_ANY.
     *
     * method is ERGROUPING_ORIENTATION_ANY.
     * @param image automatically generated
     * @param channel automatically generated
     */
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects) {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_3(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj);
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
