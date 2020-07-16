//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfPoint2f;
import org.opencv.utils.Converters;
import org.opencv.xfeatures2d.PCTSignatures;

// C++: class PCTSignatures
/**
 * Class implementing PCT (position-color-texture) signature extraction
 * as described in CITE: KrulisLS16.
 * The algorithm is divided to a feature sampler and a clusterizer.
 * Feature sampler produces samples at given set of coordinates.
 * Clusterizer then produces clusters of these samples using k-means algorithm.
 * Resulting set of clusters is the signature of the input image.
 *
 * A signature is an array of SIGNATURE_DIMENSION-dimensional points.
 * Used dimensions are:
 * weight, x, y position; lab color, contrast, entropy.
 * CITE: KrulisLS16
 * CITE: BeecksUS10
 */
public class PCTSignatures extends Algorithm {

    protected PCTSignatures(long addr) { super(addr); }

    // internal usage only
    public static PCTSignatures __fromPtr__(long addr) { return new PCTSignatures(addr); }

    // C++: enum PointDistribution
    public static final int
            UNIFORM = 0,
            REGULAR = 1,
            NORMAL = 2;


    // C++: enum SimilarityFunction
    public static final int
            MINUS = 0,
            GAUSSIAN = 1,
            HEURISTIC = 2;


    // C++: enum DistanceFunction
    public static final int
            L0_25 = 0,
            L0_5 = 1,
            L1 = 2,
            L2 = 3,
            L2SQUARED = 4,
            L5 = 5,
            L_INFINITY = 6;


    //
    // C++: static Ptr_PCTSignatures cv::xfeatures2d::PCTSignatures::create(int initSampleCount = 2000, int initSeedCount = 400, int pointDistribution = 0)
    //

    /**
     * Creates PCTSignatures algorithm using sample and seed count.
     * It generates its own sets of sampling points and clusterization seed indexes.
     * @param initSampleCount Number of points used for image sampling.
     * @param initSeedCount Number of initial clusterization seeds.
     * Must be lower or equal to initSampleCount
     * @param pointDistribution Distribution of generated points. Default: UNIFORM.
     * Available: UNIFORM, REGULAR, NORMAL.
     * @return Created algorithm.
     */
    public static PCTSignatures create(int initSampleCount, int initSeedCount, int pointDistribution) {
        return PCTSignatures.__fromPtr__(create_0(initSampleCount, initSeedCount, pointDistribution));
    }

    /**
     * Creates PCTSignatures algorithm using sample and seed count.
     * It generates its own sets of sampling points and clusterization seed indexes.
     * @param initSampleCount Number of points used for image sampling.
     * @param initSeedCount Number of initial clusterization seeds.
     * Must be lower or equal to initSampleCount
     * Available: UNIFORM, REGULAR, NORMAL.
     * @return Created algorithm.
     */
    public static PCTSignatures create(int initSampleCount, int initSeedCount) {
        return PCTSignatures.__fromPtr__(create_1(initSampleCount, initSeedCount));
    }

    /**
     * Creates PCTSignatures algorithm using sample and seed count.
     * It generates its own sets of sampling points and clusterization seed indexes.
     * @param initSampleCount Number of points used for image sampling.
     * Must be lower or equal to initSampleCount
     * Available: UNIFORM, REGULAR, NORMAL.
     * @return Created algorithm.
     */
    public static PCTSignatures create(int initSampleCount) {
        return PCTSignatures.__fromPtr__(create_2(initSampleCount));
    }

    /**
     * Creates PCTSignatures algorithm using sample and seed count.
     * It generates its own sets of sampling points and clusterization seed indexes.
     * Must be lower or equal to initSampleCount
     * Available: UNIFORM, REGULAR, NORMAL.
     * @return Created algorithm.
     */
    public static PCTSignatures create() {
        return PCTSignatures.__fromPtr__(create_3());
    }


    //
    // C++: static Ptr_PCTSignatures cv::xfeatures2d::PCTSignatures::create(vector_Point2f initSamplingPoints, int initSeedCount)
    //

    /**
     * Creates PCTSignatures algorithm using pre-generated sampling points
     * and number of clusterization seeds. It uses the provided
     * sampling points and generates its own clusterization seed indexes.
     * @param initSamplingPoints Sampling points used in image sampling.
     * @param initSeedCount Number of initial clusterization seeds.
     * Must be lower or equal to initSamplingPoints.size().
     * @return Created algorithm.
     */
    public static PCTSignatures create(MatOfPoint2f initSamplingPoints, int initSeedCount) {
        Mat initSamplingPoints_mat = initSamplingPoints;
        return PCTSignatures.__fromPtr__(create_4(initSamplingPoints_mat.nativeObj, initSeedCount));
    }


    //
    // C++: static Ptr_PCTSignatures cv::xfeatures2d::PCTSignatures::create(vector_Point2f initSamplingPoints, vector_int initClusterSeedIndexes)
    //

    /**
     * Creates PCTSignatures algorithm using pre-generated sampling points
     * and clusterization seeds indexes.
     * @param initSamplingPoints Sampling points used in image sampling.
     * @param initClusterSeedIndexes Indexes of initial clusterization seeds.
     * Its size must be lower or equal to initSamplingPoints.size().
     * @return Created algorithm.
     */
    public static PCTSignatures create(MatOfPoint2f initSamplingPoints, MatOfInt initClusterSeedIndexes) {
        Mat initSamplingPoints_mat = initSamplingPoints;
        Mat initClusterSeedIndexes_mat = initClusterSeedIndexes;
        return PCTSignatures.__fromPtr__(create_5(initSamplingPoints_mat.nativeObj, initClusterSeedIndexes_mat.nativeObj));
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getDropThreshold()
    //

    /**
     * Remove centroids in k-means whose weight is lesser or equal to given threshold.
     * @return automatically generated
     */
    public float getDropThreshold() {
        return getDropThreshold_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getJoiningDistance()
    //

    /**
     * Threshold euclidean distance between two centroids.
     * If two cluster centers are closer than this distance,
     * one of the centroid is dismissed and points are reassigned.
     * @return automatically generated
     */
    public float getJoiningDistance() {
        return getJoiningDistance_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightA()
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @return automatically generated
     */
    public float getWeightA() {
        return getWeightA_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightB()
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @return automatically generated
     */
    public float getWeightB() {
        return getWeightB_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightContrast()
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @return automatically generated
     */
    public float getWeightContrast() {
        return getWeightContrast_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightEntropy()
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @return automatically generated
     */
    public float getWeightEntropy() {
        return getWeightEntropy_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightL()
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @return automatically generated
     */
    public float getWeightL() {
        return getWeightL_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightX()
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @return automatically generated
     */
    public float getWeightX() {
        return getWeightX_0(nativeObj);
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightY()
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @return automatically generated
     */
    public float getWeightY() {
        return getWeightY_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getClusterMinSize()
    //

    /**
     * This parameter multiplied by the index of iteration gives lower limit for cluster size.
     * Clusters containing fewer points than specified by the limit have their centroid dismissed
     * and points are reassigned.
     * @return automatically generated
     */
    public int getClusterMinSize() {
        return getClusterMinSize_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getDistanceFunction()
    //

    /**
     * Distance function selector used for measuring distance between two points in k-means.
     * @return automatically generated
     */
    public int getDistanceFunction() {
        return getDistanceFunction_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getGrayscaleBits()
    //

    /**
     * Color resolution of the greyscale bitmap represented in allocated bits
     * (i.e., value 4 means that 16 shades of grey are used).
     * The greyscale bitmap is used for computing contrast and entropy values.
     * @return automatically generated
     */
    public int getGrayscaleBits() {
        return getGrayscaleBits_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getInitSeedCount()
    //

    /**
     * Number of initial seeds (initial number of clusters) for the k-means algorithm.
     * @return automatically generated
     */
    public int getInitSeedCount() {
        return getInitSeedCount_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getIterationCount()
    //

    /**
     * Number of iterations of the k-means clustering.
     * We use fixed number of iterations, since the modified clustering is pruning clusters
     * (not iteratively refining k clusters).
     * @return automatically generated
     */
    public int getIterationCount() {
        return getIterationCount_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getMaxClustersCount()
    //

    /**
     * Maximal number of generated clusters. If the number is exceeded,
     * the clusters are sorted by their weights and the smallest clusters are cropped.
     * @return automatically generated
     */
    public int getMaxClustersCount() {
        return getMaxClustersCount_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getSampleCount()
    //

    /**
     * Number of initial samples taken from the image.
     * @return automatically generated
     */
    public int getSampleCount() {
        return getSampleCount_0(nativeObj);
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getWindowRadius()
    //

    /**
     * Size of the texture sampling window used to compute contrast and entropy
     * (center of the window is always in the pixel selected by x,y coordinates
     * of the corresponding feature sample).
     * @return automatically generated
     */
    public int getWindowRadius() {
        return getWindowRadius_0(nativeObj);
    }


    //
    // C++:  vector_Point2f cv::xfeatures2d::PCTSignatures::getSamplingPoints()
    //

    /**
     * Initial samples taken from the image.
     * These sampled features become the input for clustering.
     * @return automatically generated
     */
    public MatOfPoint2f getSamplingPoints() {
        return MatOfPoint2f.fromNativeAddr(getSamplingPoints_0(nativeObj));
    }


    //
    // C++:  vector_int cv::xfeatures2d::PCTSignatures::getInitSeedIndexes()
    //

    /**
     * Initial seeds (initial number of clusters) for the k-means algorithm.
     * @return automatically generated
     */
    public MatOfInt getInitSeedIndexes() {
        return MatOfInt.fromNativeAddr(getInitSeedIndexes_0(nativeObj));
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::computeSignature(Mat image, Mat& signature)
    //

    /**
     * Computes signature of given image.
     * @param image Input image of CV_8U type.
     * @param signature Output computed signature.
     */
    public void computeSignature(Mat image, Mat signature) {
        computeSignature_0(nativeObj, image.nativeObj, signature.nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::computeSignatures(vector_Mat images, vector_Mat signatures)
    //

    /**
     * Computes signatures for multiple images in parallel.
     * @param images Vector of input images of CV_8U type.
     * @param signatures Vector of computed signatures.
     */
    public void computeSignatures(List<Mat> images, List<Mat> signatures) {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat signatures_mat = Converters.vector_Mat_to_Mat(signatures);
        computeSignatures_0(nativeObj, images_mat.nativeObj, signatures_mat.nativeObj);
    }


    //
    // C++: static void cv::xfeatures2d::PCTSignatures::drawSignature(Mat source, Mat signature, Mat& result, float radiusToShorterSideRatio = 1.0 / 8, int borderThickness = 1)
    //

    /**
     * Draws signature in the source image and outputs the result.
     * Signatures are visualized as a circle
     * with radius based on signature weight
     * and color based on signature color.
     * Contrast and entropy are not visualized.
     * @param source Source image.
     * @param signature Image signature.
     * @param result Output result.
     * @param radiusToShorterSideRatio Determines maximal radius of signature in the output image.
     * @param borderThickness Border thickness of the visualized signature.
     */
    public static void drawSignature(Mat source, Mat signature, Mat result, float radiusToShorterSideRatio, int borderThickness) {
        drawSignature_0(source.nativeObj, signature.nativeObj, result.nativeObj, radiusToShorterSideRatio, borderThickness);
    }

    /**
     * Draws signature in the source image and outputs the result.
     * Signatures are visualized as a circle
     * with radius based on signature weight
     * and color based on signature color.
     * Contrast and entropy are not visualized.
     * @param source Source image.
     * @param signature Image signature.
     * @param result Output result.
     * @param radiusToShorterSideRatio Determines maximal radius of signature in the output image.
     */
    public static void drawSignature(Mat source, Mat signature, Mat result, float radiusToShorterSideRatio) {
        drawSignature_1(source.nativeObj, signature.nativeObj, result.nativeObj, radiusToShorterSideRatio);
    }

    /**
     * Draws signature in the source image and outputs the result.
     * Signatures are visualized as a circle
     * with radius based on signature weight
     * and color based on signature color.
     * Contrast and entropy are not visualized.
     * @param source Source image.
     * @param signature Image signature.
     * @param result Output result.
     */
    public static void drawSignature(Mat source, Mat signature, Mat result) {
        drawSignature_2(source.nativeObj, signature.nativeObj, result.nativeObj);
    }


    //
    // C++: static void cv::xfeatures2d::PCTSignatures::generateInitPoints(vector_Point2f initPoints, int count, int pointDistribution)
    //

    /**
     * Generates initial sampling points according to selected point distribution.
     * @param initPoints Output vector where the generated points will be saved.
     * @param count Number of points to generate.
     * @param pointDistribution Point distribution selector.
     * Available: UNIFORM, REGULAR, NORMAL.
     * <b>Note:</b> Generated coordinates are in range [0..1)
     */
    public static void generateInitPoints(MatOfPoint2f initPoints, int count, int pointDistribution) {
        Mat initPoints_mat = initPoints;
        generateInitPoints_0(initPoints_mat.nativeObj, count, pointDistribution);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setClusterMinSize(int clusterMinSize)
    //

    /**
     * This parameter multiplied by the index of iteration gives lower limit for cluster size.
     * Clusters containing fewer points than specified by the limit have their centroid dismissed
     * and points are reassigned.
     * @param clusterMinSize automatically generated
     */
    public void setClusterMinSize(int clusterMinSize) {
        setClusterMinSize_0(nativeObj, clusterMinSize);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setDistanceFunction(int distanceFunction)
    //

    /**
     * Distance function selector used for measuring distance between two points in k-means.
     * Available: L0_25, L0_5, L1, L2, L2SQUARED, L5, L_INFINITY.
     * @param distanceFunction automatically generated
     */
    public void setDistanceFunction(int distanceFunction) {
        setDistanceFunction_0(nativeObj, distanceFunction);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setDropThreshold(float dropThreshold)
    //

    /**
     * Remove centroids in k-means whose weight is lesser or equal to given threshold.
     * @param dropThreshold automatically generated
     */
    public void setDropThreshold(float dropThreshold) {
        setDropThreshold_0(nativeObj, dropThreshold);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setGrayscaleBits(int grayscaleBits)
    //

    /**
     * Color resolution of the greyscale bitmap represented in allocated bits
     * (i.e., value 4 means that 16 shades of grey are used).
     * The greyscale bitmap is used for computing contrast and entropy values.
     * @param grayscaleBits automatically generated
     */
    public void setGrayscaleBits(int grayscaleBits) {
        setGrayscaleBits_0(nativeObj, grayscaleBits);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setInitSeedIndexes(vector_int initSeedIndexes)
    //

    /**
     * Initial seed indexes for the k-means algorithm.
     * @param initSeedIndexes automatically generated
     */
    public void setInitSeedIndexes(MatOfInt initSeedIndexes) {
        Mat initSeedIndexes_mat = initSeedIndexes;
        setInitSeedIndexes_0(nativeObj, initSeedIndexes_mat.nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setIterationCount(int iterationCount)
    //

    /**
     * Number of iterations of the k-means clustering.
     * We use fixed number of iterations, since the modified clustering is pruning clusters
     * (not iteratively refining k clusters).
     * @param iterationCount automatically generated
     */
    public void setIterationCount(int iterationCount) {
        setIterationCount_0(nativeObj, iterationCount);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setJoiningDistance(float joiningDistance)
    //

    /**
     * Threshold euclidean distance between two centroids.
     * If two cluster centers are closer than this distance,
     * one of the centroid is dismissed and points are reassigned.
     * @param joiningDistance automatically generated
     */
    public void setJoiningDistance(float joiningDistance) {
        setJoiningDistance_0(nativeObj, joiningDistance);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setMaxClustersCount(int maxClustersCount)
    //

    /**
     * Maximal number of generated clusters. If the number is exceeded,
     * the clusters are sorted by their weights and the smallest clusters are cropped.
     * @param maxClustersCount automatically generated
     */
    public void setMaxClustersCount(int maxClustersCount) {
        setMaxClustersCount_0(nativeObj, maxClustersCount);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setSamplingPoints(vector_Point2f samplingPoints)
    //

    /**
     * Sets sampling points used to sample the input image.
     * @param samplingPoints Vector of sampling points in range [0..1)
     * <b>Note:</b> Number of sampling points must be greater or equal to clusterization seed count.
     */
    public void setSamplingPoints(MatOfPoint2f samplingPoints) {
        Mat samplingPoints_mat = samplingPoints;
        setSamplingPoints_0(nativeObj, samplingPoints_mat.nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setTranslation(int idx, float value)
    //

    /**
     * Translations of the individual axes of the feature space.
     * @param idx ID of the translation
     * @param value Value of the translation
     * <b>Note:</b>
     * WEIGHT_IDX = 0;
     * X_IDX = 1;
     * Y_IDX = 2;
     * L_IDX = 3;
     * A_IDX = 4;
     * B_IDX = 5;
     * CONTRAST_IDX = 6;
     * ENTROPY_IDX = 7;
     */
    public void setTranslation(int idx, float value) {
        setTranslation_0(nativeObj, idx, value);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setTranslations(vector_float translations)
    //

    /**
     * Translations of the individual axes of the feature space.
     * @param translations Values of all translations.
     * <b>Note:</b>
     * WEIGHT_IDX = 0;
     * X_IDX = 1;
     * Y_IDX = 2;
     * L_IDX = 3;
     * A_IDX = 4;
     * B_IDX = 5;
     * CONTRAST_IDX = 6;
     * ENTROPY_IDX = 7;
     */
    public void setTranslations(MatOfFloat translations) {
        Mat translations_mat = translations;
        setTranslations_0(nativeObj, translations_mat.nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeight(int idx, float value)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space.
     * @param idx ID of the weight
     * @param value Value of the weight
     * <b>Note:</b>
     * WEIGHT_IDX = 0;
     * X_IDX = 1;
     * Y_IDX = 2;
     * L_IDX = 3;
     * A_IDX = 4;
     * B_IDX = 5;
     * CONTRAST_IDX = 6;
     * ENTROPY_IDX = 7;
     */
    public void setWeight(int idx, float value) {
        setWeight_0(nativeObj, idx, value);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightA(float weight)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @param weight automatically generated
     */
    public void setWeightA(float weight) {
        setWeightA_0(nativeObj, weight);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightB(float weight)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @param weight automatically generated
     */
    public void setWeightB(float weight) {
        setWeightB_0(nativeObj, weight);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightContrast(float weight)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @param weight automatically generated
     */
    public void setWeightContrast(float weight) {
        setWeightContrast_0(nativeObj, weight);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightEntropy(float weight)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @param weight automatically generated
     */
    public void setWeightEntropy(float weight) {
        setWeightEntropy_0(nativeObj, weight);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightL(float weight)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @param weight automatically generated
     */
    public void setWeightL(float weight) {
        setWeightL_0(nativeObj, weight);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightX(float weight)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @param weight automatically generated
     */
    public void setWeightX(float weight) {
        setWeightX_0(nativeObj, weight);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightY(float weight)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space
     * (x,y = position; L,a,b = color in CIE Lab space; c = contrast. e = entropy)
     * @param weight automatically generated
     */
    public void setWeightY(float weight) {
        setWeightY_0(nativeObj, weight);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeights(vector_float weights)
    //

    /**
     * Weights (multiplicative constants) that linearly stretch individual axes of the feature space.
     * @param weights Values of all weights.
     * <b>Note:</b>
     * WEIGHT_IDX = 0;
     * X_IDX = 1;
     * Y_IDX = 2;
     * L_IDX = 3;
     * A_IDX = 4;
     * B_IDX = 5;
     * CONTRAST_IDX = 6;
     * ENTROPY_IDX = 7;
     */
    public void setWeights(MatOfFloat weights) {
        Mat weights_mat = weights;
        setWeights_0(nativeObj, weights_mat.nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWindowRadius(int radius)
    //

    /**
     * Size of the texture sampling window used to compute contrast and entropy
     * (center of the window is always in the pixel selected by x,y coordinates
     * of the corresponding feature sample).
     * @param radius automatically generated
     */
    public void setWindowRadius(int radius) {
        setWindowRadius_0(nativeObj, radius);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_PCTSignatures cv::xfeatures2d::PCTSignatures::create(int initSampleCount = 2000, int initSeedCount = 400, int pointDistribution = 0)
    private static native long create_0(int initSampleCount, int initSeedCount, int pointDistribution);
    private static native long create_1(int initSampleCount, int initSeedCount);
    private static native long create_2(int initSampleCount);
    private static native long create_3();

    // C++: static Ptr_PCTSignatures cv::xfeatures2d::PCTSignatures::create(vector_Point2f initSamplingPoints, int initSeedCount)
    private static native long create_4(long initSamplingPoints_mat_nativeObj, int initSeedCount);

    // C++: static Ptr_PCTSignatures cv::xfeatures2d::PCTSignatures::create(vector_Point2f initSamplingPoints, vector_int initClusterSeedIndexes)
    private static native long create_5(long initSamplingPoints_mat_nativeObj, long initClusterSeedIndexes_mat_nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getDropThreshold()
    private static native float getDropThreshold_0(long nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getJoiningDistance()
    private static native float getJoiningDistance_0(long nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightA()
    private static native float getWeightA_0(long nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightB()
    private static native float getWeightB_0(long nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightContrast()
    private static native float getWeightContrast_0(long nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightEntropy()
    private static native float getWeightEntropy_0(long nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightL()
    private static native float getWeightL_0(long nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightX()
    private static native float getWeightX_0(long nativeObj);

    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightY()
    private static native float getWeightY_0(long nativeObj);

    // C++:  int cv::xfeatures2d::PCTSignatures::getClusterMinSize()
    private static native int getClusterMinSize_0(long nativeObj);

    // C++:  int cv::xfeatures2d::PCTSignatures::getDistanceFunction()
    private static native int getDistanceFunction_0(long nativeObj);

    // C++:  int cv::xfeatures2d::PCTSignatures::getGrayscaleBits()
    private static native int getGrayscaleBits_0(long nativeObj);

    // C++:  int cv::xfeatures2d::PCTSignatures::getInitSeedCount()
    private static native int getInitSeedCount_0(long nativeObj);

    // C++:  int cv::xfeatures2d::PCTSignatures::getIterationCount()
    private static native int getIterationCount_0(long nativeObj);

    // C++:  int cv::xfeatures2d::PCTSignatures::getMaxClustersCount()
    private static native int getMaxClustersCount_0(long nativeObj);

    // C++:  int cv::xfeatures2d::PCTSignatures::getSampleCount()
    private static native int getSampleCount_0(long nativeObj);

    // C++:  int cv::xfeatures2d::PCTSignatures::getWindowRadius()
    private static native int getWindowRadius_0(long nativeObj);

    // C++:  vector_Point2f cv::xfeatures2d::PCTSignatures::getSamplingPoints()
    private static native long getSamplingPoints_0(long nativeObj);

    // C++:  vector_int cv::xfeatures2d::PCTSignatures::getInitSeedIndexes()
    private static native long getInitSeedIndexes_0(long nativeObj);

    // C++:  void cv::xfeatures2d::PCTSignatures::computeSignature(Mat image, Mat& signature)
    private static native void computeSignature_0(long nativeObj, long image_nativeObj, long signature_nativeObj);

    // C++:  void cv::xfeatures2d::PCTSignatures::computeSignatures(vector_Mat images, vector_Mat signatures)
    private static native void computeSignatures_0(long nativeObj, long images_mat_nativeObj, long signatures_mat_nativeObj);

    // C++: static void cv::xfeatures2d::PCTSignatures::drawSignature(Mat source, Mat signature, Mat& result, float radiusToShorterSideRatio = 1.0 / 8, int borderThickness = 1)
    private static native void drawSignature_0(long source_nativeObj, long signature_nativeObj, long result_nativeObj, float radiusToShorterSideRatio, int borderThickness);
    private static native void drawSignature_1(long source_nativeObj, long signature_nativeObj, long result_nativeObj, float radiusToShorterSideRatio);
    private static native void drawSignature_2(long source_nativeObj, long signature_nativeObj, long result_nativeObj);

    // C++: static void cv::xfeatures2d::PCTSignatures::generateInitPoints(vector_Point2f initPoints, int count, int pointDistribution)
    private static native void generateInitPoints_0(long initPoints_mat_nativeObj, int count, int pointDistribution);

    // C++:  void cv::xfeatures2d::PCTSignatures::setClusterMinSize(int clusterMinSize)
    private static native void setClusterMinSize_0(long nativeObj, int clusterMinSize);

    // C++:  void cv::xfeatures2d::PCTSignatures::setDistanceFunction(int distanceFunction)
    private static native void setDistanceFunction_0(long nativeObj, int distanceFunction);

    // C++:  void cv::xfeatures2d::PCTSignatures::setDropThreshold(float dropThreshold)
    private static native void setDropThreshold_0(long nativeObj, float dropThreshold);

    // C++:  void cv::xfeatures2d::PCTSignatures::setGrayscaleBits(int grayscaleBits)
    private static native void setGrayscaleBits_0(long nativeObj, int grayscaleBits);

    // C++:  void cv::xfeatures2d::PCTSignatures::setInitSeedIndexes(vector_int initSeedIndexes)
    private static native void setInitSeedIndexes_0(long nativeObj, long initSeedIndexes_mat_nativeObj);

    // C++:  void cv::xfeatures2d::PCTSignatures::setIterationCount(int iterationCount)
    private static native void setIterationCount_0(long nativeObj, int iterationCount);

    // C++:  void cv::xfeatures2d::PCTSignatures::setJoiningDistance(float joiningDistance)
    private static native void setJoiningDistance_0(long nativeObj, float joiningDistance);

    // C++:  void cv::xfeatures2d::PCTSignatures::setMaxClustersCount(int maxClustersCount)
    private static native void setMaxClustersCount_0(long nativeObj, int maxClustersCount);

    // C++:  void cv::xfeatures2d::PCTSignatures::setSamplingPoints(vector_Point2f samplingPoints)
    private static native void setSamplingPoints_0(long nativeObj, long samplingPoints_mat_nativeObj);

    // C++:  void cv::xfeatures2d::PCTSignatures::setTranslation(int idx, float value)
    private static native void setTranslation_0(long nativeObj, int idx, float value);

    // C++:  void cv::xfeatures2d::PCTSignatures::setTranslations(vector_float translations)
    private static native void setTranslations_0(long nativeObj, long translations_mat_nativeObj);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeight(int idx, float value)
    private static native void setWeight_0(long nativeObj, int idx, float value);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightA(float weight)
    private static native void setWeightA_0(long nativeObj, float weight);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightB(float weight)
    private static native void setWeightB_0(long nativeObj, float weight);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightContrast(float weight)
    private static native void setWeightContrast_0(long nativeObj, float weight);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightEntropy(float weight)
    private static native void setWeightEntropy_0(long nativeObj, float weight);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightL(float weight)
    private static native void setWeightL_0(long nativeObj, float weight);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightX(float weight)
    private static native void setWeightX_0(long nativeObj, float weight);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightY(float weight)
    private static native void setWeightY_0(long nativeObj, float weight);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWeights(vector_float weights)
    private static native void setWeights_0(long nativeObj, long weights_mat_nativeObj);

    // C++:  void cv::xfeatures2d::PCTSignatures::setWindowRadius(int radius)
    private static native void setWindowRadius_0(long nativeObj, int radius);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
