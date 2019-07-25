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
//javadoc: PCTSignatures

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

    //javadoc: PCTSignatures::create(initSampleCount, initSeedCount, pointDistribution)
    public static PCTSignatures create(int initSampleCount, int initSeedCount, int pointDistribution)
    {
        
        PCTSignatures retVal = PCTSignatures.__fromPtr__(create_0(initSampleCount, initSeedCount, pointDistribution));
        
        return retVal;
    }

    //javadoc: PCTSignatures::create(initSampleCount, initSeedCount)
    public static PCTSignatures create(int initSampleCount, int initSeedCount)
    {
        
        PCTSignatures retVal = PCTSignatures.__fromPtr__(create_1(initSampleCount, initSeedCount));
        
        return retVal;
    }

    //javadoc: PCTSignatures::create(initSampleCount)
    public static PCTSignatures create(int initSampleCount)
    {
        
        PCTSignatures retVal = PCTSignatures.__fromPtr__(create_2(initSampleCount));
        
        return retVal;
    }

    //javadoc: PCTSignatures::create()
    public static PCTSignatures create()
    {
        
        PCTSignatures retVal = PCTSignatures.__fromPtr__(create_3());
        
        return retVal;
    }


    //
    // C++: static Ptr_PCTSignatures cv::xfeatures2d::PCTSignatures::create(vector_Point2f initSamplingPoints, int initSeedCount)
    //

    //javadoc: PCTSignatures::create(initSamplingPoints, initSeedCount)
    public static PCTSignatures create(MatOfPoint2f initSamplingPoints, int initSeedCount)
    {
        Mat initSamplingPoints_mat = initSamplingPoints;
        PCTSignatures retVal = PCTSignatures.__fromPtr__(create_4(initSamplingPoints_mat.nativeObj, initSeedCount));
        
        return retVal;
    }


    //
    // C++: static Ptr_PCTSignatures cv::xfeatures2d::PCTSignatures::create(vector_Point2f initSamplingPoints, vector_int initClusterSeedIndexes)
    //

    //javadoc: PCTSignatures::create(initSamplingPoints, initClusterSeedIndexes)
    public static PCTSignatures create(MatOfPoint2f initSamplingPoints, MatOfInt initClusterSeedIndexes)
    {
        Mat initSamplingPoints_mat = initSamplingPoints;
        Mat initClusterSeedIndexes_mat = initClusterSeedIndexes;
        PCTSignatures retVal = PCTSignatures.__fromPtr__(create_5(initSamplingPoints_mat.nativeObj, initClusterSeedIndexes_mat.nativeObj));
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getDropThreshold()
    //

    //javadoc: PCTSignatures::getDropThreshold()
    public  float getDropThreshold()
    {
        
        float retVal = getDropThreshold_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getJoiningDistance()
    //

    //javadoc: PCTSignatures::getJoiningDistance()
    public  float getJoiningDistance()
    {
        
        float retVal = getJoiningDistance_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightA()
    //

    //javadoc: PCTSignatures::getWeightA()
    public  float getWeightA()
    {
        
        float retVal = getWeightA_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightB()
    //

    //javadoc: PCTSignatures::getWeightB()
    public  float getWeightB()
    {
        
        float retVal = getWeightB_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightContrast()
    //

    //javadoc: PCTSignatures::getWeightContrast()
    public  float getWeightContrast()
    {
        
        float retVal = getWeightContrast_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightEntropy()
    //

    //javadoc: PCTSignatures::getWeightEntropy()
    public  float getWeightEntropy()
    {
        
        float retVal = getWeightEntropy_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightL()
    //

    //javadoc: PCTSignatures::getWeightL()
    public  float getWeightL()
    {
        
        float retVal = getWeightL_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightX()
    //

    //javadoc: PCTSignatures::getWeightX()
    public  float getWeightX()
    {
        
        float retVal = getWeightX_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  float cv::xfeatures2d::PCTSignatures::getWeightY()
    //

    //javadoc: PCTSignatures::getWeightY()
    public  float getWeightY()
    {
        
        float retVal = getWeightY_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getClusterMinSize()
    //

    //javadoc: PCTSignatures::getClusterMinSize()
    public  int getClusterMinSize()
    {
        
        int retVal = getClusterMinSize_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getDistanceFunction()
    //

    //javadoc: PCTSignatures::getDistanceFunction()
    public  int getDistanceFunction()
    {
        
        int retVal = getDistanceFunction_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getGrayscaleBits()
    //

    //javadoc: PCTSignatures::getGrayscaleBits()
    public  int getGrayscaleBits()
    {
        
        int retVal = getGrayscaleBits_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getInitSeedCount()
    //

    //javadoc: PCTSignatures::getInitSeedCount()
    public  int getInitSeedCount()
    {
        
        int retVal = getInitSeedCount_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getIterationCount()
    //

    //javadoc: PCTSignatures::getIterationCount()
    public  int getIterationCount()
    {
        
        int retVal = getIterationCount_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getMaxClustersCount()
    //

    //javadoc: PCTSignatures::getMaxClustersCount()
    public  int getMaxClustersCount()
    {
        
        int retVal = getMaxClustersCount_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getSampleCount()
    //

    //javadoc: PCTSignatures::getSampleCount()
    public  int getSampleCount()
    {
        
        int retVal = getSampleCount_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  int cv::xfeatures2d::PCTSignatures::getWindowRadius()
    //

    //javadoc: PCTSignatures::getWindowRadius()
    public  int getWindowRadius()
    {
        
        int retVal = getWindowRadius_0(nativeObj);
        
        return retVal;
    }


    //
    // C++:  vector_Point2f cv::xfeatures2d::PCTSignatures::getSamplingPoints()
    //

    //javadoc: PCTSignatures::getSamplingPoints()
    public  MatOfPoint2f getSamplingPoints()
    {
        
        MatOfPoint2f retVal = MatOfPoint2f.fromNativeAddr(getSamplingPoints_0(nativeObj));
        
        return retVal;
    }


    //
    // C++:  vector_int cv::xfeatures2d::PCTSignatures::getInitSeedIndexes()
    //

    //javadoc: PCTSignatures::getInitSeedIndexes()
    public  MatOfInt getInitSeedIndexes()
    {
        
        MatOfInt retVal = MatOfInt.fromNativeAddr(getInitSeedIndexes_0(nativeObj));
        
        return retVal;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::computeSignature(Mat image, Mat& signature)
    //

    //javadoc: PCTSignatures::computeSignature(image, signature)
    public  void computeSignature(Mat image, Mat signature)
    {
        
        computeSignature_0(nativeObj, image.nativeObj, signature.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::computeSignatures(vector_Mat images, vector_Mat signatures)
    //

    //javadoc: PCTSignatures::computeSignatures(images, signatures)
    public  void computeSignatures(List<Mat> images, List<Mat> signatures)
    {
        Mat images_mat = Converters.vector_Mat_to_Mat(images);
        Mat signatures_mat = Converters.vector_Mat_to_Mat(signatures);
        computeSignatures_0(nativeObj, images_mat.nativeObj, signatures_mat.nativeObj);
        
        return;
    }


    //
    // C++: static void cv::xfeatures2d::PCTSignatures::drawSignature(Mat source, Mat signature, Mat& result, float radiusToShorterSideRatio = 1.0 / 8, int borderThickness = 1)
    //

    //javadoc: PCTSignatures::drawSignature(source, signature, result, radiusToShorterSideRatio, borderThickness)
    public static void drawSignature(Mat source, Mat signature, Mat result, float radiusToShorterSideRatio, int borderThickness)
    {
        
        drawSignature_0(source.nativeObj, signature.nativeObj, result.nativeObj, radiusToShorterSideRatio, borderThickness);
        
        return;
    }

    //javadoc: PCTSignatures::drawSignature(source, signature, result, radiusToShorterSideRatio)
    public static void drawSignature(Mat source, Mat signature, Mat result, float radiusToShorterSideRatio)
    {
        
        drawSignature_1(source.nativeObj, signature.nativeObj, result.nativeObj, radiusToShorterSideRatio);
        
        return;
    }

    //javadoc: PCTSignatures::drawSignature(source, signature, result)
    public static void drawSignature(Mat source, Mat signature, Mat result)
    {
        
        drawSignature_2(source.nativeObj, signature.nativeObj, result.nativeObj);
        
        return;
    }


    //
    // C++: static void cv::xfeatures2d::PCTSignatures::generateInitPoints(vector_Point2f initPoints, int count, int pointDistribution)
    //

    //javadoc: PCTSignatures::generateInitPoints(initPoints, count, pointDistribution)
    public static void generateInitPoints(MatOfPoint2f initPoints, int count, int pointDistribution)
    {
        Mat initPoints_mat = initPoints;
        generateInitPoints_0(initPoints_mat.nativeObj, count, pointDistribution);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setClusterMinSize(int clusterMinSize)
    //

    //javadoc: PCTSignatures::setClusterMinSize(clusterMinSize)
    public  void setClusterMinSize(int clusterMinSize)
    {
        
        setClusterMinSize_0(nativeObj, clusterMinSize);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setDistanceFunction(int distanceFunction)
    //

    //javadoc: PCTSignatures::setDistanceFunction(distanceFunction)
    public  void setDistanceFunction(int distanceFunction)
    {
        
        setDistanceFunction_0(nativeObj, distanceFunction);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setDropThreshold(float dropThreshold)
    //

    //javadoc: PCTSignatures::setDropThreshold(dropThreshold)
    public  void setDropThreshold(float dropThreshold)
    {
        
        setDropThreshold_0(nativeObj, dropThreshold);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setGrayscaleBits(int grayscaleBits)
    //

    //javadoc: PCTSignatures::setGrayscaleBits(grayscaleBits)
    public  void setGrayscaleBits(int grayscaleBits)
    {
        
        setGrayscaleBits_0(nativeObj, grayscaleBits);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setInitSeedIndexes(vector_int initSeedIndexes)
    //

    //javadoc: PCTSignatures::setInitSeedIndexes(initSeedIndexes)
    public  void setInitSeedIndexes(MatOfInt initSeedIndexes)
    {
        Mat initSeedIndexes_mat = initSeedIndexes;
        setInitSeedIndexes_0(nativeObj, initSeedIndexes_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setIterationCount(int iterationCount)
    //

    //javadoc: PCTSignatures::setIterationCount(iterationCount)
    public  void setIterationCount(int iterationCount)
    {
        
        setIterationCount_0(nativeObj, iterationCount);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setJoiningDistance(float joiningDistance)
    //

    //javadoc: PCTSignatures::setJoiningDistance(joiningDistance)
    public  void setJoiningDistance(float joiningDistance)
    {
        
        setJoiningDistance_0(nativeObj, joiningDistance);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setMaxClustersCount(int maxClustersCount)
    //

    //javadoc: PCTSignatures::setMaxClustersCount(maxClustersCount)
    public  void setMaxClustersCount(int maxClustersCount)
    {
        
        setMaxClustersCount_0(nativeObj, maxClustersCount);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setSamplingPoints(vector_Point2f samplingPoints)
    //

    //javadoc: PCTSignatures::setSamplingPoints(samplingPoints)
    public  void setSamplingPoints(MatOfPoint2f samplingPoints)
    {
        Mat samplingPoints_mat = samplingPoints;
        setSamplingPoints_0(nativeObj, samplingPoints_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setTranslation(int idx, float value)
    //

    //javadoc: PCTSignatures::setTranslation(idx, value)
    public  void setTranslation(int idx, float value)
    {
        
        setTranslation_0(nativeObj, idx, value);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setTranslations(vector_float translations)
    //

    //javadoc: PCTSignatures::setTranslations(translations)
    public  void setTranslations(MatOfFloat translations)
    {
        Mat translations_mat = translations;
        setTranslations_0(nativeObj, translations_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeight(int idx, float value)
    //

    //javadoc: PCTSignatures::setWeight(idx, value)
    public  void setWeight(int idx, float value)
    {
        
        setWeight_0(nativeObj, idx, value);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightA(float weight)
    //

    //javadoc: PCTSignatures::setWeightA(weight)
    public  void setWeightA(float weight)
    {
        
        setWeightA_0(nativeObj, weight);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightB(float weight)
    //

    //javadoc: PCTSignatures::setWeightB(weight)
    public  void setWeightB(float weight)
    {
        
        setWeightB_0(nativeObj, weight);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightContrast(float weight)
    //

    //javadoc: PCTSignatures::setWeightContrast(weight)
    public  void setWeightContrast(float weight)
    {
        
        setWeightContrast_0(nativeObj, weight);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightEntropy(float weight)
    //

    //javadoc: PCTSignatures::setWeightEntropy(weight)
    public  void setWeightEntropy(float weight)
    {
        
        setWeightEntropy_0(nativeObj, weight);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightL(float weight)
    //

    //javadoc: PCTSignatures::setWeightL(weight)
    public  void setWeightL(float weight)
    {
        
        setWeightL_0(nativeObj, weight);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightX(float weight)
    //

    //javadoc: PCTSignatures::setWeightX(weight)
    public  void setWeightX(float weight)
    {
        
        setWeightX_0(nativeObj, weight);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeightY(float weight)
    //

    //javadoc: PCTSignatures::setWeightY(weight)
    public  void setWeightY(float weight)
    {
        
        setWeightY_0(nativeObj, weight);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWeights(vector_float weights)
    //

    //javadoc: PCTSignatures::setWeights(weights)
    public  void setWeights(MatOfFloat weights)
    {
        Mat weights_mat = weights;
        setWeights_0(nativeObj, weights_mat.nativeObj);
        
        return;
    }


    //
    // C++:  void cv::xfeatures2d::PCTSignatures::setWindowRadius(int radius)
    //

    //javadoc: PCTSignatures::setWindowRadius(radius)
    public  void setWindowRadius(int radius)
    {
        
        setWindowRadius_0(nativeObj, radius);
        
        return;
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
