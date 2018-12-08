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
//javadoc: TextDetector

public class TextDetector {

    protected final long nativeObj;
    protected TextDetector(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static TextDetector __fromPtr__(long addr) { return new TextDetector(addr); }

    //
    // C++:  void cv::text::TextDetector::detect(Mat inputImage, vector_Rect& Bbox, vector_float& confidence)
    //

    //javadoc: TextDetector::detect(inputImage, Bbox, confidence)
    public  void detect(Mat inputImage, MatOfRect Bbox, MatOfFloat confidence)
    {
        Mat Bbox_mat = Bbox;
        Mat confidence_mat = confidence;
        detect_0(nativeObj, inputImage.nativeObj, Bbox_mat.nativeObj, confidence_mat.nativeObj);
        
        return;
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
