//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Scalar;
import org.opencv.face.Facemark;
import org.opencv.utils.Converters;

// C++: class Face

public class Face {

    //
    // C++:  Ptr_Facemark cv::face::createFacemarkAAM()
    //

    public static Facemark createFacemarkAAM() {
        return Facemark.__fromPtr__(createFacemarkAAM_0());
    }


    //
    // C++:  Ptr_Facemark cv::face::createFacemarkKazemi()
    //

    public static Facemark createFacemarkKazemi() {
        return Facemark.__fromPtr__(createFacemarkKazemi_0());
    }


    //
    // C++:  Ptr_Facemark cv::face::createFacemarkLBF()
    //

    public static Facemark createFacemarkLBF() {
        return Facemark.__fromPtr__(createFacemarkLBF_0());
    }


    //
    // C++:  bool cv::face::getFacesHAAR(Mat image, Mat& faces, String face_cascade_name)
    //

    /**
     * Default face detector
     * This function is mainly utilized by the implementation of a Facemark Algorithm.
     * End users are advised to use function Facemark::getFaces which can be manually defined
     * and circumvented to the algorithm by Facemark::setFaceDetector.
     *
     * @param image The input image to be processed.
     * @param faces Output of the function which represent region of interest of the detected faces.
     * Each face is stored in cv::Rect container.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * std::vector&lt;cv::Rect&gt; faces;
     * CParams params("haarcascade_frontalface_alt.xml");
     * cv::face::getFaces(frame, faces, &amp;params);
     * for(int j=0;j&lt;faces.size();j++){
     *     cv::rectangle(frame, faces[j], cv::Scalar(255,0,255));
     * }
     * cv::imshow("detection", frame);
     * </code>
     * @param face_cascade_name automatically generated
     * @return automatically generated
     */
    public static boolean getFacesHAAR(Mat image, Mat faces, String face_cascade_name) {
        return getFacesHAAR_0(image.nativeObj, faces.nativeObj, face_cascade_name);
    }


    //
    // C++:  bool cv::face::loadDatasetList(String imageList, String annotationList, vector_String images, vector_String annotations)
    //

    /**
     * A utility to load list of paths to training image and annotation file.
     * @param imageList The specified file contains paths to the training images.
     * @param annotationList The specified file contains paths to the training annotations.
     * @param images The loaded paths of training images.
     * @param annotations The loaded paths of annotation files.
     *
     * Example of usage:
     * <code>
     * String imageFiles = "images_path.txt";
     * String ptsFiles = "annotations_path.txt";
     * std::vector&lt;String&gt; images_train;
     * std::vector&lt;String&gt; landmarks_train;
     * loadDatasetList(imageFiles,ptsFiles,images_train,landmarks_train);
     * </code>
     * @return automatically generated
     */
    public static boolean loadDatasetList(String imageList, String annotationList, List<String> images, List<String> annotations) {
        return loadDatasetList_0(imageList, annotationList, images, annotations);
    }


    //
    // C++:  bool cv::face::loadFacePoints(String filename, Mat& points, float offset = 0.0f)
    //

    /**
     * A utility to load facial landmark information from a given file.
     *
     * @param filename The filename of file contains the facial landmarks data.
     * @param points The loaded facial landmark points.
     * @param offset An offset value to adjust the loaded points.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * std::vector&lt;Point2f&gt; points;
     * face::loadFacePoints("filename.txt", points, 0.0f);
     * </code>
     *
     * The annotation file should follow the default format which is
     * <code>
     * version: 1
     * n_points:  68
     * {
     * 212.716603 499.771793
     * 230.232816 566.290071
     * ...
     * }
     * </code>
     * where n_points is the number of points considered
     * and each point is represented as its position in x and y.
     * @return automatically generated
     */
    public static boolean loadFacePoints(String filename, Mat points, float offset) {
        return loadFacePoints_0(filename, points.nativeObj, offset);
    }

    /**
     * A utility to load facial landmark information from a given file.
     *
     * @param filename The filename of file contains the facial landmarks data.
     * @param points The loaded facial landmark points.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * std::vector&lt;Point2f&gt; points;
     * face::loadFacePoints("filename.txt", points, 0.0f);
     * </code>
     *
     * The annotation file should follow the default format which is
     * <code>
     * version: 1
     * n_points:  68
     * {
     * 212.716603 499.771793
     * 230.232816 566.290071
     * ...
     * }
     * </code>
     * where n_points is the number of points considered
     * and each point is represented as its position in x and y.
     * @return automatically generated
     */
    public static boolean loadFacePoints(String filename, Mat points) {
        return loadFacePoints_1(filename, points.nativeObj);
    }


    //
    // C++:  bool cv::face::loadTrainingData(String filename, vector_String images, Mat& facePoints, char delim = ' ', float offset = 0.0f)
    //

    /**
     * A utility to load facial landmark dataset from a single file.
     *
     * @param filename The filename of a file that contains the dataset information.
     * Each line contains the filename of an image followed by
     * pairs of x and y values of facial landmarks points separated by a space.
     * Example
     * <code>
     * /home/user/ibug/image_003_1.jpg 336.820955 240.864510 334.238298 260.922709 335.266918 ...
     * /home/user/ibug/image_005_1.jpg 376.158428 230.845712 376.736984 254.924635 383.265403 ...
     * </code>
     * @param images A vector where each element represent the filename of image in the dataset.
     * Images are not loaded by default to save the memory.
     * @param facePoints The loaded landmark points for all training data.
     * @param delim Delimiter between each element, the default value is a whitespace.
     * @param offset An offset value to adjust the loaded points.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * cv::String imageFiles = "../data/images_train.txt";
     * cv::String ptsFiles = "../data/points_train.txt";
     * std::vector&lt;String&gt; images;
     * std::vector&lt;std::vector&lt;Point2f&gt; &gt; facePoints;
     * loadTrainingData(imageFiles, ptsFiles, images, facePoints, 0.0f);
     * </code>
     * @return automatically generated
     */
    public static boolean loadTrainingData(String filename, List<String> images, Mat facePoints, char delim, float offset) {
        return loadTrainingData_0(filename, images, facePoints.nativeObj, delim, offset);
    }

    /**
     * A utility to load facial landmark dataset from a single file.
     *
     * @param filename The filename of a file that contains the dataset information.
     * Each line contains the filename of an image followed by
     * pairs of x and y values of facial landmarks points separated by a space.
     * Example
     * <code>
     * /home/user/ibug/image_003_1.jpg 336.820955 240.864510 334.238298 260.922709 335.266918 ...
     * /home/user/ibug/image_005_1.jpg 376.158428 230.845712 376.736984 254.924635 383.265403 ...
     * </code>
     * @param images A vector where each element represent the filename of image in the dataset.
     * Images are not loaded by default to save the memory.
     * @param facePoints The loaded landmark points for all training data.
     * @param delim Delimiter between each element, the default value is a whitespace.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * cv::String imageFiles = "../data/images_train.txt";
     * cv::String ptsFiles = "../data/points_train.txt";
     * std::vector&lt;String&gt; images;
     * std::vector&lt;std::vector&lt;Point2f&gt; &gt; facePoints;
     * loadTrainingData(imageFiles, ptsFiles, images, facePoints, 0.0f);
     * </code>
     * @return automatically generated
     */
    public static boolean loadTrainingData(String filename, List<String> images, Mat facePoints, char delim) {
        return loadTrainingData_1(filename, images, facePoints.nativeObj, delim);
    }

    /**
     * A utility to load facial landmark dataset from a single file.
     *
     * @param filename The filename of a file that contains the dataset information.
     * Each line contains the filename of an image followed by
     * pairs of x and y values of facial landmarks points separated by a space.
     * Example
     * <code>
     * /home/user/ibug/image_003_1.jpg 336.820955 240.864510 334.238298 260.922709 335.266918 ...
     * /home/user/ibug/image_005_1.jpg 376.158428 230.845712 376.736984 254.924635 383.265403 ...
     * </code>
     * @param images A vector where each element represent the filename of image in the dataset.
     * Images are not loaded by default to save the memory.
     * @param facePoints The loaded landmark points for all training data.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * cv::String imageFiles = "../data/images_train.txt";
     * cv::String ptsFiles = "../data/points_train.txt";
     * std::vector&lt;String&gt; images;
     * std::vector&lt;std::vector&lt;Point2f&gt; &gt; facePoints;
     * loadTrainingData(imageFiles, ptsFiles, images, facePoints, 0.0f);
     * </code>
     * @return automatically generated
     */
    public static boolean loadTrainingData(String filename, List<String> images, Mat facePoints) {
        return loadTrainingData_2(filename, images, facePoints.nativeObj);
    }


    //
    // C++:  bool cv::face::loadTrainingData(String imageList, String groundTruth, vector_String images, Mat& facePoints, float offset = 0.0f)
    //

    /**
     * A utility to load facial landmark information from the dataset.
     *
     * @param imageList A file contains the list of image filenames in the training dataset.
     * @param groundTruth A file contains the list of filenames
     * where the landmarks points information are stored.
     * The content in each file should follow the standard format (see face::loadFacePoints).
     * @param images A vector where each element represent the filename of image in the dataset.
     * Images are not loaded by default to save the memory.
     * @param facePoints The loaded landmark points for all training data.
     * @param offset An offset value to adjust the loaded points.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * cv::String imageFiles = "../data/images_train.txt";
     * cv::String ptsFiles = "../data/points_train.txt";
     * std::vector&lt;String&gt; images;
     * std::vector&lt;std::vector&lt;Point2f&gt; &gt; facePoints;
     * loadTrainingData(imageFiles, ptsFiles, images, facePoints, 0.0f);
     * </code>
     *
     * example of content in the images_train.txt
     * <code>
     * /home/user/ibug/image_003_1.jpg
     * /home/user/ibug/image_004_1.jpg
     * /home/user/ibug/image_005_1.jpg
     * /home/user/ibug/image_006.jpg
     * </code>
     *
     * example of content in the points_train.txt
     * <code>
     * /home/user/ibug/image_003_1.pts
     * /home/user/ibug/image_004_1.pts
     * /home/user/ibug/image_005_1.pts
     * /home/user/ibug/image_006.pts
     * </code>
     * @return automatically generated
     */
    public static boolean loadTrainingData(String imageList, String groundTruth, List<String> images, Mat facePoints, float offset) {
        return loadTrainingData_3(imageList, groundTruth, images, facePoints.nativeObj, offset);
    }

    /**
     * A utility to load facial landmark information from the dataset.
     *
     * @param imageList A file contains the list of image filenames in the training dataset.
     * @param groundTruth A file contains the list of filenames
     * where the landmarks points information are stored.
     * The content in each file should follow the standard format (see face::loadFacePoints).
     * @param images A vector where each element represent the filename of image in the dataset.
     * Images are not loaded by default to save the memory.
     * @param facePoints The loaded landmark points for all training data.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * cv::String imageFiles = "../data/images_train.txt";
     * cv::String ptsFiles = "../data/points_train.txt";
     * std::vector&lt;String&gt; images;
     * std::vector&lt;std::vector&lt;Point2f&gt; &gt; facePoints;
     * loadTrainingData(imageFiles, ptsFiles, images, facePoints, 0.0f);
     * </code>
     *
     * example of content in the images_train.txt
     * <code>
     * /home/user/ibug/image_003_1.jpg
     * /home/user/ibug/image_004_1.jpg
     * /home/user/ibug/image_005_1.jpg
     * /home/user/ibug/image_006.jpg
     * </code>
     *
     * example of content in the points_train.txt
     * <code>
     * /home/user/ibug/image_003_1.pts
     * /home/user/ibug/image_004_1.pts
     * /home/user/ibug/image_005_1.pts
     * /home/user/ibug/image_006.pts
     * </code>
     * @return automatically generated
     */
    public static boolean loadTrainingData(String imageList, String groundTruth, List<String> images, Mat facePoints) {
        return loadTrainingData_4(imageList, groundTruth, images, facePoints.nativeObj);
    }


    //
    // C++:  bool cv::face::loadTrainingData(vector_String filename, vector_vector_Point2f trainlandmarks, vector_String trainimages)
    //

    /**
     * This function extracts the data for training from .txt files which contains the corresponding image name and landmarks.
     * The first file in each file should give the path of the image whose
     * landmarks are being described in the file. Then in the subsequent
     * lines there should be coordinates of the landmarks in the image
     * i.e each line should be of the form x,y
     * where x represents the x coordinate of the landmark and y represents
     * the y coordinate of the landmark.
     *
     * For reference you can see the files as provided in the
     * &lt;a href="http://www.ifp.illinois.edu/~vuongle2/helen/"&gt;HELEN dataset&lt;/a&gt;
     *
     * @param filename A vector of type cv::String containing name of the .txt files.
     * @param trainlandmarks A vector of type cv::Point2f that would store shape or landmarks of all images.
     * @param trainimages A vector of type cv::String which stores the name of images whose landmarks are tracked
     * @return A boolean value. It returns true when it reads the data successfully and false otherwise
     */
    public static boolean loadTrainingData(List<String> filename, List<MatOfPoint2f> trainlandmarks, List<String> trainimages) {
        List<Mat> trainlandmarks_tmplm = new ArrayList<Mat>((trainlandmarks != null) ? trainlandmarks.size() : 0);
        Mat trainlandmarks_mat = Converters.vector_vector_Point2f_to_Mat(trainlandmarks, trainlandmarks_tmplm);
        return loadTrainingData_5(filename, trainlandmarks_mat.nativeObj, trainimages);
    }


    //
    // C++:  void cv::face::drawFacemarks(Mat& image, Mat points, Scalar color = Scalar(255,0,0))
    //

    /**
     * Utility to draw the detected facial landmark points
     *
     * @param image The input image to be processed.
     * @param points Contains the data of points which will be drawn.
     * @param color The color of points in BGR format represented by cv::Scalar.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * std::vector&lt;Rect&gt; faces;
     * std::vector&lt;std::vector&lt;Point2f&gt; &gt; landmarks;
     * facemark-&gt;getFaces(img, faces);
     * facemark-&gt;fit(img, faces, landmarks);
     * for(int j=0;j&lt;rects.size();j++){
     *     face::drawFacemarks(frame, landmarks[j], Scalar(0,0,255));
     * }
     * </code>
     */
    public static void drawFacemarks(Mat image, Mat points, Scalar color) {
        drawFacemarks_0(image.nativeObj, points.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);
    }

    /**
     * Utility to draw the detected facial landmark points
     *
     * @param image The input image to be processed.
     * @param points Contains the data of points which will be drawn.
     *
     * &lt;B&gt;Example of usage&lt;/B&gt;
     * <code>
     * std::vector&lt;Rect&gt; faces;
     * std::vector&lt;std::vector&lt;Point2f&gt; &gt; landmarks;
     * facemark-&gt;getFaces(img, faces);
     * facemark-&gt;fit(img, faces, landmarks);
     * for(int j=0;j&lt;rects.size();j++){
     *     face::drawFacemarks(frame, landmarks[j], Scalar(0,0,255));
     * }
     * </code>
     */
    public static void drawFacemarks(Mat image, Mat points) {
        drawFacemarks_1(image.nativeObj, points.nativeObj);
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
