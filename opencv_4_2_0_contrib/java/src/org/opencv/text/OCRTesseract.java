//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import org.opencv.core.Mat;
import org.opencv.text.BaseOCR;
import org.opencv.text.OCRTesseract;

// C++: class OCRTesseract
/**
 * OCRTesseract class provides an interface with the tesseract-ocr API (v3.02.02) in C++.
 *
 * Notice that it is compiled only when tesseract-ocr is correctly installed.
 *
 * <b>Note:</b>
 * <ul>
 *   <li>
 *       (C++) An example of OCRTesseract recognition combined with scene text detection can be found
 *         at the end_to_end_recognition demo:
 *         &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/end_to_end_recognition.cpp&gt;
 *   <ul>
 *     <li>
 *        (C++) Another example of OCRTesseract recognition combined with scene text detection can be
 *         found at the webcam_demo:
 *         &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/webcam_demo.cpp&gt;
 *     </li>
 *   </ul>
 *   </li>
 * </ul>
 */
public class OCRTesseract extends BaseOCR {

    protected OCRTesseract(long addr) { super(addr); }

    // internal usage only
    public static OCRTesseract __fromPtr__(long addr) { return new OCRTesseract(addr); }

    //
    // C++: static Ptr_OCRTesseract cv::text::OCRTesseract::create(c_string datapath = 0, c_string language = 0, c_string char_whitelist = 0, int oem = OEM_DEFAULT, int psmode = PSM_AUTO)
    //

    /**
     * Creates an instance of the OCRTesseract class. Initializes Tesseract.
     *
     *     @param datapath the name of the parent directory of tessdata ended with "/", or NULL to use the
     *     system's default directory.
     *     @param language an ISO 639-3 code or NULL will default to "eng".
     *     @param char_whitelist specifies the list of characters used for recognition. NULL defaults to
     *     "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".
     *     @param oem tesseract-ocr offers different OCR Engine Modes (OEM), by default
     *     tesseract::OEM_DEFAULT is used. See the tesseract-ocr API documentation for other possible
     *     values.
     *     @param psmode tesseract-ocr offers different Page Segmentation Modes (PSM) tesseract::PSM_AUTO
     *     (fully automatic layout analysis) is used. See the tesseract-ocr API documentation for other
     *     possible values.
     * @return automatically generated
     */
    public static OCRTesseract create(String datapath, String language, String char_whitelist, int oem, int psmode) {
        return OCRTesseract.__fromPtr__(create_0(datapath, language, char_whitelist, oem, psmode));
    }

    /**
     * Creates an instance of the OCRTesseract class. Initializes Tesseract.
     *
     *     @param datapath the name of the parent directory of tessdata ended with "/", or NULL to use the
     *     system's default directory.
     *     @param language an ISO 639-3 code or NULL will default to "eng".
     *     @param char_whitelist specifies the list of characters used for recognition. NULL defaults to
     *     "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".
     *     @param oem tesseract-ocr offers different OCR Engine Modes (OEM), by default
     *     tesseract::OEM_DEFAULT is used. See the tesseract-ocr API documentation for other possible
     *     values.
     *     (fully automatic layout analysis) is used. See the tesseract-ocr API documentation for other
     *     possible values.
     * @return automatically generated
     */
    public static OCRTesseract create(String datapath, String language, String char_whitelist, int oem) {
        return OCRTesseract.__fromPtr__(create_1(datapath, language, char_whitelist, oem));
    }

    /**
     * Creates an instance of the OCRTesseract class. Initializes Tesseract.
     *
     *     @param datapath the name of the parent directory of tessdata ended with "/", or NULL to use the
     *     system's default directory.
     *     @param language an ISO 639-3 code or NULL will default to "eng".
     *     @param char_whitelist specifies the list of characters used for recognition. NULL defaults to
     *     "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".
     *     tesseract::OEM_DEFAULT is used. See the tesseract-ocr API documentation for other possible
     *     values.
     *     (fully automatic layout analysis) is used. See the tesseract-ocr API documentation for other
     *     possible values.
     * @return automatically generated
     */
    public static OCRTesseract create(String datapath, String language, String char_whitelist) {
        return OCRTesseract.__fromPtr__(create_2(datapath, language, char_whitelist));
    }

    /**
     * Creates an instance of the OCRTesseract class. Initializes Tesseract.
     *
     *     @param datapath the name of the parent directory of tessdata ended with "/", or NULL to use the
     *     system's default directory.
     *     @param language an ISO 639-3 code or NULL will default to "eng".
     *     "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".
     *     tesseract::OEM_DEFAULT is used. See the tesseract-ocr API documentation for other possible
     *     values.
     *     (fully automatic layout analysis) is used. See the tesseract-ocr API documentation for other
     *     possible values.
     * @return automatically generated
     */
    public static OCRTesseract create(String datapath, String language) {
        return OCRTesseract.__fromPtr__(create_3(datapath, language));
    }

    /**
     * Creates an instance of the OCRTesseract class. Initializes Tesseract.
     *
     *     @param datapath the name of the parent directory of tessdata ended with "/", or NULL to use the
     *     system's default directory.
     *     "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".
     *     tesseract::OEM_DEFAULT is used. See the tesseract-ocr API documentation for other possible
     *     values.
     *     (fully automatic layout analysis) is used. See the tesseract-ocr API documentation for other
     *     possible values.
     * @return automatically generated
     */
    public static OCRTesseract create(String datapath) {
        return OCRTesseract.__fromPtr__(create_4(datapath));
    }

    /**
     * Creates an instance of the OCRTesseract class. Initializes Tesseract.
     *
     *     system's default directory.
     *     "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".
     *     tesseract::OEM_DEFAULT is used. See the tesseract-ocr API documentation for other possible
     *     values.
     *     (fully automatic layout analysis) is used. See the tesseract-ocr API documentation for other
     *     possible values.
     * @return automatically generated
     */
    public static OCRTesseract create() {
        return OCRTesseract.__fromPtr__(create_5());
    }


    //
    // C++:  String cv::text::OCRTesseract::run(Mat image, Mat mask, int min_confidence, int component_level = 0)
    //

    public String run(Mat image, Mat mask, int min_confidence, int component_level) {
        return run_0(nativeObj, image.nativeObj, mask.nativeObj, min_confidence, component_level);
    }

    public String run(Mat image, Mat mask, int min_confidence) {
        return run_1(nativeObj, image.nativeObj, mask.nativeObj, min_confidence);
    }


    //
    // C++:  String cv::text::OCRTesseract::run(Mat image, int min_confidence, int component_level = 0)
    //

    /**
     * Recognize text using the tesseract-ocr API.
     *
     *     Takes image on input and returns recognized text in the output_text parameter. Optionally
     *     provides also the Rects for individual text elements found (e.g. words), and the list of those
     *     text elements with their confidence values.
     *
     *     @param image Input image CV_8UC1 or CV_8UC3
     *     text elements found (e.g. words or text lines).
     *     recognition of individual text elements found (e.g. words or text lines).
     *     for the recognition of individual text elements found (e.g. words or text lines).
     *     @param component_level OCR_LEVEL_WORD (by default), or OCR_LEVEL_TEXTLINE.
     * @param min_confidence automatically generated
     * @return automatically generated
     */
    public String run(Mat image, int min_confidence, int component_level) {
        return run_2(nativeObj, image.nativeObj, min_confidence, component_level);
    }

    /**
     * Recognize text using the tesseract-ocr API.
     *
     *     Takes image on input and returns recognized text in the output_text parameter. Optionally
     *     provides also the Rects for individual text elements found (e.g. words), and the list of those
     *     text elements with their confidence values.
     *
     *     @param image Input image CV_8UC1 or CV_8UC3
     *     text elements found (e.g. words or text lines).
     *     recognition of individual text elements found (e.g. words or text lines).
     *     for the recognition of individual text elements found (e.g. words or text lines).
     * @param min_confidence automatically generated
     * @return automatically generated
     */
    public String run(Mat image, int min_confidence) {
        return run_3(nativeObj, image.nativeObj, min_confidence);
    }


    //
    // C++:  void cv::text::OCRTesseract::setWhiteList(String char_whitelist)
    //

    public void setWhiteList(String char_whitelist) {
        setWhiteList_0(nativeObj, char_whitelist);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_OCRTesseract cv::text::OCRTesseract::create(c_string datapath = 0, c_string language = 0, c_string char_whitelist = 0, int oem = OEM_DEFAULT, int psmode = PSM_AUTO)
    private static native long create_0(String datapath, String language, String char_whitelist, int oem, int psmode);
    private static native long create_1(String datapath, String language, String char_whitelist, int oem);
    private static native long create_2(String datapath, String language, String char_whitelist);
    private static native long create_3(String datapath, String language);
    private static native long create_4(String datapath);
    private static native long create_5();

    // C++:  String cv::text::OCRTesseract::run(Mat image, Mat mask, int min_confidence, int component_level = 0)
    private static native String run_0(long nativeObj, long image_nativeObj, long mask_nativeObj, int min_confidence, int component_level);
    private static native String run_1(long nativeObj, long image_nativeObj, long mask_nativeObj, int min_confidence);

    // C++:  String cv::text::OCRTesseract::run(Mat image, int min_confidence, int component_level = 0)
    private static native String run_2(long nativeObj, long image_nativeObj, int min_confidence, int component_level);
    private static native String run_3(long nativeObj, long image_nativeObj, int min_confidence);

    // C++:  void cv::text::OCRTesseract::setWhiteList(String char_whitelist)
    private static native void setWhiteList_0(long nativeObj, String char_whitelist);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
