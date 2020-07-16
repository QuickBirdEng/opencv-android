//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import org.opencv.core.Mat;
import org.opencv.text.BaseOCR;
import org.opencv.text.OCRBeamSearchDecoder;

// C++: class OCRBeamSearchDecoder
/**
 * OCRBeamSearchDecoder class provides an interface for OCR using Beam Search algorithm.
 *
 * <b>Note:</b>
 * <ul>
 *   <li>
 *       (C++) An example on using OCRBeamSearchDecoder recognition combined with scene text detection can
 *         be found at the demo sample:
 *         &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/word_recognition.cpp&gt;
 *   </li>
 * </ul>
 */
public class OCRBeamSearchDecoder extends BaseOCR {

    protected OCRBeamSearchDecoder(long addr) { super(addr); }

    // internal usage only
    public static OCRBeamSearchDecoder __fromPtr__(long addr) { return new OCRBeamSearchDecoder(addr); }

    //
    // C++: static Ptr_OCRBeamSearchDecoder cv::text::OCRBeamSearchDecoder::create(Ptr_OCRBeamSearchDecoder_ClassifierCallback classifier, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI, int beam_size = 500)
    //

    // Unknown type 'Ptr_OCRBeamSearchDecoder_ClassifierCallback' (I), skipping the function


    //
    // C++: static Ptr_OCRBeamSearchDecoder cv::text::OCRBeamSearchDecoder::create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI, int beam_size = 500)
    //

    /**
     * Creates an instance of the OCRBeamSearchDecoder class. Initializes HMMDecoder from the specified path.
     *
     *     
     * @param filename automatically generated
     * @param vocabulary automatically generated
     * @param transition_probabilities_table automatically generated
     * @param emission_probabilities_table automatically generated
     * @param mode automatically generated
     * @param beam_size automatically generated
     * @return automatically generated
     */
    public static OCRBeamSearchDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode, int beam_size) {
        return OCRBeamSearchDecoder.__fromPtr__(create_0(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj, mode, beam_size));
    }

    /**
     * Creates an instance of the OCRBeamSearchDecoder class. Initializes HMMDecoder from the specified path.
     *
     *     
     * @param filename automatically generated
     * @param vocabulary automatically generated
     * @param transition_probabilities_table automatically generated
     * @param emission_probabilities_table automatically generated
     * @param mode automatically generated
     * @return automatically generated
     */
    public static OCRBeamSearchDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode) {
        return OCRBeamSearchDecoder.__fromPtr__(create_1(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj, mode));
    }

    /**
     * Creates an instance of the OCRBeamSearchDecoder class. Initializes HMMDecoder from the specified path.
     *
     *     
     * @param filename automatically generated
     * @param vocabulary automatically generated
     * @param transition_probabilities_table automatically generated
     * @param emission_probabilities_table automatically generated
     * @return automatically generated
     */
    public static OCRBeamSearchDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table) {
        return OCRBeamSearchDecoder.__fromPtr__(create_2(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj));
    }


    //
    // C++:  String cv::text::OCRBeamSearchDecoder::run(Mat image, Mat mask, int min_confidence, int component_level = 0)
    //

    public String run(Mat image, Mat mask, int min_confidence, int component_level) {
        return run_0(nativeObj, image.nativeObj, mask.nativeObj, min_confidence, component_level);
    }

    public String run(Mat image, Mat mask, int min_confidence) {
        return run_1(nativeObj, image.nativeObj, mask.nativeObj, min_confidence);
    }


    //
    // C++:  String cv::text::OCRBeamSearchDecoder::run(Mat image, int min_confidence, int component_level = 0)
    //

    /**
     * Recognize text using Beam Search.
     *
     *     Takes image on input and returns recognized text in the output_text parameter. Optionally
     *     provides also the Rects for individual text elements found (e.g. words), and the list of those
     *     text elements with their confidence values.
     *
     *     @param image Input binary image CV_8UC1 with a single text line (or word).
     *
     *
     *     text elements found (e.g. words).
     *
     *     recognition of individual text elements found (e.g. words).
     *
     *     for the recognition of individual text elements found (e.g. words).
     *
     *     @param component_level Only OCR_LEVEL_WORD is supported.
     * @param min_confidence automatically generated
     * @return automatically generated
     */
    public String run(Mat image, int min_confidence, int component_level) {
        return run_2(nativeObj, image.nativeObj, min_confidence, component_level);
    }

    /**
     * Recognize text using Beam Search.
     *
     *     Takes image on input and returns recognized text in the output_text parameter. Optionally
     *     provides also the Rects for individual text elements found (e.g. words), and the list of those
     *     text elements with their confidence values.
     *
     *     @param image Input binary image CV_8UC1 with a single text line (or word).
     *
     *
     *     text elements found (e.g. words).
     *
     *     recognition of individual text elements found (e.g. words).
     *
     *     for the recognition of individual text elements found (e.g. words).
     *
     * @param min_confidence automatically generated
     * @return automatically generated
     */
    public String run(Mat image, int min_confidence) {
        return run_3(nativeObj, image.nativeObj, min_confidence);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_OCRBeamSearchDecoder cv::text::OCRBeamSearchDecoder::create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI, int beam_size = 500)
    private static native long create_0(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj, int mode, int beam_size);
    private static native long create_1(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj, int mode);
    private static native long create_2(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj);

    // C++:  String cv::text::OCRBeamSearchDecoder::run(Mat image, Mat mask, int min_confidence, int component_level = 0)
    private static native String run_0(long nativeObj, long image_nativeObj, long mask_nativeObj, int min_confidence, int component_level);
    private static native String run_1(long nativeObj, long image_nativeObj, long mask_nativeObj, int min_confidence);

    // C++:  String cv::text::OCRBeamSearchDecoder::run(Mat image, int min_confidence, int component_level = 0)
    private static native String run_2(long nativeObj, long image_nativeObj, int min_confidence, int component_level);
    private static native String run_3(long nativeObj, long image_nativeObj, int min_confidence);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
