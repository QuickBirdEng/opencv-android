//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfRect;
import org.opencv.text.TextDetector;
import org.opencv.text.TextDetectorCNN;
import org.opencv.utils.Converters;

// C++: class TextDetectorCNN
/**
 * TextDetectorCNN class provides the functionallity of text bounding box detection.
 *  This class is representing to find bounding boxes of text words given an input image.
 *  This class uses OpenCV dnn module to load pre-trained model described in CITE: LiaoSBWL17.
 *  The original repository with the modified SSD Caffe version: https://github.com/MhLiao/TextBoxes.
 *  Model can be downloaded from [DropBox](https://www.dropbox.com/s/g8pjzv2de9gty8g/TextBoxes_icdar13.caffemodel?dl=0).
 *  Modified .prototxt file with the model description can be found in {@code opencv_contrib/modules/text/samples/textbox.prototxt}.
 */
public class TextDetectorCNN extends TextDetector {

    protected TextDetectorCNN(long addr) { super(addr); }

    // internal usage only
    public static TextDetectorCNN __fromPtr__(long addr) { return new TextDetectorCNN(addr); }

    //
    // C++: static Ptr_TextDetectorCNN cv::text::TextDetectorCNN::create(String modelArchFilename, String modelWeightsFilename)
    //

    public static TextDetectorCNN create(String modelArchFilename, String modelWeightsFilename) {
        return TextDetectorCNN.__fromPtr__(create_0(modelArchFilename, modelWeightsFilename));
    }


    //
    // C++:  void cv::text::TextDetectorCNN::detect(Mat inputImage, vector_Rect& Bbox, vector_float& confidence)
    //

    /**
     *
     *
     *     @param inputImage an image expected to be a CV_U8C3 of any size
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



    // C++: static Ptr_TextDetectorCNN cv::text::TextDetectorCNN::create(String modelArchFilename, String modelWeightsFilename)
    private static native long create_0(String modelArchFilename, String modelWeightsFilename);

    // C++:  void cv::text::TextDetectorCNN::detect(Mat inputImage, vector_Rect& Bbox, vector_float& confidence)
    private static native void detect_0(long nativeObj, long inputImage_nativeObj, long Bbox_mat_nativeObj, long confidence_mat_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
