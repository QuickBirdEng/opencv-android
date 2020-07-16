//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfRect;
import org.opencv.utils.Converters;

// C++: class TextDetector
/**
 * An abstract class providing interface for text detection algorithms
 */
public class TextDetector {

    protected final long nativeObj;
    protected TextDetector(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static TextDetector __fromPtr__(long addr) { return new TextDetector(addr); }

    //
    // C++:  void cv::text::TextDetector::detect(Mat inputImage, vector_Rect& Bbox, vector_float& confidence)
    //

    /**
     * Method that provides a quick and simple interface to detect text inside an image
     *
     *     @param inputImage an image to process
     *     @param Bbox a vector of Rect that will store the detected word bounding box
     *     @param confidence a vector of float that will be updated with the confidence the classifier has for the selected bounding box
     */
    public void detect(Mat inputImage, MatOfRect Bbox, MatOfFloat confidence) {
        Mat Bbox_mat = Bbox;
        Mat confidence_mat = confidence;
        detect_0(nativeObj, inputImage.nativeObj, Bbox_mat.nativeObj, confidence_mat.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::text::TextDetector::detect(Mat inputImage, vector_Rect& Bbox, vector_float& confidence)
    private static native void detect_0(long nativeObj, long inputImage_nativeObj, long Bbox_mat_nativeObj, long confidence_mat_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
