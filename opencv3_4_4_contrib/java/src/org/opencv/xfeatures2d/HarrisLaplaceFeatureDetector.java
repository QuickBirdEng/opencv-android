//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.HarrisLaplaceFeatureDetector;

// C++: class HarrisLaplaceFeatureDetector
//javadoc: HarrisLaplaceFeatureDetector

public class HarrisLaplaceFeatureDetector extends Feature2D {

    protected HarrisLaplaceFeatureDetector(long addr) { super(addr); }

    // internal usage only
    public static HarrisLaplaceFeatureDetector __fromPtr__(long addr) { return new HarrisLaplaceFeatureDetector(addr); }

    //
    // C++: static Ptr_HarrisLaplaceFeatureDetector cv::xfeatures2d::HarrisLaplaceFeatureDetector::create(int numOctaves = 6, float corn_thresh = 0.01f, float DOG_thresh = 0.01f, int maxCorners = 5000, int num_layers = 4)
    //

    //javadoc: HarrisLaplaceFeatureDetector::create(numOctaves, corn_thresh, DOG_thresh, maxCorners, num_layers)
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners, int num_layers)
    {
        
        HarrisLaplaceFeatureDetector retVal = HarrisLaplaceFeatureDetector.__fromPtr__(create_0(numOctaves, corn_thresh, DOG_thresh, maxCorners, num_layers));
        
        return retVal;
    }

    //javadoc: HarrisLaplaceFeatureDetector::create(numOctaves, corn_thresh, DOG_thresh, maxCorners)
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners)
    {
        
        HarrisLaplaceFeatureDetector retVal = HarrisLaplaceFeatureDetector.__fromPtr__(create_1(numOctaves, corn_thresh, DOG_thresh, maxCorners));
        
        return retVal;
    }

    //javadoc: HarrisLaplaceFeatureDetector::create(numOctaves, corn_thresh, DOG_thresh)
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh, float DOG_thresh)
    {
        
        HarrisLaplaceFeatureDetector retVal = HarrisLaplaceFeatureDetector.__fromPtr__(create_2(numOctaves, corn_thresh, DOG_thresh));
        
        return retVal;
    }

    //javadoc: HarrisLaplaceFeatureDetector::create(numOctaves, corn_thresh)
    public static HarrisLaplaceFeatureDetector create(int numOctaves, float corn_thresh)
    {
        
        HarrisLaplaceFeatureDetector retVal = HarrisLaplaceFeatureDetector.__fromPtr__(create_3(numOctaves, corn_thresh));
        
        return retVal;
    }

    //javadoc: HarrisLaplaceFeatureDetector::create(numOctaves)
    public static HarrisLaplaceFeatureDetector create(int numOctaves)
    {
        
        HarrisLaplaceFeatureDetector retVal = HarrisLaplaceFeatureDetector.__fromPtr__(create_4(numOctaves));
        
        return retVal;
    }

    //javadoc: HarrisLaplaceFeatureDetector::create()
    public static HarrisLaplaceFeatureDetector create()
    {
        
        HarrisLaplaceFeatureDetector retVal = HarrisLaplaceFeatureDetector.__fromPtr__(create_5());
        
        return retVal;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_HarrisLaplaceFeatureDetector cv::xfeatures2d::HarrisLaplaceFeatureDetector::create(int numOctaves = 6, float corn_thresh = 0.01f, float DOG_thresh = 0.01f, int maxCorners = 5000, int num_layers = 4)
    private static native long create_0(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners, int num_layers);
    private static native long create_1(int numOctaves, float corn_thresh, float DOG_thresh, int maxCorners);
    private static native long create_2(int numOctaves, float corn_thresh, float DOG_thresh);
    private static native long create_3(int numOctaves, float corn_thresh);
    private static native long create_4(int numOctaves);
    private static native long create_5();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
