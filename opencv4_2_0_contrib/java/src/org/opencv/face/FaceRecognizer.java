//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.face;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfInt;
import org.opencv.face.PredictCollector;
import org.opencv.utils.Converters;

// C++: class FaceRecognizer
/**
 * Abstract base class for all face recognition models
 *
 * All face recognition models in OpenCV are derived from the abstract base class FaceRecognizer, which
 * provides a unified access to all face recongition algorithms in OpenCV.
 *
 * ### Description
 *
 * I'll go a bit more into detail explaining FaceRecognizer, because it doesn't look like a powerful
 * interface at first sight. But: Every FaceRecognizer is an Algorithm, so you can easily get/set all
 * model internals (if allowed by the implementation). Algorithm is a relatively new OpenCV concept,
 * which is available since the 2.4 release. I suggest you take a look at its description.
 *
 * Algorithm provides the following features for all derived classes:
 *
 * <ul>
 *   <li>
 *    So called "virtual constructor". That is, each Algorithm derivative is registered at program
 *     start and you can get the list of registered algorithms and create instance of a particular
 *     algorithm by its name (see Algorithm::create). If you plan to add your own algorithms, it is
 *     good practice to add a unique prefix to your algorithms to distinguish them from other
 *     algorithms.
 *   </li>
 *   <li>
 *    Setting/Retrieving algorithm parameters by name. If you used video capturing functionality from
 *     OpenCV highgui module, you are probably familar with cv::cvSetCaptureProperty,
 * ocvcvGetCaptureProperty, VideoCapture::set and VideoCapture::get. Algorithm provides similar
 *     method where instead of integer id's you specify the parameter names as text Strings. See
 *     Algorithm::set and Algorithm::get for details.
 *   </li>
 *   <li>
 *    Reading and writing parameters from/to XML or YAML files. Every Algorithm derivative can store
 *     all its parameters and then read them back. There is no need to re-implement it each time.
 *   </li>
 * </ul>
 *
 * Moreover every FaceRecognizer supports the:
 *
 * <ul>
 *   <li>
 *    <b>Training</b> of a FaceRecognizer with FaceRecognizer::train on a given set of images (your face
 *     database!).
 *   </li>
 *   <li>
 *    <b>Prediction</b> of a given sample image, that means a face. The image is given as a Mat.
 *   </li>
 *   <li>
 *    <b>Loading/Saving</b> the model state from/to a given XML or YAML.
 *   </li>
 *   <li>
 *    <b>Setting/Getting labels info</b>, that is stored as a string. String labels info is useful for
 *     keeping names of the recognized people.
 *   </li>
 * </ul>
 *
 * <b>Note:</b> When using the FaceRecognizer interface in combination with Python, please stick to Python 2.
 * Some underlying scripts like create_csv will not work in other versions, like Python 3. Setting the
 * Thresholds +++++++++++++++++++++++
 *
 * Sometimes you run into the situation, when you want to apply a threshold on the prediction. A common
 * scenario in face recognition is to tell, whether a face belongs to the training dataset or if it is
 * unknown. You might wonder, why there's no public API in FaceRecognizer to set the threshold for the
 * prediction, but rest assured: It's supported. It just means there's no generic way in an abstract
 * class to provide an interface for setting/getting the thresholds of *every possible* FaceRecognizer
 * algorithm. The appropriate place to set the thresholds is in the constructor of the specific
 * FaceRecognizer and since every FaceRecognizer is a Algorithm (see above), you can get/set the
 * thresholds at runtime!
 *
 * Here is an example of setting a threshold for the Eigenfaces method, when creating the model:
 *
 * <code>
 * // Let's say we want to keep 10 Eigenfaces and have a threshold value of 10.0
 * int num_components = 10;
 * double threshold = 10.0;
 * // Then if you want to have a cv::FaceRecognizer with a confidence threshold,
 * // create the concrete implementation with the appropriate parameters:
 * Ptr&lt;FaceRecognizer&gt; model = EigenFaceRecognizer::create(num_components, threshold);
 * </code>
 *
 * Sometimes it's impossible to train the model, just to experiment with threshold values. Thanks to
 * Algorithm it's possible to set internal model thresholds during runtime. Let's see how we would
 * set/get the prediction for the Eigenface model, we've created above:
 *
 * <code>
 * // The following line reads the threshold from the Eigenfaces model:
 * double current_threshold = model-&gt;getDouble("threshold");
 * // And this line sets the threshold to 0.0:
 * model-&gt;set("threshold", 0.0);
 * </code>
 *
 * If you've set the threshold to 0.0 as we did above, then:
 *
 * <code>
 * //
 * Mat img = imread("person1/3.jpg", IMREAD_GRAYSCALE);
 * // Get a prediction from the model. Note: We've set a threshold of 0.0 above,
 * // since the distance is almost always larger than 0.0, you'll get -1 as
 * // label, which indicates, this face is unknown
 * int predicted_label = model-&gt;predict(img);
 * // ...
 * </code>
 *
 * is going to yield -1 as predicted label, which states this face is unknown.
 *
 * ### Getting the name of a FaceRecognizer
 *
 * Since every FaceRecognizer is a Algorithm, you can use Algorithm::name to get the name of a
 * FaceRecognizer:
 *
 * <code>
 * // Create a FaceRecognizer:
 * Ptr&lt;FaceRecognizer&gt; model = EigenFaceRecognizer::create();
 * // And here's how to get its name:
 * String name = model-&gt;name();
 * </code>
 */
public class FaceRecognizer extends Algorithm {

    protected FaceRecognizer(long addr) { super(addr); }

    // internal usage only
    public static FaceRecognizer __fromPtr__(long addr) { return new FaceRecognizer(addr); }

    //
    // C++:  String cv::face::FaceRecognizer::getLabelInfo(int label)
    //

    /**
     * Gets string information by label.
     *
     *     If an unknown label id is provided or there is no label information associated with the specified
     *     label id the method returns an empty string.
     * @param label automatically generated
     * @return automatically generated
     */
    public String getLabelInfo(int label) {
        return getLabelInfo_0(nativeObj, label);
    }


    //
    // C++:  int cv::face::FaceRecognizer::predict(Mat src)
    //

    public int predict_label(Mat src) {
        return predict_label_0(nativeObj, src.nativeObj);
    }


    //
    // C++:  vector_int cv::face::FaceRecognizer::getLabelsByString(String str)
    //

    /**
     * Gets vector of labels by string.
     *
     *     The function searches for the labels containing the specified sub-string in the associated string
     *     info.
     * @param str automatically generated
     * @return automatically generated
     */
    public MatOfInt getLabelsByString(String str) {
        return MatOfInt.fromNativeAddr(getLabelsByString_0(nativeObj, str));
    }


    //
    // C++:  void cv::face::FaceRecognizer::predict(Mat src, Ptr_PredictCollector collector)
    //

    /**
     * <ul>
     *   <li>
     *  if implemented - send all result of prediction to collector that can be used for somehow custom result handling
     *     @param src Sample image to get a prediction from.
     *     @param collector User-defined collector object that accepts all results
     *   </li>
     * </ul>
     *
     *     To implement this method u just have to do same internal cycle as in predict(InputArray src, CV_OUT int &amp;label, CV_OUT double &amp;confidence) but
     *     not try to get "best@ result, just resend it to caller side with given collector
     */
    public void predict_collect(Mat src, PredictCollector collector) {
        predict_collect_0(nativeObj, src.nativeObj, collector.getNativeObjAddr());
    }


    //
    // C++:  void cv::face::FaceRecognizer::predict(Mat src, int& label, double& confidence)
    //

    /**
     * Predicts a label and associated confidence (e.g. distance) for a given input image.
     *
     *     @param src Sample image to get a prediction from.
     *     @param label The predicted label for the given image.
     *     @param confidence Associated confidence (e.g. distance) for the predicted label.
     *
     *     The suffix const means that prediction does not affect the internal model state, so the method can
     *     be safely called from within different threads.
     *
     *     The following example shows how to get a prediction from a trained model:
     *
     *     <code>
     *     using namespace cv;
     *     // Do your initialization here (create the cv::FaceRecognizer model) ...
     *     // ...
     *     // Read in a sample image:
     *     Mat img = imread("person1/3.jpg", IMREAD_GRAYSCALE);
     *     // And get a prediction from the cv::FaceRecognizer:
     *     int predicted = model-&gt;predict(img);
     *     </code>
     *
     *     Or to get a prediction and the associated confidence (e.g. distance):
     *
     *     <code>
     *     using namespace cv;
     *     // Do your initialization here (create the cv::FaceRecognizer model) ...
     *     // ...
     *     Mat img = imread("person1/3.jpg", IMREAD_GRAYSCALE);
     *     // Some variables for the predicted label and associated confidence (e.g. distance):
     *     int predicted_label = -1;
     *     double predicted_confidence = 0.0;
     *     // Get the prediction and associated confidence from the model
     *     model-&gt;predict(img, predicted_label, predicted_confidence);
     *     </code>
     */
    public void predict(Mat src, int[] label, double[] confidence) {
        double[] label_out = new double[1];
        double[] confidence_out = new double[1];
        predict_0(nativeObj, src.nativeObj, label_out, confidence_out);
        if(label!=null) label[0] = (int)label_out[0];
        if(confidence!=null) confidence[0] = (double)confidence_out[0];
    }


    //
    // C++:  void cv::face::FaceRecognizer::read(String filename)
    //

    /**
     * Loads a FaceRecognizer and its model state.
     *
     *     Loads a persisted model and state from a given XML or YAML file . Every FaceRecognizer has to
     *     overwrite FaceRecognizer::load(FileStorage&amp; fs) to enable loading the model state.
     *     FaceRecognizer::load(FileStorage&amp; fs) in turn gets called by
     *     FaceRecognizer::load(const String&amp; filename), to ease saving a model.
     * @param filename automatically generated
     */
    public void read(String filename) {
        read_0(nativeObj, filename);
    }


    //
    // C++:  void cv::face::FaceRecognizer::setLabelInfo(int label, String strInfo)
    //

    /**
     * Sets string info for the specified model's label.
     *
     *     The string info is replaced by the provided value if it was set before for the specified label.
     * @param label automatically generated
     * @param strInfo automatically generated
     */
    public void setLabelInfo(int label, String strInfo) {
        setLabelInfo_0(nativeObj, label, strInfo);
    }


    //
    // C++:  void cv::face::FaceRecognizer::train(vector_Mat src, Mat labels)
    //

    /**
     * Trains a FaceRecognizer with given data and associated labels.
     *
     *     @param src The training images, that means the faces you want to learn. The data has to be
     *     given as a vector&lt;Mat&gt;.
     *     @param labels The labels corresponding to the images have to be given either as a vector&lt;int&gt;
     *     or a Mat of type CV_32SC1.
     *
     *     The following source code snippet shows you how to learn a Fisherfaces model on a given set of
     *     images. The images are read with imread and pushed into a std::vector&lt;Mat&gt;. The labels of each
     *     image are stored within a std::vector&lt;int&gt; (you could also use a Mat of type CV_32SC1). Think of
     *     the label as the subject (the person) this image belongs to, so same subjects (persons) should have
     *     the same label. For the available FaceRecognizer you don't have to pay any attention to the order of
     *     the labels, just make sure same persons have the same label:
     *
     *     <code>
     *     // holds images and labels
     *     vector&lt;Mat&gt; images;
     *     vector&lt;int&gt; labels;
     *     // using Mat of type CV_32SC1
     *     // Mat labels(number_of_samples, 1, CV_32SC1);
     *     // images for first person
     *     images.push_back(imread("person0/0.jpg", IMREAD_GRAYSCALE)); labels.push_back(0);
     *     images.push_back(imread("person0/1.jpg", IMREAD_GRAYSCALE)); labels.push_back(0);
     *     images.push_back(imread("person0/2.jpg", IMREAD_GRAYSCALE)); labels.push_back(0);
     *     // images for second person
     *     images.push_back(imread("person1/0.jpg", IMREAD_GRAYSCALE)); labels.push_back(1);
     *     images.push_back(imread("person1/1.jpg", IMREAD_GRAYSCALE)); labels.push_back(1);
     *     images.push_back(imread("person1/2.jpg", IMREAD_GRAYSCALE)); labels.push_back(1);
     *     </code>
     *
     *     Now that you have read some images, we can create a new FaceRecognizer. In this example I'll create
     *     a Fisherfaces model and decide to keep all of the possible Fisherfaces:
     *
     *     <code>
     *     // Create a new Fisherfaces model and retain all available Fisherfaces,
     *     // this is the most common usage of this specific FaceRecognizer:
     *     //
     *     Ptr&lt;FaceRecognizer&gt; model =  FisherFaceRecognizer::create();
     *     </code>
     *
     *     And finally train it on the given dataset (the face images and labels):
     *
     *     <code>
     *     // This is the common interface to train all of the available cv::FaceRecognizer
     *     // implementations:
     *     //
     *     model-&gt;train(images, labels);
     *     </code>
     */
    public void train(List<Mat> src, Mat labels) {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        train_0(nativeObj, src_mat.nativeObj, labels.nativeObj);
    }


    //
    // C++:  void cv::face::FaceRecognizer::update(vector_Mat src, Mat labels)
    //

    /**
     * Updates a FaceRecognizer with given data and associated labels.
     *
     *     @param src The training images, that means the faces you want to learn. The data has to be given
     *     as a vector&lt;Mat&gt;.
     *     @param labels The labels corresponding to the images have to be given either as a vector&lt;int&gt; or
     *     a Mat of type CV_32SC1.
     *
     *     This method updates a (probably trained) FaceRecognizer, but only if the algorithm supports it. The
     *     Local Binary Patterns Histograms (LBPH) recognizer (see createLBPHFaceRecognizer) can be updated.
     *     For the Eigenfaces and Fisherfaces method, this is algorithmically not possible and you have to
     *     re-estimate the model with FaceRecognizer::train. In any case, a call to train empties the existing
     *     model and learns a new model, while update does not delete any model data.
     *
     *     <code>
     *     // Create a new LBPH model (it can be updated) and use the default parameters,
     *     // this is the most common usage of this specific FaceRecognizer:
     *     //
     *     Ptr&lt;FaceRecognizer&gt; model =  LBPHFaceRecognizer::create();
     *     // This is the common interface to train all of the available cv::FaceRecognizer
     *     // implementations:
     *     //
     *     model-&gt;train(images, labels);
     *     // Some containers to hold new image:
     *     vector&lt;Mat&gt; newImages;
     *     vector&lt;int&gt; newLabels;
     *     // You should add some images to the containers:
     *     //
     *     // ...
     *     //
     *     // Now updating the model is as easy as calling:
     *     model-&gt;update(newImages,newLabels);
     *     // This will preserve the old model data and extend the existing model
     *     // with the new features extracted from newImages!
     *     </code>
     *
     *     Calling update on an Eigenfaces model (see EigenFaceRecognizer::create), which doesn't support
     *     updating, will throw an error similar to:
     *
     *     <code>
     *     OpenCV Error: The function/feature is not implemented (This FaceRecognizer (FaceRecognizer.Eigenfaces) does not support updating, you have to use FaceRecognizer::train to update it.) in update, file /home/philipp/git/opencv/modules/contrib/src/facerec.cpp, line 305
     *     terminate called after throwing an instance of 'cv::Exception'
     *     </code>
     *
     *     <b>Note:</b> The FaceRecognizer does not store your training images, because this would be very
     *     memory intense and it's not the responsibility of te FaceRecognizer to do so. The caller is
     *     responsible for maintaining the dataset, he want to work with.
     */
    public void update(List<Mat> src, Mat labels) {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        update_0(nativeObj, src_mat.nativeObj, labels.nativeObj);
    }


    //
    // C++:  void cv::face::FaceRecognizer::write(String filename)
    //

    /**
     * Saves a FaceRecognizer and its model state.
     *
     *     Saves this model to a given filename, either as XML or YAML.
     *     @param filename The filename to store this FaceRecognizer to (either XML/YAML).
     *
     *     Every FaceRecognizer overwrites FaceRecognizer::save(FileStorage&amp; fs) to save the internal model
     *     state. FaceRecognizer::save(const String&amp; filename) saves the state of a model to the given
     *     filename.
     *
     *     The suffix const means that prediction does not affect the internal model state, so the method can
     *     be safely called from within different threads.
     */
    public void write(String filename) {
        write_0(nativeObj, filename);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  String cv::face::FaceRecognizer::getLabelInfo(int label)
    private static native String getLabelInfo_0(long nativeObj, int label);

    // C++:  int cv::face::FaceRecognizer::predict(Mat src)
    private static native int predict_label_0(long nativeObj, long src_nativeObj);

    // C++:  vector_int cv::face::FaceRecognizer::getLabelsByString(String str)
    private static native long getLabelsByString_0(long nativeObj, String str);

    // C++:  void cv::face::FaceRecognizer::predict(Mat src, Ptr_PredictCollector collector)
    private static native void predict_collect_0(long nativeObj, long src_nativeObj, long collector_nativeObj);

    // C++:  void cv::face::FaceRecognizer::predict(Mat src, int& label, double& confidence)
    private static native void predict_0(long nativeObj, long src_nativeObj, double[] label_out, double[] confidence_out);

    // C++:  void cv::face::FaceRecognizer::read(String filename)
    private static native void read_0(long nativeObj, String filename);

    // C++:  void cv::face::FaceRecognizer::setLabelInfo(int label, String strInfo)
    private static native void setLabelInfo_0(long nativeObj, int label, String strInfo);

    // C++:  void cv::face::FaceRecognizer::train(vector_Mat src, Mat labels)
    private static native void train_0(long nativeObj, long src_mat_nativeObj, long labels_nativeObj);

    // C++:  void cv::face::FaceRecognizer::update(vector_Mat src, Mat labels)
    private static native void update_0(long nativeObj, long src_mat_nativeObj, long labels_nativeObj);

    // C++:  void cv::face::FaceRecognizer::write(String filename)
    private static native void write_0(long nativeObj, String filename);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
