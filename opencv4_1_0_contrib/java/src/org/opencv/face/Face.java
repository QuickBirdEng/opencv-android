//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Scalar;
import org.opencv.face.Facemark;
import org.opencv.utils.Converters;

// C++: class Face
//javadoc: Face

public class Face {

    //
    // C++:  Ptr_Facemark cv::face::createFacemarkAAM()
    //

    //javadoc: createFacemarkAAM()
    public static Facemark createFacemarkAAM()
    {
        
        Facemark retVal = Facemark.__fromPtr__(createFacemarkAAM_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_Facemark cv::face::createFacemarkKazemi()
    //

    //javadoc: createFacemarkKazemi()
    public static Facemark createFacemarkKazemi()
    {
        
        Facemark retVal = Facemark.__fromPtr__(createFacemarkKazemi_0());
        
        return retVal;
    }


    //
    // C++:  Ptr_Facemark cv::face::createFacemarkLBF()
    //

    //javadoc: createFacemarkLBF()
    public static Facemark createFacemarkLBF()
    {
        
        Facemark retVal = Facemark.__fromPtr__(createFacemarkLBF_0());
        
        return retVal;
    }


    //
    // C++:  bool cv::face::getFacesHAAR(Mat image, Mat& faces, String face_cascade_name)
    //

    //javadoc: getFacesHAAR(image, faces, face_cascade_name)
    public static boolean getFacesHAAR(Mat image, Mat faces, String face_cascade_name)
    {
        
        boolean retVal = getFacesHAAR_0(image.nativeObj, faces.nativeObj, face_cascade_name);
        
        return retVal;
    }


    //
    // C++:  bool cv::face::loadDatasetList(String imageList, String annotationList, vector_String images, vector_String annotations)
    //

    //javadoc: loadDatasetList(imageList, annotationList, images, annotations)
    public static boolean loadDatasetList(String imageList, String annotationList, List<String> images, List<String> annotations)
    {
        
        boolean retVal = loadDatasetList_0(imageList, annotationList, images, annotations);
        
        return retVal;
    }


    //
    // C++:  bool cv::face::loadFacePoints(String filename, Mat& points, float offset = 0.0f)
    //

    //javadoc: loadFacePoints(filename, points, offset)
    public static boolean loadFacePoints(String filename, Mat points, float offset)
    {
        
        boolean retVal = loadFacePoints_0(filename, points.nativeObj, offset);
        
        return retVal;
    }

    //javadoc: loadFacePoints(filename, points)
    public static boolean loadFacePoints(String filename, Mat points)
    {
        
        boolean retVal = loadFacePoints_1(filename, points.nativeObj);
        
        return retVal;
    }


    //
    // C++:  bool cv::face::loadTrainingData(String filename, vector_String images, Mat& facePoints, char delim = ' ', float offset = 0.0f)
    //

    //javadoc: loadTrainingData(filename, images, facePoints, delim, offset)
    public static boolean loadTrainingData(String filename, List<String> images, Mat facePoints, char delim, float offset)
    {
        
        boolean retVal = loadTrainingData_0(filename, images, facePoints.nativeObj, delim, offset);
        
        return retVal;
    }

    //javadoc: loadTrainingData(filename, images, facePoints, delim)
    public static boolean loadTrainingData(String filename, List<String> images, Mat facePoints, char delim)
    {
        
        boolean retVal = loadTrainingData_1(filename, images, facePoints.nativeObj, delim);
        
        return retVal;
    }

    //javadoc: loadTrainingData(filename, images, facePoints)
    public static boolean loadTrainingData(String filename, List<String> images, Mat facePoints)
    {
        
        boolean retVal = loadTrainingData_2(filename, images, facePoints.nativeObj);
        
        return retVal;
    }


    //
    // C++:  bool cv::face::loadTrainingData(String imageList, String groundTruth, vector_String images, Mat& facePoints, float offset = 0.0f)
    //

    //javadoc: loadTrainingData(imageList, groundTruth, images, facePoints, offset)
    public static boolean loadTrainingData(String imageList, String groundTruth, List<String> images, Mat facePoints, float offset)
    {
        
        boolean retVal = loadTrainingData_3(imageList, groundTruth, images, facePoints.nativeObj, offset);
        
        return retVal;
    }

    //javadoc: loadTrainingData(imageList, groundTruth, images, facePoints)
    public static boolean loadTrainingData(String imageList, String groundTruth, List<String> images, Mat facePoints)
    {
        
        boolean retVal = loadTrainingData_4(imageList, groundTruth, images, facePoints.nativeObj);
        
        return retVal;
    }


    //
    // C++:  bool cv::face::loadTrainingData(vector_String filename, vector_vector_Point2f trainlandmarks, vector_String trainimages)
    //

    //javadoc: loadTrainingData(filename, trainlandmarks, trainimages)
    public static boolean loadTrainingData(List<String> filename, List<MatOfPoint2f> trainlandmarks, List<String> trainimages)
    {
        List<Mat> trainlandmarks_tmplm = new ArrayList<Mat>((trainlandmarks != null) ? trainlandmarks.size() : 0);
        Mat trainlandmarks_mat = Converters.vector_vector_Point2f_to_Mat(trainlandmarks, trainlandmarks_tmplm);
        boolean retVal = loadTrainingData_5(filename, trainlandmarks_mat.nativeObj, trainimages);
        
        return retVal;
    }


    //
    // C++:  void cv::face::drawFacemarks(Mat& image, Mat points, Scalar color = Scalar(255,0,0))
    //

    //javadoc: drawFacemarks(image, points, color)
    public static void drawFacemarks(Mat image, Mat points, Scalar color)
    {
        
        drawFacemarks_0(image.nativeObj, points.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);
        
        return;
    }

    //javadoc: drawFacemarks(image, points)
    public static void drawFacemarks(Mat image, Mat points)
    {
        
        drawFacemarks_1(image.nativeObj, points.nativeObj);
        
        return;
    }




    // C++:  Ptr_Facemark cv::face::createFacemarkAAM()
    private static native long createFacemarkAAM_0();

    // C++:  Ptr_Facemark cv::face::createFacemarkKazemi()
    private static native long createFacemarkKazemi_0();

    // C++:  Ptr_Facemark cv::face::createFacemarkLBF()
    private static native long createFacemarkLBF_0();

    // C++:  bool cv::face::getFacesHAAR(Mat image, Mat& faces, String face_cascade_name)
    private static native boolean getFacesHAAR_0(long image_nativeObj, long faces_nativeObj, String face_cascade_name);

    // C++:  bool cv::face::loadDatasetList(String imageList, String annotationList, vector_String images, vector_String annotations)
    private static native boolean loadDatasetList_0(String imageList, String annotationList, List<String> images, List<String> annotations);

    // C++:  bool cv::face::loadFacePoints(String filename, Mat& points, float offset = 0.0f)
    private static native boolean loadFacePoints_0(String filename, long points_nativeObj, float offset);
    private static native boolean loadFacePoints_1(String filename, long points_nativeObj);

    // C++:  bool cv::face::loadTrainingData(String filename, vector_String images, Mat& facePoints, char delim = ' ', float offset = 0.0f)
    private static native boolean loadTrainingData_0(String filename, List<String> images, long facePoints_nativeObj, char delim, float offset);
    private static native boolean loadTrainingData_1(String filename, List<String> images, long facePoints_nativeObj, char delim);
    private static native boolean loadTrainingData_2(String filename, List<String> images, long facePoints_nativeObj);

    // C++:  bool cv::face::loadTrainingData(String imageList, String groundTruth, vector_String images, Mat& facePoints, float offset = 0.0f)
    private static native boolean loadTrainingData_3(String imageList, String groundTruth, List<String> images, long facePoints_nativeObj, float offset);
    private static native boolean loadTrainingData_4(String imageList, String groundTruth, List<String> images, long facePoints_nativeObj);

    // C++:  bool cv::face::loadTrainingData(vector_String filename, vector_vector_Point2f trainlandmarks, vector_String trainimages)
    private static native boolean loadTrainingData_5(List<String> filename, long trainlandmarks_mat_nativeObj, List<String> trainimages);

    // C++:  void cv::face::drawFacemarks(Mat& image, Mat points, Scalar color = Scalar(255,0,0))
    private static native void drawFacemarks_0(long image_nativeObj, long points_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3);
    private static native void drawFacemarks_1(long image_nativeObj, long points_nativeObj);

}
