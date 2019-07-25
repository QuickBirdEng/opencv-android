//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ximgproc;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class FastLineDetector
//javadoc: FastLineDetector

public class FastLineDetector extends Algorithm {

    protected FastLineDetector(long addr) { super(addr); }

    // internal usage only
    public static FastLineDetector __fromPtr__(long addr) { return new FastLineDetector(addr); }

    //
    // C++:  void cv::ximgproc::FastLineDetector::detect(Mat _image, Mat& _lines)
    //

    //javadoc: FastLineDetector::detect(_image, _lines)
    public  void detect(Mat _image, Mat _lines)
    {
        
        detect_0(nativeObj, _image.nativeObj, _lines.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::ximgproc::FastLineDetector::drawSegments(Mat& _image, Mat lines, bool draw_arrow = false)
    //

    //javadoc: FastLineDetector::drawSegments(_image, lines, draw_arrow)
    public  void drawSegments(Mat _image, Mat lines, boolean draw_arrow)
    {
        
        drawSegments_0(nativeObj, _image.nativeObj, lines.nativeObj, draw_arrow);
        
        return;
    }

    //javadoc: FastLineDetector::drawSegments(_image, lines)
    public  void drawSegments(Mat _image, Mat lines)
    {
        
        drawSegments_1(nativeObj, _image.nativeObj, lines.nativeObj);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::ximgproc::FastLineDetector::detect(Mat _image, Mat& _lines)
    private static native void detect_0(long nativeObj, long _image_nativeObj, long _lines_nativeObj);

    // C++:  void cv::ximgproc::FastLineDetector::drawSegments(Mat& _image, Mat lines, bool draw_arrow = false)
    private static native void drawSegments_0(long nativeObj, long _image_nativeObj, long lines_nativeObj, boolean draw_arrow);
    private static native void drawSegments_1(long nativeObj, long _image_nativeObj, long lines_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
