//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.MatOfRect;
import org.opencv.utils.Converters;

// C++: class Facemark
//javadoc: Facemark

public class Facemark extends Algorithm {

    protected Facemark(long addr) { super(addr); }

    // internal usage only
    public static Facemark __fromPtr__(long addr) { return new Facemark(addr); }

    //
    // C++:  bool cv::face::Facemark::fit(Mat image, vector_Rect faces, vector_vector_Point2f& landmarks)
    //

    //javadoc: Facemark::fit(image, faces, landmarks)
    public  boolean fit(Mat image, MatOfRect faces, List<MatOfPoint2f> landmarks)
    {
        Mat faces_mat = faces;
        Mat landmarks_mat = new Mat();
        boolean retVal = fit_0(nativeObj, image.nativeObj, faces_mat.nativeObj, landmarks_mat.nativeObj);
        Converters.Mat_to_vector_vector_Point2f(landmarks_mat, landmarks);
        landmarks_mat.release();
        return retVal;
    }


    //
    // C++:  void cv::face::Facemark::loadModel(String model)
    //

    //javadoc: Facemark::loadModel(model)
    public  void loadModel(String model)
    {
        
        loadModel_0(nativeObj, model);
        
        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::face::Facemark::fit(Mat image, vector_Rect faces, vector_vector_Point2f& landmarks)
    private static native boolean fit_0(long nativeObj, long image_nativeObj, long faces_mat_nativeObj, long landmarks_mat_nativeObj);

    // C++:  void cv::face::Facemark::loadModel(String model)
    private static native void loadModel_0(long nativeObj, String model);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
