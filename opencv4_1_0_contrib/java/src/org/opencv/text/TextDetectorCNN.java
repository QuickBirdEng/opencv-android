//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfRect;
import org.opencv.text.TextDetector;
import org.opencv.text.TextDetectorCNN;
import org.opencv.utils.Converters;

// C++: class TextDetectorCNN
//javadoc: TextDetectorCNN

public class TextDetectorCNN extends TextDetector {

    protected TextDetectorCNN(long addr) { super(addr); }

    // internal usage only
    public static TextDetectorCNN __fromPtr__(long addr) { return new TextDetectorCNN(addr); }

    //
    // C++: static Ptr_TextDetectorCNN cv::text::TextDetectorCNN::create(String modelArchFilename, String modelWeightsFilename)
    //

    //javadoc: TextDetectorCNN::create(modelArchFilename, modelWeightsFilename)
    public static TextDetectorCNN create(String modelArchFilename, String modelWeightsFilename)
    {
        
        TextDetectorCNN retVal = TextDetectorCNN.__fromPtr__(create_0(modelArchFilename, modelWeightsFilename));
        
        return retVal;
    }


    //
    // C++:  void cv::text::TextDetectorCNN::detect(Mat inputImage, vector_Rect& Bbox, vector_float& confidence)
    //

    //javadoc: TextDetectorCNN::detect(inputImage, Bbox, confidence)
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



    // C++: static Ptr_TextDetectorCNN cv::text::TextDetectorCNN::create(String modelArchFilename, String modelWeightsFilename)
    private static native long create_0(String modelArchFilename, String modelWeightsFilename);

    // C++:  void cv::text::TextDetectorCNN::detect(Mat inputImage, vector_Rect& Bbox, vector_float& confidence)
    private static native void detect_0(long nativeObj, long inputImage_nativeObj, long Bbox_mat_nativeObj, long confidence_mat_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
